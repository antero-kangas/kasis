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
public class ManuscriptParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MultiLineComment=1, SingleLineComment=2, WSS=3, EOL=4, Punctuation=5, 
		LeftParenthesis=6, RightParenthesis=7, Extra=8, Synopsis=9, Scene=10, 
		Effects=11, CapitalWord=12, MinusculeWord=13, Number=14;
	public static final int
		RULE_manuscript = 0, RULE_titlePart = 1, RULE_title = 2, RULE_authorsPart = 3, 
		RULE_authors = 4, RULE_dateParagraph = 5, RULE_date = 6, RULE_synopsisPart = 7, 
		RULE_synopsisTitle = 8, RULE_synopsisParagraphs = 9, RULE_synopsisParagraph = 10, 
		RULE_wss = 11, RULE_eol = 12, RULE_effectsPart = 13, RULE_effectsTitle = 14, 
		RULE_effects = 15, RULE_scenesPart = 16, RULE_scenesHeading = 17, RULE_scenes = 18, 
		RULE_scene = 19, RULE_sceneHeading = 20, RULE_heading = 21, RULE_name = 22, 
		RULE_replique = 23, RULE_parenthesis = 24, RULE_nonCapitalTextOrCommand = 25, 
		RULE_capitalWord = 26, RULE_command = 27, RULE_commandText = 28, RULE_nonCapitalWord = 29, 
		RULE_nonCapitalText = 30;
	private static String[] makeRuleNames() {
		return new String[] {
			"manuscript", "titlePart", "title", "authorsPart", "authors", "dateParagraph", 
			"date", "synopsisPart", "synopsisTitle", "synopsisParagraphs", "synopsisParagraph", 
			"wss", "eol", "effectsPart", "effectsTitle", "effects", "scenesPart", 
			"scenesHeading", "scenes", "scene", "sceneHeading", "heading", "name", 
			"replique", "parenthesis", "nonCapitalTextOrCommand", "capitalWord", 
			"command", "commandText", "nonCapitalWord", "nonCapitalText"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, "'('", "')'", null, null, "'KOHTAUKSET'", 
			"'EFEKTIT'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "MultiLineComment", "SingleLineComment", "WSS", "EOL", "Punctuation", 
			"LeftParenthesis", "RightParenthesis", "Extra", "Synopsis", "Scene", 
			"Effects", "CapitalWord", "MinusculeWord", "Number"
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

	public ManuscriptParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ManuscriptContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ManuscriptParser.EOF, 0); }
		public TitlePartContext titlePart() {
			return getRuleContext(TitlePartContext.class,0);
		}
		public AuthorsPartContext authorsPart() {
			return getRuleContext(AuthorsPartContext.class,0);
		}
		public DateParagraphContext dateParagraph() {
			return getRuleContext(DateParagraphContext.class,0);
		}
		public SynopsisPartContext synopsisPart() {
			return getRuleContext(SynopsisPartContext.class,0);
		}
		public EffectsPartContext effectsPart() {
			return getRuleContext(EffectsPartContext.class,0);
		}
		public ScenesPartContext scenesPart() {
			return getRuleContext(ScenesPartContext.class,0);
		}
		public ManuscriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_manuscript; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuscriptParserListener ) ((ManuscriptParserListener)listener).enterManuscript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuscriptParserListener ) ((ManuscriptParserListener)listener).exitManuscript(this);
		}
	}

	public final ManuscriptContext manuscript() throws RecognitionException {
		ManuscriptContext _localctx = new ManuscriptContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_manuscript);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(62);
				titlePart();
				}
				break;
			}
			setState(66);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(65);
				authorsPart();
				}
				break;
			}
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WSS) {
				{
				setState(68);
				dateParagraph();
				}
			}

			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Synopsis) {
				{
				setState(71);
				synopsisPart();
				}
			}

			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Effects) {
				{
				setState(74);
				effectsPart();
				}
			}

			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Scene) {
				{
				setState(77);
				scenesPart();
				}
			}

			setState(80);
			match(EOF);
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
	public static class TitlePartContext extends ParserRuleContext {
		public WssContext wss() {
			return getRuleContext(WssContext.class,0);
		}
		public List<TitleContext> title() {
			return getRuleContexts(TitleContext.class);
		}
		public TitleContext title(int i) {
			return getRuleContext(TitleContext.class,i);
		}
		public List<EolContext> eol() {
			return getRuleContexts(EolContext.class);
		}
		public EolContext eol(int i) {
			return getRuleContext(EolContext.class,i);
		}
		public TitlePartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_titlePart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuscriptParserListener ) ((ManuscriptParserListener)listener).enterTitlePart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuscriptParserListener ) ((ManuscriptParserListener)listener).exitTitlePart(this);
		}
	}

	public final TitlePartContext titlePart() throws RecognitionException {
		TitlePartContext _localctx = new TitlePartContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_titlePart);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			wss();
			setState(89); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(83);
				title();
				setState(85); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(84);
						eol();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(87); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				}
				setState(91); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 20768L) != 0 );
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
	public static class TitleContext extends ParserRuleContext {
		public HeadingContext heading() {
			return getRuleContext(HeadingContext.class,0);
		}
		public TitleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_title; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuscriptParserListener ) ((ManuscriptParserListener)listener).enterTitle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuscriptParserListener ) ((ManuscriptParserListener)listener).exitTitle(this);
		}
	}

	public final TitleContext title() throws RecognitionException {
		TitleContext _localctx = new TitleContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_title);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			heading();
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
	public static class AuthorsPartContext extends ParserRuleContext {
		public WssContext wss() {
			return getRuleContext(WssContext.class,0);
		}
		public List<AuthorsContext> authors() {
			return getRuleContexts(AuthorsContext.class);
		}
		public AuthorsContext authors(int i) {
			return getRuleContext(AuthorsContext.class,i);
		}
		public List<EolContext> eol() {
			return getRuleContexts(EolContext.class);
		}
		public EolContext eol(int i) {
			return getRuleContext(EolContext.class,i);
		}
		public AuthorsPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_authorsPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuscriptParserListener ) ((ManuscriptParserListener)listener).enterAuthorsPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuscriptParserListener ) ((ManuscriptParserListener)listener).exitAuthorsPart(this);
		}
	}

	public final AuthorsPartContext authorsPart() throws RecognitionException {
		AuthorsPartContext _localctx = new AuthorsPartContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_authorsPart);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			wss();
			setState(102); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(96);
				authors();
				setState(98); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(97);
						eol();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(100); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				}
				setState(104); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 28960L) != 0 );
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
	public static class AuthorsContext extends ParserRuleContext {
		public NonCapitalTextContext nonCapitalText() {
			return getRuleContext(NonCapitalTextContext.class,0);
		}
		public AuthorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_authors; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuscriptParserListener ) ((ManuscriptParserListener)listener).enterAuthors(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuscriptParserListener ) ((ManuscriptParserListener)listener).exitAuthors(this);
		}
	}

	public final AuthorsContext authors() throws RecognitionException {
		AuthorsContext _localctx = new AuthorsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_authors);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			nonCapitalText();
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
	public static class DateParagraphContext extends ParserRuleContext {
		public WssContext wss() {
			return getRuleContext(WssContext.class,0);
		}
		public DateContext date() {
			return getRuleContext(DateContext.class,0);
		}
		public List<EolContext> eol() {
			return getRuleContexts(EolContext.class);
		}
		public EolContext eol(int i) {
			return getRuleContext(EolContext.class,i);
		}
		public DateParagraphContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dateParagraph; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuscriptParserListener ) ((ManuscriptParserListener)listener).enterDateParagraph(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuscriptParserListener ) ((ManuscriptParserListener)listener).exitDateParagraph(this);
		}
	}

	public final DateParagraphContext dateParagraph() throws RecognitionException {
		DateParagraphContext _localctx = new DateParagraphContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_dateParagraph);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			wss();
			setState(109);
			date();
			setState(111); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(110);
				eol();
				}
				}
				setState(113); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WSS || _la==EOL );
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
	public static class DateContext extends ParserRuleContext {
		public NonCapitalTextContext nonCapitalText() {
			return getRuleContext(NonCapitalTextContext.class,0);
		}
		public DateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuscriptParserListener ) ((ManuscriptParserListener)listener).enterDate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuscriptParserListener ) ((ManuscriptParserListener)listener).exitDate(this);
		}
	}

	public final DateContext date() throws RecognitionException {
		DateContext _localctx = new DateContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_date);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			nonCapitalText();
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
	public static class SynopsisPartContext extends ParserRuleContext {
		public SynopsisTitleContext synopsisTitle() {
			return getRuleContext(SynopsisTitleContext.class,0);
		}
		public List<EolContext> eol() {
			return getRuleContexts(EolContext.class);
		}
		public EolContext eol(int i) {
			return getRuleContext(EolContext.class,i);
		}
		public SynopsisParagraphsContext synopsisParagraphs() {
			return getRuleContext(SynopsisParagraphsContext.class,0);
		}
		public SynopsisPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_synopsisPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuscriptParserListener ) ((ManuscriptParserListener)listener).enterSynopsisPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuscriptParserListener ) ((ManuscriptParserListener)listener).exitSynopsisPart(this);
		}
	}

	public final SynopsisPartContext synopsisPart() throws RecognitionException {
		SynopsisPartContext _localctx = new SynopsisPartContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_synopsisPart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			synopsisTitle();
			setState(119); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(118);
				eol();
				}
				}
				setState(121); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WSS || _la==EOL );
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 28960L) != 0) {
				{
				setState(123);
				synopsisParagraphs();
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
	public static class SynopsisTitleContext extends ParserRuleContext {
		public TerminalNode Synopsis() { return getToken(ManuscriptParser.Synopsis, 0); }
		public SynopsisTitleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_synopsisTitle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuscriptParserListener ) ((ManuscriptParserListener)listener).enterSynopsisTitle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuscriptParserListener ) ((ManuscriptParserListener)listener).exitSynopsisTitle(this);
		}
	}

	public final SynopsisTitleContext synopsisTitle() throws RecognitionException {
		SynopsisTitleContext _localctx = new SynopsisTitleContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_synopsisTitle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(Synopsis);
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
	public static class SynopsisParagraphsContext extends ParserRuleContext {
		public List<SynopsisParagraphContext> synopsisParagraph() {
			return getRuleContexts(SynopsisParagraphContext.class);
		}
		public SynopsisParagraphContext synopsisParagraph(int i) {
			return getRuleContext(SynopsisParagraphContext.class,i);
		}
		public List<EolContext> eol() {
			return getRuleContexts(EolContext.class);
		}
		public EolContext eol(int i) {
			return getRuleContext(EolContext.class,i);
		}
		public SynopsisParagraphsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_synopsisParagraphs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuscriptParserListener ) ((ManuscriptParserListener)listener).enterSynopsisParagraphs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuscriptParserListener ) ((ManuscriptParserListener)listener).exitSynopsisParagraphs(this);
		}
	}

	public final SynopsisParagraphsContext synopsisParagraphs() throws RecognitionException {
		SynopsisParagraphsContext _localctx = new SynopsisParagraphsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_synopsisParagraphs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(128);
				synopsisParagraph();
				setState(130); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(129);
					eol();
					}
					}
					setState(132); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WSS || _la==EOL );
				}
				}
				setState(136); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 28960L) != 0 );
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
	public static class SynopsisParagraphContext extends ParserRuleContext {
		public NonCapitalTextContext nonCapitalText() {
			return getRuleContext(NonCapitalTextContext.class,0);
		}
		public SynopsisParagraphContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_synopsisParagraph; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuscriptParserListener ) ((ManuscriptParserListener)listener).enterSynopsisParagraph(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuscriptParserListener ) ((ManuscriptParserListener)listener).exitSynopsisParagraph(this);
		}
	}

	public final SynopsisParagraphContext synopsisParagraph() throws RecognitionException {
		SynopsisParagraphContext _localctx = new SynopsisParagraphContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_synopsisParagraph);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			nonCapitalText();
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
	public static class WssContext extends ParserRuleContext {
		public TerminalNode WSS() { return getToken(ManuscriptParser.WSS, 0); }
		public WssContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wss; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuscriptParserListener ) ((ManuscriptParserListener)listener).enterWss(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuscriptParserListener ) ((ManuscriptParserListener)listener).exitWss(this);
		}
	}

	public final WssContext wss() throws RecognitionException {
		WssContext _localctx = new WssContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_wss);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(WSS);
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
	public static class EolContext extends ParserRuleContext {
		public TerminalNode EOL() { return getToken(ManuscriptParser.EOL, 0); }
		public WssContext wss() {
			return getRuleContext(WssContext.class,0);
		}
		public EolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuscriptParserListener ) ((ManuscriptParserListener)listener).enterEol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuscriptParserListener ) ((ManuscriptParserListener)listener).exitEol(this);
		}
	}

	public final EolContext eol() throws RecognitionException {
		EolContext _localctx = new EolContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_eol);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WSS) {
				{
				setState(142);
				wss();
				}
			}

			setState(145);
			match(EOL);
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
	public static class EffectsPartContext extends ParserRuleContext {
		public EffectsTitleContext effectsTitle() {
			return getRuleContext(EffectsTitleContext.class,0);
		}
		public List<EolContext> eol() {
			return getRuleContexts(EolContext.class);
		}
		public EolContext eol(int i) {
			return getRuleContext(EolContext.class,i);
		}
		public EffectsContext effects() {
			return getRuleContext(EffectsContext.class,0);
		}
		public EffectsPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_effectsPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuscriptParserListener ) ((ManuscriptParserListener)listener).enterEffectsPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuscriptParserListener ) ((ManuscriptParserListener)listener).exitEffectsPart(this);
		}
	}

	public final EffectsPartContext effectsPart() throws RecognitionException {
		EffectsPartContext _localctx = new EffectsPartContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_effectsPart);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			effectsTitle();
			setState(149); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(148);
					eol();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(151); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WSS || _la==LeftParenthesis) {
				{
				setState(153);
				effects();
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
	public static class EffectsTitleContext extends ParserRuleContext {
		public TerminalNode Effects() { return getToken(ManuscriptParser.Effects, 0); }
		public EffectsTitleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_effectsTitle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuscriptParserListener ) ((ManuscriptParserListener)listener).enterEffectsTitle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuscriptParserListener ) ((ManuscriptParserListener)listener).exitEffectsTitle(this);
		}
	}

	public final EffectsTitleContext effectsTitle() throws RecognitionException {
		EffectsTitleContext _localctx = new EffectsTitleContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_effectsTitle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(Effects);
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
	public static class EffectsContext extends ParserRuleContext {
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public List<WssContext> wss() {
			return getRuleContexts(WssContext.class);
		}
		public WssContext wss(int i) {
			return getRuleContext(WssContext.class,i);
		}
		public List<EolContext> eol() {
			return getRuleContexts(EolContext.class);
		}
		public EolContext eol(int i) {
			return getRuleContext(EolContext.class,i);
		}
		public EffectsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_effects; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuscriptParserListener ) ((ManuscriptParserListener)listener).enterEffects(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuscriptParserListener ) ((ManuscriptParserListener)listener).exitEffects(this);
		}
	}

	public final EffectsContext effects() throws RecognitionException {
		EffectsContext _localctx = new EffectsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_effects);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(167); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WSS) {
					{
					setState(158);
					wss();
					}
				}

				setState(161);
				command();
				setState(163); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(162);
						eol();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(165); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				}
				setState(169); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WSS || _la==LeftParenthesis );
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
	public static class ScenesPartContext extends ParserRuleContext {
		public ScenesHeadingContext scenesHeading() {
			return getRuleContext(ScenesHeadingContext.class,0);
		}
		public List<EolContext> eol() {
			return getRuleContexts(EolContext.class);
		}
		public EolContext eol(int i) {
			return getRuleContext(EolContext.class,i);
		}
		public ScenesContext scenes() {
			return getRuleContext(ScenesContext.class,0);
		}
		public ScenesPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scenesPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuscriptParserListener ) ((ManuscriptParserListener)listener).enterScenesPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuscriptParserListener ) ((ManuscriptParserListener)listener).exitScenesPart(this);
		}
	}

	public final ScenesPartContext scenesPart() throws RecognitionException {
		ScenesPartContext _localctx = new ScenesPartContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_scenesPart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			scenesHeading();
			setState(173); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(172);
				eol();
				}
				}
				setState(175); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WSS || _la==EOL );
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 20768L) != 0) {
				{
				setState(177);
				scenes();
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
	public static class ScenesHeadingContext extends ParserRuleContext {
		public TerminalNode Scene() { return getToken(ManuscriptParser.Scene, 0); }
		public ScenesHeadingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scenesHeading; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuscriptParserListener ) ((ManuscriptParserListener)listener).enterScenesHeading(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuscriptParserListener ) ((ManuscriptParserListener)listener).exitScenesHeading(this);
		}
	}

	public final ScenesHeadingContext scenesHeading() throws RecognitionException {
		ScenesHeadingContext _localctx = new ScenesHeadingContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_scenesHeading);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(Scene);
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
	public static class ScenesContext extends ParserRuleContext {
		public List<SceneContext> scene() {
			return getRuleContexts(SceneContext.class);
		}
		public SceneContext scene(int i) {
			return getRuleContext(SceneContext.class,i);
		}
		public ScenesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scenes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuscriptParserListener ) ((ManuscriptParserListener)listener).enterScenes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuscriptParserListener ) ((ManuscriptParserListener)listener).exitScenes(this);
		}
	}

	public final ScenesContext scenes() throws RecognitionException {
		ScenesContext _localctx = new ScenesContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_scenes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(182);
				scene();
				}
				}
				setState(185); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 20768L) != 0 );
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
	public static class SceneContext extends ParserRuleContext {
		public SceneHeadingContext sceneHeading() {
			return getRuleContext(SceneHeadingContext.class,0);
		}
		public List<EolContext> eol() {
			return getRuleContexts(EolContext.class);
		}
		public EolContext eol(int i) {
			return getRuleContext(EolContext.class,i);
		}
		public List<ParenthesisContext> parenthesis() {
			return getRuleContexts(ParenthesisContext.class);
		}
		public ParenthesisContext parenthesis(int i) {
			return getRuleContext(ParenthesisContext.class,i);
		}
		public List<WssContext> wss() {
			return getRuleContexts(WssContext.class);
		}
		public WssContext wss(int i) {
			return getRuleContext(WssContext.class,i);
		}
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public List<RepliqueContext> replique() {
			return getRuleContexts(RepliqueContext.class);
		}
		public RepliqueContext replique(int i) {
			return getRuleContext(RepliqueContext.class,i);
		}
		public SceneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scene; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuscriptParserListener ) ((ManuscriptParserListener)listener).enterScene(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuscriptParserListener ) ((ManuscriptParserListener)listener).exitScene(this);
		}
	}

	public final SceneContext scene() throws RecognitionException {
		SceneContext _localctx = new SceneContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_scene);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			sceneHeading();
			setState(189); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(188);
					eol();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(191); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(230); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(201);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (((_la) & ~0x3f) == 0 && ((1L << _la) & 29024L) != 0) {
						{
						{
						setState(193);
						parenthesis();
						setState(195); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(194);
								eol();
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(197); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						}
						setState(203);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(226); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(204);
							wss();
							setState(205);
							name();
							setState(207); 
							_errHandler.sync(this);
							_alt = 1;
							do {
								switch (_alt) {
								case 1:
									{
									{
									setState(206);
									eol();
									}
									}
									break;
								default:
									throw new NoViableAltException(this);
								}
								setState(209); 
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
							} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
							setState(222); 
							_errHandler.sync(this);
							_alt = 1;
							do {
								switch (_alt) {
								case 1:
									{
									{
									setState(215);
									_errHandler.sync(this);
									switch (_input.LA(1)) {
									case WSS:
										{
										{
										setState(211);
										wss();
										setState(212);
										replique();
										}
										}
										break;
									case Punctuation:
									case LeftParenthesis:
									case Extra:
									case CapitalWord:
									case MinusculeWord:
									case Number:
										{
										setState(214);
										parenthesis();
										}
										break;
									default:
										throw new NoViableAltException(this);
									}
									setState(218); 
									_errHandler.sync(this);
									_alt = 1;
									do {
										switch (_alt) {
										case 1:
											{
											{
											setState(217);
											eol();
											}
											}
											break;
										default:
											throw new NoViableAltException(this);
										}
										setState(220); 
										_errHandler.sync(this);
										_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
									} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
									}
									}
									break;
								default:
									throw new NoViableAltException(this);
								}
								setState(224); 
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
							} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(228); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(232); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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
	public static class SceneHeadingContext extends ParserRuleContext {
		public HeadingContext heading() {
			return getRuleContext(HeadingContext.class,0);
		}
		public SceneHeadingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sceneHeading; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuscriptParserListener ) ((ManuscriptParserListener)listener).enterSceneHeading(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuscriptParserListener ) ((ManuscriptParserListener)listener).exitSceneHeading(this);
		}
	}

	public final SceneHeadingContext sceneHeading() throws RecognitionException {
		SceneHeadingContext _localctx = new SceneHeadingContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_sceneHeading);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			heading();
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
	public static class HeadingContext extends ParserRuleContext {
		public List<WssContext> wss() {
			return getRuleContexts(WssContext.class);
		}
		public WssContext wss(int i) {
			return getRuleContext(WssContext.class,i);
		}
		public List<TerminalNode> CapitalWord() { return getTokens(ManuscriptParser.CapitalWord); }
		public TerminalNode CapitalWord(int i) {
			return getToken(ManuscriptParser.CapitalWord, i);
		}
		public List<TerminalNode> Number() { return getTokens(ManuscriptParser.Number); }
		public TerminalNode Number(int i) {
			return getToken(ManuscriptParser.Number, i);
		}
		public List<TerminalNode> Punctuation() { return getTokens(ManuscriptParser.Punctuation); }
		public TerminalNode Punctuation(int i) {
			return getToken(ManuscriptParser.Punctuation, i);
		}
		public List<TerminalNode> Extra() { return getTokens(ManuscriptParser.Extra); }
		public TerminalNode Extra(int i) {
			return getToken(ManuscriptParser.Extra, i);
		}
		public HeadingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_heading; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuscriptParserListener ) ((ManuscriptParserListener)listener).enterHeading(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuscriptParserListener ) ((ManuscriptParserListener)listener).exitHeading(this);
		}
	}

	public final HeadingContext heading() throws RecognitionException {
		HeadingContext _localctx = new HeadingContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_heading);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(237); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(236);
				_la = _input.LA(1);
				if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 20768L) != 0) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(239); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 20768L) != 0 );
			setState(249);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(241);
					wss();
					setState(243); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(242);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 20768L) != 0) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						}
						setState(245); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 20768L) != 0 );
					}
					} 
				}
				setState(251);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
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
	public static class NameContext extends ParserRuleContext {
		public List<TerminalNode> CapitalWord() { return getTokens(ManuscriptParser.CapitalWord); }
		public TerminalNode CapitalWord(int i) {
			return getToken(ManuscriptParser.CapitalWord, i);
		}
		public List<WssContext> wss() {
			return getRuleContexts(WssContext.class);
		}
		public WssContext wss(int i) {
			return getRuleContext(WssContext.class,i);
		}
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuscriptParserListener ) ((ManuscriptParserListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuscriptParserListener ) ((ManuscriptParserListener)listener).exitName(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_name);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(CapitalWord);
			setState(258);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(253);
					wss();
					setState(254);
					match(CapitalWord);
					}
					} 
				}
				setState(260);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
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
	public static class RepliqueContext extends ParserRuleContext {
		public NonCapitalTextOrCommandContext nonCapitalTextOrCommand() {
			return getRuleContext(NonCapitalTextOrCommandContext.class,0);
		}
		public RepliqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_replique; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuscriptParserListener ) ((ManuscriptParserListener)listener).enterReplique(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuscriptParserListener ) ((ManuscriptParserListener)listener).exitReplique(this);
		}
	}

	public final RepliqueContext replique() throws RecognitionException {
		RepliqueContext _localctx = new RepliqueContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_replique);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			nonCapitalTextOrCommand();
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
	public static class ParenthesisContext extends ParserRuleContext {
		public NonCapitalTextOrCommandContext nonCapitalTextOrCommand() {
			return getRuleContext(NonCapitalTextOrCommandContext.class,0);
		}
		public ParenthesisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parenthesis; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuscriptParserListener ) ((ManuscriptParserListener)listener).enterParenthesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuscriptParserListener ) ((ManuscriptParserListener)listener).exitParenthesis(this);
		}
	}

	public final ParenthesisContext parenthesis() throws RecognitionException {
		ParenthesisContext _localctx = new ParenthesisContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_parenthesis);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			nonCapitalTextOrCommand();
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
	public static class NonCapitalTextOrCommandContext extends ParserRuleContext {
		public List<NonCapitalTextContext> nonCapitalText() {
			return getRuleContexts(NonCapitalTextContext.class);
		}
		public NonCapitalTextContext nonCapitalText(int i) {
			return getRuleContext(NonCapitalTextContext.class,i);
		}
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public List<WssContext> wss() {
			return getRuleContexts(WssContext.class);
		}
		public WssContext wss(int i) {
			return getRuleContext(WssContext.class,i);
		}
		public NonCapitalTextOrCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonCapitalTextOrCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuscriptParserListener ) ((ManuscriptParserListener)listener).enterNonCapitalTextOrCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuscriptParserListener ) ((ManuscriptParserListener)listener).exitNonCapitalTextOrCommand(this);
		}
	}

	public final NonCapitalTextOrCommandContext nonCapitalTextOrCommand() throws RecognitionException {
		NonCapitalTextOrCommandContext _localctx = new NonCapitalTextOrCommandContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_nonCapitalTextOrCommand);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Punctuation:
			case Extra:
			case CapitalWord:
			case MinusculeWord:
			case Number:
				{
				setState(265);
				nonCapitalText();
				setState(282);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(270); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(267);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==WSS) {
									{
									setState(266);
									wss();
									}
								}

								setState(269);
								command();
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(272); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						setState(278);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
						case 1:
							{
							setState(275);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==WSS) {
								{
								setState(274);
								wss();
								}
							}

							setState(277);
							nonCapitalText();
							}
							break;
						}
						}
						} 
					}
					setState(284);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
				}
				}
				break;
			case LeftParenthesis:
				{
				setState(301); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(285);
					command();
					setState(292);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(287);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==WSS) {
								{
								setState(286);
								wss();
								}
							}

							setState(289);
							command();
							}
							} 
						}
						setState(294);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
					}
					setState(299);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
					case 1:
						{
						setState(296);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WSS) {
							{
							setState(295);
							wss();
							}
						}

						setState(298);
						nonCapitalText();
						}
						break;
					}
					}
					}
					setState(303); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LeftParenthesis );
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class CapitalWordContext extends ParserRuleContext {
		public TerminalNode CapitalWord() { return getToken(ManuscriptParser.CapitalWord, 0); }
		public CapitalWordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_capitalWord; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuscriptParserListener ) ((ManuscriptParserListener)listener).enterCapitalWord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuscriptParserListener ) ((ManuscriptParserListener)listener).exitCapitalWord(this);
		}
	}

	public final CapitalWordContext capitalWord() throws RecognitionException {
		CapitalWordContext _localctx = new CapitalWordContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_capitalWord);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			match(CapitalWord);
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
	public static class CommandContext extends ParserRuleContext {
		public TerminalNode LeftParenthesis() { return getToken(ManuscriptParser.LeftParenthesis, 0); }
		public CommandTextContext commandText() {
			return getRuleContext(CommandTextContext.class,0);
		}
		public TerminalNode RightParenthesis() { return getToken(ManuscriptParser.RightParenthesis, 0); }
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuscriptParserListener ) ((ManuscriptParserListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuscriptParserListener ) ((ManuscriptParserListener)listener).exitCommand(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_command);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			match(LeftParenthesis);
			setState(310);
			commandText();
			setState(311);
			match(RightParenthesis);
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
	public static class CommandTextContext extends ParserRuleContext {
		public List<WssContext> wss() {
			return getRuleContexts(WssContext.class);
		}
		public WssContext wss(int i) {
			return getRuleContext(WssContext.class,i);
		}
		public List<NonCapitalTextContext> nonCapitalText() {
			return getRuleContexts(NonCapitalTextContext.class);
		}
		public NonCapitalTextContext nonCapitalText(int i) {
			return getRuleContext(NonCapitalTextContext.class,i);
		}
		public List<CapitalWordContext> capitalWord() {
			return getRuleContexts(CapitalWordContext.class);
		}
		public CapitalWordContext capitalWord(int i) {
			return getRuleContext(CapitalWordContext.class,i);
		}
		public CommandTextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commandText; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuscriptParserListener ) ((ManuscriptParserListener)listener).enterCommandText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuscriptParserListener ) ((ManuscriptParserListener)listener).exitCommandText(this);
		}
	}

	public final CommandTextContext commandText() throws RecognitionException {
		CommandTextContext _localctx = new CommandTextContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_commandText);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(316);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
				case 1:
					{
					setState(313);
					wss();
					}
					break;
				case 2:
					{
					setState(314);
					nonCapitalText();
					}
					break;
				case 3:
					{
					setState(315);
					capitalWord();
					}
					break;
				}
				}
				setState(318); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 28968L) != 0 );
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
	public static class NonCapitalWordContext extends ParserRuleContext {
		public List<TerminalNode> Number() { return getTokens(ManuscriptParser.Number); }
		public TerminalNode Number(int i) {
			return getToken(ManuscriptParser.Number, i);
		}
		public List<TerminalNode> Punctuation() { return getTokens(ManuscriptParser.Punctuation); }
		public TerminalNode Punctuation(int i) {
			return getToken(ManuscriptParser.Punctuation, i);
		}
		public List<TerminalNode> Extra() { return getTokens(ManuscriptParser.Extra); }
		public TerminalNode Extra(int i) {
			return getToken(ManuscriptParser.Extra, i);
		}
		public List<TerminalNode> MinusculeWord() { return getTokens(ManuscriptParser.MinusculeWord); }
		public TerminalNode MinusculeWord(int i) {
			return getToken(ManuscriptParser.MinusculeWord, i);
		}
		public List<TerminalNode> CapitalWord() { return getTokens(ManuscriptParser.CapitalWord); }
		public TerminalNode CapitalWord(int i) {
			return getToken(ManuscriptParser.CapitalWord, i);
		}
		public NonCapitalWordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonCapitalWord; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuscriptParserListener ) ((ManuscriptParserListener)listener).enterNonCapitalWord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuscriptParserListener ) ((ManuscriptParserListener)listener).exitNonCapitalWord(this);
		}
	}

	public final NonCapitalWordContext nonCapitalWord() throws RecognitionException {
		NonCapitalWordContext _localctx = new NonCapitalWordContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_nonCapitalWord);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CapitalWord) {
				{
				{
				setState(320);
				match(CapitalWord);
				}
				}
				setState(325);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(326);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 24864L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(330);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(327);
					_la = _input.LA(1);
					if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 28960L) != 0) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
				setState(332);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
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
	public static class NonCapitalTextContext extends ParserRuleContext {
		public List<NonCapitalWordContext> nonCapitalWord() {
			return getRuleContexts(NonCapitalWordContext.class);
		}
		public NonCapitalWordContext nonCapitalWord(int i) {
			return getRuleContext(NonCapitalWordContext.class,i);
		}
		public List<WssContext> wss() {
			return getRuleContexts(WssContext.class);
		}
		public WssContext wss(int i) {
			return getRuleContext(WssContext.class,i);
		}
		public List<TerminalNode> CapitalWord() { return getTokens(ManuscriptParser.CapitalWord); }
		public TerminalNode CapitalWord(int i) {
			return getToken(ManuscriptParser.CapitalWord, i);
		}
		public NonCapitalTextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonCapitalText; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuscriptParserListener ) ((ManuscriptParserListener)listener).enterNonCapitalText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuscriptParserListener ) ((ManuscriptParserListener)listener).exitNonCapitalText(this);
		}
	}

	public final NonCapitalTextContext nonCapitalText() throws RecognitionException {
		NonCapitalTextContext _localctx = new NonCapitalTextContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_nonCapitalText);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				{
				{
				setState(333);
				match(CapitalWord);
				setState(341);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(334);
						wss();
						setState(337);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
						case 1:
							{
							setState(335);
							match(CapitalWord);
							}
							break;
						case 2:
							{
							setState(336);
							nonCapitalWord();
							}
							break;
						}
						}
						} 
					}
					setState(343);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
				}
				}
				setState(344);
				wss();
				setState(345);
				nonCapitalWord();
				}
				}
				break;
			case 2:
				{
				setState(347);
				nonCapitalWord();
				setState(355);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(348);
						wss();
						setState(351);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
						case 1:
							{
							setState(349);
							match(CapitalWord);
							}
							break;
						case 2:
							{
							setState(350);
							nonCapitalWord();
							}
							break;
						}
						}
						} 
					}
					setState(357);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
				}
				}
				break;
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

	public static final String _serializedATN =
		"\u0004\u0001\u000e\u0169\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0001\u0000\u0003\u0000@\b\u0000\u0001\u0000\u0003\u0000C\b\u0000"+
		"\u0001\u0000\u0003\u0000F\b\u0000\u0001\u0000\u0003\u0000I\b\u0000\u0001"+
		"\u0000\u0003\u0000L\b\u0000\u0001\u0000\u0003\u0000O\b\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0004\u0001V\b\u0001"+
		"\u000b\u0001\f\u0001W\u0004\u0001Z\b\u0001\u000b\u0001\f\u0001[\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0004\u0003c\b"+
		"\u0003\u000b\u0003\f\u0003d\u0004\u0003g\b\u0003\u000b\u0003\f\u0003h"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0004\u0005"+
		"p\b\u0005\u000b\u0005\f\u0005q\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0004\u0007x\b\u0007\u000b\u0007\f\u0007y\u0001\u0007\u0003\u0007"+
		"}\b\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0004\t\u0083\b\t\u000b\t\f"+
		"\t\u0084\u0004\t\u0087\b\t\u000b\t\f\t\u0088\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0003\f\u0090\b\f\u0001\f\u0001\f\u0001\r\u0001\r"+
		"\u0004\r\u0096\b\r\u000b\r\f\r\u0097\u0001\r\u0003\r\u009b\b\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0003\u000f\u00a0\b\u000f\u0001\u000f\u0001\u000f"+
		"\u0004\u000f\u00a4\b\u000f\u000b\u000f\f\u000f\u00a5\u0004\u000f\u00a8"+
		"\b\u000f\u000b\u000f\f\u000f\u00a9\u0001\u0010\u0001\u0010\u0004\u0010"+
		"\u00ae\b\u0010\u000b\u0010\f\u0010\u00af\u0001\u0010\u0003\u0010\u00b3"+
		"\b\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0004\u0012\u00b8\b\u0012"+
		"\u000b\u0012\f\u0012\u00b9\u0001\u0013\u0001\u0013\u0004\u0013\u00be\b"+
		"\u0013\u000b\u0013\f\u0013\u00bf\u0001\u0013\u0001\u0013\u0004\u0013\u00c4"+
		"\b\u0013\u000b\u0013\f\u0013\u00c5\u0005\u0013\u00c8\b\u0013\n\u0013\f"+
		"\u0013\u00cb\t\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0004\u0013\u00d0"+
		"\b\u0013\u000b\u0013\f\u0013\u00d1\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0003\u0013\u00d8\b\u0013\u0001\u0013\u0004\u0013\u00db\b"+
		"\u0013\u000b\u0013\f\u0013\u00dc\u0004\u0013\u00df\b\u0013\u000b\u0013"+
		"\f\u0013\u00e0\u0004\u0013\u00e3\b\u0013\u000b\u0013\f\u0013\u00e4\u0004"+
		"\u0013\u00e7\b\u0013\u000b\u0013\f\u0013\u00e8\u0001\u0014\u0001\u0014"+
		"\u0001\u0015\u0004\u0015\u00ee\b\u0015\u000b\u0015\f\u0015\u00ef\u0001"+
		"\u0015\u0001\u0015\u0004\u0015\u00f4\b\u0015\u000b\u0015\f\u0015\u00f5"+
		"\u0005\u0015\u00f8\b\u0015\n\u0015\f\u0015\u00fb\t\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u0101\b\u0016\n\u0016\f\u0016"+
		"\u0104\t\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0019"+
		"\u0001\u0019\u0003\u0019\u010c\b\u0019\u0001\u0019\u0004\u0019\u010f\b"+
		"\u0019\u000b\u0019\f\u0019\u0110\u0001\u0019\u0003\u0019\u0114\b\u0019"+
		"\u0001\u0019\u0003\u0019\u0117\b\u0019\u0005\u0019\u0119\b\u0019\n\u0019"+
		"\f\u0019\u011c\t\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u0120\b\u0019"+
		"\u0001\u0019\u0005\u0019\u0123\b\u0019\n\u0019\f\u0019\u0126\t\u0019\u0001"+
		"\u0019\u0003\u0019\u0129\b\u0019\u0001\u0019\u0003\u0019\u012c\b\u0019"+
		"\u0004\u0019\u012e\b\u0019\u000b\u0019\f\u0019\u012f\u0003\u0019\u0132"+
		"\b\u0019\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0004\u001c\u013d\b\u001c\u000b"+
		"\u001c\f\u001c\u013e\u0001\u001d\u0005\u001d\u0142\b\u001d\n\u001d\f\u001d"+
		"\u0145\t\u001d\u0001\u001d\u0001\u001d\u0005\u001d\u0149\b\u001d\n\u001d"+
		"\f\u001d\u014c\t\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0003\u001e\u0152\b\u001e\u0005\u001e\u0154\b\u001e\n\u001e\f\u001e\u0157"+
		"\t\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0003\u001e\u0160\b\u001e\u0005\u001e\u0162\b\u001e"+
		"\n\u001e\f\u001e\u0165\t\u001e\u0003\u001e\u0167\b\u001e\u0001\u001e\u0000"+
		"\u0000\u001f\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \"$&(*,.02468:<\u0000\u0003\u0004\u0000\u0005"+
		"\u0005\b\b\f\f\u000e\u000e\u0003\u0000\u0005\u0005\b\b\r\u000e\u0003\u0000"+
		"\u0005\u0005\b\b\f\u000e\u0183\u0000?\u0001\u0000\u0000\u0000\u0002R\u0001"+
		"\u0000\u0000\u0000\u0004]\u0001\u0000\u0000\u0000\u0006_\u0001\u0000\u0000"+
		"\u0000\bj\u0001\u0000\u0000\u0000\nl\u0001\u0000\u0000\u0000\fs\u0001"+
		"\u0000\u0000\u0000\u000eu\u0001\u0000\u0000\u0000\u0010~\u0001\u0000\u0000"+
		"\u0000\u0012\u0086\u0001\u0000\u0000\u0000\u0014\u008a\u0001\u0000\u0000"+
		"\u0000\u0016\u008c\u0001\u0000\u0000\u0000\u0018\u008f\u0001\u0000\u0000"+
		"\u0000\u001a\u0093\u0001\u0000\u0000\u0000\u001c\u009c\u0001\u0000\u0000"+
		"\u0000\u001e\u00a7\u0001\u0000\u0000\u0000 \u00ab\u0001\u0000\u0000\u0000"+
		"\"\u00b4\u0001\u0000\u0000\u0000$\u00b7\u0001\u0000\u0000\u0000&\u00bb"+
		"\u0001\u0000\u0000\u0000(\u00ea\u0001\u0000\u0000\u0000*\u00ed\u0001\u0000"+
		"\u0000\u0000,\u00fc\u0001\u0000\u0000\u0000.\u0105\u0001\u0000\u0000\u0000"+
		"0\u0107\u0001\u0000\u0000\u00002\u0131\u0001\u0000\u0000\u00004\u0133"+
		"\u0001\u0000\u0000\u00006\u0135\u0001\u0000\u0000\u00008\u013c\u0001\u0000"+
		"\u0000\u0000:\u0143\u0001\u0000\u0000\u0000<\u0166\u0001\u0000\u0000\u0000"+
		">@\u0003\u0002\u0001\u0000?>\u0001\u0000\u0000\u0000?@\u0001\u0000\u0000"+
		"\u0000@B\u0001\u0000\u0000\u0000AC\u0003\u0006\u0003\u0000BA\u0001\u0000"+
		"\u0000\u0000BC\u0001\u0000\u0000\u0000CE\u0001\u0000\u0000\u0000DF\u0003"+
		"\n\u0005\u0000ED\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000FH\u0001"+
		"\u0000\u0000\u0000GI\u0003\u000e\u0007\u0000HG\u0001\u0000\u0000\u0000"+
		"HI\u0001\u0000\u0000\u0000IK\u0001\u0000\u0000\u0000JL\u0003\u001a\r\u0000"+
		"KJ\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000LN\u0001\u0000\u0000"+
		"\u0000MO\u0003 \u0010\u0000NM\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000"+
		"\u0000OP\u0001\u0000\u0000\u0000PQ\u0005\u0000\u0000\u0001Q\u0001\u0001"+
		"\u0000\u0000\u0000RY\u0003\u0016\u000b\u0000SU\u0003\u0004\u0002\u0000"+
		"TV\u0003\u0018\f\u0000UT\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000"+
		"WU\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000XZ\u0001\u0000\u0000"+
		"\u0000YS\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[Y\u0001\u0000"+
		"\u0000\u0000[\\\u0001\u0000\u0000\u0000\\\u0003\u0001\u0000\u0000\u0000"+
		"]^\u0003*\u0015\u0000^\u0005\u0001\u0000\u0000\u0000_f\u0003\u0016\u000b"+
		"\u0000`b\u0003\b\u0004\u0000ac\u0003\u0018\f\u0000ba\u0001\u0000\u0000"+
		"\u0000cd\u0001\u0000\u0000\u0000db\u0001\u0000\u0000\u0000de\u0001\u0000"+
		"\u0000\u0000eg\u0001\u0000\u0000\u0000f`\u0001\u0000\u0000\u0000gh\u0001"+
		"\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000"+
		"i\u0007\u0001\u0000\u0000\u0000jk\u0003<\u001e\u0000k\t\u0001\u0000\u0000"+
		"\u0000lm\u0003\u0016\u000b\u0000mo\u0003\f\u0006\u0000np\u0003\u0018\f"+
		"\u0000on\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000qo\u0001\u0000"+
		"\u0000\u0000qr\u0001\u0000\u0000\u0000r\u000b\u0001\u0000\u0000\u0000"+
		"st\u0003<\u001e\u0000t\r\u0001\u0000\u0000\u0000uw\u0003\u0010\b\u0000"+
		"vx\u0003\u0018\f\u0000wv\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000"+
		"yw\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000z|\u0001\u0000\u0000"+
		"\u0000{}\u0003\u0012\t\u0000|{\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000"+
		"\u0000}\u000f\u0001\u0000\u0000\u0000~\u007f\u0005\t\u0000\u0000\u007f"+
		"\u0011\u0001\u0000\u0000\u0000\u0080\u0082\u0003\u0014\n\u0000\u0081\u0083"+
		"\u0003\u0018\f\u0000\u0082\u0081\u0001\u0000\u0000\u0000\u0083\u0084\u0001"+
		"\u0000\u0000\u0000\u0084\u0082\u0001\u0000\u0000\u0000\u0084\u0085\u0001"+
		"\u0000\u0000\u0000\u0085\u0087\u0001\u0000\u0000\u0000\u0086\u0080\u0001"+
		"\u0000\u0000\u0000\u0087\u0088\u0001\u0000\u0000\u0000\u0088\u0086\u0001"+
		"\u0000\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089\u0013\u0001"+
		"\u0000\u0000\u0000\u008a\u008b\u0003<\u001e\u0000\u008b\u0015\u0001\u0000"+
		"\u0000\u0000\u008c\u008d\u0005\u0003\u0000\u0000\u008d\u0017\u0001\u0000"+
		"\u0000\u0000\u008e\u0090\u0003\u0016\u000b\u0000\u008f\u008e\u0001\u0000"+
		"\u0000\u0000\u008f\u0090\u0001\u0000\u0000\u0000\u0090\u0091\u0001\u0000"+
		"\u0000\u0000\u0091\u0092\u0005\u0004\u0000\u0000\u0092\u0019\u0001\u0000"+
		"\u0000\u0000\u0093\u0095\u0003\u001c\u000e\u0000\u0094\u0096\u0003\u0018"+
		"\f\u0000\u0095\u0094\u0001\u0000\u0000\u0000\u0096\u0097\u0001\u0000\u0000"+
		"\u0000\u0097\u0095\u0001\u0000\u0000\u0000\u0097\u0098\u0001\u0000\u0000"+
		"\u0000\u0098\u009a\u0001\u0000\u0000\u0000\u0099\u009b\u0003\u001e\u000f"+
		"\u0000\u009a\u0099\u0001\u0000\u0000\u0000\u009a\u009b\u0001\u0000\u0000"+
		"\u0000\u009b\u001b\u0001\u0000\u0000\u0000\u009c\u009d\u0005\u000b\u0000"+
		"\u0000\u009d\u001d\u0001\u0000\u0000\u0000\u009e\u00a0\u0003\u0016\u000b"+
		"\u0000\u009f\u009e\u0001\u0000\u0000\u0000\u009f\u00a0\u0001\u0000\u0000"+
		"\u0000\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1\u00a3\u00036\u001b\u0000"+
		"\u00a2\u00a4\u0003\u0018\f\u0000\u00a3\u00a2\u0001\u0000\u0000\u0000\u00a4"+
		"\u00a5\u0001\u0000\u0000\u0000\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a5"+
		"\u00a6\u0001\u0000\u0000\u0000\u00a6\u00a8\u0001\u0000\u0000\u0000\u00a7"+
		"\u009f\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9"+
		"\u00a7\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000\u0000\u0000\u00aa"+
		"\u001f\u0001\u0000\u0000\u0000\u00ab\u00ad\u0003\"\u0011\u0000\u00ac\u00ae"+
		"\u0003\u0018\f\u0000\u00ad\u00ac\u0001\u0000\u0000\u0000\u00ae\u00af\u0001"+
		"\u0000\u0000\u0000\u00af\u00ad\u0001\u0000\u0000\u0000\u00af\u00b0\u0001"+
		"\u0000\u0000\u0000\u00b0\u00b2\u0001\u0000\u0000\u0000\u00b1\u00b3\u0003"+
		"$\u0012\u0000\u00b2\u00b1\u0001\u0000\u0000\u0000\u00b2\u00b3\u0001\u0000"+
		"\u0000\u0000\u00b3!\u0001\u0000\u0000\u0000\u00b4\u00b5\u0005\n\u0000"+
		"\u0000\u00b5#\u0001\u0000\u0000\u0000\u00b6\u00b8\u0003&\u0013\u0000\u00b7"+
		"\u00b6\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001\u0000\u0000\u0000\u00b9"+
		"\u00b7\u0001\u0000\u0000\u0000\u00b9\u00ba\u0001\u0000\u0000\u0000\u00ba"+
		"%\u0001\u0000\u0000\u0000\u00bb\u00bd\u0003(\u0014\u0000\u00bc\u00be\u0003"+
		"\u0018\f\u0000\u00bd\u00bc\u0001\u0000\u0000\u0000\u00be\u00bf\u0001\u0000"+
		"\u0000\u0000\u00bf\u00bd\u0001\u0000\u0000\u0000\u00bf\u00c0\u0001\u0000"+
		"\u0000\u0000\u00c0\u00e6\u0001\u0000\u0000\u0000\u00c1\u00c3\u00030\u0018"+
		"\u0000\u00c2\u00c4\u0003\u0018\f\u0000\u00c3\u00c2\u0001\u0000\u0000\u0000"+
		"\u00c4\u00c5\u0001\u0000\u0000\u0000\u00c5\u00c3\u0001\u0000\u0000\u0000"+
		"\u00c5\u00c6\u0001\u0000\u0000\u0000\u00c6\u00c8\u0001\u0000\u0000\u0000"+
		"\u00c7\u00c1\u0001\u0000\u0000\u0000\u00c8\u00cb\u0001\u0000\u0000\u0000"+
		"\u00c9\u00c7\u0001\u0000\u0000\u0000\u00c9\u00ca\u0001\u0000\u0000\u0000"+
		"\u00ca\u00e2\u0001\u0000\u0000\u0000\u00cb\u00c9\u0001\u0000\u0000\u0000"+
		"\u00cc\u00cd\u0003\u0016\u000b\u0000\u00cd\u00cf\u0003,\u0016\u0000\u00ce"+
		"\u00d0\u0003\u0018\f\u0000\u00cf\u00ce\u0001\u0000\u0000\u0000\u00d0\u00d1"+
		"\u0001\u0000\u0000\u0000\u00d1\u00cf\u0001\u0000\u0000\u0000\u00d1\u00d2"+
		"\u0001\u0000\u0000\u0000\u00d2\u00de\u0001\u0000\u0000\u0000\u00d3\u00d4"+
		"\u0003\u0016\u000b\u0000\u00d4\u00d5\u0003.\u0017\u0000\u00d5\u00d8\u0001"+
		"\u0000\u0000\u0000\u00d6\u00d8\u00030\u0018\u0000\u00d7\u00d3\u0001\u0000"+
		"\u0000\u0000\u00d7\u00d6\u0001\u0000\u0000\u0000\u00d8\u00da\u0001\u0000"+
		"\u0000\u0000\u00d9\u00db\u0003\u0018\f\u0000\u00da\u00d9\u0001\u0000\u0000"+
		"\u0000\u00db\u00dc\u0001\u0000\u0000\u0000\u00dc\u00da\u0001\u0000\u0000"+
		"\u0000\u00dc\u00dd\u0001\u0000\u0000\u0000\u00dd\u00df\u0001\u0000\u0000"+
		"\u0000\u00de\u00d7\u0001\u0000\u0000\u0000\u00df\u00e0\u0001\u0000\u0000"+
		"\u0000\u00e0\u00de\u0001\u0000\u0000\u0000\u00e0\u00e1\u0001\u0000\u0000"+
		"\u0000\u00e1\u00e3\u0001\u0000\u0000\u0000\u00e2\u00cc\u0001\u0000\u0000"+
		"\u0000\u00e3\u00e4\u0001\u0000\u0000\u0000\u00e4\u00e2\u0001\u0000\u0000"+
		"\u0000\u00e4\u00e5\u0001\u0000\u0000\u0000\u00e5\u00e7\u0001\u0000\u0000"+
		"\u0000\u00e6\u00c9\u0001\u0000\u0000\u0000\u00e7\u00e8\u0001\u0000\u0000"+
		"\u0000\u00e8\u00e6\u0001\u0000\u0000\u0000\u00e8\u00e9\u0001\u0000\u0000"+
		"\u0000\u00e9\'\u0001\u0000\u0000\u0000\u00ea\u00eb\u0003*\u0015\u0000"+
		"\u00eb)\u0001\u0000\u0000\u0000\u00ec\u00ee\u0007\u0000\u0000\u0000\u00ed"+
		"\u00ec\u0001\u0000\u0000\u0000\u00ee\u00ef\u0001\u0000\u0000\u0000\u00ef"+
		"\u00ed\u0001\u0000\u0000\u0000\u00ef\u00f0\u0001\u0000\u0000\u0000\u00f0"+
		"\u00f9\u0001\u0000\u0000\u0000\u00f1\u00f3\u0003\u0016\u000b\u0000\u00f2"+
		"\u00f4\u0007\u0000\u0000\u0000\u00f3\u00f2\u0001\u0000\u0000\u0000\u00f4"+
		"\u00f5\u0001\u0000\u0000\u0000\u00f5\u00f3\u0001\u0000\u0000\u0000\u00f5"+
		"\u00f6\u0001\u0000\u0000\u0000\u00f6\u00f8\u0001\u0000\u0000\u0000\u00f7"+
		"\u00f1\u0001\u0000\u0000\u0000\u00f8\u00fb\u0001\u0000\u0000\u0000\u00f9"+
		"\u00f7\u0001\u0000\u0000\u0000\u00f9\u00fa\u0001\u0000\u0000\u0000\u00fa"+
		"+\u0001\u0000\u0000\u0000\u00fb\u00f9\u0001\u0000\u0000\u0000\u00fc\u0102"+
		"\u0005\f\u0000\u0000\u00fd\u00fe\u0003\u0016\u000b\u0000\u00fe\u00ff\u0005"+
		"\f\u0000\u0000\u00ff\u0101\u0001\u0000\u0000\u0000\u0100\u00fd\u0001\u0000"+
		"\u0000\u0000\u0101\u0104\u0001\u0000\u0000\u0000\u0102\u0100\u0001\u0000"+
		"\u0000\u0000\u0102\u0103\u0001\u0000\u0000\u0000\u0103-\u0001\u0000\u0000"+
		"\u0000\u0104\u0102\u0001\u0000\u0000\u0000\u0105\u0106\u00032\u0019\u0000"+
		"\u0106/\u0001\u0000\u0000\u0000\u0107\u0108\u00032\u0019\u0000\u01081"+
		"\u0001\u0000\u0000\u0000\u0109\u011a\u0003<\u001e\u0000\u010a\u010c\u0003"+
		"\u0016\u000b\u0000\u010b\u010a\u0001\u0000\u0000\u0000\u010b\u010c\u0001"+
		"\u0000\u0000\u0000\u010c\u010d\u0001\u0000\u0000\u0000\u010d\u010f\u0003"+
		"6\u001b\u0000\u010e\u010b\u0001\u0000\u0000\u0000\u010f\u0110\u0001\u0000"+
		"\u0000\u0000\u0110\u010e\u0001\u0000\u0000\u0000\u0110\u0111\u0001\u0000"+
		"\u0000\u0000\u0111\u0116\u0001\u0000\u0000\u0000\u0112\u0114\u0003\u0016"+
		"\u000b\u0000\u0113\u0112\u0001\u0000\u0000\u0000\u0113\u0114\u0001\u0000"+
		"\u0000\u0000\u0114\u0115\u0001\u0000\u0000\u0000\u0115\u0117\u0003<\u001e"+
		"\u0000\u0116\u0113\u0001\u0000\u0000\u0000\u0116\u0117\u0001\u0000\u0000"+
		"\u0000\u0117\u0119\u0001\u0000\u0000\u0000\u0118\u010e\u0001\u0000\u0000"+
		"\u0000\u0119\u011c\u0001\u0000\u0000\u0000\u011a\u0118\u0001\u0000\u0000"+
		"\u0000\u011a\u011b\u0001\u0000\u0000\u0000\u011b\u0132\u0001\u0000\u0000"+
		"\u0000\u011c\u011a\u0001\u0000\u0000\u0000\u011d\u0124\u00036\u001b\u0000"+
		"\u011e\u0120\u0003\u0016\u000b\u0000\u011f\u011e\u0001\u0000\u0000\u0000"+
		"\u011f\u0120\u0001\u0000\u0000\u0000\u0120\u0121\u0001\u0000\u0000\u0000"+
		"\u0121\u0123\u00036\u001b\u0000\u0122\u011f\u0001\u0000\u0000\u0000\u0123"+
		"\u0126\u0001\u0000\u0000\u0000\u0124\u0122\u0001\u0000\u0000\u0000\u0124"+
		"\u0125\u0001\u0000\u0000\u0000\u0125\u012b\u0001\u0000\u0000\u0000\u0126"+
		"\u0124\u0001\u0000\u0000\u0000\u0127\u0129\u0003\u0016\u000b\u0000\u0128"+
		"\u0127\u0001\u0000\u0000\u0000\u0128\u0129\u0001\u0000\u0000\u0000\u0129"+
		"\u012a\u0001\u0000\u0000\u0000\u012a\u012c\u0003<\u001e\u0000\u012b\u0128"+
		"\u0001\u0000\u0000\u0000\u012b\u012c\u0001\u0000\u0000\u0000\u012c\u012e"+
		"\u0001\u0000\u0000\u0000\u012d\u011d\u0001\u0000\u0000\u0000\u012e\u012f"+
		"\u0001\u0000\u0000\u0000\u012f\u012d\u0001\u0000\u0000\u0000\u012f\u0130"+
		"\u0001\u0000\u0000\u0000\u0130\u0132\u0001\u0000\u0000\u0000\u0131\u0109"+
		"\u0001\u0000\u0000\u0000\u0131\u012d\u0001\u0000\u0000\u0000\u01323\u0001"+
		"\u0000\u0000\u0000\u0133\u0134\u0005\f\u0000\u0000\u01345\u0001\u0000"+
		"\u0000\u0000\u0135\u0136\u0005\u0006\u0000\u0000\u0136\u0137\u00038\u001c"+
		"\u0000\u0137\u0138\u0005\u0007\u0000\u0000\u01387\u0001\u0000\u0000\u0000"+
		"\u0139\u013d\u0003\u0016\u000b\u0000\u013a\u013d\u0003<\u001e\u0000\u013b"+
		"\u013d\u00034\u001a\u0000\u013c\u0139\u0001\u0000\u0000\u0000\u013c\u013a"+
		"\u0001\u0000\u0000\u0000\u013c\u013b\u0001\u0000\u0000\u0000\u013d\u013e"+
		"\u0001\u0000\u0000\u0000\u013e\u013c\u0001\u0000\u0000\u0000\u013e\u013f"+
		"\u0001\u0000\u0000\u0000\u013f9\u0001\u0000\u0000\u0000\u0140\u0142\u0005"+
		"\f\u0000\u0000\u0141\u0140\u0001\u0000\u0000\u0000\u0142\u0145\u0001\u0000"+
		"\u0000\u0000\u0143\u0141\u0001\u0000\u0000\u0000\u0143\u0144\u0001\u0000"+
		"\u0000\u0000\u0144\u0146\u0001\u0000\u0000\u0000\u0145\u0143\u0001\u0000"+
		"\u0000\u0000\u0146\u014a\u0007\u0001\u0000\u0000\u0147\u0149\u0007\u0002"+
		"\u0000\u0000\u0148\u0147\u0001\u0000\u0000\u0000\u0149\u014c\u0001\u0000"+
		"\u0000\u0000\u014a\u0148\u0001\u0000\u0000\u0000\u014a\u014b\u0001\u0000"+
		"\u0000\u0000\u014b;\u0001\u0000\u0000\u0000\u014c\u014a\u0001\u0000\u0000"+
		"\u0000\u014d\u0155\u0005\f\u0000\u0000\u014e\u0151\u0003\u0016\u000b\u0000"+
		"\u014f\u0152\u0005\f\u0000\u0000\u0150\u0152\u0003:\u001d\u0000\u0151"+
		"\u014f\u0001\u0000\u0000\u0000\u0151\u0150\u0001\u0000\u0000\u0000\u0152"+
		"\u0154\u0001\u0000\u0000\u0000\u0153\u014e\u0001\u0000\u0000\u0000\u0154"+
		"\u0157\u0001\u0000\u0000\u0000\u0155\u0153\u0001\u0000\u0000\u0000\u0155"+
		"\u0156\u0001\u0000\u0000\u0000\u0156\u0158\u0001\u0000\u0000\u0000\u0157"+
		"\u0155\u0001\u0000\u0000\u0000\u0158\u0159\u0003\u0016\u000b\u0000\u0159"+
		"\u015a\u0003:\u001d\u0000\u015a\u0167\u0001\u0000\u0000\u0000\u015b\u0163"+
		"\u0003:\u001d\u0000\u015c\u015f\u0003\u0016\u000b\u0000\u015d\u0160\u0005"+
		"\f\u0000\u0000\u015e\u0160\u0003:\u001d\u0000\u015f\u015d\u0001\u0000"+
		"\u0000\u0000\u015f\u015e\u0001\u0000\u0000\u0000\u0160\u0162\u0001\u0000"+
		"\u0000\u0000\u0161\u015c\u0001\u0000\u0000\u0000\u0162\u0165\u0001\u0000"+
		"\u0000\u0000\u0163\u0161\u0001\u0000\u0000\u0000\u0163\u0164\u0001\u0000"+
		"\u0000\u0000\u0164\u0167\u0001\u0000\u0000\u0000\u0165\u0163\u0001\u0000"+
		"\u0000\u0000\u0166\u014d\u0001\u0000\u0000\u0000\u0166\u015b\u0001\u0000"+
		"\u0000\u0000\u0167=\u0001\u0000\u0000\u00009?BEHKNW[dhqy|\u0084\u0088"+
		"\u008f\u0097\u009a\u009f\u00a5\u00a9\u00af\u00b2\u00b9\u00bf\u00c5\u00c9"+
		"\u00d1\u00d7\u00dc\u00e0\u00e4\u00e8\u00ef\u00f5\u00f9\u0102\u010b\u0110"+
		"\u0113\u0116\u011a\u011f\u0124\u0128\u012b\u012f\u0131\u013c\u013e\u0143"+
		"\u014a\u0151\u0155\u015f\u0163\u0166";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}