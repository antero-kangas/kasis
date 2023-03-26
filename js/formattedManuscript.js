const LINEWIDTH = 66;
const NEWLINE = "\n";
const MINTITLEINDENT = 10;
const NAMELEFT = 20;
const REPLIQUELEFT = 10;
const REPLIQUERIGHT = 60;

export default class FormattedManuscript {
	constructor (json) {
		this.json = json;
		this.output = this.manuscript(json);
	}

	center(text, minindent) {
		const words = text.split(" ");
		let t = words.join(" ");
		let prefixLength = (LINEWIDTH - t.length) / 2;
		prefixLength = Math.max(0, prefixLength);
		t = " ".repeat(prefixLength) + t;
		return t;
	}

	// left(text) {
	// 	return text.split(" ").join(" ");
	// }

	match(text, left=0, right=LINEWIDTH) {
		const LEN = right-left;
		const words = text.split(" ");
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
					result += " ".repeat(left) + line + NEWLINE;
					line = words[i];
				};
				i++
			}
			result += " ".repeat(left) + line + NEWLINE;
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
		result += this.title(json.title);
		result += this.author(json.author);
		result += this.date(json.date); 
		result += this.synopsis(json.synopsis);
		result += this.scenesPart(json.scenesPart);
		return result;
	}

	title(json) {
		let result = "";
		if (json) {
			result += this.center(json, MINTITLEINDENT) + NEWLINE + NEWLINE;
		}
		return result;
	}

	author(json) {
		let result = "";
		if (json) {
			result += this.center(json, MINTITLEINDENT) + NEWLINE;
		}
		return result;
	}

	date(json) {
		let result = "";
		if (json) {
			result += this.center(json, MINTITLEINDENT) + NEWLINE + NEWLINE + NEWLINE;
		}
		return result;
	}

	synopsis(json) {
		let result = "";
		if (json) {
			result += this.formatLeft(json.synopsisTitle) + NEWLINE + NEWLINE;
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
			result += this.formatLeft(json) + NEWLINE +  NEWLINE;
		}
		return result;
	}

	scenesPart(json) {
		let result = "";
		if (json) {
			result += NEWLINE + this.formatLeft(json.scenesHeading) + NEWLINE  + NEWLINE ;
			result += this.scenes(json.scenes);
		}
		return result;
	}

	scenes(json) {
		let result = "";
		if (json) {
			json.forEach(scene => {
				result += this.scene(scene.scene)
			})
		}
		return result;
	}

	scene(json) {
		let result = "";
		if (json) {
			json.forEach(scenePart => {
				switch (Object.keys(scenePart)[0]) {
					case "sceneHeading": 
						result += NEWLINE + NEWLINE + this.formatLeft(scenePart.sceneHeading) + NEWLINE;
						break;
					case "name": 
						result += NEWLINE + this.formatName(scenePart.name) + NEWLINE;
						break;
					case "parenthesis": 
						result += this.formatLeft(scenePart.parenthesis) + NEWLINE;
						break;
					case "replique": 
						result += this.formatReplique(scenePart.replique) + NEWLINE;
						break;
				}
			})
		}
		return result;
	}
}	