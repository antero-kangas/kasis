// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class IParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MultiLineComment=1, SingleLineComment=2, WhiteSpace=3, Dollar=4, Semicolon=5, 
		LParen=6, RParen=7, Number=8, Id=9, Equal=10, Comma=11, Colon=12, Plus=13, 
		Minus=14, ToPower=15, Times=16, Div=17, Mod=18, DQString=19, SQString=20;
	public static final int
		RULE_i = 0, RULE_statements = 1, RULE_statement = 2, RULE_definition = 3, 
		RULE_sList = 4, RULE_sParam = 5, RULE_type = 6, RULE_defaultValue = 7, 
		RULE_call = 8, RULE_vList = 9, RULE_vParam = 10, RULE_assignment = 11, 
		RULE_expression = 12, RULE_power = 13, RULE_term = 14, RULE_factor = 15, 
		RULE_value = 16, RULE_dollar = 17, RULE_lParen = 18, RULE_rParen = 19, 
		RULE_id = 20, RULE_equal = 21, RULE_comma = 22, RULE_colon = 23, RULE_plus = 24, 
		RULE_minus = 25, RULE_toPower = 26, RULE_times = 27, RULE_div = 28, RULE_mod = 29, 
		RULE_number = 30, RULE_string = 31;
	private static String[] makeRuleNames() {
		return new String[] {
			"i", "statements", "statement", "definition", "sList", "sParam", "type", 
			"defaultValue", "call", "vList", "vParam", "assignment", "expression", 
			"power", "term", "factor", "value", "dollar", "lParen", "rParen", "id", 
			"equal", "comma", "colon", "plus", "minus", "toPower", "times", "div", 
			"mod", "number", "string"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'#'", "';'", "'('", "')'", null, null, "'='", 
			"','", "':'", "'+'", "'-'", "'\\u02C6'", "'*'", "'/'", "'%'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "MultiLineComment", "SingleLineComment", "WhiteSpace", "Dollar", 
			"Semicolon", "LParen", "RParen", "Number", "Id", "Equal", "Comma", "Colon", 
			"Plus", "Minus", "ToPower", "Times", "Div", "Mod", "DQString", "SQString"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public IParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IContext extends ParserRuleContext {
		public List<DollarContext> dollar() {
			return getRuleContexts(DollarContext.class);
		}
		public DollarContext dollar(int i) {
			return getRuleContext(DollarContext.class,i);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public IContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_i; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IParserListener ) ((IParserListener)listener).enterI(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IParserListener ) ((IParserListener)listener).exitI(this);
		}
	}

	public final IContext i() throws RecognitionException {
		IContext _localctx = new IContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_i);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			dollar();
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 1598272L) != 0) {
				{
				setState(65);
				statements(0);
				}
			}

			setState(68);
			dollar();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementsContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public TerminalNode Semicolon() { return getToken(IParser.Semicolon, 0); }
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IParserListener ) ((IParserListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IParserListener ) ((IParserListener)listener).exitStatements(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		return statements(0);
	}

	private StatementsContext statements(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		StatementsContext _localctx = new StatementsContext(_ctx, _parentState);
		StatementsContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_statements, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(71);
			statement();
			}
			_ctx.stop = _input.LT(-1);
			setState(80);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new StatementsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_statements);
					setState(73);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(75);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Semicolon) {
						{
						setState(74);
						match(Semicolon);
						}
					}

					setState(77);
					statements(3);
					}
					} 
				}
				setState(82);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public DefinitionContext definition() {
			return getRuleContext(DefinitionContext.class,0);
		}
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LParenContext lParen() {
			return getRuleContext(LParenContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public RParenContext rParen() {
			return getRuleContext(RParenContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IParserListener ) ((IParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IParserListener ) ((IParserListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(91);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				definition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				call();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(85);
				assignment();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(86);
				expression(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(87);
				lParen();
				setState(88);
				statements(0);
				setState(89);
				rParen();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DefinitionContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public LParenContext lParen() {
			return getRuleContext(LParenContext.class,0);
		}
		public SListContext sList() {
			return getRuleContext(SListContext.class,0);
		}
		public RParenContext rParen() {
			return getRuleContext(RParenContext.class,0);
		}
		public EqualContext equal() {
			return getRuleContext(EqualContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public DefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IParserListener ) ((IParserListener)listener).enterDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IParserListener ) ((IParserListener)listener).exitDefinition(this);
		}
	}

	public final DefinitionContext definition() throws RecognitionException {
		DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			id();
			setState(94);
			lParen();
			setState(95);
			sList();
			setState(96);
			rParen();
			setState(97);
			equal();
			setState(98);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SListContext extends ParserRuleContext {
		public List<SParamContext> sParam() {
			return getRuleContexts(SParamContext.class);
		}
		public SParamContext sParam(int i) {
			return getRuleContext(SParamContext.class,i);
		}
		public CommaContext comma() {
			return getRuleContext(CommaContext.class,0);
		}
		public SListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IParserListener ) ((IParserListener)listener).enterSList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IParserListener ) ((IParserListener)listener).exitSList(this);
		}
	}

	public final SListContext sList() throws RecognitionException {
		SListContext _localctx = new SListContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_sList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			sParam();
			{
			setState(101);
			comma();
			setState(102);
			sParam();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SParamContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ColonContext colon() {
			return getRuleContext(ColonContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public EqualContext equal() {
			return getRuleContext(EqualContext.class,0);
		}
		public DefaultValueContext defaultValue() {
			return getRuleContext(DefaultValueContext.class,0);
		}
		public SParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IParserListener ) ((IParserListener)listener).enterSParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IParserListener ) ((IParserListener)listener).exitSParam(this);
		}
	}

	public final SParamContext sParam() throws RecognitionException {
		SParamContext _localctx = new SParamContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_sParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			id();
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(105);
				colon();
				setState(106);
				type();
				}
			}

			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Equal) {
				{
				setState(110);
				equal();
				setState(111);
				defaultValue();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IParserListener ) ((IParserListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IParserListener ) ((IParserListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DefaultValueContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DefaultValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IParserListener ) ((IParserListener)listener).enterDefaultValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IParserListener ) ((IParserListener)listener).exitDefaultValue(this);
		}
	}

	public final DefaultValueContext defaultValue() throws RecognitionException {
		DefaultValueContext _localctx = new DefaultValueContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_defaultValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CallContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public LParenContext lParen() {
			return getRuleContext(LParenContext.class,0);
		}
		public VListContext vList() {
			return getRuleContext(VListContext.class,0);
		}
		public RParenContext rParen() {
			return getRuleContext(RParenContext.class,0);
		}
		public CallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IParserListener ) ((IParserListener)listener).enterCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IParserListener ) ((IParserListener)listener).exitCall(this);
		}
	}

	public final CallContext call() throws RecognitionException {
		CallContext _localctx = new CallContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			id();
			setState(120);
			lParen();
			setState(121);
			vList();
			setState(122);
			rParen();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VListContext extends ParserRuleContext {
		public List<VParamContext> vParam() {
			return getRuleContexts(VParamContext.class);
		}
		public VParamContext vParam(int i) {
			return getRuleContext(VParamContext.class,i);
		}
		public List<CommaContext> comma() {
			return getRuleContexts(CommaContext.class);
		}
		public CommaContext comma(int i) {
			return getRuleContext(CommaContext.class,i);
		}
		public VListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IParserListener ) ((IParserListener)listener).enterVList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IParserListener ) ((IParserListener)listener).exitVList(this);
		}
	}

	public final VListContext vList() throws RecognitionException {
		VListContext _localctx = new VListContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_vList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			vParam();
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(125);
				comma();
				setState(126);
				vParam();
				}
				}
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VParamContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IParserListener ) ((IParserListener)listener).enterVParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IParserListener ) ((IParserListener)listener).exitVParam(this);
		}
	}

	public final VParamContext vParam() throws RecognitionException {
		VParamContext _localctx = new VParamContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_vParam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public EqualContext equal() {
			return getRuleContext(EqualContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IParserListener ) ((IParserListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IParserListener ) ((IParserListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			id();
			setState(136);
			equal();
			setState(137);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public PowerContext power() {
			return getRuleContext(PowerContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PlusContext plus() {
			return getRuleContext(PlusContext.class,0);
		}
		public MinusContext minus() {
			return getRuleContext(MinusContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IParserListener ) ((IParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IParserListener ) ((IParserListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(140);
			power();
			}
			_ctx.stop = _input.LT(-1);
			setState(152);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(150);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(142);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(143);
						plus();
						setState(144);
						power();
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(146);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(147);
						minus();
						setState(148);
						power();
						}
						break;
					}
					} 
				}
				setState(154);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PowerContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ToPowerContext toPower() {
			return getRuleContext(ToPowerContext.class,0);
		}
		public PowerContext power() {
			return getRuleContext(PowerContext.class,0);
		}
		public PowerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_power; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IParserListener ) ((IParserListener)listener).enterPower(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IParserListener ) ((IParserListener)listener).exitPower(this);
		}
	}

	public final PowerContext power() throws RecognitionException {
		PowerContext _localctx = new PowerContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_power);
		try {
			setState(160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				term(0);
				setState(156);
				toPower();
				setState(157);
				power();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				term(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TermContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TimesContext times() {
			return getRuleContext(TimesContext.class,0);
		}
		public DivContext div() {
			return getRuleContext(DivContext.class,0);
		}
		public ModContext mod() {
			return getRuleContext(ModContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IParserListener ) ((IParserListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IParserListener ) ((IParserListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		return term(0);
	}

	private TermContext term(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TermContext _localctx = new TermContext(_ctx, _parentState);
		TermContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_term, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(163);
			factor();
			}
			_ctx.stop = _input.LT(-1);
			setState(179);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(177);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(165);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(166);
						times();
						setState(167);
						factor();
						}
						break;
					case 2:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(169);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(170);
						div();
						setState(171);
						factor();
						}
						break;
					case 3:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(173);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(174);
						mod();
						setState(175);
						factor();
						}
						break;
					}
					} 
				}
				setState(181);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FactorContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public PlusContext plus() {
			return getRuleContext(PlusContext.class,0);
		}
		public MinusContext minus() {
			return getRuleContext(MinusContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public LParenContext lParen() {
			return getRuleContext(LParenContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public RParenContext rParen() {
			return getRuleContext(RParenContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IParserListener ) ((IParserListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IParserListener ) ((IParserListener)listener).exitFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_factor);
		try {
			setState(193);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Plus:
			case Minus:
				enterOuterAlt(_localctx, 1);
				{
				setState(184);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Plus:
					{
					setState(182);
					plus();
					}
					break;
				case Minus:
					{
					setState(183);
					minus();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(186);
				factor();
				}
				break;
			case Number:
			case Id:
			case DQString:
			case SQString:
				enterOuterAlt(_localctx, 2);
				{
				setState(188);
				value();
				}
				break;
			case LParen:
				enterOuterAlt(_localctx, 3);
				{
				setState(189);
				lParen();
				setState(190);
				expression(0);
				setState(191);
				rParen();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValueContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IParserListener ) ((IParserListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IParserListener ) ((IParserListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_value);
		try {
			setState(198);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Number:
				enterOuterAlt(_localctx, 1);
				{
				setState(195);
				number();
				}
				break;
			case DQString:
			case SQString:
				enterOuterAlt(_localctx, 2);
				{
				setState(196);
				string();
				}
				break;
			case Id:
				enterOuterAlt(_localctx, 3);
				{
				setState(197);
				id();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DollarContext extends ParserRuleContext {
		public TerminalNode Dollar() { return getToken(IParser.Dollar, 0); }
		public DollarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dollar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IParserListener ) ((IParserListener)listener).enterDollar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IParserListener ) ((IParserListener)listener).exitDollar(this);
		}
	}

	public final DollarContext dollar() throws RecognitionException {
		DollarContext _localctx = new DollarContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_dollar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(Dollar);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LParenContext extends ParserRuleContext {
		public TerminalNode LParen() { return getToken(IParser.LParen, 0); }
		public LParenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lParen; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IParserListener ) ((IParserListener)listener).enterLParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IParserListener ) ((IParserListener)listener).exitLParen(this);
		}
	}

	public final LParenContext lParen() throws RecognitionException {
		LParenContext _localctx = new LParenContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_lParen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(LParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RParenContext extends ParserRuleContext {
		public TerminalNode RParen() { return getToken(IParser.RParen, 0); }
		public RParenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rParen; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IParserListener ) ((IParserListener)listener).enterRParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IParserListener ) ((IParserListener)listener).exitRParen(this);
		}
	}

	public final RParenContext rParen() throws RecognitionException {
		RParenContext _localctx = new RParenContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_rParen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(RParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdContext extends ParserRuleContext {
		public TerminalNode Id() { return getToken(IParser.Id, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IParserListener ) ((IParserListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IParserListener ) ((IParserListener)listener).exitId(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(Id);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EqualContext extends ParserRuleContext {
		public TerminalNode Equal() { return getToken(IParser.Equal, 0); }
		public EqualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IParserListener ) ((IParserListener)listener).enterEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IParserListener ) ((IParserListener)listener).exitEqual(this);
		}
	}

	public final EqualContext equal() throws RecognitionException {
		EqualContext _localctx = new EqualContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_equal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(Equal);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CommaContext extends ParserRuleContext {
		public TerminalNode Comma() { return getToken(IParser.Comma, 0); }
		public CommaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IParserListener ) ((IParserListener)listener).enterComma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IParserListener ) ((IParserListener)listener).exitComma(this);
		}
	}

	public final CommaContext comma() throws RecognitionException {
		CommaContext _localctx = new CommaContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_comma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(Comma);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ColonContext extends ParserRuleContext {
		public TerminalNode Colon() { return getToken(IParser.Colon, 0); }
		public ColonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IParserListener ) ((IParserListener)listener).enterColon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IParserListener ) ((IParserListener)listener).exitColon(this);
		}
	}

	public final ColonContext colon() throws RecognitionException {
		ColonContext _localctx = new ColonContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_colon);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(Colon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PlusContext extends ParserRuleContext {
		public TerminalNode Plus() { return getToken(IParser.Plus, 0); }
		public PlusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IParserListener ) ((IParserListener)listener).enterPlus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IParserListener ) ((IParserListener)listener).exitPlus(this);
		}
	}

	public final PlusContext plus() throws RecognitionException {
		PlusContext _localctx = new PlusContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_plus);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(Plus);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MinusContext extends ParserRuleContext {
		public TerminalNode Minus() { return getToken(IParser.Minus, 0); }
		public MinusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_minus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IParserListener ) ((IParserListener)listener).enterMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IParserListener ) ((IParserListener)listener).exitMinus(this);
		}
	}

	public final MinusContext minus() throws RecognitionException {
		MinusContext _localctx = new MinusContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_minus);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(Minus);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ToPowerContext extends ParserRuleContext {
		public TerminalNode ToPower() { return getToken(IParser.ToPower, 0); }
		public ToPowerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_toPower; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IParserListener ) ((IParserListener)listener).enterToPower(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IParserListener ) ((IParserListener)listener).exitToPower(this);
		}
	}

	public final ToPowerContext toPower() throws RecognitionException {
		ToPowerContext _localctx = new ToPowerContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_toPower);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(ToPower);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TimesContext extends ParserRuleContext {
		public TerminalNode Times() { return getToken(IParser.Times, 0); }
		public TimesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_times; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IParserListener ) ((IParserListener)listener).enterTimes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IParserListener ) ((IParserListener)listener).exitTimes(this);
		}
	}

	public final TimesContext times() throws RecognitionException {
		TimesContext _localctx = new TimesContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_times);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			match(Times);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DivContext extends ParserRuleContext {
		public TerminalNode Div() { return getToken(IParser.Div, 0); }
		public DivContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_div; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IParserListener ) ((IParserListener)listener).enterDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IParserListener ) ((IParserListener)listener).exitDiv(this);
		}
	}

	public final DivContext div() throws RecognitionException {
		DivContext _localctx = new DivContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_div);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(Div);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ModContext extends ParserRuleContext {
		public TerminalNode Mod() { return getToken(IParser.Mod, 0); }
		public ModContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IParserListener ) ((IParserListener)listener).enterMod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IParserListener ) ((IParserListener)listener).exitMod(this);
		}
	}

	public final ModContext mod() throws RecognitionException {
		ModContext _localctx = new ModContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_mod);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(Mod);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NumberContext extends ParserRuleContext {
		public TerminalNode Number() { return getToken(IParser.Number, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IParserListener ) ((IParserListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IParserListener ) ((IParserListener)listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(Number);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StringContext extends ParserRuleContext {
		public TerminalNode DQString() { return getToken(IParser.DQString, 0); }
		public TerminalNode SQString() { return getToken(IParser.SQString, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IParserListener ) ((IParserListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IParserListener ) ((IParserListener)listener).exitString(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			_la = _input.LA(1);
			if ( !(_la==DQString || _la==SQString) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return statements_sempred((StatementsContext)_localctx, predIndex);
		case 12:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 14:
			return term_sempred((TermContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean statements_sempred(StatementsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 3);
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean term_sempred(TermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0014\u00e7\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0001\u0000\u0001\u0000\u0003\u0000C\b"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u0001L\b\u0001\u0001\u0001\u0005\u0001O\b\u0001"+
		"\n\u0001\f\u0001R\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\\\b\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005m\b\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005r\b\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0005\t\u0081\b\t\n\t\f\t\u0084\t\t\u0001\n"+
		"\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0005\f\u0097\b\f\n\f\f\f\u009a\t\f\u0001\r\u0001\r\u0001\r\u0001\r"+
		"\u0001\r\u0003\r\u00a1\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e"+
		"\u00b2\b\u000e\n\u000e\f\u000e\u00b5\t\u000e\u0001\u000f\u0001\u000f\u0003"+
		"\u000f\u00b9\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00c2\b\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0003\u0010\u00c7\b\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001"+
		"\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001"+
		"\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001"+
		"\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0000\u0003\u0002"+
		"\u0018\u001c \u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \"$&(*,.02468:<>\u0000\u0001\u0001\u0000\u0013"+
		"\u0014\u00db\u0000@\u0001\u0000\u0000\u0000\u0002F\u0001\u0000\u0000\u0000"+
		"\u0004[\u0001\u0000\u0000\u0000\u0006]\u0001\u0000\u0000\u0000\bd\u0001"+
		"\u0000\u0000\u0000\nh\u0001\u0000\u0000\u0000\fs\u0001\u0000\u0000\u0000"+
		"\u000eu\u0001\u0000\u0000\u0000\u0010w\u0001\u0000\u0000\u0000\u0012|"+
		"\u0001\u0000\u0000\u0000\u0014\u0085\u0001\u0000\u0000\u0000\u0016\u0087"+
		"\u0001\u0000\u0000\u0000\u0018\u008b\u0001\u0000\u0000\u0000\u001a\u00a0"+
		"\u0001\u0000\u0000\u0000\u001c\u00a2\u0001\u0000\u0000\u0000\u001e\u00c1"+
		"\u0001\u0000\u0000\u0000 \u00c6\u0001\u0000\u0000\u0000\"\u00c8\u0001"+
		"\u0000\u0000\u0000$\u00ca\u0001\u0000\u0000\u0000&\u00cc\u0001\u0000\u0000"+
		"\u0000(\u00ce\u0001\u0000\u0000\u0000*\u00d0\u0001\u0000\u0000\u0000,"+
		"\u00d2\u0001\u0000\u0000\u0000.\u00d4\u0001\u0000\u0000\u00000\u00d6\u0001"+
		"\u0000\u0000\u00002\u00d8\u0001\u0000\u0000\u00004\u00da\u0001\u0000\u0000"+
		"\u00006\u00dc\u0001\u0000\u0000\u00008\u00de\u0001\u0000\u0000\u0000:"+
		"\u00e0\u0001\u0000\u0000\u0000<\u00e2\u0001\u0000\u0000\u0000>\u00e4\u0001"+
		"\u0000\u0000\u0000@B\u0003\"\u0011\u0000AC\u0003\u0002\u0001\u0000BA\u0001"+
		"\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000"+
		"DE\u0003\"\u0011\u0000E\u0001\u0001\u0000\u0000\u0000FG\u0006\u0001\uffff"+
		"\uffff\u0000GH\u0003\u0004\u0002\u0000HP\u0001\u0000\u0000\u0000IK\n\u0002"+
		"\u0000\u0000JL\u0005\u0005\u0000\u0000KJ\u0001\u0000\u0000\u0000KL\u0001"+
		"\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000MO\u0003\u0002\u0001\u0003"+
		"NI\u0001\u0000\u0000\u0000OR\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000"+
		"\u0000PQ\u0001\u0000\u0000\u0000Q\u0003\u0001\u0000\u0000\u0000RP\u0001"+
		"\u0000\u0000\u0000S\\\u0003\u0006\u0003\u0000T\\\u0003\u0010\b\u0000U"+
		"\\\u0003\u0016\u000b\u0000V\\\u0003\u0018\f\u0000WX\u0003$\u0012\u0000"+
		"XY\u0003\u0002\u0001\u0000YZ\u0003&\u0013\u0000Z\\\u0001\u0000\u0000\u0000"+
		"[S\u0001\u0000\u0000\u0000[T\u0001\u0000\u0000\u0000[U\u0001\u0000\u0000"+
		"\u0000[V\u0001\u0000\u0000\u0000[W\u0001\u0000\u0000\u0000\\\u0005\u0001"+
		"\u0000\u0000\u0000]^\u0003(\u0014\u0000^_\u0003$\u0012\u0000_`\u0003\b"+
		"\u0004\u0000`a\u0003&\u0013\u0000ab\u0003*\u0015\u0000bc\u0003\u0004\u0002"+
		"\u0000c\u0007\u0001\u0000\u0000\u0000de\u0003\n\u0005\u0000ef\u0003,\u0016"+
		"\u0000fg\u0003\n\u0005\u0000g\t\u0001\u0000\u0000\u0000hl\u0003(\u0014"+
		"\u0000ij\u0003.\u0017\u0000jk\u0003\f\u0006\u0000km\u0001\u0000\u0000"+
		"\u0000li\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000mq\u0001\u0000"+
		"\u0000\u0000no\u0003*\u0015\u0000op\u0003\u000e\u0007\u0000pr\u0001\u0000"+
		"\u0000\u0000qn\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000r\u000b"+
		"\u0001\u0000\u0000\u0000st\u0003(\u0014\u0000t\r\u0001\u0000\u0000\u0000"+
		"uv\u0003\u0018\f\u0000v\u000f\u0001\u0000\u0000\u0000wx\u0003(\u0014\u0000"+
		"xy\u0003$\u0012\u0000yz\u0003\u0012\t\u0000z{\u0003&\u0013\u0000{\u0011"+
		"\u0001\u0000\u0000\u0000|\u0082\u0003\u0014\n\u0000}~\u0003,\u0016\u0000"+
		"~\u007f\u0003\u0014\n\u0000\u007f\u0081\u0001\u0000\u0000\u0000\u0080"+
		"}\u0001\u0000\u0000\u0000\u0081\u0084\u0001\u0000\u0000\u0000\u0082\u0080"+
		"\u0001\u0000\u0000\u0000\u0082\u0083\u0001\u0000\u0000\u0000\u0083\u0013"+
		"\u0001\u0000\u0000\u0000\u0084\u0082\u0001\u0000\u0000\u0000\u0085\u0086"+
		"\u0003\u0018\f\u0000\u0086\u0015\u0001\u0000\u0000\u0000\u0087\u0088\u0003"+
		"(\u0014\u0000\u0088\u0089\u0003*\u0015\u0000\u0089\u008a\u0003\u0018\f"+
		"\u0000\u008a\u0017\u0001\u0000\u0000\u0000\u008b\u008c\u0006\f\uffff\uffff"+
		"\u0000\u008c\u008d\u0003\u001a\r\u0000\u008d\u0098\u0001\u0000\u0000\u0000"+
		"\u008e\u008f\n\u0003\u0000\u0000\u008f\u0090\u00030\u0018\u0000\u0090"+
		"\u0091\u0003\u001a\r\u0000\u0091\u0097\u0001\u0000\u0000\u0000\u0092\u0093"+
		"\n\u0002\u0000\u0000\u0093\u0094\u00032\u0019\u0000\u0094\u0095\u0003"+
		"\u001a\r\u0000\u0095\u0097\u0001\u0000\u0000\u0000\u0096\u008e\u0001\u0000"+
		"\u0000\u0000\u0096\u0092\u0001\u0000\u0000\u0000\u0097\u009a\u0001\u0000"+
		"\u0000\u0000\u0098\u0096\u0001\u0000\u0000\u0000\u0098\u0099\u0001\u0000"+
		"\u0000\u0000\u0099\u0019\u0001\u0000\u0000\u0000\u009a\u0098\u0001\u0000"+
		"\u0000\u0000\u009b\u009c\u0003\u001c\u000e\u0000\u009c\u009d\u00034\u001a"+
		"\u0000\u009d\u009e\u0003\u001a\r\u0000\u009e\u00a1\u0001\u0000\u0000\u0000"+
		"\u009f\u00a1\u0003\u001c\u000e\u0000\u00a0\u009b\u0001\u0000\u0000\u0000"+
		"\u00a0\u009f\u0001\u0000\u0000\u0000\u00a1\u001b\u0001\u0000\u0000\u0000"+
		"\u00a2\u00a3\u0006\u000e\uffff\uffff\u0000\u00a3\u00a4\u0003\u001e\u000f"+
		"\u0000\u00a4\u00b3\u0001\u0000\u0000\u0000\u00a5\u00a6\n\u0004\u0000\u0000"+
		"\u00a6\u00a7\u00036\u001b\u0000\u00a7\u00a8\u0003\u001e\u000f\u0000\u00a8"+
		"\u00b2\u0001\u0000\u0000\u0000\u00a9\u00aa\n\u0003\u0000\u0000\u00aa\u00ab"+
		"\u00038\u001c\u0000\u00ab\u00ac\u0003\u001e\u000f\u0000\u00ac\u00b2\u0001"+
		"\u0000\u0000\u0000\u00ad\u00ae\n\u0002\u0000\u0000\u00ae\u00af\u0003:"+
		"\u001d\u0000\u00af\u00b0\u0003\u001e\u000f\u0000\u00b0\u00b2\u0001\u0000"+
		"\u0000\u0000\u00b1\u00a5\u0001\u0000\u0000\u0000\u00b1\u00a9\u0001\u0000"+
		"\u0000\u0000\u00b1\u00ad\u0001\u0000\u0000\u0000\u00b2\u00b5\u0001\u0000"+
		"\u0000\u0000\u00b3\u00b1\u0001\u0000\u0000\u0000\u00b3\u00b4\u0001\u0000"+
		"\u0000\u0000\u00b4\u001d\u0001\u0000\u0000\u0000\u00b5\u00b3\u0001\u0000"+
		"\u0000\u0000\u00b6\u00b9\u00030\u0018\u0000\u00b7\u00b9\u00032\u0019\u0000"+
		"\u00b8\u00b6\u0001\u0000\u0000\u0000\u00b8\u00b7\u0001\u0000\u0000\u0000"+
		"\u00b9\u00ba\u0001\u0000\u0000\u0000\u00ba\u00bb\u0003\u001e\u000f\u0000"+
		"\u00bb\u00c2\u0001\u0000\u0000\u0000\u00bc\u00c2\u0003 \u0010\u0000\u00bd"+
		"\u00be\u0003$\u0012\u0000\u00be\u00bf\u0003\u0018\f\u0000\u00bf\u00c0"+
		"\u0003&\u0013\u0000\u00c0\u00c2\u0001\u0000\u0000\u0000\u00c1\u00b8\u0001"+
		"\u0000\u0000\u0000\u00c1\u00bc\u0001\u0000\u0000\u0000\u00c1\u00bd\u0001"+
		"\u0000\u0000\u0000\u00c2\u001f\u0001\u0000\u0000\u0000\u00c3\u00c7\u0003"+
		"<\u001e\u0000\u00c4\u00c7\u0003>\u001f\u0000\u00c5\u00c7\u0003(\u0014"+
		"\u0000\u00c6\u00c3\u0001\u0000\u0000\u0000\u00c6\u00c4\u0001\u0000\u0000"+
		"\u0000\u00c6\u00c5\u0001\u0000\u0000\u0000\u00c7!\u0001\u0000\u0000\u0000"+
		"\u00c8\u00c9\u0005\u0004\u0000\u0000\u00c9#\u0001\u0000\u0000\u0000\u00ca"+
		"\u00cb\u0005\u0006\u0000\u0000\u00cb%\u0001\u0000\u0000\u0000\u00cc\u00cd"+
		"\u0005\u0007\u0000\u0000\u00cd\'\u0001\u0000\u0000\u0000\u00ce\u00cf\u0005"+
		"\t\u0000\u0000\u00cf)\u0001\u0000\u0000\u0000\u00d0\u00d1\u0005\n\u0000"+
		"\u0000\u00d1+\u0001\u0000\u0000\u0000\u00d2\u00d3\u0005\u000b\u0000\u0000"+
		"\u00d3-\u0001\u0000\u0000\u0000\u00d4\u00d5\u0005\f\u0000\u0000\u00d5"+
		"/\u0001\u0000\u0000\u0000\u00d6\u00d7\u0005\r\u0000\u0000\u00d71\u0001"+
		"\u0000\u0000\u0000\u00d8\u00d9\u0005\u000e\u0000\u0000\u00d93\u0001\u0000"+
		"\u0000\u0000\u00da\u00db\u0005\u000f\u0000\u0000\u00db5\u0001\u0000\u0000"+
		"\u0000\u00dc\u00dd\u0005\u0010\u0000\u0000\u00dd7\u0001\u0000\u0000\u0000"+
		"\u00de\u00df\u0005\u0011\u0000\u0000\u00df9\u0001\u0000\u0000\u0000\u00e0"+
		"\u00e1\u0005\u0012\u0000\u0000\u00e1;\u0001\u0000\u0000\u0000\u00e2\u00e3"+
		"\u0005\b\u0000\u0000\u00e3=\u0001\u0000\u0000\u0000\u00e4\u00e5\u0007"+
		"\u0000\u0000\u0000\u00e5?\u0001\u0000\u0000\u0000\u000fBKP[lq\u0082\u0096"+
		"\u0098\u00a0\u00b1\u00b3\u00b8\u00c1\u00c6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}