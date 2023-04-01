import { joinToStrAndArr } from "./tools.js";

const LINEWIDTH = 66;
const NEWLINE = "\n";
const MINCENTERINDENT = 10;
const NAMELEFT = 20;
const REPLIQUELEFT = 10;
const REPLIQUERIGHT = 60;

const NARRATOR = "kertoja";
const PAUSE = "(tauko)";

export default class ProcessedManuscript {
	constructor (json) {
		this.json = json;
		this.name = NARRATOR;
		this.effects = [];
		[this.formatted, this.sound] = this.manuscript(json);
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
		[format, sound] = joinToStrAndArr(format, sound, this.title(json.title));
		[format, sound] = joinToStrAndArr(format, sound, this.authors(json.authors));
		[format, sound] = joinToStrAndArr(format, sound, this.date(json.date));
		[format, sound] = joinToStrAndArr(format, sound, this.synopsis(json.synopsis));
		this.effectsPart(json.effectsPart);
		[format, sound] = joinToStrAndArr(format, sound, this.scenesPart(json.scenesPart));
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
		let sound = [];
		if (json) {
			format += this.center(json);
			sound.push({name: NARRATOR, text: json})
		}
		return [format, sound];
	}

	date(json) {
		let format = "";
		let sound = [];
		if (json) {
			format += this.center(json) + NEWLINE + NEWLINE;
			sound.push({name: NARRATOR, text: json})
		}
		return [format, sound];
	}

	synopsis(json) {
		let format = "";
		let sound = [];
		if (json) {
			format += this.formatLeft(json.synopsisTitle) + NEWLINE;
			sound.push({"name": NARRATOR, "text": json.synopsisTitle});
			[format, sound] = joinToStrAndArr(format, sound, 
				this.synopsisParagraphs(json.synopsisParagraphs));
		}
		return [format, sound];
	}

	synopsisParagraphs(json) {
		let format = "";
		let sound = [];
		if (json) {
			json.forEach(synopsisParagraph => {
				[format, sound] = joinToStrAndArr(format, sound, 
					this.synopsisParagraph(synopsisParagraph.synopsisParagraph));
			})
		}
		return [format, sound];
	}

	synopsisParagraph(json) {
		let format = "";
		let sound = [];
		if (json) {
			format += this.formatLeft(json) + NEWLINE;
			sound.push({"name": NARRATOR, "text": json});
		}
		return [format, sound];
	}

	effectsPart(json) {
		if (json && json.effects) {
			json.effects.forEach(effect => {
				this.effects.push(effect.command)
			})
		}
	}

	scenesPart(json) {
		let format = "";
		let sound = [];
		let fmt, snd;
		if (json) {
			format += NEWLINE + this.formatLeft(json.scenesHeading);	
			sound.push({"name": NARRATOR, "text": json.scenesHeading});
			[format, sound] = joinToStrAndArr (format, sound, 
				this.scenes(json.scenes));
		}
		return [format, sound];
	}

	scenes(json) {
		let format = "";
		let sound = [];
		if (json) {
			json.forEach(scene => {
				[format, sound] = joinToStrAndArr(format, sound,
					this.scene(scene.scene));
			})
		}
		return [format, sound];
	}

	scene(json) {
		let format = "";
		let sound = [];
		this.name = NARRATOR;
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
						this.name = scenePart.name;
						sound.push({"name": NARRATOR, "text": scenePart.name});
						break;
					case "parenthesis": 
						[format, sound] = joinToStrAndArr(format, sound,
							this.parenthesis(scenePart.parenthesis));
						break;
					case "replique": 
						[format, sound] = joinToStrAndArr(format, sound,
							this.replique(scenePart.replique));
						break;
				}
			})
		}
		return [format, sound];
	}

	parenthesis(json) {
		let format = "";
		let sound = [];
		let command;
		if (json) {
			json.forEach(parenthesisPart => {
				switch (Object.keys(parenthesisPart)[0]) {
				case "nonCapitalTextOrCommand": 
					format += this.formatLeft(parenthesisPart.nonCapitalTextOrCommand) + NEWLINE;
					break;
				case "nonCapitalText":
					sound.push({"name": NARRATOR, "text": parenthesisPart.nonCapitalText});
					break;
				case "command":
					let command = parenthesisPart.command;
					if (this.effects.includes(command)){
						sound.push({"effect": command});
					} else {
						sound.push({"name": NARRATOR, text: command});
					}
					break;
				}
			})
		} 
		return [format, sound];
	}

	replique(json) {
		let format = "";
		let sound = [];
		let command;
		if (json) {
			json.forEach(repliquePart => {
				switch (Object.keys(repliquePart)[0]) {
				case "nonCapitalTextOrCommand": 
					format += this.formatReplique(repliquePart.nonCapitalTextOrCommand) + NEWLINE;
					break;
				case "nonCapitalText":
					sound.push({"name": this.name, "text": repliquePart.nonCapitalText});
					break;
				case "command":
					command = repliquePart.command;
					format += this.formatReplique(command) + NEWLINE;
					if (this.effects.includes(command)) {
						sound.push({"effect": command});
					} else {
						sound.push({"name": NARRATOR, text: command});
					}
					break;
				}
			})
		} 
		return [format, sound];

	}
}	