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
		MultiLineComment=1, SingleLineComment=2, WhiteSpace=3, True=4, False=5, 
		Bool=6, Num=7, String=8, Dollar=9, Semicolon=10, LParen=11, RParen=12, 
		LBracket=13, RBracket=14, LCurly=15, RCurly=16, Dot=17, Number=18, Id=19, 
		Defines=20, Comma=21, Colon=22, Plus=23, Minus=24, ToPower=25, Times=26, 
		Div=27, Mod=28, DQString=29, SQString=30, Ge=31, Gt=32, Le=33, Lt=34, 
		Ne=35, Eq=36, And=37, Or=38, Not=39, Set=40;
	public static final int
		RULE_i = 0, RULE_statements = 1, RULE_statement = 2, RULE_definition = 3, 
		RULE_overload = 4, RULE_sList = 5, RULE_sParam = 6, RULE_type = 7, RULE_defaultValue = 8, 
		RULE_call = 9, RULE_vList = 10, RULE_vParam = 11, RULE_assignment = 12, 
		RULE_indexing = 13, RULE_expression = 14, RULE_power = 15, RULE_term = 16, 
		RULE_factor = 17, RULE_value = 18, RULE_proposition = 19, RULE_disjunction = 20, 
		RULE_conjunction = 21, RULE_relation = 22, RULE_relationOperator = 23, 
		RULE_list = 24, RULE_object = 25, RULE_keyValues = 26, RULE_keyValue = 27, 
		RULE_key = 28, RULE_dollar = 29, RULE_semicolon = 30, RULE_lParen = 31, 
		RULE_rParen = 32, RULE_id = 33, RULE_defines = 34, RULE_ge = 35, RULE_gt = 36, 
		RULE_eq = 37, RULE_ne = 38, RULE_le = 39, RULE_lt = 40, RULE_set = 41, 
		RULE_comma = 42, RULE_colon = 43, RULE_plus = 44, RULE_minus = 45, RULE_toPower = 46, 
		RULE_times = 47, RULE_div = 48, RULE_mod = 49, RULE_number = 50, RULE_bool = 51, 
		RULE_trueValue = 52, RULE_falseValue = 53, RULE_string = 54, RULE_dQString = 55, 
		RULE_sQString = 56, RULE_and = 57, RULE_or = 58, RULE_not = 59, RULE_lBracket = 60, 
		RULE_rBracket = 61, RULE_lCurly = 62, RULE_rCurly = 63;
	private static String[] makeRuleNames() {
		return new String[] {
			"i", "statements", "statement", "definition", "overload", "sList", "sParam", 
			"type", "defaultValue", "call", "vList", "vParam", "assignment", "indexing", 
			"expression", "power", "term", "factor", "value", "proposition", "disjunction", 
			"conjunction", "relation", "relationOperator", "list", "object", "keyValues", 
			"keyValue", "key", "dollar", "semicolon", "lParen", "rParen", "id", "defines", 
			"ge", "gt", "eq", "ne", "le", "lt", "set", "comma", "colon", "plus", 
			"minus", "toPower", "times", "div", "mod", "number", "bool", "trueValue", 
			"falseValue", "string", "dQString", "sQString", "and", "or", "not", "lBracket", 
			"rBracket", "lCurly", "rCurly"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'true'", "'false'", "'bool'", "'number'", "'string'", 
			"'$'", "';'", "'('", "')'", "'['", "']'", "'{'", "'}'", "'.'", null, 
			null, "':='", "','", "':'", "'+'", "'-'", "'\\u02C6'", "'*'", "'/'", 
			"'%'", null, null, null, "'>'", null, "'<'", null, "'=='", "'&&'", "'||'", 
			"'!'", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "MultiLineComment", "SingleLineComment", "WhiteSpace", "True", 
			"False", "Bool", "Num", "String", "Dollar", "Semicolon", "LParen", "RParen", 
			"LBracket", "RBracket", "LCurly", "RCurly", "Dot", "Number", "Id", "Defines", 
			"Comma", "Colon", "Plus", "Minus", "ToPower", "Times", "Div", "Mod", 
			"DQString", "SQString", "Ge", "Gt", "Le", "Lt", "Ne", "Eq", "And", "Or", 
			"Not", "Set"
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
			setState(128);
			dollar();
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 1636609072L) != 0) {
				{
				setState(129);
				statements();
				}
			}

			setState(132);
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
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<SemicolonContext> semicolon() {
			return getRuleContexts(SemicolonContext.class);
		}
		public SemicolonContext semicolon(int i) {
			return getRuleContext(SemicolonContext.class,i);
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
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Semicolon) {
				{
				{
				setState(134);
				semicolon();
				}
				}
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(140);
			statement();
			setState(150);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(144);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Semicolon) {
						{
						{
						setState(141);
						semicolon();
						}
						}
						setState(146);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(147);
					statement();
					}
					} 
				}
				setState(152);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Semicolon) {
				{
				{
				setState(153);
				semicolon();
				}
				}
				setState(158);
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
	public static class StatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public RelationContext relation() {
			return getRuleContext(RelationContext.class,0);
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
			setState(166);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
				relation();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(161);
				assignment();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(162);
				lParen();
				setState(163);
				statements();
				setState(164);
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
		public RParenContext rParen() {
			return getRuleContext(RParenContext.class,0);
		}
		public SetContext set() {
			return getRuleContext(SetContext.class,0);
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
			setState(168);
			id();
			setState(169);
			lParen();
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Id) {
				{
				setState(170);
				sList();
				}
			}

			setState(173);
			rParen();
			setState(174);
			set();
			setState(175);
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
			setState(177);
			id();
			setState(178);
			lParen();
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Id) {
				{
				setState(179);
				sList();
				}
			}

			setState(182);
			rParen();
			setState(183);
			defines();
			setState(184);
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
			setState(186);
			sParam();
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(187);
				comma();
				setState(188);
				sParam();
				}
				}
				setState(194);
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
		public SetContext set() {
			return getRuleContext(SetContext.class,0);
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
			setState(195);
			id();
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(196);
				colon();
				setState(197);
				type();
				}
			}

			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Set) {
				{
				setState(201);
				set();
				setState(202);
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
		enterRule(_localctx, 14, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
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
		enterRule(_localctx, 16, RULE_defaultValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
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
			setState(210);
			id();
			setState(211);
			lParen();
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 1636608048L) != 0) {
				{
				setState(212);
				vList();
				}
			}

			setState(215);
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
		enterRule(_localctx, 20, RULE_vList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			vParam();
			setState(223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(218);
				comma();
				setState(219);
				vParam();
				}
				}
				setState(225);
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
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
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
			setState(226);
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
	public static class AssignmentContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public SetContext set() {
			return getRuleContext(SetContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public IndexingContext indexing() {
			return getRuleContext(IndexingContext.class,0);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			id();
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBracket) {
				{
				setState(229);
				indexing();
				}
			}

			setState(232);
			set();
			setState(233);
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
	public static class IndexingContext extends ParserRuleContext {
		public List<ListContext> list() {
			return getRuleContexts(ListContext.class);
		}
		public ListContext list(int i) {
			return getRuleContext(ListContext.class,i);
		}
		public IndexingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexing; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IParserListener ) ((IParserListener)listener).enterIndexing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IParserListener ) ((IParserListener)listener).exitIndexing(this);
		}
	}

	public final IndexingContext indexing() throws RecognitionException {
		IndexingContext _localctx = new IndexingContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_indexing);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(236); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(235);
					list();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(238); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(241);
			power();
			}
			_ctx.stop = _input.LT(-1);
			setState(253);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(251);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(243);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(244);
						plus();
						setState(245);
						power();
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(247);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(248);
						minus();
						setState(249);
						power();
						}
						break;
					}
					} 
				}
				setState(255);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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
		enterRule(_localctx, 30, RULE_power);
		try {
			setState(261);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(256);
				term(0);
				setState(257);
				toPower();
				setState(258);
				power();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(260);
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
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_term, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(264);
			factor();
			}
			_ctx.stop = _input.LT(-1);
			setState(280);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(278);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(266);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(267);
						times();
						setState(268);
						factor();
						}
						break;
					case 2:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(270);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(271);
						div();
						setState(272);
						factor();
						}
						break;
					case 3:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(274);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(275);
						mod();
						setState(276);
						factor();
						}
						break;
					}
					} 
				}
				setState(282);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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
		enterRule(_localctx, 34, RULE_factor);
		try {
			setState(294);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Plus:
			case Minus:
				enterOuterAlt(_localctx, 1);
				{
				setState(285);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Plus:
					{
					setState(283);
					plus();
					}
					break;
				case Minus:
					{
					setState(284);
					minus();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(287);
				factor();
				}
				break;
			case True:
			case False:
			case LBracket:
			case LCurly:
			case Number:
			case Id:
			case DQString:
			case SQString:
				enterOuterAlt(_localctx, 2);
				{
				setState(289);
				value();
				}
				break;
			case LParen:
				enterOuterAlt(_localctx, 3);
				{
				setState(290);
				lParen();
				setState(291);
				statement();
				setState(292);
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
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public IndexingContext indexing() {
			return getRuleContext(IndexingContext.class,0);
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
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
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
		enterRule(_localctx, 36, RULE_value);
		try {
			setState(308);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(296);
				number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(297);
				string();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(298);
				bool();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(299);
				id();
				setState(301);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(300);
					indexing();
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(303);
				definition();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(304);
				overload();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(305);
				call();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(306);
				list();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(307);
				object();
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
	public static class PropositionContext extends ParserRuleContext {
		public DisjunctionContext disjunction() {
			return getRuleContext(DisjunctionContext.class,0);
		}
		public PropositionContext proposition() {
			return getRuleContext(PropositionContext.class,0);
		}
		public OrContext or() {
			return getRuleContext(OrContext.class,0);
		}
		public PropositionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proposition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IParserListener ) ((IParserListener)listener).enterProposition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IParserListener ) ((IParserListener)listener).exitProposition(this);
		}
	}

	public final PropositionContext proposition() throws RecognitionException {
		return proposition(0);
	}

	private PropositionContext proposition(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PropositionContext _localctx = new PropositionContext(_ctx, _parentState);
		PropositionContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_proposition, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(311);
			disjunction(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(319);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PropositionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_proposition);
					setState(313);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(314);
					or();
					setState(315);
					disjunction(0);
					}
					} 
				}
				setState(321);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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
	public static class DisjunctionContext extends ParserRuleContext {
		public ConjunctionContext conjunction() {
			return getRuleContext(ConjunctionContext.class,0);
		}
		public DisjunctionContext disjunction() {
			return getRuleContext(DisjunctionContext.class,0);
		}
		public AndContext and() {
			return getRuleContext(AndContext.class,0);
		}
		public DisjunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_disjunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IParserListener ) ((IParserListener)listener).enterDisjunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IParserListener ) ((IParserListener)listener).exitDisjunction(this);
		}
	}

	public final DisjunctionContext disjunction() throws RecognitionException {
		return disjunction(0);
	}

	private DisjunctionContext disjunction(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DisjunctionContext _localctx = new DisjunctionContext(_ctx, _parentState);
		DisjunctionContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_disjunction, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(323);
			conjunction();
			}
			_ctx.stop = _input.LT(-1);
			setState(331);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DisjunctionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_disjunction);
					setState(325);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(326);
					and();
					setState(327);
					conjunction();
					}
					} 
				}
				setState(333);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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
	public static class ConjunctionContext extends ParserRuleContext {
		public NotContext not() {
			return getRuleContext(NotContext.class,0);
		}
		public ConjunctionContext conjunction() {
			return getRuleContext(ConjunctionContext.class,0);
		}
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public RelationContext relation() {
			return getRuleContext(RelationContext.class,0);
		}
		public LParenContext lParen() {
			return getRuleContext(LParenContext.class,0);
		}
		public PropositionContext proposition() {
			return getRuleContext(PropositionContext.class,0);
		}
		public RParenContext rParen() {
			return getRuleContext(RParenContext.class,0);
		}
		public ConjunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conjunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IParserListener ) ((IParserListener)listener).enterConjunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IParserListener ) ((IParserListener)listener).exitConjunction(this);
		}
	}

	public final ConjunctionContext conjunction() throws RecognitionException {
		ConjunctionContext _localctx = new ConjunctionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_conjunction);
		try {
			setState(343);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(334);
				not();
				setState(335);
				conjunction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(337);
				bool();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(338);
				relation();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(339);
				lParen();
				setState(340);
				proposition(0);
				setState(341);
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
	public static class RelationContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public RelationOperatorContext relationOperator() {
			return getRuleContext(RelationOperatorContext.class,0);
		}
		public RelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IParserListener ) ((IParserListener)listener).enterRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IParserListener ) ((IParserListener)listener).exitRelation(this);
		}
	}

	public final RelationContext relation() throws RecognitionException {
		RelationContext _localctx = new RelationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_relation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			expression(0);
			setState(346);
			relationOperator();
			setState(347);
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
	public static class RelationOperatorContext extends ParserRuleContext {
		public GeContext ge() {
			return getRuleContext(GeContext.class,0);
		}
		public GtContext gt() {
			return getRuleContext(GtContext.class,0);
		}
		public EqContext eq() {
			return getRuleContext(EqContext.class,0);
		}
		public NeContext ne() {
			return getRuleContext(NeContext.class,0);
		}
		public LtContext lt() {
			return getRuleContext(LtContext.class,0);
		}
		public LeContext le() {
			return getRuleContext(LeContext.class,0);
		}
		public RelationOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IParserListener ) ((IParserListener)listener).enterRelationOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IParserListener ) ((IParserListener)listener).exitRelationOperator(this);
		}
	}

	public final RelationOperatorContext relationOperator() throws RecognitionException {
		RelationOperatorContext _localctx = new RelationOperatorContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_relationOperator);
		try {
			setState(355);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Ge:
				enterOuterAlt(_localctx, 1);
				{
				setState(349);
				ge();
				}
				break;
			case Gt:
				enterOuterAlt(_localctx, 2);
				{
				setState(350);
				gt();
				}
				break;
			case Eq:
				enterOuterAlt(_localctx, 3);
				{
				setState(351);
				eq();
				}
				break;
			case Ne:
				enterOuterAlt(_localctx, 4);
				{
				setState(352);
				ne();
				}
				break;
			case Lt:
				enterOuterAlt(_localctx, 5);
				{
				setState(353);
				lt();
				}
				break;
			case Le:
				enterOuterAlt(_localctx, 6);
				{
				setState(354);
				le();
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
	public static class ListContext extends ParserRuleContext {
		public LBracketContext lBracket() {
			return getRuleContext(LBracketContext.class,0);
		}
		public TerminalNode RBracket() { return getToken(IParser.RBracket, 0); }
		public VListContext vList() {
			return getRuleContext(VListContext.class,0);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IParserListener ) ((IParserListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IParserListener ) ((IParserListener)listener).exitList(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			lBracket();
			setState(359);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 1636608048L) != 0) {
				{
				setState(358);
				vList();
				}
			}

			setState(361);
			match(RBracket);
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
	public static class ObjectContext extends ParserRuleContext {
		public LCurlyContext lCurly() {
			return getRuleContext(LCurlyContext.class,0);
		}
		public RCurlyContext rCurly() {
			return getRuleContext(RCurlyContext.class,0);
		}
		public KeyValuesContext keyValues() {
			return getRuleContext(KeyValuesContext.class,0);
		}
		public ObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IParserListener ) ((IParserListener)listener).enterObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IParserListener ) ((IParserListener)listener).exitObject(this);
		}
	}

	public final ObjectContext object() throws RecognitionException {
		ObjectContext _localctx = new ObjectContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_object);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			lCurly();
			setState(365);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 1611137024L) != 0) {
				{
				setState(364);
				keyValues();
				}
			}

			setState(367);
			rCurly();
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
	public static class KeyValuesContext extends ParserRuleContext {
		public List<KeyValueContext> keyValue() {
			return getRuleContexts(KeyValueContext.class);
		}
		public KeyValueContext keyValue(int i) {
			return getRuleContext(KeyValueContext.class,i);
		}
		public List<CommaContext> comma() {
			return getRuleContexts(CommaContext.class);
		}
		public CommaContext comma(int i) {
			return getRuleContext(CommaContext.class,i);
		}
		public KeyValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyValues; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IParserListener ) ((IParserListener)listener).enterKeyValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IParserListener ) ((IParserListener)listener).exitKeyValues(this);
		}
	}

	public final KeyValuesContext keyValues() throws RecognitionException {
		KeyValuesContext _localctx = new KeyValuesContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_keyValues);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			keyValue();
			setState(375);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(370);
				comma();
				setState(371);
				keyValue();
				}
				}
				setState(377);
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
	public static class KeyValueContext extends ParserRuleContext {
		public KeyContext key() {
			return getRuleContext(KeyContext.class,0);
		}
		public ColonContext colon() {
			return getRuleContext(ColonContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public KeyValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IParserListener ) ((IParserListener)listener).enterKeyValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IParserListener ) ((IParserListener)listener).exitKeyValue(this);
		}
	}

	public final KeyValueContext keyValue() throws RecognitionException {
		KeyValueContext _localctx = new KeyValueContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_keyValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			key();
			setState(379);
			colon();
			setState(380);
			value();
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
	public static class KeyContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public KeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IParserListener ) ((IParserListener)listener).enterKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IParserListener ) ((IParserListener)listener).exitKey(this);
		}
	}

	public final KeyContext key() throws RecognitionException {
		KeyContext _localctx = new KeyContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_key);
		try {
			setState(384);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Id:
				enterOuterAlt(_localctx, 1);
				{
				setState(382);
				id();
				}
				break;
			case DQString:
			case SQString:
				enterOuterAlt(_localctx, 2);
				{
				setState(383);
				string();
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
		enterRule(_localctx, 58, RULE_dollar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
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
	public static class SemicolonContext extends ParserRuleContext {
		public TerminalNode Semicolon() { return getToken(IParser.Semicolon, 0); }
		public SemicolonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_semicolon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IParserListener ) ((IParserListener)listener).enterSemicolon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IParserListener ) ((IParserListener)listener).exitSemicolon(this);
		}
	}

	public final SemicolonContext semicolon() throws RecognitionException {
		SemicolonContext _localctx = new SemicolonContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_semicolon);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			match(Semicolon);
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
		enterRule(_localctx, 62, RULE_lParen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
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
		enterRule(_localctx, 64, RULE_rParen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
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
		enterRule(_localctx, 66, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
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
		enterRule(_localctx, 68, RULE_defines);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
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

	@SuppressWarnings("CheckReturnValue")
	public static class GeContext extends ParserRuleContext {
		public TerminalNode Ge() { return getToken(IParser.Ge, 0); }
		public GeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ge; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IParserListener ) ((IParserListener)listener).enterGe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IParserListener ) ((IParserListener)listener).exitGe(this);
		}
	}

	public final GeContext ge() throws RecognitionException {
		GeContext _localctx = new GeContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_ge);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
			match(Ge);
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
	public static class GtContext extends ParserRuleContext {
		public TerminalNode Gt() { return getToken(IParser.Gt, 0); }
		public GtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IParserListener ) ((IParserListener)listener).enterGt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IParserListener ) ((IParserListener)listener).exitGt(this);
		}
	}

	public final GtContext gt() throws RecognitionException {
		GtContext _localctx = new GtContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_gt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			match(Gt);
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
	public static class EqContext extends ParserRuleContext {
		public TerminalNode Eq() { return getToken(IParser.Eq, 0); }
		public EqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IParserListener ) ((IParserListener)listener).enterEq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IParserListener ) ((IParserListener)listener).exitEq(this);
		}
	}

	public final EqContext eq() throws RecognitionException {
		EqContext _localctx = new EqContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_eq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			match(Eq);
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
	public static class NeContext extends ParserRuleContext {
		public TerminalNode Ne() { return getToken(IParser.Ne, 0); }
		public NeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ne; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IParserListener ) ((IParserListener)listener).enterNe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IParserListener ) ((IParserListener)listener).exitNe(this);
		}
	}

	public final NeContext ne() throws RecognitionException {
		NeContext _localctx = new NeContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_ne);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			match(Ne);
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
	public static class LeContext extends ParserRuleContext {
		public TerminalNode Le() { return getToken(IParser.Le, 0); }
		public LeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_le; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IParserListener ) ((IParserListener)listener).enterLe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IParserListener ) ((IParserListener)listener).exitLe(this);
		}
	}

	public final LeContext le() throws RecognitionException {
		LeContext _localctx = new LeContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_le);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			match(Le);
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
	public static class LtContext extends ParserRuleContext {
		public TerminalNode Lt() { return getToken(IParser.Lt, 0); }
		public LtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IParserListener ) ((IParserListener)listener).enterLt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IParserListener ) ((IParserListener)listener).exitLt(this);
		}
	}

	public final LtContext lt() throws RecognitionException {
		LtContext _localctx = new LtContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_lt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			match(Lt);
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
	public static class SetContext extends ParserRuleContext {
		public TerminalNode Set() { return getToken(IParser.Set, 0); }
		public SetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IParserListener ) ((IParserListener)listener).enterSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IParserListener ) ((IParserListener)listener).exitSet(this);
		}
	}

	public final SetContext set() throws RecognitionException {
		SetContext _localctx = new SetContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_set);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			match(Set);
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
		enterRule(_localctx, 84, RULE_comma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
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
		enterRule(_localctx, 86, RULE_colon);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
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
		enterRule(_localctx, 88, RULE_plus);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
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
		enterRule(_localctx, 90, RULE_minus);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
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
		enterRule(_localctx, 92, RULE_toPower);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
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
		enterRule(_localctx, 94, RULE_times);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
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
		enterRule(_localctx, 96, RULE_div);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
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
		enterRule(_localctx, 98, RULE_mod);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
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
		enterRule(_localctx, 100, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
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
	public static class BoolContext extends ParserRuleContext {
		public TrueValueContext trueValue() {
			return getRuleContext(TrueValueContext.class,0);
		}
		public FalseValueContext falseValue() {
			return getRuleContext(FalseValueContext.class,0);
		}
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IParserListener ) ((IParserListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IParserListener ) ((IParserListener)listener).exitBool(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_bool);
		try {
			setState(432);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case True:
				enterOuterAlt(_localctx, 1);
				{
				setState(430);
				trueValue();
				}
				break;
			case False:
				enterOuterAlt(_localctx, 2);
				{
				setState(431);
				falseValue();
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
	public static class TrueValueContext extends ParserRuleContext {
		public TerminalNode True() { return getToken(IParser.True, 0); }
		public TrueValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trueValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IParserListener ) ((IParserListener)listener).enterTrueValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IParserListener ) ((IParserListener)listener).exitTrueValue(this);
		}
	}

	public final TrueValueContext trueValue() throws RecognitionException {
		TrueValueContext _localctx = new TrueValueContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_trueValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
			match(True);
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
	public static class FalseValueContext extends ParserRuleContext {
		public TerminalNode False() { return getToken(IParser.False, 0); }
		public FalseValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_falseValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IParserListener ) ((IParserListener)listener).enterFalseValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IParserListener ) ((IParserListener)listener).exitFalseValue(this);
		}
	}

	public final FalseValueContext falseValue() throws RecognitionException {
		FalseValueContext _localctx = new FalseValueContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_falseValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
			match(False);
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
		enterRule(_localctx, 108, RULE_string);
		try {
			setState(440);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DQString:
				enterOuterAlt(_localctx, 1);
				{
				setState(438);
				dQString();
				}
				break;
			case SQString:
				enterOuterAlt(_localctx, 2);
				{
				setState(439);
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

	@SuppressWarnings("CheckReturnValue")
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
		enterRule(_localctx, 110, RULE_dQString);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
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

	@SuppressWarnings("CheckReturnValue")
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
		enterRule(_localctx, 112, RULE_sQString);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AndContext extends ParserRuleContext {
		public TerminalNode And() { return getToken(IParser.And, 0); }
		public AndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IParserListener ) ((IParserListener)listener).enterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IParserListener ) ((IParserListener)listener).exitAnd(this);
		}
	}

	public final AndContext and() throws RecognitionException {
		AndContext _localctx = new AndContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_and);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			match(And);
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
	public static class OrContext extends ParserRuleContext {
		public TerminalNode Or() { return getToken(IParser.Or, 0); }
		public OrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_or; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IParserListener ) ((IParserListener)listener).enterOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IParserListener ) ((IParserListener)listener).exitOr(this);
		}
	}

	public final OrContext or() throws RecognitionException {
		OrContext _localctx = new OrContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_or);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			match(Or);
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
	public static class NotContext extends ParserRuleContext {
		public TerminalNode Not() { return getToken(IParser.Not, 0); }
		public NotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_not; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IParserListener ) ((IParserListener)listener).enterNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IParserListener ) ((IParserListener)listener).exitNot(this);
		}
	}

	public final NotContext not() throws RecognitionException {
		NotContext _localctx = new NotContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_not);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
			match(Not);
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
	public static class LBracketContext extends ParserRuleContext {
		public TerminalNode LBracket() { return getToken(IParser.LBracket, 0); }
		public LBracketContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lBracket; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IParserListener ) ((IParserListener)listener).enterLBracket(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IParserListener ) ((IParserListener)listener).exitLBracket(this);
		}
	}

	public final LBracketContext lBracket() throws RecognitionException {
		LBracketContext _localctx = new LBracketContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_lBracket);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
			match(LBracket);
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
	public static class RBracketContext extends ParserRuleContext {
		public TerminalNode RBracket() { return getToken(IParser.RBracket, 0); }
		public RBracketContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rBracket; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IParserListener ) ((IParserListener)listener).enterRBracket(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IParserListener ) ((IParserListener)listener).exitRBracket(this);
		}
	}

	public final RBracketContext rBracket() throws RecognitionException {
		RBracketContext _localctx = new RBracketContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_rBracket);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			match(RBracket);
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
	public static class LCurlyContext extends ParserRuleContext {
		public TerminalNode LCurly() { return getToken(IParser.LCurly, 0); }
		public LCurlyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lCurly; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IParserListener ) ((IParserListener)listener).enterLCurly(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IParserListener ) ((IParserListener)listener).exitLCurly(this);
		}
	}

	public final LCurlyContext lCurly() throws RecognitionException {
		LCurlyContext _localctx = new LCurlyContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_lCurly);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			match(LCurly);
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
	public static class RCurlyContext extends ParserRuleContext {
		public TerminalNode RCurly() { return getToken(IParser.RCurly, 0); }
		public RCurlyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rCurly; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IParserListener ) ((IParserListener)listener).enterRCurly(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IParserListener ) ((IParserListener)listener).exitRCurly(this);
		}
	}

	public final RCurlyContext rCurly() throws RecognitionException {
		RCurlyContext _localctx = new RCurlyContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_rCurly);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			match(RCurly);
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
		case 14:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 16:
			return term_sempred((TermContext)_localctx, predIndex);
		case 19:
			return proposition_sempred((PropositionContext)_localctx, predIndex);
		case 20:
			return disjunction_sempred((DisjunctionContext)_localctx, predIndex);
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
	private boolean proposition_sempred(PropositionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean disjunction_sempred(DisjunctionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001(\u01cd\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007;\u0002"+
		"<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0001\u0000\u0001\u0000"+
		"\u0003\u0000\u0083\b\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0005\u0001"+
		"\u0088\b\u0001\n\u0001\f\u0001\u008b\t\u0001\u0001\u0001\u0001\u0001\u0005"+
		"\u0001\u008f\b\u0001\n\u0001\f\u0001\u0092\t\u0001\u0001\u0001\u0005\u0001"+
		"\u0095\b\u0001\n\u0001\f\u0001\u0098\t\u0001\u0001\u0001\u0005\u0001\u009b"+
		"\b\u0001\n\u0001\f\u0001\u009e\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u00a7\b\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u00ac\b\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u0004\u00b5\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u00bf\b\u0005"+
		"\n\u0005\f\u0005\u00c2\t\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0003\u0006\u00c8\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003"+
		"\u0006\u00cd\b\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0003\t\u00d6\b\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0005\n\u00de\b\n\n\n\f\n\u00e1\t\n\u0001\u000b\u0001\u000b\u0001\f"+
		"\u0001\f\u0003\f\u00e7\b\f\u0001\f\u0001\f\u0001\f\u0001\r\u0004\r\u00ed"+
		"\b\r\u000b\r\f\r\u00ee\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0005\u000e\u00fc\b\u000e\n\u000e\f\u000e\u00ff\t\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u0106"+
		"\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u0117\b\u0010\n"+
		"\u0010\f\u0010\u011a\t\u0010\u0001\u0011\u0001\u0011\u0003\u0011\u011e"+
		"\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0003\u0011\u0127\b\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u012e\b\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0135\b\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0005\u0013\u013e\b\u0013\n\u0013\f\u0013\u0141\t\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0005\u0014\u014a\b\u0014\n\u0014\f\u0014\u014d\t\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0003\u0015\u0158\b\u0015\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0003\u0017\u0164\b\u0017\u0001\u0018\u0001\u0018\u0003"+
		"\u0018\u0168\b\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0003"+
		"\u0019\u016e\b\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0005\u001a\u0176\b\u001a\n\u001a\f\u001a\u0179\t\u001a"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c"+
		"\u0003\u001c\u0181\b\u001c\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e"+
		"\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001!\u0001!\u0001\"\u0001\"\u0001"+
		"#\u0001#\u0001$\u0001$\u0001%\u0001%\u0001&\u0001&\u0001\'\u0001\'\u0001"+
		"(\u0001(\u0001)\u0001)\u0001*\u0001*\u0001+\u0001+\u0001,\u0001,\u0001"+
		"-\u0001-\u0001.\u0001.\u0001/\u0001/\u00010\u00010\u00011\u00011\u0001"+
		"2\u00012\u00013\u00013\u00033\u01b1\b3\u00014\u00014\u00015\u00015\u0001"+
		"6\u00016\u00036\u01b9\b6\u00017\u00017\u00018\u00018\u00019\u00019\u0001"+
		":\u0001:\u0001;\u0001;\u0001<\u0001<\u0001=\u0001=\u0001>\u0001>\u0001"+
		"?\u0001?\u0001?\u0000\u0004\u001c &(@\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDF"+
		"HJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0000\u0000\u01bf\u0000\u0080\u0001\u0000"+
		"\u0000\u0000\u0002\u0089\u0001\u0000\u0000\u0000\u0004\u00a6\u0001\u0000"+
		"\u0000\u0000\u0006\u00a8\u0001\u0000\u0000\u0000\b\u00b1\u0001\u0000\u0000"+
		"\u0000\n\u00ba\u0001\u0000\u0000\u0000\f\u00c3\u0001\u0000\u0000\u0000"+
		"\u000e\u00ce\u0001\u0000\u0000\u0000\u0010\u00d0\u0001\u0000\u0000\u0000"+
		"\u0012\u00d2\u0001\u0000\u0000\u0000\u0014\u00d9\u0001\u0000\u0000\u0000"+
		"\u0016\u00e2\u0001\u0000\u0000\u0000\u0018\u00e4\u0001\u0000\u0000\u0000"+
		"\u001a\u00ec\u0001\u0000\u0000\u0000\u001c\u00f0\u0001\u0000\u0000\u0000"+
		"\u001e\u0105\u0001\u0000\u0000\u0000 \u0107\u0001\u0000\u0000\u0000\""+
		"\u0126\u0001\u0000\u0000\u0000$\u0134\u0001\u0000\u0000\u0000&\u0136\u0001"+
		"\u0000\u0000\u0000(\u0142\u0001\u0000\u0000\u0000*\u0157\u0001\u0000\u0000"+
		"\u0000,\u0159\u0001\u0000\u0000\u0000.\u0163\u0001\u0000\u0000\u00000"+
		"\u0165\u0001\u0000\u0000\u00002\u016b\u0001\u0000\u0000\u00004\u0171\u0001"+
		"\u0000\u0000\u00006\u017a\u0001\u0000\u0000\u00008\u0180\u0001\u0000\u0000"+
		"\u0000:\u0182\u0001\u0000\u0000\u0000<\u0184\u0001\u0000\u0000\u0000>"+
		"\u0186\u0001\u0000\u0000\u0000@\u0188\u0001\u0000\u0000\u0000B\u018a\u0001"+
		"\u0000\u0000\u0000D\u018c\u0001\u0000\u0000\u0000F\u018e\u0001\u0000\u0000"+
		"\u0000H\u0190\u0001\u0000\u0000\u0000J\u0192\u0001\u0000\u0000\u0000L"+
		"\u0194\u0001\u0000\u0000\u0000N\u0196\u0001\u0000\u0000\u0000P\u0198\u0001"+
		"\u0000\u0000\u0000R\u019a\u0001\u0000\u0000\u0000T\u019c\u0001\u0000\u0000"+
		"\u0000V\u019e\u0001\u0000\u0000\u0000X\u01a0\u0001\u0000\u0000\u0000Z"+
		"\u01a2\u0001\u0000\u0000\u0000\\\u01a4\u0001\u0000\u0000\u0000^\u01a6"+
		"\u0001\u0000\u0000\u0000`\u01a8\u0001\u0000\u0000\u0000b\u01aa\u0001\u0000"+
		"\u0000\u0000d\u01ac\u0001\u0000\u0000\u0000f\u01b0\u0001\u0000\u0000\u0000"+
		"h\u01b2\u0001\u0000\u0000\u0000j\u01b4\u0001\u0000\u0000\u0000l\u01b8"+
		"\u0001\u0000\u0000\u0000n\u01ba\u0001\u0000\u0000\u0000p\u01bc\u0001\u0000"+
		"\u0000\u0000r\u01be\u0001\u0000\u0000\u0000t\u01c0\u0001\u0000\u0000\u0000"+
		"v\u01c2\u0001\u0000\u0000\u0000x\u01c4\u0001\u0000\u0000\u0000z\u01c6"+
		"\u0001\u0000\u0000\u0000|\u01c8\u0001\u0000\u0000\u0000~\u01ca\u0001\u0000"+
		"\u0000\u0000\u0080\u0082\u0003:\u001d\u0000\u0081\u0083\u0003\u0002\u0001"+
		"\u0000\u0082\u0081\u0001\u0000\u0000\u0000\u0082\u0083\u0001\u0000\u0000"+
		"\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u0085\u0003:\u001d\u0000"+
		"\u0085\u0001\u0001\u0000\u0000\u0000\u0086\u0088\u0003<\u001e\u0000\u0087"+
		"\u0086\u0001\u0000\u0000\u0000\u0088\u008b\u0001\u0000\u0000\u0000\u0089"+
		"\u0087\u0001\u0000\u0000\u0000\u0089\u008a\u0001\u0000\u0000\u0000\u008a"+
		"\u008c\u0001\u0000\u0000\u0000\u008b\u0089\u0001\u0000\u0000\u0000\u008c"+
		"\u0096\u0003\u0004\u0002\u0000\u008d\u008f\u0003<\u001e\u0000\u008e\u008d"+
		"\u0001\u0000\u0000\u0000\u008f\u0092\u0001\u0000\u0000\u0000\u0090\u008e"+
		"\u0001\u0000\u0000\u0000\u0090\u0091\u0001\u0000\u0000\u0000\u0091\u0093"+
		"\u0001\u0000\u0000\u0000\u0092\u0090\u0001\u0000\u0000\u0000\u0093\u0095"+
		"\u0003\u0004\u0002\u0000\u0094\u0090\u0001\u0000\u0000\u0000\u0095\u0098"+
		"\u0001\u0000\u0000\u0000\u0096\u0094\u0001\u0000\u0000\u0000\u0096\u0097"+
		"\u0001\u0000\u0000\u0000\u0097\u009c\u0001\u0000\u0000\u0000\u0098\u0096"+
		"\u0001\u0000\u0000\u0000\u0099\u009b\u0003<\u001e\u0000\u009a\u0099\u0001"+
		"\u0000\u0000\u0000\u009b\u009e\u0001\u0000\u0000\u0000\u009c\u009a\u0001"+
		"\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000\u0000\u009d\u0003\u0001"+
		"\u0000\u0000\u0000\u009e\u009c\u0001\u0000\u0000\u0000\u009f\u00a7\u0003"+
		"\u001c\u000e\u0000\u00a0\u00a7\u0003,\u0016\u0000\u00a1\u00a7\u0003\u0018"+
		"\f\u0000\u00a2\u00a3\u0003>\u001f\u0000\u00a3\u00a4\u0003\u0002\u0001"+
		"\u0000\u00a4\u00a5\u0003@ \u0000\u00a5\u00a7\u0001\u0000\u0000\u0000\u00a6"+
		"\u009f\u0001\u0000\u0000\u0000\u00a6\u00a0\u0001\u0000\u0000\u0000\u00a6"+
		"\u00a1\u0001\u0000\u0000\u0000\u00a6\u00a2\u0001\u0000\u0000\u0000\u00a7"+
		"\u0005\u0001\u0000\u0000\u0000\u00a8\u00a9\u0003B!\u0000\u00a9\u00ab\u0003"+
		">\u001f\u0000\u00aa\u00ac\u0003\n\u0005\u0000\u00ab\u00aa\u0001\u0000"+
		"\u0000\u0000\u00ab\u00ac\u0001\u0000\u0000\u0000\u00ac\u00ad\u0001\u0000"+
		"\u0000\u0000\u00ad\u00ae\u0003@ \u0000\u00ae\u00af\u0003R)\u0000\u00af"+
		"\u00b0\u0003\u0004\u0002\u0000\u00b0\u0007\u0001\u0000\u0000\u0000\u00b1"+
		"\u00b2\u0003B!\u0000\u00b2\u00b4\u0003>\u001f\u0000\u00b3\u00b5\u0003"+
		"\n\u0005\u0000\u00b4\u00b3\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000"+
		"\u0000\u0000\u00b5\u00b6\u0001\u0000\u0000\u0000\u00b6\u00b7\u0003@ \u0000"+
		"\u00b7\u00b8\u0003D\"\u0000\u00b8\u00b9\u0003\u0004\u0002\u0000\u00b9"+
		"\t\u0001\u0000\u0000\u0000\u00ba\u00c0\u0003\f\u0006\u0000\u00bb\u00bc"+
		"\u0003T*\u0000\u00bc\u00bd\u0003\f\u0006\u0000\u00bd\u00bf\u0001\u0000"+
		"\u0000\u0000\u00be\u00bb\u0001\u0000\u0000\u0000\u00bf\u00c2\u0001\u0000"+
		"\u0000\u0000\u00c0\u00be\u0001\u0000\u0000\u0000\u00c0\u00c1\u0001\u0000"+
		"\u0000\u0000\u00c1\u000b\u0001\u0000\u0000\u0000\u00c2\u00c0\u0001\u0000"+
		"\u0000\u0000\u00c3\u00c7\u0003B!\u0000\u00c4\u00c5\u0003V+\u0000\u00c5"+
		"\u00c6\u0003\u000e\u0007\u0000\u00c6\u00c8\u0001\u0000\u0000\u0000\u00c7"+
		"\u00c4\u0001\u0000\u0000\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c8"+
		"\u00cc\u0001\u0000\u0000\u0000\u00c9\u00ca\u0003R)\u0000\u00ca\u00cb\u0003"+
		"\u0010\b\u0000\u00cb\u00cd\u0001\u0000\u0000\u0000\u00cc\u00c9\u0001\u0000"+
		"\u0000\u0000\u00cc\u00cd\u0001\u0000\u0000\u0000\u00cd\r\u0001\u0000\u0000"+
		"\u0000\u00ce\u00cf\u0003B!\u0000\u00cf\u000f\u0001\u0000\u0000\u0000\u00d0"+
		"\u00d1\u0003\u001c\u000e\u0000\u00d1\u0011\u0001\u0000\u0000\u0000\u00d2"+
		"\u00d3\u0003B!\u0000\u00d3\u00d5\u0003>\u001f\u0000\u00d4\u00d6\u0003"+
		"\u0014\n\u0000\u00d5\u00d4\u0001\u0000\u0000\u0000\u00d5\u00d6\u0001\u0000"+
		"\u0000\u0000\u00d6\u00d7\u0001\u0000\u0000\u0000\u00d7\u00d8\u0003@ \u0000"+
		"\u00d8\u0013\u0001\u0000\u0000\u0000\u00d9\u00df\u0003\u0016\u000b\u0000"+
		"\u00da\u00db\u0003T*\u0000\u00db\u00dc\u0003\u0016\u000b\u0000\u00dc\u00de"+
		"\u0001\u0000\u0000\u0000\u00dd\u00da\u0001\u0000\u0000\u0000\u00de\u00e1"+
		"\u0001\u0000\u0000\u0000\u00df\u00dd\u0001\u0000\u0000\u0000\u00df\u00e0"+
		"\u0001\u0000\u0000\u0000\u00e0\u0015\u0001\u0000\u0000\u0000\u00e1\u00df"+
		"\u0001\u0000\u0000\u0000\u00e2\u00e3\u0003\u0004\u0002\u0000\u00e3\u0017"+
		"\u0001\u0000\u0000\u0000\u00e4\u00e6\u0003B!\u0000\u00e5\u00e7\u0003\u001a"+
		"\r\u0000\u00e6\u00e5\u0001\u0000\u0000\u0000\u00e6\u00e7\u0001\u0000\u0000"+
		"\u0000\u00e7\u00e8\u0001\u0000\u0000\u0000\u00e8\u00e9\u0003R)\u0000\u00e9"+
		"\u00ea\u0003\u0004\u0002\u0000\u00ea\u0019\u0001\u0000\u0000\u0000\u00eb"+
		"\u00ed\u00030\u0018\u0000\u00ec\u00eb\u0001\u0000\u0000\u0000\u00ed\u00ee"+
		"\u0001\u0000\u0000\u0000\u00ee\u00ec\u0001\u0000\u0000\u0000\u00ee\u00ef"+
		"\u0001\u0000\u0000\u0000\u00ef\u001b\u0001\u0000\u0000\u0000\u00f0\u00f1"+
		"\u0006\u000e\uffff\uffff\u0000\u00f1\u00f2\u0003\u001e\u000f\u0000\u00f2"+
		"\u00fd\u0001\u0000\u0000\u0000\u00f3\u00f4\n\u0003\u0000\u0000\u00f4\u00f5"+
		"\u0003X,\u0000\u00f5\u00f6\u0003\u001e\u000f\u0000\u00f6\u00fc\u0001\u0000"+
		"\u0000\u0000\u00f7\u00f8\n\u0002\u0000\u0000\u00f8\u00f9\u0003Z-\u0000"+
		"\u00f9\u00fa\u0003\u001e\u000f\u0000\u00fa\u00fc\u0001\u0000\u0000\u0000"+
		"\u00fb\u00f3\u0001\u0000\u0000\u0000\u00fb\u00f7\u0001\u0000\u0000\u0000"+
		"\u00fc\u00ff\u0001\u0000\u0000\u0000\u00fd\u00fb\u0001\u0000\u0000\u0000"+
		"\u00fd\u00fe\u0001\u0000\u0000\u0000\u00fe\u001d\u0001\u0000\u0000\u0000"+
		"\u00ff\u00fd\u0001\u0000\u0000\u0000\u0100\u0101\u0003 \u0010\u0000\u0101"+
		"\u0102\u0003\\.\u0000\u0102\u0103\u0003\u001e\u000f\u0000\u0103\u0106"+
		"\u0001\u0000\u0000\u0000\u0104\u0106\u0003 \u0010\u0000\u0105\u0100\u0001"+
		"\u0000\u0000\u0000\u0105\u0104\u0001\u0000\u0000\u0000\u0106\u001f\u0001"+
		"\u0000\u0000\u0000\u0107\u0108\u0006\u0010\uffff\uffff\u0000\u0108\u0109"+
		"\u0003\"\u0011\u0000\u0109\u0118\u0001\u0000\u0000\u0000\u010a\u010b\n"+
		"\u0004\u0000\u0000\u010b\u010c\u0003^/\u0000\u010c\u010d\u0003\"\u0011"+
		"\u0000\u010d\u0117\u0001\u0000\u0000\u0000\u010e\u010f\n\u0003\u0000\u0000"+
		"\u010f\u0110\u0003`0\u0000\u0110\u0111\u0003\"\u0011\u0000\u0111\u0117"+
		"\u0001\u0000\u0000\u0000\u0112\u0113\n\u0002\u0000\u0000\u0113\u0114\u0003"+
		"b1\u0000\u0114\u0115\u0003\"\u0011\u0000\u0115\u0117\u0001\u0000\u0000"+
		"\u0000\u0116\u010a\u0001\u0000\u0000\u0000\u0116\u010e\u0001\u0000\u0000"+
		"\u0000\u0116\u0112\u0001\u0000\u0000\u0000\u0117\u011a\u0001\u0000\u0000"+
		"\u0000\u0118\u0116\u0001\u0000\u0000\u0000\u0118\u0119\u0001\u0000\u0000"+
		"\u0000\u0119!\u0001\u0000\u0000\u0000\u011a\u0118\u0001\u0000\u0000\u0000"+
		"\u011b\u011e\u0003X,\u0000\u011c\u011e\u0003Z-\u0000\u011d\u011b\u0001"+
		"\u0000\u0000\u0000\u011d\u011c\u0001\u0000\u0000\u0000\u011e\u011f\u0001"+
		"\u0000\u0000\u0000\u011f\u0120\u0003\"\u0011\u0000\u0120\u0127\u0001\u0000"+
		"\u0000\u0000\u0121\u0127\u0003$\u0012\u0000\u0122\u0123\u0003>\u001f\u0000"+
		"\u0123\u0124\u0003\u0004\u0002\u0000\u0124\u0125\u0003@ \u0000\u0125\u0127"+
		"\u0001\u0000\u0000\u0000\u0126\u011d\u0001\u0000\u0000\u0000\u0126\u0121"+
		"\u0001\u0000\u0000\u0000\u0126\u0122\u0001\u0000\u0000\u0000\u0127#\u0001"+
		"\u0000\u0000\u0000\u0128\u0135\u0003d2\u0000\u0129\u0135\u0003l6\u0000"+
		"\u012a\u0135\u0003f3\u0000\u012b\u012d\u0003B!\u0000\u012c\u012e\u0003"+
		"\u001a\r\u0000\u012d\u012c\u0001\u0000\u0000\u0000\u012d\u012e\u0001\u0000"+
		"\u0000\u0000\u012e\u0135\u0001\u0000\u0000\u0000\u012f\u0135\u0003\u0006"+
		"\u0003\u0000\u0130\u0135\u0003\b\u0004\u0000\u0131\u0135\u0003\u0012\t"+
		"\u0000\u0132\u0135\u00030\u0018\u0000\u0133\u0135\u00032\u0019\u0000\u0134"+
		"\u0128\u0001\u0000\u0000\u0000\u0134\u0129\u0001\u0000\u0000\u0000\u0134"+
		"\u012a\u0001\u0000\u0000\u0000\u0134\u012b\u0001\u0000\u0000\u0000\u0134"+
		"\u012f\u0001\u0000\u0000\u0000\u0134\u0130\u0001\u0000\u0000\u0000\u0134"+
		"\u0131\u0001\u0000\u0000\u0000\u0134\u0132\u0001\u0000\u0000\u0000\u0134"+
		"\u0133\u0001\u0000\u0000\u0000\u0135%\u0001\u0000\u0000\u0000\u0136\u0137"+
		"\u0006\u0013\uffff\uffff\u0000\u0137\u0138\u0003(\u0014\u0000\u0138\u013f"+
		"\u0001\u0000\u0000\u0000\u0139\u013a\n\u0002\u0000\u0000\u013a\u013b\u0003"+
		"t:\u0000\u013b\u013c\u0003(\u0014\u0000\u013c\u013e\u0001\u0000\u0000"+
		"\u0000\u013d\u0139\u0001\u0000\u0000\u0000\u013e\u0141\u0001\u0000\u0000"+
		"\u0000\u013f\u013d\u0001\u0000\u0000\u0000\u013f\u0140\u0001\u0000\u0000"+
		"\u0000\u0140\'\u0001\u0000\u0000\u0000\u0141\u013f\u0001\u0000\u0000\u0000"+
		"\u0142\u0143\u0006\u0014\uffff\uffff\u0000\u0143\u0144\u0003*\u0015\u0000"+
		"\u0144\u014b\u0001\u0000\u0000\u0000\u0145\u0146\n\u0002\u0000\u0000\u0146"+
		"\u0147\u0003r9\u0000\u0147\u0148\u0003*\u0015\u0000\u0148\u014a\u0001"+
		"\u0000\u0000\u0000\u0149\u0145\u0001\u0000\u0000\u0000\u014a\u014d\u0001"+
		"\u0000\u0000\u0000\u014b\u0149\u0001\u0000\u0000\u0000\u014b\u014c\u0001"+
		"\u0000\u0000\u0000\u014c)\u0001\u0000\u0000\u0000\u014d\u014b\u0001\u0000"+
		"\u0000\u0000\u014e\u014f\u0003v;\u0000\u014f\u0150\u0003*\u0015\u0000"+
		"\u0150\u0158\u0001\u0000\u0000\u0000\u0151\u0158\u0003f3\u0000\u0152\u0158"+
		"\u0003,\u0016\u0000\u0153\u0154\u0003>\u001f\u0000\u0154\u0155\u0003&"+
		"\u0013\u0000\u0155\u0156\u0003@ \u0000\u0156\u0158\u0001\u0000\u0000\u0000"+
		"\u0157\u014e\u0001\u0000\u0000\u0000\u0157\u0151\u0001\u0000\u0000\u0000"+
		"\u0157\u0152\u0001\u0000\u0000\u0000\u0157\u0153\u0001\u0000\u0000\u0000"+
		"\u0158+\u0001\u0000\u0000\u0000\u0159\u015a\u0003\u001c\u000e\u0000\u015a"+
		"\u015b\u0003.\u0017\u0000\u015b\u015c\u0003\u001c\u000e\u0000\u015c-\u0001"+
		"\u0000\u0000\u0000\u015d\u0164\u0003F#\u0000\u015e\u0164\u0003H$\u0000"+
		"\u015f\u0164\u0003J%\u0000\u0160\u0164\u0003L&\u0000\u0161\u0164\u0003"+
		"P(\u0000\u0162\u0164\u0003N\'\u0000\u0163\u015d\u0001\u0000\u0000\u0000"+
		"\u0163\u015e\u0001\u0000\u0000\u0000\u0163\u015f\u0001\u0000\u0000\u0000"+
		"\u0163\u0160\u0001\u0000\u0000\u0000\u0163\u0161\u0001\u0000\u0000\u0000"+
		"\u0163\u0162\u0001\u0000\u0000\u0000\u0164/\u0001\u0000\u0000\u0000\u0165"+
		"\u0167\u0003x<\u0000\u0166\u0168\u0003\u0014\n\u0000\u0167\u0166\u0001"+
		"\u0000\u0000\u0000\u0167\u0168\u0001\u0000\u0000\u0000\u0168\u0169\u0001"+
		"\u0000\u0000\u0000\u0169\u016a\u0005\u000e\u0000\u0000\u016a1\u0001\u0000"+
		"\u0000\u0000\u016b\u016d\u0003|>\u0000\u016c\u016e\u00034\u001a\u0000"+
		"\u016d\u016c\u0001\u0000\u0000\u0000\u016d\u016e\u0001\u0000\u0000\u0000"+
		"\u016e\u016f\u0001\u0000\u0000\u0000\u016f\u0170\u0003~?\u0000\u01703"+
		"\u0001\u0000\u0000\u0000\u0171\u0177\u00036\u001b\u0000\u0172\u0173\u0003"+
		"T*\u0000\u0173\u0174\u00036\u001b\u0000\u0174\u0176\u0001\u0000\u0000"+
		"\u0000\u0175\u0172\u0001\u0000\u0000\u0000\u0176\u0179\u0001\u0000\u0000"+
		"\u0000\u0177\u0175\u0001\u0000\u0000\u0000\u0177\u0178\u0001\u0000\u0000"+
		"\u0000\u01785\u0001\u0000\u0000\u0000\u0179\u0177\u0001\u0000\u0000\u0000"+
		"\u017a\u017b\u00038\u001c\u0000\u017b\u017c\u0003V+\u0000\u017c\u017d"+
		"\u0003$\u0012\u0000\u017d7\u0001\u0000\u0000\u0000\u017e\u0181\u0003B"+
		"!\u0000\u017f\u0181\u0003l6\u0000\u0180\u017e\u0001\u0000\u0000\u0000"+
		"\u0180\u017f\u0001\u0000\u0000\u0000\u01819\u0001\u0000\u0000\u0000\u0182"+
		"\u0183\u0005\t\u0000\u0000\u0183;\u0001\u0000\u0000\u0000\u0184\u0185"+
		"\u0005\n\u0000\u0000\u0185=\u0001\u0000\u0000\u0000\u0186\u0187\u0005"+
		"\u000b\u0000\u0000\u0187?\u0001\u0000\u0000\u0000\u0188\u0189\u0005\f"+
		"\u0000\u0000\u0189A\u0001\u0000\u0000\u0000\u018a\u018b\u0005\u0013\u0000"+
		"\u0000\u018bC\u0001\u0000\u0000\u0000\u018c\u018d\u0005\u0014\u0000\u0000"+
		"\u018dE\u0001\u0000\u0000\u0000\u018e\u018f\u0005\u001f\u0000\u0000\u018f"+
		"G\u0001\u0000\u0000\u0000\u0190\u0191\u0005 \u0000\u0000\u0191I\u0001"+
		"\u0000\u0000\u0000\u0192\u0193\u0005$\u0000\u0000\u0193K\u0001\u0000\u0000"+
		"\u0000\u0194\u0195\u0005#\u0000\u0000\u0195M\u0001\u0000\u0000\u0000\u0196"+
		"\u0197\u0005!\u0000\u0000\u0197O\u0001\u0000\u0000\u0000\u0198\u0199\u0005"+
		"\"\u0000\u0000\u0199Q\u0001\u0000\u0000\u0000\u019a\u019b\u0005(\u0000"+
		"\u0000\u019bS\u0001\u0000\u0000\u0000\u019c\u019d\u0005\u0015\u0000\u0000"+
		"\u019dU\u0001\u0000\u0000\u0000\u019e\u019f\u0005\u0016\u0000\u0000\u019f"+
		"W\u0001\u0000\u0000\u0000\u01a0\u01a1\u0005\u0017\u0000\u0000\u01a1Y\u0001"+
		"\u0000\u0000\u0000\u01a2\u01a3\u0005\u0018\u0000\u0000\u01a3[\u0001\u0000"+
		"\u0000\u0000\u01a4\u01a5\u0005\u0019\u0000\u0000\u01a5]\u0001\u0000\u0000"+
		"\u0000\u01a6\u01a7\u0005\u001a\u0000\u0000\u01a7_\u0001\u0000\u0000\u0000"+
		"\u01a8\u01a9\u0005\u001b\u0000\u0000\u01a9a\u0001\u0000\u0000\u0000\u01aa"+
		"\u01ab\u0005\u001c\u0000\u0000\u01abc\u0001\u0000\u0000\u0000\u01ac\u01ad"+
		"\u0005\u0012\u0000\u0000\u01ade\u0001\u0000\u0000\u0000\u01ae\u01b1\u0003"+
		"h4\u0000\u01af\u01b1\u0003j5\u0000\u01b0\u01ae\u0001\u0000\u0000\u0000"+
		"\u01b0\u01af\u0001\u0000\u0000\u0000\u01b1g\u0001\u0000\u0000\u0000\u01b2"+
		"\u01b3\u0005\u0004\u0000\u0000\u01b3i\u0001\u0000\u0000\u0000\u01b4\u01b5"+
		"\u0005\u0005\u0000\u0000\u01b5k\u0001\u0000\u0000\u0000\u01b6\u01b9\u0003"+
		"n7\u0000\u01b7\u01b9\u0003p8\u0000\u01b8\u01b6\u0001\u0000\u0000\u0000"+
		"\u01b8\u01b7\u0001\u0000\u0000\u0000\u01b9m\u0001\u0000\u0000\u0000\u01ba"+
		"\u01bb\u0005\u001d\u0000\u0000\u01bbo\u0001\u0000\u0000\u0000\u01bc\u01bd"+
		"\u0005\u001e\u0000\u0000\u01bdq\u0001\u0000\u0000\u0000\u01be\u01bf\u0005"+
		"%\u0000\u0000\u01bfs\u0001\u0000\u0000\u0000\u01c0\u01c1\u0005&\u0000"+
		"\u0000\u01c1u\u0001\u0000\u0000\u0000\u01c2\u01c3\u0005\'\u0000\u0000"+
		"\u01c3w\u0001\u0000\u0000\u0000\u01c4\u01c5\u0005\r\u0000\u0000\u01c5"+
		"y\u0001\u0000\u0000\u0000\u01c6\u01c7\u0005\u000e\u0000\u0000\u01c7{\u0001"+
		"\u0000\u0000\u0000\u01c8\u01c9\u0005\u000f\u0000\u0000\u01c9}\u0001\u0000"+
		"\u0000\u0000\u01ca\u01cb\u0005\u0010\u0000\u0000\u01cb\u007f\u0001\u0000"+
		"\u0000\u0000\"\u0082\u0089\u0090\u0096\u009c\u00a6\u00ab\u00b4\u00c0\u00c7"+
		"\u00cc\u00d5\u00df\u00e6\u00ee\u00fb\u00fd\u0105\u0116\u0118\u011d\u0126"+
		"\u012d\u0134\u013f\u014b\u0157\u0163\u0167\u016d\u0177\u0180\u01b0\u01b8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}