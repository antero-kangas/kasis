const LINEWIDTH = 66;
const NEWLINE = "\n";
const MINCENTERINDENT = 10;
const NAMELEFT = 20;
const REPLIQUELEFT = 10;
const REPLIQUERIGHT = 60;

const NARRATOR = "narrator";
const PAUSE = "pause";

export default class ProcessedManuscript {
	constructor (json) {
		this.json = json;
		let fmt, snd; 
		[fmt, snd] = this.manuscript(json);
		this.formatted = fmt;
		this.sound = snd;
	}

	center(text) {
		return this.match(text, MINCENTERINDENT, LINEWIDTH-MINCENTERINDENT, true);
	}

	match(text, left=0, right=LINEWIDTH, center=false) {
		const LEN = right-left;
		const words = text.split(" ");
		let add;
		let result = "";
		let line = "";
		if (words.length > 0) {
			let i = 0;
			line = words[i];
			i = 1;
			while (i < words.length) {
				if (line.length + 1 + words[i].length < LEN) {
					line += " " + words[i];
				} else {
					add = left+(center? (LEN-line.length)/2: 0);
					result += " ".repeat(add) + line + NEWLINE;
					line = words[i];
				};
				i++
			}
			add = left+(center? (LEN-line.length)/2: 0);
			result += " ".repeat(add) + line + NEWLINE;
		} 
		return result;
	}

	formatLeft(text) {
		let result = this.match(text);
		return result;
	}

	formatSceneHeading(text) {
		let result = this.match(text);
		return result;
	}

	formatName(text) {
		let result = this.match(text, NAMELEFT);
		return result;
	}

	formatReplique(text) {
		let result = this.match(text, REPLIQUELEFT, REPLIQUERIGHT);
		return result;
	}

	formatParenthesis(text) {
		let words = text.split(" ");
		let result = "";
		let i = 0;
		let line = " ";
		while (i < words.length) {
			let test = i==0?words[i] : " "+words[i];
			while ((line+test).length <= LINEWIDTH && i < words.length) {
				line += test;
				i++;
				test = i==0?words[i] : " "+words[i];
			}
			result += line + NEWLINE; 
			line = words[i]; 
		}
		return result
	}

	manuscript(json) {
		let result = "";
		let sound = [];
		let res, snd;
		[res, snd] = this.title(json.title);
		result += res;
		sound = sound.concat(snd);
		result += this.authors(json.authors);
		result += this.date(json.date); 
		result += this.synopsis(json.synopsis);
		[res, snd] = this.scenesPart(json.scenesPart);
		result += res;
		sound = sound.concat(snd);
		return [result, sound];
	}

	title(json) {
		let result = "";
		let sound = [];
		if (json) {
			result += this.center(json) + NEWLINE;
			sound.push({name: NARRATOR, text: json})
		}
		return [result, sound];
	}

	authors(json) {
		let result = "";
		if (json) {
			result += this.center(json);
		}
		return result;
	}

	date(json) {
		let result = "";
		if (json) {
			result += this.center(json) + NEWLINE + NEWLINE;
		}
		return result;
	}

	synopsis(json) {
		let result = "";
		if (json) {
			result += this.formatLeft(json.synopsisTitle) + NEWLINE;
			result += this.synopsisParagraphs(json.synopsisParagraphs);
		}
		return result;
	}

	synopsisParagraphs(json) {
		let result = "";
		if (json) {
			json.forEach(synopsisParagraph => {
				result += this.synopsisParagraph(synopsisParagraph.synopsisParagraph)
			})
		}
		return result;
	}

	synopsisParagraph(json) {
		let result = "";
		if (json) {
			result += this.formatLeft(json) + NEWLINE;
		}
		return result;
	}

	scenesPart(json) {
		let result = "";
		let sound = [];
		let fmt, snd;
		if (json) {
			result += NEWLINE + this.formatLeft(json.scenesHeading);	
			[fmt, snd] = this.scenes(json.scenes);
			result += fmt;
			sound = sound.concat(snd);
		}
		return [result, sound];
	}

	scenes(json) {
		let result = "";
		let sound = [];
		let res, snd;
		if (json) {
			json.forEach(scene => {
				[res, snd] = this.scene(scene.scene);
				result += res;
				sound = sound.concat(snd);
			})
		}
		return [result, sound];
	}

	scene(json) {
		let result = "";
		let sound = [];
		let name = NARRATOR;
		if (json) {
			json.forEach(scenePart => {
				switch (Object.keys(scenePart)[0]) {
					case "sceneHeading": 
						result += NEWLINE + this.formatLeft(scenePart.sceneHeading) + NEWLINE;
						sound.push({"effect": PAUSE});
						sound.push({"name": NARRATOR, "text": scenePart.sceneHeading});
						break;
					case "name": 
						result += NEWLINE + this.formatName(scenePart.name) + NEWLINE;
						name = scenePart.name;
						sound.push({"name": NARRATOR, "text": scenePart.name});
						break;
					case "parenthesis": 
						result += this.formatLeft(scenePart.parenthesis) + NEWLINE;
						sound.push({"name": NARRATOR, "text": scenePart.parenthesis});
						break;
					case "replique": 
						result += this.formatReplique(scenePart.replique) + NEWLINE;
						sound.push({"name": name, "text": scenePart.replique});
						break;
				}
			})
		}
		return [result, sound];
	}
}	