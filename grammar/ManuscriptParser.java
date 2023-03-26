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
		CapitalWord=11, MinusculeWord=12, Number=13;
	public static final int
		RULE_manuscript = 0, RULE_titleParagraph = 1, RULE_title = 2, RULE_authorParagraph = 3, 
		RULE_author = 4, RULE_dateParagraph = 5, RULE_date = 6, RULE_synopsisPart = 7, 
		RULE_synopsisTitle = 8, RULE_synopsisParagraphs = 9, RULE_synopsisParagraph = 10, 
		RULE_wss = 11, RULE_eol = 12, RULE_scenesPart = 13, RULE_scenesHeading = 14, 
		RULE_scenes = 15, RULE_scene = 16, RULE_sceneHeading = 17, RULE_heading = 18, 
		RULE_name = 19, RULE_replique = 20, RULE_parenthesis = 21, RULE_nonCapitalTextOrCommand = 22, 
		RULE_command = 23, RULE_nonCapitalWord = 24, RULE_nonCapitalText = 25;
	private static String[] makeRuleNames() {
		return new String[] {
			"manuscript", "titleParagraph", "title", "authorParagraph", "author", 
			"dateParagraph", "date", "synopsisPart", "synopsisTitle", "synopsisParagraphs", 
			"synopsisParagraph", "wss", "eol", "scenesPart", "scenesHeading", "scenes", 
			"scene", "sceneHeading", "heading", "name", "replique", "parenthesis", 
			"nonCapitalTextOrCommand", "command", "nonCapitalWord", "nonCapitalText"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, "'('", "')'", null, null, "'KOHTAUKSET'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "MultiLineComment", "SingleLineComment", "WSS", "EOL", "Punctuation", 
			"LeftParenthesis", "RightParenthesis", "Extra", "Synopsis", "Scene", 
			"CapitalWord", "MinusculeWord", "Number"
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
		public TitleParagraphContext titleParagraph() {
			return getRuleContext(TitleParagraphContext.class,0);
		}
		public AuthorParagraphContext authorParagraph() {
			return getRuleContext(AuthorParagraphContext.class,0);
		}
		public DateParagraphContext dateParagraph() {
			return getRuleContext(DateParagraphContext.class,0);
		}
		public SynopsisPartContext synopsisPart() {
			return getRuleContext(SynopsisPartContext.class,0);
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
			setState(53);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(52);
				titleParagraph();
				}
				break;
			}
			setState(56);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(55);
				authorParagraph();
				}
				break;
			}
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WSS) {
				{
				setState(58);
				dateParagraph();
				}
			}

			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Synopsis) {
				{
				setState(61);
				synopsisPart();
				}
			}

			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Scene) {
				{
				setState(64);
				scenesPart();
				}
			}

			setState(67);
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
	public static class TitleParagraphContext extends ParserRuleContext {
		public WssContext wss() {
			return getRuleContext(WssContext.class,0);
		}
		public TitleContext title() {
			return getRuleContext(TitleContext.class,0);
		}
		public List<EolContext> eol() {
			return getRuleContexts(EolContext.class);
		}
		public EolContext eol(int i) {
			return getRuleContext(EolContext.class,i);
		}
		public TitleParagraphContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_titleParagraph; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuscriptParserListener ) ((ManuscriptParserListener)listener).enterTitleParagraph(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuscriptParserListener ) ((ManuscriptParserListener)listener).exitTitleParagraph(this);
		}
	}

	public final TitleParagraphContext titleParagraph() throws RecognitionException {
		TitleParagraphContext _localctx = new TitleParagraphContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_titleParagraph);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			wss();
			setState(70);
			title();
			setState(72); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(71);
					eol();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(74); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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
			setState(76);
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
	public static class AuthorParagraphContext extends ParserRuleContext {
		public WssContext wss() {
			return getRuleContext(WssContext.class,0);
		}
		public AuthorContext author() {
			return getRuleContext(AuthorContext.class,0);
		}
		public List<EolContext> eol() {
			return getRuleContexts(EolContext.class);
		}
		public EolContext eol(int i) {
			return getRuleContext(EolContext.class,i);
		}
		public AuthorParagraphContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_authorParagraph; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuscriptParserListener ) ((ManuscriptParserListener)listener).enterAuthorParagraph(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuscriptParserListener ) ((ManuscriptParserListener)listener).exitAuthorParagraph(this);
		}
	}

	public final AuthorParagraphContext authorParagraph() throws RecognitionException {
		AuthorParagraphContext _localctx = new AuthorParagraphContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_authorParagraph);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			wss();
			setState(79);
			author();
			setState(81); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(80);
					eol();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(83); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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
	public static class AuthorContext extends ParserRuleContext {
		public NonCapitalTextContext nonCapitalText() {
			return getRuleContext(NonCapitalTextContext.class,0);
		}
		public AuthorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_author; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuscriptParserListener ) ((ManuscriptParserListener)listener).enterAuthor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuscriptParserListener ) ((ManuscriptParserListener)listener).exitAuthor(this);
		}
	}

	public final AuthorContext author() throws RecognitionException {
		AuthorContext _localctx = new AuthorContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_author);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
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
			setState(87);
			wss();
			setState(88);
			date();
			setState(90); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(89);
				eol();
				}
				}
				setState(92); 
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
			setState(94);
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
			setState(96);
			synopsisTitle();
			setState(98); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(97);
				eol();
				}
				}
				setState(100); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WSS || _la==EOL );
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 14624L) != 0) {
				{
				setState(102);
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
			setState(105);
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
			setState(113); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(107);
				synopsisParagraph();
				setState(109); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(108);
					eol();
					}
					}
					setState(111); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WSS || _la==EOL );
				}
				}
				setState(115); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 14624L) != 0 );
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
			setState(117);
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
			setState(119);
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
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WSS) {
				{
				setState(121);
				wss();
				}
			}

			setState(124);
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
		enterRule(_localctx, 26, RULE_scenesPart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			scenesHeading();
			setState(128); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(127);
				eol();
				}
				}
				setState(130); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WSS || _la==EOL );
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 10528L) != 0) {
				{
				setState(132);
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
		enterRule(_localctx, 28, RULE_scenesHeading);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
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
		enterRule(_localctx, 30, RULE_scenes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(137);
				scene();
				}
				}
				setState(140); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 10528L) != 0 );
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
		enterRule(_localctx, 32, RULE_scene);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			sceneHeading();
			setState(144); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(143);
					eol();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(146); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(185); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(156);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (((_la) & ~0x3f) == 0 && ((1L << _la) & 14688L) != 0) {
						{
						{
						setState(148);
						parenthesis();
						setState(150); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(149);
								eol();
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(152); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						}
						setState(158);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(181); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(159);
							wss();
							setState(160);
							name();
							setState(162); 
							_errHandler.sync(this);
							_alt = 1;
							do {
								switch (_alt) {
								case 1:
									{
									{
									setState(161);
									eol();
									}
									}
									break;
								default:
									throw new NoViableAltException(this);
								}
								setState(164); 
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
							} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
							setState(177); 
							_errHandler.sync(this);
							_alt = 1;
							do {
								switch (_alt) {
								case 1:
									{
									{
									setState(170);
									_errHandler.sync(this);
									switch (_input.LA(1)) {
									case WSS:
										{
										{
										setState(166);
										wss();
										setState(167);
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
										setState(169);
										parenthesis();
										}
										break;
									default:
										throw new NoViableAltException(this);
									}
									setState(173); 
									_errHandler.sync(this);
									_alt = 1;
									do {
										switch (_alt) {
										case 1:
											{
											{
											setState(172);
											eol();
											}
											}
											break;
										default:
											throw new NoViableAltException(this);
										}
										setState(175); 
										_errHandler.sync(this);
										_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
									} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
									}
									}
									break;
								default:
									throw new NoViableAltException(this);
								}
								setState(179); 
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
							} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(183); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(187); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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
		enterRule(_localctx, 34, RULE_sceneHeading);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
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
		enterRule(_localctx, 36, RULE_heading);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(192); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(191);
				_la = _input.LA(1);
				if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 10528L) != 0) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(194); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 10528L) != 0 );
			setState(204);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(196);
					wss();
					setState(198); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(197);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 10528L) != 0) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						}
						setState(200); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 10528L) != 0 );
					}
					} 
				}
				setState(206);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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
		enterRule(_localctx, 38, RULE_name);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(CapitalWord);
			setState(213);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(208);
					wss();
					setState(209);
					match(CapitalWord);
					}
					} 
				}
				setState(215);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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
		enterRule(_localctx, 40, RULE_replique);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
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
		enterRule(_localctx, 42, RULE_parenthesis);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
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
		enterRule(_localctx, 44, RULE_nonCapitalTextOrCommand);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Punctuation:
			case Extra:
			case CapitalWord:
			case MinusculeWord:
			case Number:
				{
				setState(220);
				nonCapitalText();
				setState(237);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(225); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(222);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==WSS) {
									{
									setState(221);
									wss();
									}
								}

								setState(224);
								command();
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(227); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						setState(233);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
						case 1:
							{
							setState(230);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==WSS) {
								{
								setState(229);
								wss();
								}
							}

							setState(232);
							nonCapitalText();
							}
							break;
						}
						}
						} 
					}
					setState(239);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				}
				}
				break;
			case LeftParenthesis:
				{
				setState(256); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(240);
					command();
					setState(247);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(242);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==WSS) {
								{
								setState(241);
								wss();
								}
							}

							setState(244);
							command();
							}
							} 
						}
						setState(249);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
					}
					setState(254);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
					case 1:
						{
						setState(251);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WSS) {
							{
							setState(250);
							wss();
							}
						}

						setState(253);
						nonCapitalText();
						}
						break;
					}
					}
					}
					setState(258); 
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
	public static class CommandContext extends ParserRuleContext {
		public TerminalNode LeftParenthesis() { return getToken(ManuscriptParser.LeftParenthesis, 0); }
		public TerminalNode RightParenthesis() { return getToken(ManuscriptParser.RightParenthesis, 0); }
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
		public List<TerminalNode> CapitalWord() { return getTokens(ManuscriptParser.CapitalWord); }
		public TerminalNode CapitalWord(int i) {
			return getToken(ManuscriptParser.CapitalWord, i);
		}
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
		enterRule(_localctx, 46, RULE_command);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(LeftParenthesis);
			setState(266); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(266);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
				case 1:
					{
					setState(263);
					wss();
					}
					break;
				case 2:
					{
					setState(264);
					nonCapitalText();
					}
					break;
				case 3:
					{
					setState(265);
					match(CapitalWord);
					}
					break;
				}
				}
				setState(268); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 14632L) != 0 );
			setState(270);
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
		enterRule(_localctx, 48, RULE_nonCapitalWord);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CapitalWord) {
				{
				{
				setState(272);
				match(CapitalWord);
				}
				}
				setState(277);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(278);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 12576L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(282);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(279);
					_la = _input.LA(1);
					if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 14624L) != 0) ) {
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
				setState(284);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
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
		public List<WssContext> wss() {
			return getRuleContexts(WssContext.class);
		}
		public WssContext wss(int i) {
			return getRuleContext(WssContext.class,i);
		}
		public List<NonCapitalWordContext> nonCapitalWord() {
			return getRuleContexts(NonCapitalWordContext.class);
		}
		public NonCapitalWordContext nonCapitalWord(int i) {
			return getRuleContext(NonCapitalWordContext.class,i);
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
		enterRule(_localctx, 50, RULE_nonCapitalText);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				{
				setState(285);
				match(CapitalWord);
				setState(293);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(286);
						wss();
						setState(289);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
						case 1:
							{
							setState(287);
							match(CapitalWord);
							}
							break;
						case 2:
							{
							setState(288);
							nonCapitalWord();
							}
							break;
						}
						}
						} 
					}
					setState(295);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
				}
				}
				setState(296);
				wss();
				setState(297);
				nonCapitalWord();
				}
				break;
			case 2:
				{
				setState(299);
				nonCapitalWord();
				}
				break;
			}
			setState(309);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(302);
					wss();
					setState(305);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
					case 1:
						{
						setState(303);
						match(CapitalWord);
						}
						break;
					case 2:
						{
						setState(304);
						nonCapitalWord();
						}
						break;
					}
					}
					} 
				}
				setState(311);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
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
		"\u0004\u0001\r\u0139\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0001\u0000\u0003\u00006\b\u0000\u0001\u0000"+
		"\u0003\u00009\b\u0000\u0001\u0000\u0003\u0000<\b\u0000\u0001\u0000\u0003"+
		"\u0000?\b\u0000\u0001\u0000\u0003\u0000B\b\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0004\u0001I\b\u0001\u000b\u0001"+
		"\f\u0001J\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0004\u0003R\b\u0003\u000b\u0003\f\u0003S\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0004\u0005[\b\u0005\u000b\u0005\f\u0005"+
		"\\\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0004\u0007c\b\u0007"+
		"\u000b\u0007\f\u0007d\u0001\u0007\u0003\u0007h\b\u0007\u0001\b\u0001\b"+
		"\u0001\t\u0001\t\u0004\tn\b\t\u000b\t\f\to\u0004\tr\b\t\u000b\t\f\ts\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0003\f{\b\f\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0004\r\u0081\b\r\u000b\r\f\r\u0082\u0001\r\u0003\r"+
		"\u0086\b\r\u0001\u000e\u0001\u000e\u0001\u000f\u0004\u000f\u008b\b\u000f"+
		"\u000b\u000f\f\u000f\u008c\u0001\u0010\u0001\u0010\u0004\u0010\u0091\b"+
		"\u0010\u000b\u0010\f\u0010\u0092\u0001\u0010\u0001\u0010\u0004\u0010\u0097"+
		"\b\u0010\u000b\u0010\f\u0010\u0098\u0005\u0010\u009b\b\u0010\n\u0010\f"+
		"\u0010\u009e\t\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0004\u0010\u00a3"+
		"\b\u0010\u000b\u0010\f\u0010\u00a4\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0003\u0010\u00ab\b\u0010\u0001\u0010\u0004\u0010\u00ae\b"+
		"\u0010\u000b\u0010\f\u0010\u00af\u0004\u0010\u00b2\b\u0010\u000b\u0010"+
		"\f\u0010\u00b3\u0004\u0010\u00b6\b\u0010\u000b\u0010\f\u0010\u00b7\u0004"+
		"\u0010\u00ba\b\u0010\u000b\u0010\f\u0010\u00bb\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0004\u0012\u00c1\b\u0012\u000b\u0012\f\u0012\u00c2\u0001"+
		"\u0012\u0001\u0012\u0004\u0012\u00c7\b\u0012\u000b\u0012\f\u0012\u00c8"+
		"\u0005\u0012\u00cb\b\u0012\n\u0012\f\u0012\u00ce\t\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u00d4\b\u0013\n\u0013\f\u0013"+
		"\u00d7\t\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016"+
		"\u0001\u0016\u0003\u0016\u00df\b\u0016\u0001\u0016\u0004\u0016\u00e2\b"+
		"\u0016\u000b\u0016\f\u0016\u00e3\u0001\u0016\u0003\u0016\u00e7\b\u0016"+
		"\u0001\u0016\u0003\u0016\u00ea\b\u0016\u0005\u0016\u00ec\b\u0016\n\u0016"+
		"\f\u0016\u00ef\t\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u00f3\b\u0016"+
		"\u0001\u0016\u0005\u0016\u00f6\b\u0016\n\u0016\f\u0016\u00f9\t\u0016\u0001"+
		"\u0016\u0003\u0016\u00fc\b\u0016\u0001\u0016\u0003\u0016\u00ff\b\u0016"+
		"\u0004\u0016\u0101\b\u0016\u000b\u0016\f\u0016\u0102\u0003\u0016\u0105"+
		"\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0004\u0017\u010b"+
		"\b\u0017\u000b\u0017\f\u0017\u010c\u0001\u0017\u0001\u0017\u0001\u0018"+
		"\u0005\u0018\u0112\b\u0018\n\u0018\f\u0018\u0115\t\u0018\u0001\u0018\u0001"+
		"\u0018\u0005\u0018\u0119\b\u0018\n\u0018\f\u0018\u011c\t\u0018\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u0122\b\u0019\u0005\u0019"+
		"\u0124\b\u0019\n\u0019\f\u0019\u0127\t\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0003\u0019\u012d\b\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0003\u0019\u0132\b\u0019\u0005\u0019\u0134\b\u0019\n\u0019\f\u0019"+
		"\u0137\t\u0019\u0001\u0019\u0000\u0000\u001a\u0000\u0002\u0004\u0006\b"+
		"\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02"+
		"\u0000\u0003\u0004\u0000\u0005\u0005\b\b\u000b\u000b\r\r\u0003\u0000\u0005"+
		"\u0005\b\b\f\r\u0003\u0000\u0005\u0005\b\b\u000b\r\u0150\u00005\u0001"+
		"\u0000\u0000\u0000\u0002E\u0001\u0000\u0000\u0000\u0004L\u0001\u0000\u0000"+
		"\u0000\u0006N\u0001\u0000\u0000\u0000\bU\u0001\u0000\u0000\u0000\nW\u0001"+
		"\u0000\u0000\u0000\f^\u0001\u0000\u0000\u0000\u000e`\u0001\u0000\u0000"+
		"\u0000\u0010i\u0001\u0000\u0000\u0000\u0012q\u0001\u0000\u0000\u0000\u0014"+
		"u\u0001\u0000\u0000\u0000\u0016w\u0001\u0000\u0000\u0000\u0018z\u0001"+
		"\u0000\u0000\u0000\u001a~\u0001\u0000\u0000\u0000\u001c\u0087\u0001\u0000"+
		"\u0000\u0000\u001e\u008a\u0001\u0000\u0000\u0000 \u008e\u0001\u0000\u0000"+
		"\u0000\"\u00bd\u0001\u0000\u0000\u0000$\u00c0\u0001\u0000\u0000\u0000"+
		"&\u00cf\u0001\u0000\u0000\u0000(\u00d8\u0001\u0000\u0000\u0000*\u00da"+
		"\u0001\u0000\u0000\u0000,\u0104\u0001\u0000\u0000\u0000.\u0106\u0001\u0000"+
		"\u0000\u00000\u0113\u0001\u0000\u0000\u00002\u012c\u0001\u0000\u0000\u0000"+
		"46\u0003\u0002\u0001\u000054\u0001\u0000\u0000\u000056\u0001\u0000\u0000"+
		"\u000068\u0001\u0000\u0000\u000079\u0003\u0006\u0003\u000087\u0001\u0000"+
		"\u0000\u000089\u0001\u0000\u0000\u00009;\u0001\u0000\u0000\u0000:<\u0003"+
		"\n\u0005\u0000;:\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000<>\u0001"+
		"\u0000\u0000\u0000=?\u0003\u000e\u0007\u0000>=\u0001\u0000\u0000\u0000"+
		">?\u0001\u0000\u0000\u0000?A\u0001\u0000\u0000\u0000@B\u0003\u001a\r\u0000"+
		"A@\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000"+
		"\u0000CD\u0005\u0000\u0000\u0001D\u0001\u0001\u0000\u0000\u0000EF\u0003"+
		"\u0016\u000b\u0000FH\u0003\u0004\u0002\u0000GI\u0003\u0018\f\u0000HG\u0001"+
		"\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000JH\u0001\u0000\u0000\u0000"+
		"JK\u0001\u0000\u0000\u0000K\u0003\u0001\u0000\u0000\u0000LM\u0003$\u0012"+
		"\u0000M\u0005\u0001\u0000\u0000\u0000NO\u0003\u0016\u000b\u0000OQ\u0003"+
		"\b\u0004\u0000PR\u0003\u0018\f\u0000QP\u0001\u0000\u0000\u0000RS\u0001"+
		"\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000"+
		"T\u0007\u0001\u0000\u0000\u0000UV\u00032\u0019\u0000V\t\u0001\u0000\u0000"+
		"\u0000WX\u0003\u0016\u000b\u0000XZ\u0003\f\u0006\u0000Y[\u0003\u0018\f"+
		"\u0000ZY\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\Z\u0001\u0000"+
		"\u0000\u0000\\]\u0001\u0000\u0000\u0000]\u000b\u0001\u0000\u0000\u0000"+
		"^_\u00032\u0019\u0000_\r\u0001\u0000\u0000\u0000`b\u0003\u0010\b\u0000"+
		"ac\u0003\u0018\f\u0000ba\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000"+
		"db\u0001\u0000\u0000\u0000de\u0001\u0000\u0000\u0000eg\u0001\u0000\u0000"+
		"\u0000fh\u0003\u0012\t\u0000gf\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000"+
		"\u0000h\u000f\u0001\u0000\u0000\u0000ij\u0005\t\u0000\u0000j\u0011\u0001"+
		"\u0000\u0000\u0000km\u0003\u0014\n\u0000ln\u0003\u0018\f\u0000ml\u0001"+
		"\u0000\u0000\u0000no\u0001\u0000\u0000\u0000om\u0001\u0000\u0000\u0000"+
		"op\u0001\u0000\u0000\u0000pr\u0001\u0000\u0000\u0000qk\u0001\u0000\u0000"+
		"\u0000rs\u0001\u0000\u0000\u0000sq\u0001\u0000\u0000\u0000st\u0001\u0000"+
		"\u0000\u0000t\u0013\u0001\u0000\u0000\u0000uv\u00032\u0019\u0000v\u0015"+
		"\u0001\u0000\u0000\u0000wx\u0005\u0003\u0000\u0000x\u0017\u0001\u0000"+
		"\u0000\u0000y{\u0003\u0016\u000b\u0000zy\u0001\u0000\u0000\u0000z{\u0001"+
		"\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000|}\u0005\u0004\u0000\u0000"+
		"}\u0019\u0001\u0000\u0000\u0000~\u0080\u0003\u001c\u000e\u0000\u007f\u0081"+
		"\u0003\u0018\f\u0000\u0080\u007f\u0001\u0000\u0000\u0000\u0081\u0082\u0001"+
		"\u0000\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0082\u0083\u0001"+
		"\u0000\u0000\u0000\u0083\u0085\u0001\u0000\u0000\u0000\u0084\u0086\u0003"+
		"\u001e\u000f\u0000\u0085\u0084\u0001\u0000\u0000\u0000\u0085\u0086\u0001"+
		"\u0000\u0000\u0000\u0086\u001b\u0001\u0000\u0000\u0000\u0087\u0088\u0005"+
		"\n\u0000\u0000\u0088\u001d\u0001\u0000\u0000\u0000\u0089\u008b\u0003 "+
		"\u0010\u0000\u008a\u0089\u0001\u0000\u0000\u0000\u008b\u008c\u0001\u0000"+
		"\u0000\u0000\u008c\u008a\u0001\u0000\u0000\u0000\u008c\u008d\u0001\u0000"+
		"\u0000\u0000\u008d\u001f\u0001\u0000\u0000\u0000\u008e\u0090\u0003\"\u0011"+
		"\u0000\u008f\u0091\u0003\u0018\f\u0000\u0090\u008f\u0001\u0000\u0000\u0000"+
		"\u0091\u0092\u0001\u0000\u0000\u0000\u0092\u0090\u0001\u0000\u0000\u0000"+
		"\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u00b9\u0001\u0000\u0000\u0000"+
		"\u0094\u0096\u0003*\u0015\u0000\u0095\u0097\u0003\u0018\f\u0000\u0096"+
		"\u0095\u0001\u0000\u0000\u0000\u0097\u0098\u0001\u0000\u0000\u0000\u0098"+
		"\u0096\u0001\u0000\u0000\u0000\u0098\u0099\u0001\u0000\u0000\u0000\u0099"+
		"\u009b\u0001\u0000\u0000\u0000\u009a\u0094\u0001\u0000\u0000\u0000\u009b"+
		"\u009e\u0001\u0000\u0000\u0000\u009c\u009a\u0001\u0000\u0000\u0000\u009c"+
		"\u009d\u0001\u0000\u0000\u0000\u009d\u00b5\u0001\u0000\u0000\u0000\u009e"+
		"\u009c\u0001\u0000\u0000\u0000\u009f\u00a0\u0003\u0016\u000b\u0000\u00a0"+
		"\u00a2\u0003&\u0013\u0000\u00a1\u00a3\u0003\u0018\f\u0000\u00a2\u00a1"+
		"\u0001\u0000\u0000\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4\u00a2"+
		"\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5\u00b1"+
		"\u0001\u0000\u0000\u0000\u00a6\u00a7\u0003\u0016\u000b\u0000\u00a7\u00a8"+
		"\u0003(\u0014\u0000\u00a8\u00ab\u0001\u0000\u0000\u0000\u00a9\u00ab\u0003"+
		"*\u0015\u0000\u00aa\u00a6\u0001\u0000\u0000\u0000\u00aa\u00a9\u0001\u0000"+
		"\u0000\u0000\u00ab\u00ad\u0001\u0000\u0000\u0000\u00ac\u00ae\u0003\u0018"+
		"\f\u0000\u00ad\u00ac\u0001\u0000\u0000\u0000\u00ae\u00af\u0001\u0000\u0000"+
		"\u0000\u00af\u00ad\u0001\u0000\u0000\u0000\u00af\u00b0\u0001\u0000\u0000"+
		"\u0000\u00b0\u00b2\u0001\u0000\u0000\u0000\u00b1\u00aa\u0001\u0000\u0000"+
		"\u0000\u00b2\u00b3\u0001\u0000\u0000\u0000\u00b3\u00b1\u0001\u0000\u0000"+
		"\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4\u00b6\u0001\u0000\u0000"+
		"\u0000\u00b5\u009f\u0001\u0000\u0000\u0000\u00b6\u00b7\u0001\u0000\u0000"+
		"\u0000\u00b7\u00b5\u0001\u0000\u0000\u0000\u00b7\u00b8\u0001\u0000\u0000"+
		"\u0000\u00b8\u00ba\u0001\u0000\u0000\u0000\u00b9\u009c\u0001\u0000\u0000"+
		"\u0000\u00ba\u00bb\u0001\u0000\u0000\u0000\u00bb\u00b9\u0001\u0000\u0000"+
		"\u0000\u00bb\u00bc\u0001\u0000\u0000\u0000\u00bc!\u0001\u0000\u0000\u0000"+
		"\u00bd\u00be\u0003$\u0012\u0000\u00be#\u0001\u0000\u0000\u0000\u00bf\u00c1"+
		"\u0007\u0000\u0000\u0000\u00c0\u00bf\u0001\u0000\u0000\u0000\u00c1\u00c2"+
		"\u0001\u0000\u0000\u0000\u00c2\u00c0\u0001\u0000\u0000\u0000\u00c2\u00c3"+
		"\u0001\u0000\u0000\u0000\u00c3\u00cc\u0001\u0000\u0000\u0000\u00c4\u00c6"+
		"\u0003\u0016\u000b\u0000\u00c5\u00c7\u0007\u0000\u0000\u0000\u00c6\u00c5"+
		"\u0001\u0000\u0000\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c8\u00c6"+
		"\u0001\u0000\u0000\u0000\u00c8\u00c9\u0001\u0000\u0000\u0000\u00c9\u00cb"+
		"\u0001\u0000\u0000\u0000\u00ca\u00c4\u0001\u0000\u0000\u0000\u00cb\u00ce"+
		"\u0001\u0000\u0000\u0000\u00cc\u00ca\u0001\u0000\u0000\u0000\u00cc\u00cd"+
		"\u0001\u0000\u0000\u0000\u00cd%\u0001\u0000\u0000\u0000\u00ce\u00cc\u0001"+
		"\u0000\u0000\u0000\u00cf\u00d5\u0005\u000b\u0000\u0000\u00d0\u00d1\u0003"+
		"\u0016\u000b\u0000\u00d1\u00d2\u0005\u000b\u0000\u0000\u00d2\u00d4\u0001"+
		"\u0000\u0000\u0000\u00d3\u00d0\u0001\u0000\u0000\u0000\u00d4\u00d7\u0001"+
		"\u0000\u0000\u0000\u00d5\u00d3\u0001\u0000\u0000\u0000\u00d5\u00d6\u0001"+
		"\u0000\u0000\u0000\u00d6\'\u0001\u0000\u0000\u0000\u00d7\u00d5\u0001\u0000"+
		"\u0000\u0000\u00d8\u00d9\u0003,\u0016\u0000\u00d9)\u0001\u0000\u0000\u0000"+
		"\u00da\u00db\u0003,\u0016\u0000\u00db+\u0001\u0000\u0000\u0000\u00dc\u00ed"+
		"\u00032\u0019\u0000\u00dd\u00df\u0003\u0016\u000b\u0000\u00de\u00dd\u0001"+
		"\u0000\u0000\u0000\u00de\u00df\u0001\u0000\u0000\u0000\u00df\u00e0\u0001"+
		"\u0000\u0000\u0000\u00e0\u00e2\u0003.\u0017\u0000\u00e1\u00de\u0001\u0000"+
		"\u0000\u0000\u00e2\u00e3\u0001\u0000\u0000\u0000\u00e3\u00e1\u0001\u0000"+
		"\u0000\u0000\u00e3\u00e4\u0001\u0000\u0000\u0000\u00e4\u00e9\u0001\u0000"+
		"\u0000\u0000\u00e5\u00e7\u0003\u0016\u000b\u0000\u00e6\u00e5\u0001\u0000"+
		"\u0000\u0000\u00e6\u00e7\u0001\u0000\u0000\u0000\u00e7\u00e8\u0001\u0000"+
		"\u0000\u0000\u00e8\u00ea\u00032\u0019\u0000\u00e9\u00e6\u0001\u0000\u0000"+
		"\u0000\u00e9\u00ea\u0001\u0000\u0000\u0000\u00ea\u00ec\u0001\u0000\u0000"+
		"\u0000\u00eb\u00e1\u0001\u0000\u0000\u0000\u00ec\u00ef\u0001\u0000\u0000"+
		"\u0000\u00ed\u00eb\u0001\u0000\u0000\u0000\u00ed\u00ee\u0001\u0000\u0000"+
		"\u0000\u00ee\u0105\u0001\u0000\u0000\u0000\u00ef\u00ed\u0001\u0000\u0000"+
		"\u0000\u00f0\u00f7\u0003.\u0017\u0000\u00f1\u00f3\u0003\u0016\u000b\u0000"+
		"\u00f2\u00f1\u0001\u0000\u0000\u0000\u00f2\u00f3\u0001\u0000\u0000\u0000"+
		"\u00f3\u00f4\u0001\u0000\u0000\u0000\u00f4\u00f6\u0003.\u0017\u0000\u00f5"+
		"\u00f2\u0001\u0000\u0000\u0000\u00f6\u00f9\u0001\u0000\u0000\u0000\u00f7"+
		"\u00f5\u0001\u0000\u0000\u0000\u00f7\u00f8\u0001\u0000\u0000\u0000\u00f8"+
		"\u00fe\u0001\u0000\u0000\u0000\u00f9\u00f7\u0001\u0000\u0000\u0000\u00fa"+
		"\u00fc\u0003\u0016\u000b\u0000\u00fb\u00fa\u0001\u0000\u0000\u0000\u00fb"+
		"\u00fc\u0001\u0000\u0000\u0000\u00fc\u00fd\u0001\u0000\u0000\u0000\u00fd"+
		"\u00ff\u00032\u0019\u0000\u00fe\u00fb\u0001\u0000\u0000\u0000\u00fe\u00ff"+
		"\u0001\u0000\u0000\u0000\u00ff\u0101\u0001\u0000\u0000\u0000\u0100\u00f0"+
		"\u0001\u0000\u0000\u0000\u0101\u0102\u0001\u0000\u0000\u0000\u0102\u0100"+
		"\u0001\u0000\u0000\u0000\u0102\u0103\u0001\u0000\u0000\u0000\u0103\u0105"+
		"\u0001\u0000\u0000\u0000\u0104\u00dc\u0001\u0000\u0000\u0000\u0104\u0100"+
		"\u0001\u0000\u0000\u0000\u0105-\u0001\u0000\u0000\u0000\u0106\u010a\u0005"+
		"\u0006\u0000\u0000\u0107\u010b\u0003\u0016\u000b\u0000\u0108\u010b\u0003"+
		"2\u0019\u0000\u0109\u010b\u0005\u000b\u0000\u0000\u010a\u0107\u0001\u0000"+
		"\u0000\u0000\u010a\u0108\u0001\u0000\u0000\u0000\u010a\u0109\u0001\u0000"+
		"\u0000\u0000\u010b\u010c\u0001\u0000\u0000\u0000\u010c\u010a\u0001\u0000"+
		"\u0000\u0000\u010c\u010d\u0001\u0000\u0000\u0000\u010d\u010e\u0001\u0000"+
		"\u0000\u0000\u010e\u010f\u0005\u0007\u0000\u0000\u010f/\u0001\u0000\u0000"+
		"\u0000\u0110\u0112\u0005\u000b\u0000\u0000\u0111\u0110\u0001\u0000\u0000"+
		"\u0000\u0112\u0115\u0001\u0000\u0000\u0000\u0113\u0111\u0001\u0000\u0000"+
		"\u0000\u0113\u0114\u0001\u0000\u0000\u0000\u0114\u0116\u0001\u0000\u0000"+
		"\u0000\u0115\u0113\u0001\u0000\u0000\u0000\u0116\u011a\u0007\u0001\u0000"+
		"\u0000\u0117\u0119\u0007\u0002\u0000\u0000\u0118\u0117\u0001\u0000\u0000"+
		"\u0000\u0119\u011c\u0001\u0000\u0000\u0000\u011a\u0118\u0001\u0000\u0000"+
		"\u0000\u011a\u011b\u0001\u0000\u0000\u0000\u011b1\u0001\u0000\u0000\u0000"+
		"\u011c\u011a\u0001\u0000\u0000\u0000\u011d\u0125\u0005\u000b\u0000\u0000"+
		"\u011e\u0121\u0003\u0016\u000b\u0000\u011f\u0122\u0005\u000b\u0000\u0000"+
		"\u0120\u0122\u00030\u0018\u0000\u0121\u011f\u0001\u0000\u0000\u0000\u0121"+
		"\u0120\u0001\u0000\u0000\u0000\u0122\u0124\u0001\u0000\u0000\u0000\u0123"+
		"\u011e\u0001\u0000\u0000\u0000\u0124\u0127\u0001\u0000\u0000\u0000\u0125"+
		"\u0123\u0001\u0000\u0000\u0000\u0125\u0126\u0001\u0000\u0000\u0000\u0126"+
		"\u0128\u0001\u0000\u0000\u0000\u0127\u0125\u0001\u0000\u0000\u0000\u0128"+
		"\u0129\u0003\u0016\u000b\u0000\u0129\u012a\u00030\u0018\u0000\u012a\u012d"+
		"\u0001\u0000\u0000\u0000\u012b\u012d\u00030\u0018\u0000\u012c\u011d\u0001"+
		"\u0000\u0000\u0000\u012c\u012b\u0001\u0000\u0000\u0000\u012d\u0135\u0001"+
		"\u0000\u0000\u0000\u012e\u0131\u0003\u0016\u000b\u0000\u012f\u0132\u0005"+
		"\u000b\u0000\u0000\u0130\u0132\u00030\u0018\u0000\u0131\u012f\u0001\u0000"+
		"\u0000\u0000\u0131\u0130\u0001\u0000\u0000\u0000\u0132\u0134\u0001\u0000"+
		"\u0000\u0000\u0133\u012e\u0001\u0000\u0000\u0000\u0134\u0137\u0001\u0000"+
		"\u0000\u0000\u0135\u0133\u0001\u0000\u0000\u0000\u0135\u0136\u0001\u0000"+
		"\u0000\u0000\u01363\u0001\u0000\u0000\u0000\u0137\u0135\u0001\u0000\u0000"+
		"\u0000158;>AJS\\dgosz\u0082\u0085\u008c\u0092\u0098\u009c\u00a4\u00aa"+
		"\u00af\u00b3\u00b7\u00bb\u00c2\u00c8\u00cc\u00d5\u00de\u00e3\u00e6\u00e9"+
		"\u00ed\u00f2\u00f7\u00fb\u00fe\u0102\u0104\u010a\u010c\u0113\u011a\u0121"+
		"\u0125\u012c\u0131\u0135";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}