// Generated from SoundParser.g4 by ANTLR 4.9
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SoundParser}.
 */
public interface SoundParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SoundParser#sound}.
	 * @param ctx the parse tree
	 */
	void enterSound(SoundParser.SoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoundParser#sound}.
	 * @param ctx the parse tree
	 */
	void exitSound(SoundParser.SoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoundParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(SoundParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoundParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(SoundParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoundParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(SoundParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoundParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(SoundParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoundParser#def}.
	 * @param ctx the parse tree
	 */
	void enterDef(SoundParser.DefContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoundParser#def}.
	 * @param ctx the parse tree
	 */
	void exitDef(SoundParser.DefContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoundParser#defParams}.
	 * @param ctx the parse tree
	 */
	void enterDefParams(SoundParser.DefParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoundParser#defParams}.
	 * @param ctx the parse tree
	 */
	void exitDefParams(SoundParser.DefParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoundParser#calls}.
	 * @param ctx the parse tree
	 */
	void enterCalls(SoundParser.CallsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoundParser#calls}.
	 * @param ctx the parse tree
	 */
	void exitCalls(SoundParser.CallsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoundParser#call}.
	 * @param ctx the parse tree
	 */
	void enterCall(SoundParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoundParser#call}.
	 * @param ctx the parse tree
	 */
	void exitCall(SoundParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoundParser#callParams}.
	 * @param ctx the parse tree
	 */
	void enterCallParams(SoundParser.CallParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoundParser#callParams}.
	 * @param ctx the parse tree
	 */
	void exitCallParams(SoundParser.CallParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoundParser#callParam}.
	 * @param ctx the parse tree
	 */
	void enterCallParam(SoundParser.CallParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoundParser#callParam}.
	 * @param ctx the parse tree
	 */
	void exitCallParam(SoundParser.CallParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoundParser#semicolon}.
	 * @param ctx the parse tree
	 */
	void enterSemicolon(SoundParser.SemicolonContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoundParser#semicolon}.
	 * @param ctx the parse tree
	 */
	void exitSemicolon(SoundParser.SemicolonContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoundParser#comma}.
	 * @param ctx the parse tree
	 */
	void enterComma(SoundParser.CommaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoundParser#comma}.
	 * @param ctx the parse tree
	 */
	void exitComma(SoundParser.CommaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoundParser#lParen}.
	 * @param ctx the parse tree
	 */
	void enterLParen(SoundParser.LParenContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoundParser#lParen}.
	 * @param ctx the parse tree
	 */
	void exitLParen(SoundParser.LParenContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoundParser#rParen}.
	 * @param ctx the parse tree
	 */
	void enterRParen(SoundParser.RParenContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoundParser#rParen}.
	 * @param ctx the parse tree
	 */
	void exitRParen(SoundParser.RParenContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoundParser#lBracket}.
	 * @param ctx the parse tree
	 */
	void enterLBracket(SoundParser.LBracketContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoundParser#lBracket}.
	 * @param ctx the parse tree
	 */
	void exitLBracket(SoundParser.LBracketContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoundParser#rBracket}.
	 * @param ctx the parse tree
	 */
	void enterRBracket(SoundParser.RBracketContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoundParser#rBracket}.
	 * @param ctx the parse tree
	 */
	void exitRBracket(SoundParser.RBracketContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoundParser#equal}.
	 * @param ctx the parse tree
	 */
	void enterEqual(SoundParser.EqualContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoundParser#equal}.
	 * @param ctx the parse tree
	 */
	void exitEqual(SoundParser.EqualContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoundParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(SoundParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoundParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(SoundParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoundParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(SoundParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoundParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(SoundParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoundParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(SoundParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoundParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(SoundParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoundParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(SoundParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoundParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(SoundParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoundParser#elements}.
	 * @param ctx the parse tree
	 */
	void enterElements(SoundParser.ElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoundParser#elements}.
	 * @param ctx the parse tree
	 */
	void exitElements(SoundParser.ElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoundParser#elem}.
	 * @param ctx the parse tree
	 */
	void enterElem(SoundParser.ElemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoundParser#elem}.
	 * @param ctx the parse tree
	 */
	void exitElem(SoundParser.ElemContext ctx);
}