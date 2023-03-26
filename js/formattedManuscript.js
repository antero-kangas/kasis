
const LINEWIDTH = 66;
const NEWLINE = "\n";
const MINTITLEINDENT = 10;
const NAMELEFT = 20;
const REPLIQUELEFT = 10;
const REPLIQUERIGHT = 60;

export default class FormattedManuscript {
	constructor (json) {
		console.log("constructor")
		this.json = json;
		this.output = this.manuscript(json);
	}

	center(text, minindent) {
		const words = text.split(" ");
		let t = words.join(" ");
		let prefixLength = (LINEWIDTH - t.length) / 2;
		// console.log(prefixLength)
		prefixLength = Math.max(0, prefixLength);
		t = " ".repeat(prefixLength) + t;
		return t;
	}

	left(text) {
		return text.split(" ").join(" ");
	}

	formatName(text) {
		return this.center(text, 0);
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
		// console.log("manuscript")
		let result = "";
		result += this.title(json.title);
		result += this.author(json.author);
		result += this.date(json.date); 
		result += this.synopsis(json.synopsis);
		result += this.scenesPart(json.scenesPart);
		return result;
	}

	title(json) {
		// console.log("title", json)
		let result = "";
		if (json) {
			result += this.center(json, MINTITLEINDENT) + NEWLINE + NEWLINE;
		}
		return result;
	}

	author(json) {
		// console.log("author", json)
		let result = "";
		if (json) {
			result += this.center(json, MINTITLEINDENT) + NEWLINE;
		}
		return result;
	}

	date(json) {
		// console.log("date", json)
		let result = "";
		if (json) {
			result += this.center(json, MINTITLEINDENT) + NEWLINE + NEWLINE + NEWLINE;
		}
		return result;
	}

	synopsis(json) {
		// console.log("synopsis")
		let result = "";
		if (json) {
			result += this.left(json.synopsisTitle) + NEWLINE + NEWLINE;
			result += this.synopsisParagraphs(json.synopsisParagraphs);
		}
		return result;
	}

	synopsisParagraphs(json) {
		// console.log("synopsisParagraphs:", json, !!json, json.length)
		let result = "";
		if (json) {
			json.forEach(synopsisParagraph => {
				result += this.synopsisParagraph(synopsisParagraph.synopsisParagraph)
			})
		}
		return result;
	}

	synopsisParagraph(json) {
		// console.log("synopsisParagraph", json)
		let result = "";
		if (json) {
			result += this.formatParenthesis(json) + NEWLINE +  NEWLINE;
		}
		return result;
	}

	scenesPart(json) {
		// console.log("scenesPart", json)
		let result = "";
		if (json) {
			result += NEWLINE + this.left(json.scenesHeading) + NEWLINE  + NEWLINE ;
			result += this.scenes(json.scenes);
		}
		return result;
	}

	scenes(json) {
		// console.log("scenes::::", json)
		let result = "";
		if (json) {
			json.forEach(scene => {
				// console.log("scene.scene=", scene.scene)
				result += this.scene(scene.scene)
			})
		}
		return result;
	}

	scene(json) {
		// console.log("\nscene", json);
		let result = "";
		if (json) {
			json.forEach(scenePart => {
				console.log("scenePart=",scenePart,Object.keys(scenePart)[0])
				console.log(scenePart[scenePart,Object.keys(scenePart)[0]])
				switch (Object.keys(scenePart)[0]) {
					case "sceneHeading": 
						result += NEWLINE + NEWLINE + this.left(scenePart.sceneHeading) + NEWLINE + NEWLINE;
						break;
					case "name": 
						result += NEWLINE + this.center(scenePart.name) + NEWLINE + NEWLINE;
						break;
					case "parenthesis": 
						result += this.left(scenePart.parenthesis) + NEWLINE + NEWLINE;
						break;
					case "replique": 
						result += this.center(scenePart.replique) + NEWLINE + NEWLINE;
						break;
				}
			})
		}
		return result;
	}
}	