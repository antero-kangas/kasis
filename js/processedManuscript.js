const LINEWIDTH = 66;
const NEWLINE = "\n";
const MINCENTERINDENT = 10;
const NAMELEFT = 20;
const REPLIQUELEFT = 10;
const REPLIQUERIGHT = 60;

const NARRATOR = "kertoja";
const PAUSE = "(tauko))";

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
		let format = "";
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
					format += " ".repeat(add) + line + NEWLINE;
					line = words[i];
				};
				i++
			}
			add = left+(center? (LEN-line.length)/2: 0);
			format += " ".repeat(add) + line + NEWLINE;
		} 
		return format;
	}

	formatLeft(text) {
		let format = this.match(text);
		return format;
	}

	formatSceneHeading(text) {
		let format = this.match(text);
		return format;
	}

	formatName(text) {
		let format = this.match(text, NAMELEFT);
		return format;
	}

	formatReplique(text) {
		console.log("formatReplique text=", text)
		let format = this.match(text, REPLIQUELEFT, REPLIQUERIGHT);
		return format;
	}

	formatParenthesis(text) {
		let words = text.split(" ");
		let format = "";
		let i = 0;
		let line = " ";
		while (i < words.length) {
			let test = i==0?words[i] : " "+words[i];
			while ((line+test).length <= LINEWIDTH && i < words.length) {
				line += test;
				i++;
				test = i==0?words[i] : " "+words[i];
			}
			format += line + NEWLINE; 
			line = words[i]; 
		}
		return format
	}

	manuscript(json) {
		let format = "";
		let sound = [];
		let fmt, snd;
		[fmt, snd] = this.title(json.title);
		format += fmt;
		sound = sound.concat(snd);
		format += this.authors(json.authors);
		format += this.date(json.date); 
		format += this.synopsis(json.synopsis);
		[fmt, snd] = this.scenesPart(json.scenesPart);
		format += fmt;
		sound = sound.concat(snd);
		return [format, sound];
	}

	title(json) {
		let format = "";
		let sound = [];
		if (json) {
			format += this.center(json) + NEWLINE;
			sound.push({name: NARRATOR, text: json})
		}
		return [format, sound];
	}

	authors(json) {
		let format = "";
		if (json) {
			format += this.center(json);
		}
		return format;
	}

	date(json) {
		let format = "";
		if (json) {
			format += this.center(json) + NEWLINE + NEWLINE;
		}
		return format;
	}

	synopsis(json) {
		let format = "";
		if (json) {
			format += this.formatLeft(json.synopsisTitle) + NEWLINE;
			format += this.synopsisParagraphs(json.synopsisParagraphs);
		}
		return format;
	}

	synopsisParagraphs(json) {
		let format = "";
		if (json) {
			json.forEach(synopsisParagraph => {
				format += this.synopsisParagraph(synopsisParagraph.synopsisParagraph)
			})
		}
		return format;
	}

	synopsisParagraph(json) {
		let format = "";
		if (json) {
			format += this.formatLeft(json) + NEWLINE;
		}
		return format;
	}

	scenesPart(json) {
		let format = "";
		let sound = [];
		let fmt, snd;
		if (json) {
			format += NEWLINE + this.formatLeft(json.scenesHeading);	
			[fmt, snd] = this.scenes(json.scenes);
			format += fmt;
			sound = sound.concat(snd);
		}
		return [format, sound];
	}

	scenes(json) {
		let format = "";
		let sound = [];
		let fmt, snd;
		if (json) {
			json.forEach(scene => {
				[fmt, snd] = this.scene(scene.scene);
				format += fmt;
				sound = sound.concat(snd);
			})
		}
		return [format, sound];
	}

	scene(json) {
		let format = "";
		let sound = [];
		let fmt, snd;
		let name = NARRATOR;
		let x;
		if (json) {
			json.forEach(scenePart => {
				switch (Object.keys(scenePart)[0]) {
					case "sceneHeading": 
						format += NEWLINE + this.formatLeft(scenePart.sceneHeading) + NEWLINE;
						sound.push({"effect": PAUSE});
						sound.push({"name": NARRATOR, "text": scenePart.sceneHeading});
						break;
					case "name": 
						format += NEWLINE + this.formatName(scenePart.name) + NEWLINE;
						name = scenePart.name;
						sound.push({"name": NARRATOR, "text": scenePart.name});
						break;
					case "parenthesis": 
						x = this.parenthesis(scenePart.parenthesis);
						[fmt, snd] = this.parenthesis(scenePart.parenthesis);
						format += fmt;
						sound = sound.concat(snd);
						break;
					case "replique": 
						[fmt, snd] = this.replique(scenePart.replique);
						format += fmt;
						sound = sound.concat(snd);
						break;
				}
			})
		}
		return [format, sound];
	}

	parenthesis(json) {
		let format = "";
		let sound = [];
		if (json) {
			json.forEach(parenthesisPart => {
				switch (Object.keys(parenthesisPart)[0]) {
				case "nonCapitalTextOrCommand": 
					format += this.formatLeft(parenthesisPart.nonCapitalTextOrCommand) + NEWLINE;
					sound.push({"name": NARRATOR, "text": parenthesisPart.nonCapitalTextOrCommand});
					break;
				case "command":
					sound.push({"effect": parenthesisPart.command});

					break;
				}
			})
		} 
		return [format, sound];
	}

	replique(json) {
		let format = "";
		let sound = [];
		if (json) {
			json.forEach(repliquePart => {
				switch (Object.keys(repliquePart)[0]) {
				case "nonCapitalTextOrCommand": 
					format += this.formatReplique(repliquePart.nonCapitalTextOrCommand) + NEWLINE;
					break;
				case "command":
					format += this.formatReplique(repliquePart.comamnd) + NEWLINE;
					sound.push({"effect": repliquePart.command});
					break;
				}
			})
		} 
		return [format, sound];

	}
}	