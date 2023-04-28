// Generated from IParser.g4 by ANTLR 4.9
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link IParser}.
 */
public interface IParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link IParser#i}.
	 * @param ctx the parse tree
	 */
	void enterI(IParser.IContext ctx);
	/**
	 * Exit a parse tree produced by {@link IParser#i}.
	 * @param ctx the parse tree
	 */
	void exitI(IParser.IContext ctx);
	/**
	 * Enter a parse tree produced by {@link IParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(IParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link IParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(IParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link IParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(IParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link IParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(IParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link IParser#definition}.
	 * @param ctx the parse tree
	 */
	void enterDefinition(IParser.DefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link IParser#definition}.
	 * @param ctx the parse tree
	 */
	void exitDefinition(IParser.DefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link IParser#overload}.
	 * @param ctx the parse tree
	 */
	void enterOverload(IParser.OverloadContext ctx);
	/**
	 * Exit a parse tree produced by {@link IParser#overload}.
	 * @param ctx the parse tree
	 */
	void exitOverload(IParser.OverloadContext ctx);
	/**
	 * Enter a parse tree produced by {@link IParser#sList}.
	 * @param ctx the parse tree
	 */
	void enterSList(IParser.SListContext ctx);
	/**
	 * Exit a parse tree produced by {@link IParser#sList}.
	 * @param ctx the parse tree
	 */
	void exitSList(IParser.SListContext ctx);
	/**
	 * Enter a parse tree produced by {@link IParser#sParam}.
	 * @param ctx the parse tree
	 */
	void enterSParam(IParser.SParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link IParser#sParam}.
	 * @param ctx the parse tree
	 */
	void exitSParam(IParser.SParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link IParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(IParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link IParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(IParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link IParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void enterDefaultValue(IParser.DefaultValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link IParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void exitDefaultValue(IParser.DefaultValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link IParser#call}.
	 * @param ctx the parse tree
	 */
	void enterCall(IParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by {@link IParser#call}.
	 * @param ctx the parse tree
	 */
	void exitCall(IParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by {@link IParser#vList}.
	 * @param ctx the parse tree
	 */
	void enterVList(IParser.VListContext ctx);
	/**
	 * Exit a parse tree produced by {@link IParser#vList}.
	 * @param ctx the parse tree
	 */
	void exitVList(IParser.VListContext ctx);
	/**
	 * Enter a parse tree produced by {@link IParser#vParam}.
	 * @param ctx the parse tree
	 */
	void enterVParam(IParser.VParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link IParser#vParam}.
	 * @param ctx the parse tree
	 */
	void exitVParam(IParser.VParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link IParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(IParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link IParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(IParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link IParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(IParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link IParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(IParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link IParser#power}.
	 * @param ctx the parse tree
	 */
	void enterPower(IParser.PowerContext ctx);
	/**
	 * Exit a parse tree produced by {@link IParser#power}.
	 * @param ctx the parse tree
	 */
	void exitPower(IParser.PowerContext ctx);
	/**
	 * Enter a parse tree produced by {@link IParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(IParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link IParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(IParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link IParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(IParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link IParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(IParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link IParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(IParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link IParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(IParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link IParser#dollar}.
	 * @param ctx the parse tree
	 */
	void enterDollar(IParser.DollarContext ctx);
	/**
	 * Exit a parse tree produced by {@link IParser#dollar}.
	 * @param ctx the parse tree
	 */
	void exitDollar(IParser.DollarContext ctx);
	/**
	 * Enter a parse tree produced by {@link IParser#lParen}.
	 * @param ctx the parse tree
	 */
	void enterLParen(IParser.LParenContext ctx);
	/**
	 * Exit a parse tree produced by {@link IParser#lParen}.
	 * @param ctx the parse tree
	 */
	void exitLParen(IParser.LParenContext ctx);
	/**
	 * Enter a parse tree produced by {@link IParser#rParen}.
	 * @param ctx the parse tree
	 */
	void enterRParen(IParser.RParenContext ctx);
	/**
	 * Exit a parse tree produced by {@link IParser#rParen}.
	 * @param ctx the parse tree
	 */
	void exitRParen(IParser.RParenContext ctx);
	/**
	 * Enter a parse tree produced by {@link IParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(IParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link IParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(IParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link IParser#defines}.
	 * @param ctx the parse tree
	 */
	void enterDefines(IParser.DefinesContext ctx);
	/**
	 * Exit a parse tree produced by {@link IParser#defines}.
	 * @param ctx the parse tree
	 */
	void exitDefines(IParser.DefinesContext ctx);
	/**
	 * Enter a parse tree produced by {@link IParser#equal}.
	 * @param ctx the parse tree
	 */
	void enterEqual(IParser.EqualContext ctx);
	/**
	 * Exit a parse tree produced by {@link IParser#equal}.
	 * @param ctx the parse tree
	 */
	void exitEqual(IParser.EqualContext ctx);
	/**
	 * Enter a parse tree produced by {@link IParser#comma}.
	 * @param ctx the parse tree
	 */
	void enterComma(IParser.CommaContext ctx);
	/**
	 * Exit a parse tree produced by {@link IParser#comma}.
	 * @param ctx the parse tree
	 */
	void exitComma(IParser.CommaContext ctx);
	/**
	 * Enter a parse tree produced by {@link IParser#colon}.
	 * @param ctx the parse tree
	 */
	void enterColon(IParser.ColonContext ctx);
	/**
	 * Exit a parse tree produced by {@link IParser#colon}.
	 * @param ctx the parse tree
	 */
	void exitColon(IParser.ColonContext ctx);
	/**
	 * Enter a parse tree produced by {@link IParser#plus}.
	 * @param ctx the parse tree
	 */
	void enterPlus(IParser.PlusContext ctx);
	/**
	 * Exit a parse tree produced by {@link IParser#plus}.
	 * @param ctx the parse tree
	 */
	void exitPlus(IParser.PlusContext ctx);
	/**
	 * Enter a parse tree produced by {@link IParser#minus}.
	 * @param ctx the parse tree
	 */
	void enterMinus(IParser.MinusContext ctx);
	/**
	 * Exit a parse tree produced by {@link IParser#minus}.
	 * @param ctx the parse tree
	 */
	void exitMinus(IParser.MinusContext ctx);
	/**
	 * Enter a parse tree produced by {@link IParser#toPower}.
	 * @param ctx the parse tree
	 */
	void enterToPower(IParser.ToPowerContext ctx);
	/**
	 * Exit a parse tree produced by {@link IParser#toPower}.
	 * @param ctx the parse tree
	 */
	void exitToPower(IParser.ToPowerContext ctx);
	/**
	 * Enter a parse tree produced by {@link IParser#times}.
	 * @param ctx the parse tree
	 */
	void enterTimes(IParser.TimesContext ctx);
	/**
	 * Exit a parse tree produced by {@link IParser#times}.
	 * @param ctx the parse tree
	 */
	void exitTimes(IParser.TimesContext ctx);
	/**
	 * Enter a parse tree produced by {@link IParser#div}.
	 * @param ctx the parse tree
	 */
	void enterDiv(IParser.DivContext ctx);
	/**
	 * Exit a parse tree produced by {@link IParser#div}.
	 * @param ctx the parse tree
	 */
	void exitDiv(IParser.DivContext ctx);
	/**
	 * Enter a parse tree produced by {@link IParser#mod}.
	 * @param ctx the parse tree
	 */
	void enterMod(IParser.ModContext ctx);
	/**
	 * Exit a parse tree produced by {@link IParser#mod}.
	 * @param ctx the parse tree
	 */
	void exitMod(IParser.ModContext ctx);
	/**
	 * Enter a parse tree produced by {@link IParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(IParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link IParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(IParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link IParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(IParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link IParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(IParser.StringContext ctx);
}