// Generated from ManuscriptParser.g4 by ANTLR 4.9
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ManuscriptParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

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
	public String getGrammarFileName() { return "ManuscriptParser.g4"; }

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
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Punctuation) | (1L << Extra) | (1L << CapitalWord) | (1L << MinusculeWord) | (1L << Number))) != 0)) {
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
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Punctuation) | (1L << Extra) | (1L << CapitalWord) | (1L << MinusculeWord) | (1L << Number))) != 0) );
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
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Punctuation) | (1L << Extra) | (1L << CapitalWord) | (1L << Number))) != 0)) {
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
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Punctuation) | (1L << Extra) | (1L << CapitalWord) | (1L << Number))) != 0) );
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
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Punctuation) | (1L << LeftParenthesis) | (1L << Extra) | (1L << CapitalWord) | (1L << MinusculeWord) | (1L << Number))) != 0)) {
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
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Punctuation) | (1L << Extra) | (1L << CapitalWord) | (1L << Number))) != 0)) ) {
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
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Punctuation) | (1L << Extra) | (1L << CapitalWord) | (1L << Number))) != 0) );
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
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Punctuation) | (1L << Extra) | (1L << CapitalWord) | (1L << Number))) != 0)) ) {
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
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Punctuation) | (1L << Extra) | (1L << CapitalWord) | (1L << Number))) != 0) );
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
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WSS) | (1L << Punctuation) | (1L << Extra) | (1L << CapitalWord) | (1L << MinusculeWord) | (1L << Number))) != 0) );
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
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Punctuation) | (1L << Extra) | (1L << MinusculeWord) | (1L << Number))) != 0)) ) {
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
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Punctuation) | (1L << Extra) | (1L << CapitalWord) | (1L << MinusculeWord) | (1L << Number))) != 0)) ) {
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
		enterRule(_localctx, 50, RULE_nonCapitalText);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
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
				}
				break;
			case 2:
				{
				setState(299);
				nonCapitalWord();
				setState(307);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(300);
						wss();
						setState(303);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
						case 1:
							{
							setState(301);
							match(CapitalWord);
							}
							break;
						case 2:
							{
							setState(302);
							nonCapitalWord();
							}
							break;
						}
						}
						} 
					}
					setState(309);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\17\u013b\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\5\28\n\2\3\2\5\2;\n\2\3\2\5\2>\n\2\3\2\5\2A\n"+
		"\2\3\2\5\2D\n\2\3\2\3\2\3\3\3\3\3\3\6\3K\n\3\r\3\16\3L\3\4\3\4\3\5\3\5"+
		"\3\5\6\5T\n\5\r\5\16\5U\3\6\3\6\3\7\3\7\3\7\6\7]\n\7\r\7\16\7^\3\b\3\b"+
		"\3\t\3\t\6\te\n\t\r\t\16\tf\3\t\5\tj\n\t\3\n\3\n\3\13\3\13\6\13p\n\13"+
		"\r\13\16\13q\6\13t\n\13\r\13\16\13u\3\f\3\f\3\r\3\r\3\16\5\16}\n\16\3"+
		"\16\3\16\3\17\3\17\6\17\u0083\n\17\r\17\16\17\u0084\3\17\5\17\u0088\n"+
		"\17\3\20\3\20\3\21\6\21\u008d\n\21\r\21\16\21\u008e\3\22\3\22\6\22\u0093"+
		"\n\22\r\22\16\22\u0094\3\22\3\22\6\22\u0099\n\22\r\22\16\22\u009a\7\22"+
		"\u009d\n\22\f\22\16\22\u00a0\13\22\3\22\3\22\3\22\6\22\u00a5\n\22\r\22"+
		"\16\22\u00a6\3\22\3\22\3\22\3\22\5\22\u00ad\n\22\3\22\6\22\u00b0\n\22"+
		"\r\22\16\22\u00b1\6\22\u00b4\n\22\r\22\16\22\u00b5\6\22\u00b8\n\22\r\22"+
		"\16\22\u00b9\6\22\u00bc\n\22\r\22\16\22\u00bd\3\23\3\23\3\24\6\24\u00c3"+
		"\n\24\r\24\16\24\u00c4\3\24\3\24\6\24\u00c9\n\24\r\24\16\24\u00ca\7\24"+
		"\u00cd\n\24\f\24\16\24\u00d0\13\24\3\25\3\25\3\25\3\25\7\25\u00d6\n\25"+
		"\f\25\16\25\u00d9\13\25\3\26\3\26\3\27\3\27\3\30\3\30\5\30\u00e1\n\30"+
		"\3\30\6\30\u00e4\n\30\r\30\16\30\u00e5\3\30\5\30\u00e9\n\30\3\30\5\30"+
		"\u00ec\n\30\7\30\u00ee\n\30\f\30\16\30\u00f1\13\30\3\30\3\30\5\30\u00f5"+
		"\n\30\3\30\7\30\u00f8\n\30\f\30\16\30\u00fb\13\30\3\30\5\30\u00fe\n\30"+
		"\3\30\5\30\u0101\n\30\6\30\u0103\n\30\r\30\16\30\u0104\5\30\u0107\n\30"+
		"\3\31\3\31\3\31\3\31\6\31\u010d\n\31\r\31\16\31\u010e\3\31\3\31\3\32\7"+
		"\32\u0114\n\32\f\32\16\32\u0117\13\32\3\32\3\32\7\32\u011b\n\32\f\32\16"+
		"\32\u011e\13\32\3\33\3\33\3\33\3\33\5\33\u0124\n\33\7\33\u0126\n\33\f"+
		"\33\16\33\u0129\13\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0132\n"+
		"\33\7\33\u0134\n\33\f\33\16\33\u0137\13\33\5\33\u0139\n\33\3\33\2\2\34"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\2\5\6\2\7\7"+
		"\n\n\r\r\17\17\5\2\7\7\n\n\16\17\5\2\7\7\n\n\r\17\2\u0152\2\67\3\2\2\2"+
		"\4G\3\2\2\2\6N\3\2\2\2\bP\3\2\2\2\nW\3\2\2\2\fY\3\2\2\2\16`\3\2\2\2\20"+
		"b\3\2\2\2\22k\3\2\2\2\24s\3\2\2\2\26w\3\2\2\2\30y\3\2\2\2\32|\3\2\2\2"+
		"\34\u0080\3\2\2\2\36\u0089\3\2\2\2 \u008c\3\2\2\2\"\u0090\3\2\2\2$\u00bf"+
		"\3\2\2\2&\u00c2\3\2\2\2(\u00d1\3\2\2\2*\u00da\3\2\2\2,\u00dc\3\2\2\2."+
		"\u0106\3\2\2\2\60\u0108\3\2\2\2\62\u0115\3\2\2\2\64\u0138\3\2\2\2\668"+
		"\5\4\3\2\67\66\3\2\2\2\678\3\2\2\28:\3\2\2\29;\5\b\5\2:9\3\2\2\2:;\3\2"+
		"\2\2;=\3\2\2\2<>\5\f\7\2=<\3\2\2\2=>\3\2\2\2>@\3\2\2\2?A\5\20\t\2@?\3"+
		"\2\2\2@A\3\2\2\2AC\3\2\2\2BD\5\34\17\2CB\3\2\2\2CD\3\2\2\2DE\3\2\2\2E"+
		"F\7\2\2\3F\3\3\2\2\2GH\5\30\r\2HJ\5\6\4\2IK\5\32\16\2JI\3\2\2\2KL\3\2"+
		"\2\2LJ\3\2\2\2LM\3\2\2\2M\5\3\2\2\2NO\5&\24\2O\7\3\2\2\2PQ\5\30\r\2QS"+
		"\5\n\6\2RT\5\32\16\2SR\3\2\2\2TU\3\2\2\2US\3\2\2\2UV\3\2\2\2V\t\3\2\2"+
		"\2WX\5\64\33\2X\13\3\2\2\2YZ\5\30\r\2Z\\\5\16\b\2[]\5\32\16\2\\[\3\2\2"+
		"\2]^\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_\r\3\2\2\2`a\5\64\33\2a\17\3\2\2\2b"+
		"d\5\22\n\2ce\5\32\16\2dc\3\2\2\2ef\3\2\2\2fd\3\2\2\2fg\3\2\2\2gi\3\2\2"+
		"\2hj\5\24\13\2ih\3\2\2\2ij\3\2\2\2j\21\3\2\2\2kl\7\13\2\2l\23\3\2\2\2"+
		"mo\5\26\f\2np\5\32\16\2on\3\2\2\2pq\3\2\2\2qo\3\2\2\2qr\3\2\2\2rt\3\2"+
		"\2\2sm\3\2\2\2tu\3\2\2\2us\3\2\2\2uv\3\2\2\2v\25\3\2\2\2wx\5\64\33\2x"+
		"\27\3\2\2\2yz\7\5\2\2z\31\3\2\2\2{}\5\30\r\2|{\3\2\2\2|}\3\2\2\2}~\3\2"+
		"\2\2~\177\7\6\2\2\177\33\3\2\2\2\u0080\u0082\5\36\20\2\u0081\u0083\5\32"+
		"\16\2\u0082\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0082\3\2\2\2\u0084"+
		"\u0085\3\2\2\2\u0085\u0087\3\2\2\2\u0086\u0088\5 \21\2\u0087\u0086\3\2"+
		"\2\2\u0087\u0088\3\2\2\2\u0088\35\3\2\2\2\u0089\u008a\7\f\2\2\u008a\37"+
		"\3\2\2\2\u008b\u008d\5\"\22\2\u008c\u008b\3\2\2\2\u008d\u008e\3\2\2\2"+
		"\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f!\3\2\2\2\u0090\u0092\5"+
		"$\23\2\u0091\u0093\5\32\16\2\u0092\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094"+
		"\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u00bb\3\2\2\2\u0096\u0098\5,"+
		"\27\2\u0097\u0099\5\32\16\2\u0098\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a"+
		"\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009d\3\2\2\2\u009c\u0096\3\2"+
		"\2\2\u009d\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f"+
		"\u00b7\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u00a2\5\30\r\2\u00a2\u00a4\5"+
		"(\25\2\u00a3\u00a5\5\32\16\2\u00a4\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6"+
		"\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00b3\3\2\2\2\u00a8\u00a9\5\30"+
		"\r\2\u00a9\u00aa\5*\26\2\u00aa\u00ad\3\2\2\2\u00ab\u00ad\5,\27\2\u00ac"+
		"\u00a8\3\2\2\2\u00ac\u00ab\3\2\2\2\u00ad\u00af\3\2\2\2\u00ae\u00b0\5\32"+
		"\16\2\u00af\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1"+
		"\u00b2\3\2\2\2\u00b2\u00b4\3\2\2\2\u00b3\u00ac\3\2\2\2\u00b4\u00b5\3\2"+
		"\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b8\3\2\2\2\u00b7"+
		"\u00a1\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2"+
		"\2\2\u00ba\u00bc\3\2\2\2\u00bb\u009e\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd"+
		"\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be#\3\2\2\2\u00bf\u00c0\5&\24\2"+
		"\u00c0%\3\2\2\2\u00c1\u00c3\t\2\2\2\u00c2\u00c1\3\2\2\2\u00c3\u00c4\3"+
		"\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00ce\3\2\2\2\u00c6"+
		"\u00c8\5\30\r\2\u00c7\u00c9\t\2\2\2\u00c8\u00c7\3\2\2\2\u00c9\u00ca\3"+
		"\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cd\3\2\2\2\u00cc"+
		"\u00c6\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2"+
		"\2\2\u00cf\'\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00d7\7\r\2\2\u00d2\u00d3"+
		"\5\30\r\2\u00d3\u00d4\7\r\2\2\u00d4\u00d6\3\2\2\2\u00d5\u00d2\3\2\2\2"+
		"\u00d6\u00d9\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8)\3"+
		"\2\2\2\u00d9\u00d7\3\2\2\2\u00da\u00db\5.\30\2\u00db+\3\2\2\2\u00dc\u00dd"+
		"\5.\30\2\u00dd-\3\2\2\2\u00de\u00ef\5\64\33\2\u00df\u00e1\5\30\r\2\u00e0"+
		"\u00df\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e4\5\60"+
		"\31\2\u00e3\u00e0\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5"+
		"\u00e6\3\2\2\2\u00e6\u00eb\3\2\2\2\u00e7\u00e9\5\30\r\2\u00e8\u00e7\3"+
		"\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00ec\5\64\33\2\u00eb"+
		"\u00e8\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ee\3\2\2\2\u00ed\u00e3\3\2"+
		"\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0"+
		"\u0107\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2\u00f9\5\60\31\2\u00f3\u00f5\5"+
		"\30\r\2\u00f4\u00f3\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6"+
		"\u00f8\5\60\31\2\u00f7\u00f4\3\2\2\2\u00f8\u00fb\3\2\2\2\u00f9\u00f7\3"+
		"\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u0100\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fc"+
		"\u00fe\5\30\r\2\u00fd\u00fc\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u00ff\3"+
		"\2\2\2\u00ff\u0101\5\64\33\2\u0100\u00fd\3\2\2\2\u0100\u0101\3\2\2\2\u0101"+
		"\u0103\3\2\2\2\u0102\u00f2\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0102\3\2"+
		"\2\2\u0104\u0105\3\2\2\2\u0105\u0107\3\2\2\2\u0106\u00de\3\2\2\2\u0106"+
		"\u0102\3\2\2\2\u0107/\3\2\2\2\u0108\u010c\7\b\2\2\u0109\u010d\5\30\r\2"+
		"\u010a\u010d\5\64\33\2\u010b\u010d\7\r\2\2\u010c\u0109\3\2\2\2\u010c\u010a"+
		"\3\2\2\2\u010c\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u010c\3\2\2\2\u010e"+
		"\u010f\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0111\7\t\2\2\u0111\61\3\2\2"+
		"\2\u0112\u0114\7\r\2\2\u0113\u0112\3\2\2\2\u0114\u0117\3\2\2\2\u0115\u0113"+
		"\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0118\3\2\2\2\u0117\u0115\3\2\2\2\u0118"+
		"\u011c\t\3\2\2\u0119\u011b\t\4\2\2\u011a\u0119\3\2\2\2\u011b\u011e\3\2"+
		"\2\2\u011c\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d\63\3\2\2\2\u011e\u011c"+
		"\3\2\2\2\u011f\u0127\7\r\2\2\u0120\u0123\5\30\r\2\u0121\u0124\7\r\2\2"+
		"\u0122\u0124\5\62\32\2\u0123\u0121\3\2\2\2\u0123\u0122\3\2\2\2\u0124\u0126"+
		"\3\2\2\2\u0125\u0120\3\2\2\2\u0126\u0129\3\2\2\2\u0127\u0125\3\2\2\2\u0127"+
		"\u0128\3\2\2\2\u0128\u012a\3\2\2\2\u0129\u0127\3\2\2\2\u012a\u012b\5\30"+
		"\r\2\u012b\u012c\5\62\32\2\u012c\u0139\3\2\2\2\u012d\u0135\5\62\32\2\u012e"+
		"\u0131\5\30\r\2\u012f\u0132\7\r\2\2\u0130\u0132\5\62\32\2\u0131\u012f"+
		"\3\2\2\2\u0131\u0130\3\2\2\2\u0132\u0134\3\2\2\2\u0133\u012e\3\2\2\2\u0134"+
		"\u0137\3\2\2\2\u0135\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0139\3\2"+
		"\2\2\u0137\u0135\3\2\2\2\u0138\u011f\3\2\2\2\u0138\u012d\3\2\2\2\u0139"+
		"\65\3\2\2\2\63\67:=@CLU^fiqu|\u0084\u0087\u008e\u0094\u009a\u009e\u00a6"+
		"\u00ac\u00b1\u00b5\u00b9\u00bd\u00c4\u00ca\u00ce\u00d7\u00e0\u00e5\u00e8"+
		"\u00eb\u00ef\u00f4\u00f9\u00fd\u0100\u0104\u0106\u010c\u010e\u0115\u011c"+
		"\u0123\u0127\u0131\u0135\u0138";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}