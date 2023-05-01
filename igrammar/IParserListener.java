// Generated from java-escape by ANTLR 4.11.1
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
	 * Enter a parse tree produced by {@link IParser#indexing}.
	 * @param ctx the parse tree
	 */
	void enterIndexing(IParser.IndexingContext ctx);
	/**
	 * Exit a parse tree produced by {@link IParser#indexing}.
	 * @param ctx the parse tree
	 */
	void exitIndexing(IParser.IndexingContext ctx);
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
	 * Enter a parse tree produced by {@link IParser#proposition}.
	 * @param ctx the parse tree
	 */
	void enterProposition(IParser.PropositionContext ctx);
	/**
	 * Exit a parse tree produced by {@link IParser#proposition}.
	 * @param ctx the parse tree
	 */
	void exitProposition(IParser.PropositionContext ctx);
	/**
	 * Enter a parse tree produced by {@link IParser#disjunction}.
	 * @param ctx the parse tree
	 */
	void enterDisjunction(IParser.DisjunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link IParser#disjunction}.
	 * @param ctx the parse tree
	 */
	void exitDisjunction(IParser.DisjunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link IParser#conjunction}.
	 * @param ctx the parse tree
	 */
	void enterConjunction(IParser.ConjunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link IParser#conjunction}.
	 * @param ctx the parse tree
	 */
	void exitConjunction(IParser.ConjunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link IParser#relation}.
	 * @param ctx the parse tree
	 */
	void enterRelation(IParser.RelationContext ctx);
	/**
	 * Exit a parse tree produced by {@link IParser#relation}.
	 * @param ctx the parse tree
	 */
	void exitRelation(IParser.RelationContext ctx);
	/**
	 * Enter a parse tree produced by {@link IParser#relationOperator}.
	 * @param ctx the parse tree
	 */
	void enterRelationOperator(IParser.RelationOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link IParser#relationOperator}.
	 * @param ctx the parse tree
	 */
	void exitRelationOperator(IParser.RelationOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link IParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(IParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link IParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(IParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link IParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObject(IParser.ObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link IParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObject(IParser.ObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link IParser#keyValues}.
	 * @param ctx the parse tree
	 */
	void enterKeyValues(IParser.KeyValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link IParser#keyValues}.
	 * @param ctx the parse tree
	 */
	void exitKeyValues(IParser.KeyValuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link IParser#keyValue}.
	 * @param ctx the parse tree
	 */
	void enterKeyValue(IParser.KeyValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link IParser#keyValue}.
	 * @param ctx the parse tree
	 */
	void exitKeyValue(IParser.KeyValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link IParser#key}.
	 * @param ctx the parse tree
	 */
	void enterKey(IParser.KeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link IParser#key}.
	 * @param ctx the parse tree
	 */
	void exitKey(IParser.KeyContext ctx);
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
	 * Enter a parse tree produced by {@link IParser#semicolon}.
	 * @param ctx the parse tree
	 */
	void enterSemicolon(IParser.SemicolonContext ctx);
	/**
	 * Exit a parse tree produced by {@link IParser#semicolon}.
	 * @param ctx the parse tree
	 */
	void exitSemicolon(IParser.SemicolonContext ctx);
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
	 * Enter a parse tree produced by {@link IParser#ge}.
	 * @param ctx the parse tree
	 */
	void enterGe(IParser.GeContext ctx);
	/**
	 * Exit a parse tree produced by {@link IParser#ge}.
	 * @param ctx the parse tree
	 */
	void exitGe(IParser.GeContext ctx);
	/**
	 * Enter a parse tree produced by {@link IParser#gt}.
	 * @param ctx the parse tree
	 */
	void enterGt(IParser.GtContext ctx);
	/**
	 * Exit a parse tree produced by {@link IParser#gt}.
	 * @param ctx the parse tree
	 */
	void exitGt(IParser.GtContext ctx);
	/**
	 * Enter a parse tree produced by {@link IParser#eq}.
	 * @param ctx the parse tree
	 */
	void enterEq(IParser.EqContext ctx);
	/**
	 * Exit a parse tree produced by {@link IParser#eq}.
	 * @param ctx the parse tree
	 */
	void exitEq(IParser.EqContext ctx);
	/**
	 * Enter a parse tree produced by {@link IParser#ne}.
	 * @param ctx the parse tree
	 */
	void enterNe(IParser.NeContext ctx);
	/**
	 * Exit a parse tree produced by {@link IParser#ne}.
	 * @param ctx the parse tree
	 */
	void exitNe(IParser.NeContext ctx);
	/**
	 * Enter a parse tree produced by {@link IParser#le}.
	 * @param ctx the parse tree
	 */
	void enterLe(IParser.LeContext ctx);
	/**
	 * Exit a parse tree produced by {@link IParser#le}.
	 * @param ctx the parse tree
	 */
	void exitLe(IParser.LeContext ctx);
	/**
	 * Enter a parse tree produced by {@link IParser#lt}.
	 * @param ctx the parse tree
	 */
	void enterLt(IParser.LtContext ctx);
	/**
	 * Exit a parse tree produced by {@link IParser#lt}.
	 * @param ctx the parse tree
	 */
	void exitLt(IParser.LtContext ctx);
	/**
	 * Enter a parse tree produced by {@link IParser#set}.
	 * @param ctx the parse tree
	 */
	void enterSet(IParser.SetContext ctx);
	/**
	 * Exit a parse tree produced by {@link IParser#set}.
	 * @param ctx the parse tree
	 */
	void exitSet(IParser.SetContext ctx);
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
	 * Enter a parse tree produced by {@link IParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(IParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link IParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(IParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link IParser#trueValue}.
	 * @param ctx the parse tree
	 */
	void enterTrueValue(IParser.TrueValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link IParser#trueValue}.
	 * @param ctx the parse tree
	 */
	void exitTrueValue(IParser.TrueValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link IParser#falseValue}.
	 * @param ctx the parse tree
	 */
	void enterFalseValue(IParser.FalseValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link IParser#falseValue}.
	 * @param ctx the parse tree
	 */
	void exitFalseValue(IParser.FalseValueContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link IParser#dQString}.
	 * @param ctx the parse tree
	 */
	void enterDQString(IParser.DQStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link IParser#dQString}.
	 * @param ctx the parse tree
	 */
	void exitDQString(IParser.DQStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link IParser#sQString}.
	 * @param ctx the parse tree
	 */
	void enterSQString(IParser.SQStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link IParser#sQString}.
	 * @param ctx the parse tree
	 */
	void exitSQString(IParser.SQStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link IParser#and}.
	 * @param ctx the parse tree
	 */
	void enterAnd(IParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by {@link IParser#and}.
	 * @param ctx the parse tree
	 */
	void exitAnd(IParser.AndContext ctx);
	/**
	 * Enter a parse tree produced by {@link IParser#or}.
	 * @param ctx the parse tree
	 */
	void enterOr(IParser.OrContext ctx);
	/**
	 * Exit a parse tree produced by {@link IParser#or}.
	 * @param ctx the parse tree
	 */
	void exitOr(IParser.OrContext ctx);
	/**
	 * Enter a parse tree produced by {@link IParser#not}.
	 * @param ctx the parse tree
	 */
	void enterNot(IParser.NotContext ctx);
	/**
	 * Exit a parse tree produced by {@link IParser#not}.
	 * @param ctx the parse tree
	 */
	void exitNot(IParser.NotContext ctx);
	/**
	 * Enter a parse tree produced by {@link IParser#lBracket}.
	 * @param ctx the parse tree
	 */
	void enterLBracket(IParser.LBracketContext ctx);
	/**
	 * Exit a parse tree produced by {@link IParser#lBracket}.
	 * @param ctx the parse tree
	 */
	void exitLBracket(IParser.LBracketContext ctx);
	/**
	 * Enter a parse tree produced by {@link IParser#rBracket}.
	 * @param ctx the parse tree
	 */
	void enterRBracket(IParser.RBracketContext ctx);
	/**
	 * Exit a parse tree produced by {@link IParser#rBracket}.
	 * @param ctx the parse tree
	 */
	void exitRBracket(IParser.RBracketContext ctx);
	/**
	 * Enter a parse tree produced by {@link IParser#lCurly}.
	 * @param ctx the parse tree
	 */
	void enterLCurly(IParser.LCurlyContext ctx);
	/**
	 * Exit a parse tree produced by {@link IParser#lCurly}.
	 * @param ctx the parse tree
	 */
	void exitLCurly(IParser.LCurlyContext ctx);
	/**
	 * Enter a parse tree produced by {@link IParser#rCurly}.
	 * @param ctx the parse tree
	 */
	void enterRCurly(IParser.RCurlyContext ctx);
	/**
	 * Exit a parse tree produced by {@link IParser#rCurly}.
	 * @param ctx the parse tree
	 */
	void exitRCurly(IParser.RCurlyContext ctx);
}