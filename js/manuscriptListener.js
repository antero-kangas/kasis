// Generated from ManuscriptParser.g4 by ANTLR 4.9
// jshint ignore: start
import antlr4 from 'antlr4';
import ManuscriptParserListener from '../grammar/ManuscriptParserListener.js';

// This class defines a complete listener for a parse tree produced by ManuscriptParser.
export default class ManuscriptListener extends ManuscriptParserListener {

    // override default listener behavior
    constructor() {
        super();

		this.manuscript = {}				// lopputulos
		this.stack = [];				// pino, jossa tulosolmut
		this.current = this; 	        // solmu, jossa kulloinkin ollaan
		this.ids = [];					// kaikki määritetyt id:t
		// Löydettyjä virheitä ja varoituksia
		this.syntaxErrors = [];			// Löydetyt syntaksivirheet
		this.semanticErrors = [];		// Löydetyt semanttiset virheet
		this.semanticWarnings = [];		// Löydetyt semanttiset varoitukset

		this.report = "";				// Kootaan virheilmoitukset ja varoitukset 

	}

	push() {
		/**
		 * Current talteen  
		 * Kutsuttava aina ennen kuin lisätään {} tai [], johon mennään
		 */
		this.stack.push(this.current);
	}

	back() {
		/**
		 * Current takaisin
		 * Kutsuttava, kun palataan pushin vastinkohtaan
		 */
		this.current = this.stack.pop();
	}

	add(key, value) {
		/**
		 * Lisätään (key: value) -pari:
		 * 
		 *   Jos lisäys taulukkoon, niin taulukon loppuun
		 *   Jos lisäys objektiin, niin siihen
		 */
		if (Array.isArray(this.current)) {
			let item = {};
			item[key] = value;
			this.current.push(item);
		} else {
			this.current[key] = value;
		}
		// lisättyyn tyhjään Arrayhin tai objektiin aina jatketaan juuri siihen!
		if (this.isEmpty(value)) return value;
		return this.current;
	}

	addAndGo(key, value) {
		/**
		 * Current talteen  
		 * Kutsuttava aina ennen kuin lisätään {} tai [], johon mennään
		 * Lisätään pari ja mennään sinne.
		 */
		this.push();
		this.current = this.add(key, value);
	}

	isEmpty(obj) {
		if (Array.isArray(obj)) return obj.length === 0;
		return Object.keys(obj).length === 0;
	}


	// Enter a parse tree produced by ManuscriptParser#manuscript.
	enterManuscript(ctx) {
		this.addAndGo ("manuscript", {});
	}

	// Exit a parse tree produced by ManuscriptParser#manuscript.
	exitManuscript(ctx) {
		this.back();
	}


	// Enter a parse tree produced by ManuscriptParser#titleParagraph.
	enterTitleParagraph(ctx) {
	}

	// Exit a parse tree produced by ManuscriptParser#titleParagraph.
	exitTitleParagraph(ctx) {
	}


	// Enter a parse tree produced by ManuscriptParser#title.
	enterTitle(ctx) {
		this.add("title", ctx.getText().trim());
	}

	// Exit a parse tree produced by ManuscriptParser#title.
	exitTitle(ctx) {
	}


	// Enter a parse tree produced by ManuscriptParser#authorParagraph.
	enterAuthorParagraph(ctx) {
	}

	// Exit a parse tree produced by ManuscriptParser#authorParagraph.
	exitAuthorParagraph(ctx) {
	}


	// Enter a parse tree produced by ManuscriptParser#author.
	enterAuthor(ctx) {
		this.add("author", ctx.getText().trim());
	}

	// Exit a parse tree produced by ManuscriptParser#author.
	exitAuthor(ctx) {
	}


	// Enter a parse tree produced by ManuscriptParser#dateParagraph.
	enterDateParagraph(ctx) {
	}

	// Exit a parse tree produced by ManuscriptParser#dateParagraph.
	exitDateParagraph(ctx) {
	}


	// Enter a parse tree produced by ManuscriptParser#date.
	enterDate(ctx) {
		this.add("date", ctx.getText().trim());
	}

	// Exit a parse tree produced by ManuscriptParser#date.
	exitDate(ctx) {
	}


	// Enter a parse tree produced by ManuscriptParser#synopsisPart.
	enterSynopsisPart(ctx) {
		this.addAndGo("synopsis", {});
	}

	// Enter a parse tree produced by ManuscriptParser#synopsisParagraphs.
	enterSynopsisParagraphs(ctx) {
		this.addAndGo("synopsisParagraphs", []);
	}

	// Exit a parse tree produced by ManuscriptParser#synopsisParagraphs.
	exitSynopsisParagraphs(ctx) {
		this.back();
	}

	// Enter a parse tree produced by ManuscriptParser#synopsisParagraph.
	enterSynopsisParagraph(ctx) {
		this.add("synopsisParagraph", ctx.getText().trim());
	}

