
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
		let words = text.split(" ");
		let t = words.join(" ");
		const prefixLength = (LINEWIDTH - t.length) / 2;
		console.log(prefixLength)
		t = " ".repeat(prefixLength) + t;
		return t;
	}

	left(text) {
		return text.split(" ").join(" ");
	}

	manuscript(json) {
		console.log("manuscript")
		let result = "";
		result += this.title(json.title);
		result += this.author(json.author);
		result += this.date(json.date); 
		result += this.synopsis(json.synopsis);
		result += this.scenesPart(json.scenesPart);
		return result;
	}

	title(json) {
		console.log("title", json)
		let result = "";
		if (json) {
			result += this.center(json, MINTITLEINDENT) + NEWLINE + NEWLINE;
		}
		return result;
	}

	author(json) {
		console.log("author", json)
		let result = "";
		if (json) {
			result += this.center(json, MINTITLEINDENT) + NEWLINE;
		}
		return result;
	}

	date(json) {
		console.log("date", json)
		let result = "";
		if (json) {
			result += this.center(json, MINTITLEINDENT) + NEWLINE + NEWLINE + NEWLINE;
		}
		return result;
	}

	synopsis(json) {
		console.log("synopsis")
		let result = "";
		if (json) {
			result += this.left(json.synopsisTitle) + NEWLINE + NEWLINE;
			result += this.synopsisParagraphs(json.synopsisParagraphs);
		}
		return result;
	}

	synopsisParagraphs(json) {
		console.log("synopsisParagraphs:", json, !!json, json.length)
		let result = "";
		if (json) {
			json.forEach(synopsisParagraph => {
				console.log("sP=", synopsisParagraph);
				result += this.synopsisParagraph(synopsisParagraph.synopsisParagraph)
			})
		}
		return result;
	}

	synopsisParagraph(json) {
		console.log("synopsisParagraph", json)
		let result = "";
		if (json) {
			result += this.left(json) + NEWLINE +  NEWLINE;
		}
		return result;
	}

	scenesPart(json) {
		console.log("scenesPart", json)
		let result = "";
		result += NEWLINE + this.left(json.scenesHeading) + NEWLINE  + NEWLINE ;
		return result;
	}

}	