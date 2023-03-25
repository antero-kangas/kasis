// Generated from ManuscriptParser.g4 by ANTLR 4.9
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ManuscriptParser}.
 */
public interface ManuscriptParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ManuscriptParser#manuscript}.
	 * @param ctx the parse tree
	 */
	void enterManuscript(ManuscriptParser.ManuscriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuscriptParser#manuscript}.
	 * @param ctx the parse tree
	 */
	void exitManuscript(ManuscriptParser.ManuscriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManuscriptParser#titleParagraph}.
	 * @param ctx the parse tree
	 */
	void enterTitleParagraph(ManuscriptParser.TitleParagraphContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuscriptParser#titleParagraph}.
	 * @param ctx the parse tree
	 */
	void exitTitleParagraph(ManuscriptParser.TitleParagraphContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManuscriptParser#title}.
	 * @param ctx the parse tree
	 */
	void enterTitle(ManuscriptParser.TitleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuscriptParser#title}.
	 * @param ctx the parse tree
	 */
	void exitTitle(ManuscriptParser.TitleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManuscriptParser#authorParagraph}.
	 * @param ctx the parse tree
	 */
	void enterAuthorParagraph(ManuscriptParser.AuthorParagraphContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuscriptParser#authorParagraph}.
	 * @param ctx the parse tree
	 */
	void exitAuthorParagraph(ManuscriptParser.AuthorParagraphContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManuscriptParser#author}.
	 * @param ctx the parse tree
	 */
	void enterAuthor(ManuscriptParser.AuthorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuscriptParser#author}.
	 * @param ctx the parse tree
	 */
	void exitAuthor(ManuscriptParser.AuthorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManuscriptParser#dateParagraph}.
	 * @param ctx the parse tree
	 */
	void enterDateParagraph(ManuscriptParser.DateParagraphContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuscriptParser#dateParagraph}.
	 * @param ctx the parse tree
	 */
	void exitDateParagraph(ManuscriptParser.DateParagraphContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManuscriptParser#date}.
	 * @param ctx the parse tree
	 */
	void enterDate(ManuscriptParser.DateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuscriptParser#date}.
	 * @param ctx the parse tree
	 */
	void exitDate(ManuscriptParser.DateContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManuscriptParser#synopsisPart}.
	 * @param ctx the parse tree
	 */
	void enterSynopsisPart(ManuscriptParser.SynopsisPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuscriptParser#synopsisPart}.
	 * @param ctx the parse tree
	 */
	void exitSynopsisPart(ManuscriptParser.SynopsisPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManuscriptParser#synopsisParagraphs}.
	 * @param ctx the parse tree
	 */
	void enterSynopsisParagraphs(ManuscriptParser.SynopsisParagraphsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuscriptParser#synopsisParagraphs}.
	 * @param ctx the parse tree
	 */
	void exitSynopsisParagraphs(ManuscriptParser.SynopsisParagraphsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManuscriptParser#synopsisParagraph}.
	 * @param ctx the parse tree
	 */
	void enterSynopsisParagraph(ManuscriptParser.SynopsisParagraphContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuscriptParser#synopsisParagraph}.
	 * @param ctx the parse tree
	 */
	void exitSynopsisParagraph(ManuscriptParser.SynopsisParagraphContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManuscriptParser#wss}.
	 * @param ctx the parse tree
	 */
	void enterWss(ManuscriptParser.WssContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuscriptParser#wss}.
	 * @param ctx the parse tree
	 */
	void exitWss(ManuscriptParser.WssContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManuscriptParser#eol}.
	 * @param ctx the parse tree
	 */
	void enterEol(ManuscriptParser.EolContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuscriptParser#eol}.
	 * @param ctx the parse tree
	 */
	void exitEol(ManuscriptParser.EolContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManuscriptParser#scenesPart}.
	 * @param ctx the parse tree
	 */
	void enterScenesPart(ManuscriptParser.ScenesPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuscriptParser#scenesPart}.
	 * @param ctx the parse tree
	 */
	void exitScenesPart(ManuscriptParser.ScenesPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManuscriptParser#scenes}.
	 * @param ctx the parse tree
	 */
	void enterScenes(ManuscriptParser.ScenesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuscriptParser#scenes}.
	 * @param ctx the parse tree
	 */
	void exitScenes(ManuscriptParser.ScenesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManuscriptParser#scene}.
	 * @param ctx the parse tree
	 */
	void enterScene(ManuscriptParser.SceneContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuscriptParser#scene}.
	 * @param ctx the parse tree
	 */
	void exitScene(ManuscriptParser.SceneContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManuscriptParser#sceneHeading}.
	 * @param ctx the parse tree
	 */
	void enterSceneHeading(ManuscriptParser.SceneHeadingContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuscriptParser#sceneHeading}.
	 * @param ctx the parse tree
	 */
	void exitSceneHeading(ManuscriptParser.SceneHeadingContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManuscriptParser#heading}.
	 * @param ctx the parse tree
	 */
	void enterHeading(ManuscriptParser.HeadingContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuscriptParser#heading}.
	 * @param ctx the parse tree
	 */
	void exitHeading(ManuscriptParser.HeadingContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManuscriptParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(ManuscriptParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuscriptParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(ManuscriptParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManuscriptParser#replique}.
	 * @param ctx the parse tree
	 */
	void enterReplique(ManuscriptParser.RepliqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuscriptParser#replique}.
	 * @param ctx the parse tree
	 */
	void exitReplique(ManuscriptParser.RepliqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManuscriptParser#parenthesis}.
	 * @param ctx the parse tree
	 */
	void enterParenthesis(ManuscriptParser.ParenthesisContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuscriptParser#parenthesis}.
	 * @param ctx the parse tree
	 */
	void exitParenthesis(ManuscriptParser.ParenthesisContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManuscriptParser#anyTextOrCommand}.
	 * @param ctx the parse tree
	 */
	void enterAnyTextOrCommand(ManuscriptParser.AnyTextOrCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuscriptParser#anyTextOrCommand}.
	 * @param ctx the parse tree
	 */
	void exitAnyTextOrCommand(ManuscriptParser.AnyTextOrCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManuscriptParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(ManuscriptParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuscriptParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(ManuscriptParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManuscriptParser#capitalword}.
	 * @param ctx the parse tree
	 */
	void enterCapitalword(ManuscriptParser.CapitalwordContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuscriptParser#capitalword}.
	 * @param ctx the parse tree
	 */
	void exitCapitalword(ManuscriptParser.CapitalwordContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManuscriptParser#anyText}.
	 * @param ctx the parse tree
	 */
	void enterAnyText(ManuscriptParser.AnyTextContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuscriptParser#anyText}.
	 * @param ctx the parse tree
	 */
	void exitAnyText(ManuscriptParser.AnyTextContext ctx);
}