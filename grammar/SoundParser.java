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
public class SoundParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MultiLineComment=1, SingleLineComment=2, WhiteSpace=3, EOL=4, Semicolon=5, 
		Comma=6, Equal=7, Number=8, Id=9, LParen=10, RParen=11, LBracket=12, RBracket=13, 
		String=14;
	public static final int
		RULE_sound = 0, RULE_statements = 1, RULE_statement = 2, RULE_def = 3, 
		RULE_defParams = 4, RULE_calls = 5, RULE_call = 6, RULE_callParams = 7, 
		RULE_callParam = 8, RULE_semicolon = 9, RULE_comma = 10, RULE_lParen = 11, 
		RULE_rParen = 12, RULE_lBracket = 13, RULE_rBracket = 14, RULE_equal = 15, 
		RULE_id = 16, RULE_string = 17, RULE_number = 18, RULE_array = 19, RULE_elements = 20, 
		RULE_elem = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"sound", "statements", "statement", "def", "defParams", "calls", "call", 
			"callParams", "callParam", "semicolon", "comma", "lParen", "rParen", 
			"lBracket", "rBracket", "equal", "id", "string", "number", "array", "elements", 
			"elem"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "';'", "','", "'='", null, null, "'('", 
			"')'", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "MultiLineComment", "SingleLineComment", "WhiteSpace", "EOL", "Semicolon", 
			"Comma", "Equal", "Number", "Id", "LParen", "RParen", "LBracket", "RBracket", 
			"String"
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

	public SoundParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SoundContext extends ParserRuleContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public SoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoundParserListener ) ((SoundParserListener)listener).enterSound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoundParserListener ) ((SoundParserListener)listener).exitSound(this);
		}
	}

	public final SoundContext sound() throws RecognitionException {
		SoundContext _localctx = new SoundContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_sound);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			statements();
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
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoundParserListener ) ((SoundParserListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoundParserListener ) ((SoundParserListener)listener).exitStatements(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(46);
				statement();
				}
				}
				setState(49); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Id );
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
		public DefContext def() {
			return getRuleContext(DefContext.class,0);
		}
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoundParserListener ) ((SoundParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoundParserListener ) ((SoundParserListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(53);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				def();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DefContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public List<LParenContext> lParen() {
			return getRuleContexts(LParenContext.class);
		}
		public LParenContext lParen(int i) {
			return getRuleContext(LParenContext.class,i);
		}
		public List<RParenContext> rParen() {
			return getRuleContexts(RParenContext.class);
		}
		public RParenContext rParen(int i) {
			return getRuleContext(RParenContext.class,i);
		}
		public EqualContext equal() {
			return getRuleContext(EqualContext.class,0);
		}
		public DefParamsContext defParams() {
			return getRuleContext(DefParamsContext.class,0);
		}
		public CallsContext calls() {
			return getRuleContext(CallsContext.class,0);
		}
		public DefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoundParserListener ) ((SoundParserListener)listener).enterDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoundParserListener ) ((SoundParserListener)listener).exitDef(this);
		}
	}

	public final DefContext def() throws RecognitionException {
		DefContext _localctx = new DefContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			id();
			setState(56);
			lParen();
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Id) {
				{
				setState(57);
				defParams();
				}
			}

			setState(60);
			rParen();
			setState(61);
			equal();
			setState(62);
			lParen();
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Id) {
				{
				setState(63);
				calls();
				}
			}

			setState(66);
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
	public static class DefParamsContext extends ParserRuleContext {
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public List<CommaContext> comma() {
			return getRuleContexts(CommaContext.class);
		}
		public CommaContext comma(int i) {
			return getRuleContext(CommaContext.class,i);
		}
		public DefParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoundParserListener ) ((SoundParserListener)listener).enterDefParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoundParserListener ) ((SoundParserListener)listener).exitDefParams(this);
		}
	}

	public final DefParamsContext defParams() throws RecognitionException {
		DefParamsContext _localctx = new DefParamsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_defParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			id();
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(69);
				comma();
				setState(70);
				id();
				}
				}
				setState(76);
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
	public static class CallsContext extends ParserRuleContext {
		public List<CallContext> call() {
			return getRuleContexts(CallContext.class);
		}
		public CallContext call(int i) {
			return getRuleContext(CallContext.class,i);
		}
		public CallsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calls; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoundParserListener ) ((SoundParserListener)listener).enterCalls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoundParserListener ) ((SoundParserListener)listener).exitCalls(this);
		}
	}

	public final CallsContext calls() throws RecognitionException {
		CallsContext _localctx = new CallsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_calls);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(77);
				call();
				}
				}
				setState(80); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Id );
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
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
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
		public CallParamsContext callParams() {
			return getRuleContext(CallParamsContext.class,0);
		}
		public CallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoundParserListener ) ((SoundParserListener)listener).enterCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoundParserListener ) ((SoundParserListener)listener).exitCall(this);
		}
	}

	public final CallContext call() throws RecognitionException {
		CallContext _localctx = new CallContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(82);
				id();
				setState(83);
				equal();
				}
				break;
			}
			setState(87);
			id();
			setState(88);
			lParen();
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 21248L) != 0) {
				{
				setState(89);
				callParams();
				}
			}

			setState(92);
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
	public static class CallParamsContext extends ParserRuleContext {
		public List<CallParamContext> callParam() {
			return getRuleContexts(CallParamContext.class);
		}
		public CallParamContext callParam(int i) {
			return getRuleContext(CallParamContext.class,i);
		}
		public List<CommaContext> comma() {
			return getRuleContexts(CommaContext.class);
		}
		public CommaContext comma(int i) {
			return getRuleContext(CommaContext.class,i);
		}
		public CallParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoundParserListener ) ((SoundParserListener)listener).enterCallParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoundParserListener ) ((SoundParserListener)listener).exitCallParams(this);
		}
	}

	public final CallParamsContext callParams() throws RecognitionException {
		CallParamsContext _localctx = new CallParamsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_callParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			callParam();
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(95);
				comma();
				setState(96);
				callParam();
				}
				}
				setState(102);
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
	public static class CallParamContext extends ParserRuleContext {
		public ElemContext elem() {
			return getRuleContext(ElemContext.class,0);
		}
		public CallParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoundParserListener ) ((SoundParserListener)listener).enterCallParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoundParserListener ) ((SoundParserListener)listener).exitCallParam(this);
		}
	}

	public final CallParamContext callParam() throws RecognitionException {
		CallParamContext _localctx = new CallParamContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_callParam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			elem();
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
		public TerminalNode Semicolon() { return getToken(SoundParser.Semicolon, 0); }
		public SemicolonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_semicolon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoundParserListener ) ((SoundParserListener)listener).enterSemicolon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoundParserListener ) ((SoundParserListener)listener).exitSemicolon(this);
		}
	}

	public final SemicolonContext semicolon() throws RecognitionException {
		SemicolonContext _localctx = new SemicolonContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_semicolon);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
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
	public static class CommaContext extends ParserRuleContext {
		public TerminalNode Comma() { return getToken(SoundParser.Comma, 0); }
		public CommaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoundParserListener ) ((SoundParserListener)listener).enterComma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoundParserListener ) ((SoundParserListener)listener).exitComma(this);
		}
	}

	public final CommaContext comma() throws RecognitionException {
		CommaContext _localctx = new CommaContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_comma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
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
	public static class LParenContext extends ParserRuleContext {
		public TerminalNode LParen() { return getToken(SoundParser.LParen, 0); }
		public LParenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lParen; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoundParserListener ) ((SoundParserListener)listener).enterLParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoundParserListener ) ((SoundParserListener)listener).exitLParen(this);
		}
	}

	public final LParenContext lParen() throws RecognitionException {
		LParenContext _localctx = new LParenContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_lParen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
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
		public TerminalNode RParen() { return getToken(SoundParser.RParen, 0); }
		public RParenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rParen; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoundParserListener ) ((SoundParserListener)listener).enterRParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoundParserListener ) ((SoundParserListener)listener).exitRParen(this);
		}
	}

	public final RParenContext rParen() throws RecognitionException {
		RParenContext _localctx = new RParenContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_rParen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
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
	public static class LBracketContext extends ParserRuleContext {
		public TerminalNode LBracket() { return getToken(SoundParser.LBracket, 0); }
		public LBracketContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lBracket; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoundParserListener ) ((SoundParserListener)listener).enterLBracket(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoundParserListener ) ((SoundParserListener)listener).exitLBracket(this);
		}
	}

	public final LBracketContext lBracket() throws RecognitionException {
		LBracketContext _localctx = new LBracketContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_lBracket);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
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
		public TerminalNode RBracket() { return getToken(SoundParser.RBracket, 0); }
		public RBracketContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rBracket; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoundParserListener ) ((SoundParserListener)listener).enterRBracket(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoundParserListener ) ((SoundParserListener)listener).exitRBracket(this);
		}
	}

	public final RBracketContext rBracket() throws RecognitionException {
		RBracketContext _localctx = new RBracketContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_rBracket);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
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
	public static class EqualContext extends ParserRuleContext {
		public TerminalNode Equal() { return getToken(SoundParser.Equal, 0); }
		public EqualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoundParserListener ) ((SoundParserListener)listener).enterEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoundParserListener ) ((SoundParserListener)listener).exitEqual(this);
		}
	}

	public final EqualContext equal() throws RecognitionException {
		EqualContext _localctx = new EqualContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_equal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
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
	public static class IdContext extends ParserRuleContext {
		public TerminalNode Id() { return getToken(SoundParser.Id, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoundParserListener ) ((SoundParserListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoundParserListener ) ((SoundParserListener)listener).exitId(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
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
	public static class StringContext extends ParserRuleContext {
		public TerminalNode String() { return getToken(SoundParser.String, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoundParserListener ) ((SoundParserListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoundParserListener ) ((SoundParserListener)listener).exitString(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(String);
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
		public TerminalNode Number() { return getToken(SoundParser.Number, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoundParserListener ) ((SoundParserListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoundParserListener ) ((SoundParserListener)listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
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
	public static class ArrayContext extends ParserRuleContext {
		public LBracketContext lBracket() {
			return getRuleContext(LBracketContext.class,0);
		}
		public RBracketContext rBracket() {
			return getRuleContext(RBracketContext.class,0);
		}
		public ElementsContext elements() {
			return getRuleContext(ElementsContext.class,0);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoundParserListener ) ((SoundParserListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoundParserListener ) ((SoundParserListener)listener).exitArray(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			lBracket();
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 21248L) != 0) {
				{
				setState(126);
				elements();
				}
			}

			setState(129);
			rBracket();
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
	public static class ElementsContext extends ParserRuleContext {
		public List<ElemContext> elem() {
			return getRuleContexts(ElemContext.class);
		}
		public ElemContext elem(int i) {
			return getRuleContext(ElemContext.class,i);
		}
		public List<CommaContext> comma() {
			return getRuleContexts(CommaContext.class);
		}
		public CommaContext comma(int i) {
			return getRuleContext(CommaContext.class,i);
		}
		public ElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoundParserListener ) ((SoundParserListener)listener).enterElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoundParserListener ) ((SoundParserListener)listener).exitElements(this);
		}
	}

	public final ElementsContext elements() throws RecognitionException {
		ElementsContext _localctx = new ElementsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_elements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			elem();
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(132);
				comma();
				setState(133);
				elem();
				}
				}
				setState(139);
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
	public static class ElemContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public ElemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoundParserListener ) ((SoundParserListener)listener).enterElem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoundParserListener ) ((SoundParserListener)listener).exitElem(this);
		}
	}

	public final ElemContext elem() throws RecognitionException {
		ElemContext _localctx = new ElemContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_elem);
		try {
			setState(145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				string();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(142);
				id();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(143);
				array();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(144);
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

	public static final String _serializedATN =
		"\u0004\u0001\u000e\u0094\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0001\u0000\u0001\u0000\u0001\u0001\u0004\u00010\b\u0001\u000b"+
		"\u0001\f\u00011\u0001\u0002\u0001\u0002\u0003\u00026\b\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003;\b\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003A\b\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004I\b\u0004"+
		"\n\u0004\f\u0004L\t\u0004\u0001\u0005\u0004\u0005O\b\u0005\u000b\u0005"+
		"\f\u0005P\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006V\b\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0003\u0006[\b\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007c\b"+
		"\u0007\n\u0007\f\u0007f\t\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0003"+
		"\u0013\u0080\b\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0005\u0014\u0088\b\u0014\n\u0014\f\u0014\u008b\t\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015"+
		"\u0092\b\u0015\u0001\u0015\u0000\u0000\u0016\u0000\u0002\u0004\u0006\b"+
		"\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*\u0000"+
		"\u0000\u008c\u0000,\u0001\u0000\u0000\u0000\u0002/\u0001\u0000\u0000\u0000"+
		"\u00045\u0001\u0000\u0000\u0000\u00067\u0001\u0000\u0000\u0000\bD\u0001"+
		"\u0000\u0000\u0000\nN\u0001\u0000\u0000\u0000\fU\u0001\u0000\u0000\u0000"+
		"\u000e^\u0001\u0000\u0000\u0000\u0010g\u0001\u0000\u0000\u0000\u0012i"+
		"\u0001\u0000\u0000\u0000\u0014k\u0001\u0000\u0000\u0000\u0016m\u0001\u0000"+
		"\u0000\u0000\u0018o\u0001\u0000\u0000\u0000\u001aq\u0001\u0000\u0000\u0000"+
		"\u001cs\u0001\u0000\u0000\u0000\u001eu\u0001\u0000\u0000\u0000 w\u0001"+
		"\u0000\u0000\u0000\"y\u0001\u0000\u0000\u0000${\u0001\u0000\u0000\u0000"+
		"&}\u0001\u0000\u0000\u0000(\u0083\u0001\u0000\u0000\u0000*\u0091\u0001"+
		"\u0000\u0000\u0000,-\u0003\u0002\u0001\u0000-\u0001\u0001\u0000\u0000"+
		"\u0000.0\u0003\u0004\u0002\u0000/.\u0001\u0000\u0000\u000001\u0001\u0000"+
		"\u0000\u00001/\u0001\u0000\u0000\u000012\u0001\u0000\u0000\u00002\u0003"+
		"\u0001\u0000\u0000\u000036\u0003\u0006\u0003\u000046\u0003\f\u0006\u0000"+
		"53\u0001\u0000\u0000\u000054\u0001\u0000\u0000\u00006\u0005\u0001\u0000"+
		"\u0000\u000078\u0003 \u0010\u00008:\u0003\u0016\u000b\u00009;\u0003\b"+
		"\u0004\u0000:9\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000;<\u0001"+
		"\u0000\u0000\u0000<=\u0003\u0018\f\u0000=>\u0003\u001e\u000f\u0000>@\u0003"+
		"\u0016\u000b\u0000?A\u0003\n\u0005\u0000@?\u0001\u0000\u0000\u0000@A\u0001"+
		"\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000BC\u0003\u0018\f\u0000C\u0007"+
		"\u0001\u0000\u0000\u0000DJ\u0003 \u0010\u0000EF\u0003\u0014\n\u0000FG"+
		"\u0003 \u0010\u0000GI\u0001\u0000\u0000\u0000HE\u0001\u0000\u0000\u0000"+
		"IL\u0001\u0000\u0000\u0000JH\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000"+
		"\u0000K\t\u0001\u0000\u0000\u0000LJ\u0001\u0000\u0000\u0000MO\u0003\f"+
		"\u0006\u0000NM\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000PN\u0001"+
		"\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000Q\u000b\u0001\u0000\u0000"+
		"\u0000RS\u0003 \u0010\u0000ST\u0003\u001e\u000f\u0000TV\u0001\u0000\u0000"+
		"\u0000UR\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000VW\u0001\u0000"+
		"\u0000\u0000WX\u0003 \u0010\u0000XZ\u0003\u0016\u000b\u0000Y[\u0003\u000e"+
		"\u0007\u0000ZY\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[\\\u0001"+
		"\u0000\u0000\u0000\\]\u0003\u0018\f\u0000]\r\u0001\u0000\u0000\u0000^"+
		"d\u0003\u0010\b\u0000_`\u0003\u0014\n\u0000`a\u0003\u0010\b\u0000ac\u0001"+
		"\u0000\u0000\u0000b_\u0001\u0000\u0000\u0000cf\u0001\u0000\u0000\u0000"+
		"db\u0001\u0000\u0000\u0000de\u0001\u0000\u0000\u0000e\u000f\u0001\u0000"+
		"\u0000\u0000fd\u0001\u0000\u0000\u0000gh\u0003*\u0015\u0000h\u0011\u0001"+
		"\u0000\u0000\u0000ij\u0005\u0005\u0000\u0000j\u0013\u0001\u0000\u0000"+
		"\u0000kl\u0005\u0006\u0000\u0000l\u0015\u0001\u0000\u0000\u0000mn\u0005"+
		"\n\u0000\u0000n\u0017\u0001\u0000\u0000\u0000op\u0005\u000b\u0000\u0000"+
		"p\u0019\u0001\u0000\u0000\u0000qr\u0005\f\u0000\u0000r\u001b\u0001\u0000"+
		"\u0000\u0000st\u0005\r\u0000\u0000t\u001d\u0001\u0000\u0000\u0000uv\u0005"+
		"\u0007\u0000\u0000v\u001f\u0001\u0000\u0000\u0000wx\u0005\t\u0000\u0000"+
		"x!\u0001\u0000\u0000\u0000yz\u0005\u000e\u0000\u0000z#\u0001\u0000\u0000"+
		"\u0000{|\u0005\b\u0000\u0000|%\u0001\u0000\u0000\u0000}\u007f\u0003\u001a"+
		"\r\u0000~\u0080\u0003(\u0014\u0000\u007f~\u0001\u0000\u0000\u0000\u007f"+
		"\u0080\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081"+
		"\u0082\u0003\u001c\u000e\u0000\u0082\'\u0001\u0000\u0000\u0000\u0083\u0089"+
		"\u0003*\u0015\u0000\u0084\u0085\u0003\u0014\n\u0000\u0085\u0086\u0003"+
		"*\u0015\u0000\u0086\u0088\u0001\u0000\u0000\u0000\u0087\u0084\u0001\u0000"+
		"\u0000\u0000\u0088\u008b\u0001\u0000\u0000\u0000\u0089\u0087\u0001\u0000"+
		"\u0000\u0000\u0089\u008a\u0001\u0000\u0000\u0000\u008a)\u0001\u0000\u0000"+
		"\u0000\u008b\u0089\u0001\u0000\u0000\u0000\u008c\u0092\u0003$\u0012\u0000"+
		"\u008d\u0092\u0003\"\u0011\u0000\u008e\u0092\u0003 \u0010\u0000\u008f"+
		"\u0092\u0003&\u0013\u0000\u0090\u0092\u0003\f\u0006\u0000\u0091\u008c"+
		"\u0001\u0000\u0000\u0000\u0091\u008d\u0001\u0000\u0000\u0000\u0091\u008e"+
		"\u0001\u0000\u0000\u0000\u0091\u008f\u0001\u0000\u0000\u0000\u0091\u0090"+
		"\u0001\u0000\u0000\u0000\u0092+\u0001\u0000\u0000\u0000\f15:@JPUZd\u007f"+
		"\u0089\u0091";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}