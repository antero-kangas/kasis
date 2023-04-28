// Generated from IParser.g4 by ANTLR 4.9
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class IParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MultiLineComment=1, SingleLineComment=2, WhiteSpace=3, True=4, False=5, 
		Bool=6, Num=7, String=8, Dollar=9, Semicolon=10, LParen=11, RParen=12, 
		Dot=13, Number=14, Id=15, Defines=16, Equal=17, Comma=18, Colon=19, Plus=20, 
		Minus=21, ToPower=22, Times=23, Div=24, Mod=25, DQString=26, SQString=27;
	public static final int
		RULE_i = 0, RULE_statements = 1, RULE_statement = 2, RULE_definition = 3, 
		RULE_overload = 4, RULE_sList = 5, RULE_sParam = 6, RULE_type = 7, RULE_defaultValue = 8, 
		RULE_call = 9, RULE_vList = 10, RULE_vParam = 11, RULE_assignment = 12, 
		RULE_expression = 13, RULE_power = 14, RULE_term = 15, RULE_factor = 16, 
		RULE_value = 17, RULE_dollar = 18, RULE_lParen = 19, RULE_rParen = 20, 
		RULE_id = 21, RULE_defines = 22, RULE_equal = 23, RULE_comma = 24, RULE_colon = 25, 
		RULE_plus = 26, RULE_minus = 27, RULE_toPower = 28, RULE_times = 29, RULE_div = 30, 
		RULE_mod = 31, RULE_number = 32, RULE_string = 33, RULE_dQString = 34, 
		RULE_sQString = 35;
	private static String[] makeRuleNames() {
		return new String[] {
			"i", "statements", "statement", "definition", "overload", "sList", "sParam", 
			"type", "defaultValue", "call", "vList", "vParam", "assignment", "expression", 
			"power", "term", "factor", "value", "dollar", "lParen", "rParen", "id", 
			"defines", "equal", "comma", "colon", "plus", "minus", "toPower", "times", 
			"div", "mod", "number", "string", "dQString", "sQString"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'true'", "'false'", "'bool'", "'number'", "'string'", 
			"'$'", "';'", "'('", "')'", "'.'", null, null, "':='", "'='", "','", 
			"':'", "'+'", "'-'", "'\u02C6'", "'*'", "'/'", "'%'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "MultiLineComment", "SingleLineComment", "WhiteSpace", "True", 
			"False", "Bool", "Num", "String", "Dollar", "Semicolon", "LParen", "RParen", 
			"Dot", "Number", "Id", "Defines", "Equal", "Comma", "Colon", "Plus", 
			"Minus", "ToPower", "Times", "Div", "Mod", "DQString", "SQString"
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
	public String getGrammarFileName() { return "IParser.g4"; }

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
			setState(72);
			dollar();
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Semicolon) | (1L << LParen) | (1L << Number) | (1L << Id) | (1L << Plus) | (1L << Minus) | (1L << DQString) | (1L << SQString))) != 0)) {
				{
				setState(73);
				statements();
				}
			}

			setState(76);
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

	public static class StatementsContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> Semicolon() { return getTokens(IParser.Semicolon); }
		public TerminalNode Semicolon(int i) {
			return getToken(IParser.Semicolon, i);
		}
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
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statements);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Semicolon) {
				{
				{
				setState(78);
				match(Semicolon);
				}
				}
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(84);
			statement();
			setState(93);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(86); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(85);
						match(Semicolon);
						}
						}
						setState(88); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==Semicolon );
					setState(90);
					statement();
					}
					} 
				}
				setState(95);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Semicolon) {
				{
				{
				setState(96);
				match(Semicolon);
				}
				}
				setState(101);
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

	public static class StatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
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
			setState(108);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
				assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(104);
				lParen();
				setState(105);
				statements();
				setState(106);
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

	public static class DefinitionContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public LParenContext lParen() {
			return getRuleContext(LParenContext.class,0);
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
		public SListContext sList() {
			return getRuleContext(SListContext.class,0);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			id();
			setState(111);
			lParen();
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Id) {
				{
				setState(112);
				sList();
				}
			}

			setState(115);
			rParen();
			setState(116);
			equal();
			setState(117);
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

	public static class OverloadContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public LParenContext lParen() {
			return getRuleContext(LParenContext.class,0);
		}
		public RParenContext rParen() {
			return getRuleContext(RParenContext.class,0);
		}
		public DefinesContext defines() {
			return getRuleContext(DefinesContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public SListContext sList() {
			return getRuleContext(SListContext.class,0);
		}
		public OverloadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_overload; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IParserListener ) ((IParserListener)listener).enterOverload(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IParserListener ) ((IParserListener)listener).exitOverload(this);
		}
	}

	public final OverloadContext overload() throws RecognitionException {
		OverloadContext _localctx = new OverloadContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_overload);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			id();
			setState(120);
			lParen();
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Id) {
				{
				setState(121);
				sList();
				}
			}

			setState(124);
			rParen();
			setState(125);
			defines();
			setState(126);
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

	public static class SListContext extends ParserRuleContext {
		public List<SParamContext> sParam() {
			return getRuleContexts(SParamContext.class);
		}
		public SParamContext sParam(int i) {
			return getRuleContext(SParamContext.class,i);
		}
		public List<CommaContext> comma() {
			return getRuleContexts(CommaContext.class);
		}
		public CommaContext comma(int i) {
			return getRuleContext(CommaContext.class,i);
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
		enterRule(_localctx, 10, RULE_sList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			sParam();
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(129);
				comma();
				setState(130);
				sParam();
				}
				}
				setState(136);
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
		enterRule(_localctx, 12, RULE_sParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			id();
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(138);
				colon();
				setState(139);
				type();
				}
			}

			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Equal) {
				{
				setState(143);
				equal();
				setState(144);
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
		enterRule(_localctx, 14, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
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
		enterRule(_localctx, 16, RULE_defaultValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
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

	public static class CallContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public LParenContext lParen() {
			return getRuleContext(LParenContext.class,0);
		}
		public RParenContext rParen() {
			return getRuleContext(RParenContext.class,0);
		}
		public VListContext vList() {
			return getRuleContext(VListContext.class,0);
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
		enterRule(_localctx, 18, RULE_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			id();
			setState(153);
			lParen();
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LParen) | (1L << Number) | (1L << Id) | (1L << Plus) | (1L << Minus) | (1L << DQString) | (1L << SQString))) != 0)) {
				{
				setState(154);
				vList();
				}
			}

			setState(157);
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
		enterRule(_localctx, 20, RULE_vList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			vParam();
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(160);
				comma();
				setState(161);
				vParam();
				}
				}
				setState(167);
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
		enterRule(_localctx, 22, RULE_vParam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
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

	public static class AssignmentContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public EqualContext equal() {
			return getRuleContext(EqualContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
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
		enterRule(_localctx, 24, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			id();
			setState(171);
			equal();
			setState(172);
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
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(175);
			power();
			}
			_ctx.stop = _input.LT(-1);
			setState(187);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(185);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(177);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(178);
						plus();
						setState(179);
						power();
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(181);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(182);
						minus();
						setState(183);
						power();
						}
						break;
					}
					} 
				}
				setState(189);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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
		enterRule(_localctx, 28, RULE_power);
		try {
			setState(195);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(190);
				term(0);
				setState(191);
				toPower();
				setState(192);
				power();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(194);
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
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_term, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(198);
			factor();
			}
			_ctx.stop = _input.LT(-1);
			setState(214);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(212);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(200);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(201);
						times();
						setState(202);
						factor();
						}
						break;
					case 2:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(204);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(205);
						div();
						setState(206);
						factor();
						}
						break;
					case 3:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(208);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(209);
						mod();
						setState(210);
						factor();
						}
						break;
					}
					} 
				}
				setState(216);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
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
		enterRule(_localctx, 32, RULE_factor);
		try {
			setState(228);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Plus:
			case Minus:
				enterOuterAlt(_localctx, 1);
				{
				setState(219);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Plus:
					{
					setState(217);
					plus();
					}
					break;
				case Minus:
					{
					setState(218);
					minus();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(221);
				factor();
				}
				break;
			case Number:
			case Id:
			case DQString:
			case SQString:
				enterOuterAlt(_localctx, 2);
				{
				setState(223);
				value();
				}
				break;
			case LParen:
				enterOuterAlt(_localctx, 3);
				{
				setState(224);
				lParen();
				setState(225);
				statement();
				setState(226);
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
		public DefinitionContext definition() {
			return getRuleContext(DefinitionContext.class,0);
		}
		public OverloadContext overload() {
			return getRuleContext(OverloadContext.class,0);
		}
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
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
		enterRule(_localctx, 34, RULE_value);
		try {
			setState(236);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(230);
				number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(231);
				string();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(232);
				id();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(233);
				definition();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(234);
				overload();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(235);
				call();
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
		enterRule(_localctx, 36, RULE_dollar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
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
		enterRule(_localctx, 38, RULE_lParen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
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
		enterRule(_localctx, 40, RULE_rParen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
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
		enterRule(_localctx, 42, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
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

	public static class DefinesContext extends ParserRuleContext {
		public TerminalNode Defines() { return getToken(IParser.Defines, 0); }
		public DefinesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defines; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IParserListener ) ((IParserListener)listener).enterDefines(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IParserListener ) ((IParserListener)listener).exitDefines(this);
		}
	}

	public final DefinesContext defines() throws RecognitionException {
		DefinesContext _localctx = new DefinesContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_defines);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(Defines);
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
		enterRule(_localctx, 46, RULE_equal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
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
		enterRule(_localctx, 48, RULE_comma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
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
		enterRule(_localctx, 50, RULE_colon);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
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
		enterRule(_localctx, 52, RULE_plus);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
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
		enterRule(_localctx, 54, RULE_minus);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
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
		enterRule(_localctx, 56, RULE_toPower);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
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
		enterRule(_localctx, 58, RULE_times);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
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
		enterRule(_localctx, 60, RULE_div);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
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
		enterRule(_localctx, 62, RULE_mod);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
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
		enterRule(_localctx, 64, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
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

	public static class StringContext extends ParserRuleContext {
		public DQStringContext dQString() {
			return getRuleContext(DQStringContext.class,0);
		}
		public SQStringContext sQString() {
			return getRuleContext(SQStringContext.class,0);
		}
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
		enterRule(_localctx, 66, RULE_string);
		try {
			setState(270);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DQString:
				enterOuterAlt(_localctx, 1);
				{
				setState(268);
				dQString();
				}
				break;
			case SQString:
				enterOuterAlt(_localctx, 2);
				{
				setState(269);
				sQString();
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

	public static class DQStringContext extends ParserRuleContext {
		public TerminalNode DQString() { return getToken(IParser.DQString, 0); }
		public DQStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dQString; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IParserListener ) ((IParserListener)listener).enterDQString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IParserListener ) ((IParserListener)listener).exitDQString(this);
		}
	}

	public final DQStringContext dQString() throws RecognitionException {
		DQStringContext _localctx = new DQStringContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_dQString);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(DQString);
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

	public static class SQStringContext extends ParserRuleContext {
		public TerminalNode SQString() { return getToken(IParser.SQString, 0); }
		public SQStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sQString; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IParserListener ) ((IParserListener)listener).enterSQString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IParserListener ) ((IParserListener)listener).exitSQString(this);
		}
	}

	public final SQStringContext sQString() throws RecognitionException {
		SQStringContext _localctx = new SQStringContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_sQString);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			match(SQString);
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
		case 13:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 15:
			return term_sempred((TermContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean term_sempred(TermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\35\u0117\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\5\2M\n\2\3\2\3\2\3\3\7\3R\n\3\f"+
		"\3\16\3U\13\3\3\3\3\3\6\3Y\n\3\r\3\16\3Z\3\3\7\3^\n\3\f\3\16\3a\13\3\3"+
		"\3\7\3d\n\3\f\3\16\3g\13\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4o\n\4\3\5\3\5\3"+
		"\5\5\5t\n\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\5\6}\n\6\3\6\3\6\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\7\7\u0087\n\7\f\7\16\7\u008a\13\7\3\b\3\b\3\b\3\b\5\b\u0090"+
		"\n\b\3\b\3\b\3\b\5\b\u0095\n\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\5\13\u009e"+
		"\n\13\3\13\3\13\3\f\3\f\3\f\3\f\7\f\u00a6\n\f\f\f\16\f\u00a9\13\f\3\r"+
		"\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\7\17\u00bc\n\17\f\17\16\17\u00bf\13\17\3\20\3\20\3\20\3\20"+
		"\3\20\5\20\u00c6\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\7\21\u00d7\n\21\f\21\16\21\u00da\13\21\3\22"+
		"\3\22\5\22\u00de\n\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00e7\n"+
		"\22\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00ef\n\23\3\24\3\24\3\25\3\25"+
		"\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34"+
		"\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\5#\u0111\n#\3"+
		"$\3$\3%\3%\3%\2\4\34 &\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,"+
		".\60\62\64\668:<>@BDFH\2\2\2\u010f\2J\3\2\2\2\4S\3\2\2\2\6n\3\2\2\2\b"+
		"p\3\2\2\2\ny\3\2\2\2\f\u0082\3\2\2\2\16\u008b\3\2\2\2\20\u0096\3\2\2\2"+
		"\22\u0098\3\2\2\2\24\u009a\3\2\2\2\26\u00a1\3\2\2\2\30\u00aa\3\2\2\2\32"+
		"\u00ac\3\2\2\2\34\u00b0\3\2\2\2\36\u00c5\3\2\2\2 \u00c7\3\2\2\2\"\u00e6"+
		"\3\2\2\2$\u00ee\3\2\2\2&\u00f0\3\2\2\2(\u00f2\3\2\2\2*\u00f4\3\2\2\2,"+
		"\u00f6\3\2\2\2.\u00f8\3\2\2\2\60\u00fa\3\2\2\2\62\u00fc\3\2\2\2\64\u00fe"+
		"\3\2\2\2\66\u0100\3\2\2\28\u0102\3\2\2\2:\u0104\3\2\2\2<\u0106\3\2\2\2"+
		">\u0108\3\2\2\2@\u010a\3\2\2\2B\u010c\3\2\2\2D\u0110\3\2\2\2F\u0112\3"+
		"\2\2\2H\u0114\3\2\2\2JL\5&\24\2KM\5\4\3\2LK\3\2\2\2LM\3\2\2\2MN\3\2\2"+
		"\2NO\5&\24\2O\3\3\2\2\2PR\7\f\2\2QP\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2"+
		"\2\2TV\3\2\2\2US\3\2\2\2V_\5\6\4\2WY\7\f\2\2XW\3\2\2\2YZ\3\2\2\2ZX\3\2"+
		"\2\2Z[\3\2\2\2[\\\3\2\2\2\\^\5\6\4\2]X\3\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3"+
		"\2\2\2`e\3\2\2\2a_\3\2\2\2bd\7\f\2\2cb\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3"+
		"\2\2\2f\5\3\2\2\2ge\3\2\2\2ho\5\34\17\2io\5\32\16\2jk\5(\25\2kl\5\4\3"+
		"\2lm\5*\26\2mo\3\2\2\2nh\3\2\2\2ni\3\2\2\2nj\3\2\2\2o\7\3\2\2\2pq\5,\27"+
		"\2qs\5(\25\2rt\5\f\7\2sr\3\2\2\2st\3\2\2\2tu\3\2\2\2uv\5*\26\2vw\5\60"+
		"\31\2wx\5\6\4\2x\t\3\2\2\2yz\5,\27\2z|\5(\25\2{}\5\f\7\2|{\3\2\2\2|}\3"+
		"\2\2\2}~\3\2\2\2~\177\5*\26\2\177\u0080\5.\30\2\u0080\u0081\5\6\4\2\u0081"+
		"\13\3\2\2\2\u0082\u0088\5\16\b\2\u0083\u0084\5\62\32\2\u0084\u0085\5\16"+
		"\b\2\u0085\u0087\3\2\2\2\u0086\u0083\3\2\2\2\u0087\u008a\3\2\2\2\u0088"+
		"\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\r\3\2\2\2\u008a\u0088\3\2\2\2"+
		"\u008b\u008f\5,\27\2\u008c\u008d\5\64\33\2\u008d\u008e\5\20\t\2\u008e"+
		"\u0090\3\2\2\2\u008f\u008c\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0094\3\2"+
		"\2\2\u0091\u0092\5\60\31\2\u0092\u0093\5\22\n\2\u0093\u0095\3\2\2\2\u0094"+
		"\u0091\3\2\2\2\u0094\u0095\3\2\2\2\u0095\17\3\2\2\2\u0096\u0097\5,\27"+
		"\2\u0097\21\3\2\2\2\u0098\u0099\5\34\17\2\u0099\23\3\2\2\2\u009a\u009b"+
		"\5,\27\2\u009b\u009d\5(\25\2\u009c\u009e\5\26\f\2\u009d\u009c\3\2\2\2"+
		"\u009d\u009e\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\5*\26\2\u00a0\25"+
		"\3\2\2\2\u00a1\u00a7\5\30\r\2\u00a2\u00a3\5\62\32\2\u00a3\u00a4\5\30\r"+
		"\2\u00a4\u00a6\3\2\2\2\u00a5\u00a2\3\2\2\2\u00a6\u00a9\3\2\2\2\u00a7\u00a5"+
		"\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\27\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa"+
		"\u00ab\5\34\17\2\u00ab\31\3\2\2\2\u00ac\u00ad\5,\27\2\u00ad\u00ae\5\60"+
		"\31\2\u00ae\u00af\5\6\4\2\u00af\33\3\2\2\2\u00b0\u00b1\b\17\1\2\u00b1"+
		"\u00b2\5\36\20\2\u00b2\u00bd\3\2\2\2\u00b3\u00b4\f\5\2\2\u00b4\u00b5\5"+
		"\66\34\2\u00b5\u00b6\5\36\20\2\u00b6\u00bc\3\2\2\2\u00b7\u00b8\f\4\2\2"+
		"\u00b8\u00b9\58\35\2\u00b9\u00ba\5\36\20\2\u00ba\u00bc\3\2\2\2\u00bb\u00b3"+
		"\3\2\2\2\u00bb\u00b7\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd"+
		"\u00be\3\2\2\2\u00be\35\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0\u00c1\5 \21"+
		"\2\u00c1\u00c2\5:\36\2\u00c2\u00c3\5\36\20\2\u00c3\u00c6\3\2\2\2\u00c4"+
		"\u00c6\5 \21\2\u00c5\u00c0\3\2\2\2\u00c5\u00c4\3\2\2\2\u00c6\37\3\2\2"+
		"\2\u00c7\u00c8\b\21\1\2\u00c8\u00c9\5\"\22\2\u00c9\u00d8\3\2\2\2\u00ca"+
		"\u00cb\f\6\2\2\u00cb\u00cc\5<\37\2\u00cc\u00cd\5\"\22\2\u00cd\u00d7\3"+
		"\2\2\2\u00ce\u00cf\f\5\2\2\u00cf\u00d0\5> \2\u00d0\u00d1\5\"\22\2\u00d1"+
		"\u00d7\3\2\2\2\u00d2\u00d3\f\4\2\2\u00d3\u00d4\5@!\2\u00d4\u00d5\5\"\22"+
		"\2\u00d5\u00d7\3\2\2\2\u00d6\u00ca\3\2\2\2\u00d6\u00ce\3\2\2\2\u00d6\u00d2"+
		"\3\2\2\2\u00d7\u00da\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9"+
		"!\3\2\2\2\u00da\u00d8\3\2\2\2\u00db\u00de\5\66\34\2\u00dc\u00de\58\35"+
		"\2\u00dd\u00db\3\2\2\2\u00dd\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e0"+
		"\5\"\22\2\u00e0\u00e7\3\2\2\2\u00e1\u00e7\5$\23\2\u00e2\u00e3\5(\25\2"+
		"\u00e3\u00e4\5\6\4\2\u00e4\u00e5\5*\26\2\u00e5\u00e7\3\2\2\2\u00e6\u00dd"+
		"\3\2\2\2\u00e6\u00e1\3\2\2\2\u00e6\u00e2\3\2\2\2\u00e7#\3\2\2\2\u00e8"+
		"\u00ef\5B\"\2\u00e9\u00ef\5D#\2\u00ea\u00ef\5,\27\2\u00eb\u00ef\5\b\5"+
		"\2\u00ec\u00ef\5\n\6\2\u00ed\u00ef\5\24\13\2\u00ee\u00e8\3\2\2\2\u00ee"+
		"\u00e9\3\2\2\2\u00ee\u00ea\3\2\2\2\u00ee\u00eb\3\2\2\2\u00ee\u00ec\3\2"+
		"\2\2\u00ee\u00ed\3\2\2\2\u00ef%\3\2\2\2\u00f0\u00f1\7\13\2\2\u00f1\'\3"+
		"\2\2\2\u00f2\u00f3\7\r\2\2\u00f3)\3\2\2\2\u00f4\u00f5\7\16\2\2\u00f5+"+
		"\3\2\2\2\u00f6\u00f7\7\21\2\2\u00f7-\3\2\2\2\u00f8\u00f9\7\22\2\2\u00f9"+
		"/\3\2\2\2\u00fa\u00fb\7\23\2\2\u00fb\61\3\2\2\2\u00fc\u00fd\7\24\2\2\u00fd"+
		"\63\3\2\2\2\u00fe\u00ff\7\25\2\2\u00ff\65\3\2\2\2\u0100\u0101\7\26\2\2"+
		"\u0101\67\3\2\2\2\u0102\u0103\7\27\2\2\u01039\3\2\2\2\u0104\u0105\7\30"+
		"\2\2\u0105;\3\2\2\2\u0106\u0107\7\31\2\2\u0107=\3\2\2\2\u0108\u0109\7"+
		"\32\2\2\u0109?\3\2\2\2\u010a\u010b\7\33\2\2\u010bA\3\2\2\2\u010c\u010d"+
		"\7\20\2\2\u010dC\3\2\2\2\u010e\u0111\5F$\2\u010f\u0111\5H%\2\u0110\u010e"+
		"\3\2\2\2\u0110\u010f\3\2\2\2\u0111E\3\2\2\2\u0112\u0113\7\34\2\2\u0113"+
		"G\3\2\2\2\u0114\u0115\7\35\2\2\u0115I\3\2\2\2\30LSZ_ens|\u0088\u008f\u0094"+
		"\u009d\u00a7\u00bb\u00bd\u00c5\u00d6\u00d8\u00dd\u00e6\u00ee\u0110";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}