	// Exit a parse tree produced by ManuscriptParser#synopsisParagraph.
	exitSynopsisParagraph(ctx) {
	}

	// Exit a parse tree produced by ManuscriptParser#synopsisPart.
	exitSynopsisPart(ctx) {
		this.back();
	}

	// Enter a parse tree produced by ManuscriptParser#synopsisTitle.
	enterSynopsisTitle(ctx) {
		this.add("synopsisTitle", ctx.getText());
	}

	// Exit a parse tree produced by ManuscriptParser#synopsisTitle.
	exitSynopsisTitle(ctx) {
	}

	// Enter a parse tree produced by ManuscriptParser#synopsisParagraph.
	enterSynopsisParagraph(ctx) {
		this.add("synopsisParagraph", ctx.getText().trim());
	}

	// Exit a parse tree produced by ManuscriptParser#synopsisParagraph.
	exitSynopsisParagraph(ctx) {
	}


	// Enter a parse tree produced by ManuscriptParser#wss.
	enterWss(ctx) {
	}

	// Exit a parse tree produced by ManuscriptParser#wss.
	exitWss(ctx) {
	}


	// Enter a parse tree produced by ManuscriptParser#eol.
	enterEol(ctx) {
	}

	// Exit a parse tree produced by ManuscriptParser#eol.
	exitEol(ctx) {
	}


	// Enter a parse tree produced by ManuscriptParser#scenesPart.
	enterScenesPart(ctx) {
		this.addAndGo("scenesPart", {});
	}

	// Exit a parse tree produced by ManuscriptParser#scenesPart.
	exitScenesPart(ctx) {
		this.back();
	}


	// Enter a parse tree produced by ManuscriptParser#scenesHeading.
	enterScenesHeading(ctx) {
		this.add("scsnesHeading", ctx.getText().trim());
	}

	// Exit a parse tree produced by ManuscriptParser#scenesHeading.
	exitScenesHeading(ctx) {
	}

	// Enter a parse tree produced by ManuscriptParser#scenes.
	enterScenes(ctx) {
		this.addAndGo("scenes", []);
	}

	// Exit a parse tree produced by ManuscriptParser#scenes.
	exitScenes(ctx) {
		this.back();
	}


	// Enter a parse tree produced by ManuscriptParser#scene.
	enterScene(ctx) {
		this.addAndGo("scene", []);
	}

	// Exit a parse tree produced by ManuscriptParser#scene.
	exitScene(ctx) {
		this.back();
	}


	// Enter a parse tree produced by ManuscriptParser#sceneHeading.
	enterSceneHeading(ctx) {
		this.add("sceneHeading", ctx.getText().trim())
	}

	// Exit a parse tree produced by ManuscriptParser#sceneHeading.
	exitSceneHeading(ctx) {
	}


	// Enter a parse tree produced by ManuscriptParser#heading.
	enterHeading(ctx) {
	}

	// Exit a parse tree produced by ManuscriptParser#heading.
	exitHeading(ctx) {
	}


	// Enter a parse tree produced by ManuscriptParser#name.
	enterName(ctx) {
		this.add("name", ctx.getText().trim())
	}

	// Exit a parse tree produced by ManuscriptParser#name.
	exitName(ctx) {
	}


	// Enter a parse tree produced by ManuscriptParser#replique.
	enterReplique(ctx) {
		this.add("replique", ctx.getText().trim())
	}

	// Exit a parse tree produced by ManuscriptParser#replique.
	exitReplique(ctx) {
	}


	// Enter a parse tree produced by ManuscriptParser#parenthesis.
	enterParenthesis(ctx) {
		this.add("parenthesis", ctx.getText().trim())
	}

	// Exit a parse tree produced by ManuscriptParser#parenthesis.
	exitParenthesis(ctx) {
	}


	// Enter a parse tree produced by ManuscriptParser#anyTextOrCommand.
	enterAnyTextOrCommand(ctx) {
	}

	// Exit a parse tree produced by ManuscriptParser#anyTextOrCommand.
	exitAnyTextOrCommand(ctx) {
	}


	// Enter a parse tree produced by ManuscriptParser#command.
	enterCommand(ctx) {
	}

	// Exit a parse tree produced by ManuscriptParser#command.
	exitCommand(ctx) {
	}


	// Enter a parse tree produced by ManuscriptParser#capitalword.
	enterCapitalword(ctx) {
	}

	// Exit a parse tree produced by ManuscriptParser#capitalword.
	exitCapitalword(ctx) {
	}


	// Enter a parse tree produced by ManuscriptParser#anyText.
	enterAnyText(ctx) {
	}

	// Exit a parse tree produced by ManuscriptParser#anyText.
	exitAnyText(ctx) {
	}



}