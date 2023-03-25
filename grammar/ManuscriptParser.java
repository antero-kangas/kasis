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
		MultiLineComment=1, SingleLineComment=2, WSS=3, EOL=4, Capital=5, Minuscule=6, 
		Punctuation=7, LeftParenthesis=8, RightParenthesis=9, Extra=10, Minus=11, 
		Synopsis=12, Scene=13, CapitalWord=14, Number=15, MinusculeWord=16;
	public static final int
		RULE_manuscript = 0, RULE_titleParagraph = 1, RULE_title = 2, RULE_authorParagraph = 3, 
		RULE_author = 4, RULE_dateParagraph = 5, RULE_date = 6, RULE_synopsisPart = 7, 
		RULE_synopsisParagraphs = 8, RULE_synopsisParagraph = 9, RULE_wss = 10, 
		RULE_eol = 11, RULE_scenesPart = 12, RULE_scenes = 13, RULE_scene = 14, 
		RULE_sceneHeading = 15, RULE_heading = 16, RULE_name = 17, RULE_replique = 18, 
		RULE_parenthesis = 19, RULE_anyTextOrCommand = 20, RULE_command = 21, 
		RULE_capitalword = 22, RULE_anyText = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"manuscript", "titleParagraph", "title", "authorParagraph", "author", 
			"dateParagraph", "date", "synopsisPart", "synopsisParagraphs", "synopsisParagraph", 
			"wss", "eol", "scenesPart", "scenes", "scene", "sceneHeading", "heading", 
			"name", "replique", "parenthesis", "anyTextOrCommand", "command", "capitalword", 
			"anyText"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "'('", "')'", null, "'-'", 
			null, "'KOHTAUKSET'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "MultiLineComment", "SingleLineComment", "WSS", "EOL", "Capital", 
			"Minuscule", "Punctuation", "LeftParenthesis", "RightParenthesis", "Extra", 
			"Minus", "Synopsis", "Scene", "CapitalWord", "Number", "MinusculeWord"
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
			setState(49);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(48);
				titleParagraph();
				}
				break;
			}
			setState(52);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(51);
				authorParagraph();
				}
				break;
			}
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WSS) {
				{
				setState(54);
				dateParagraph();
				}
			}

			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Synopsis) {
				{
				setState(57);
				synopsisPart();
				}
			}

			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Scene) {
				{
				setState(60);
				scenesPart();
				}
			}

			setState(63);
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
			setState(65);
			wss();
			setState(66);
			title();
			setState(68); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(67);
					eol();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(70); 
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
			setState(72);
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
			setState(74);
			wss();
			setState(75);
			author();
			setState(77); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(76);
					eol();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(79); 
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
		public AnyTextContext anyText() {
			return getRuleContext(AnyTextContext.class,0);
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
			setState(81);
			anyText();
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
			setState(83);
			wss();
			setState(84);
			date();
			setState(86); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(85);
				eol();
				}
				}
				setState(88); 
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
		public AnyTextContext anyText() {
			return getRuleContext(AnyTextContext.class,0);
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
			setState(90);
			anyText();
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
		public TerminalNode Synopsis() { return getToken(ManuscriptParser.Synopsis, 0); }
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
			setState(92);
			match(Synopsis);
			setState(94); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(93);
				eol();
				}
				}
				setState(96); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WSS || _la==EOL );
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Punctuation) | (1L << Extra) | (1L << Minus) | (1L << CapitalWord) | (1L << Number) | (1L << MinusculeWord))) != 0)) {
				{
				setState(98);
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
		enterRule(_localctx, 16, RULE_synopsisParagraphs);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(112); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(102); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(101);
						synopsisParagraph();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(104); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WSS || _la==EOL) {
					{
					{
					setState(106);
					eol();
					}
					}
					setState(111);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(114); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Punctuation) | (1L << Extra) | (1L << Minus) | (1L << CapitalWord) | (1L << Number) | (1L << MinusculeWord))) != 0) );
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
		public AnyTextContext anyText() {
			return getRuleContext(AnyTextContext.class,0);
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
		enterRule(_localctx, 18, RULE_synopsisParagraph);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			anyText();
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
		enterRule(_localctx, 20, RULE_wss);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
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
		enterRule(_localctx, 22, RULE_eol);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WSS) {
				{
				setState(120);
				wss();
				}
			}

			setState(123);
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
		public TerminalNode Scene() { return getToken(ManuscriptParser.Scene, 0); }
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
		enterRule(_localctx, 24, RULE_scenesPart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(Scene);
			setState(127); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(126);
				eol();
				}
				}
				setState(129); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WSS || _la==EOL );
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Punctuation) | (1L << Extra) | (1L << Minus) | (1L << CapitalWord) | (1L << Number))) != 0)) {
				{
				setState(131);
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
		enterRule(_localctx, 26, RULE_scenes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(134);
				scene();
				}
				}
				setState(137); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Punctuation) | (1L << Extra) | (1L << Minus) | (1L << CapitalWord) | (1L << Number))) != 0) );
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
		enterRule(_localctx, 28, RULE_scene);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			sceneHeading();
			setState(141); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(140);
					eol();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(143); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(182); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(153);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Punctuation) | (1L << LeftParenthesis) | (1L << Extra) | (1L << Minus) | (1L << CapitalWord) | (1L << Number) | (1L << MinusculeWord))) != 0)) {
						{
						{
						setState(145);
						parenthesis();
						setState(147); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(146);
								eol();
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(149); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						}
						setState(155);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(178); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(156);
							wss();
							setState(157);
							name();
							setState(159); 
							_errHandler.sync(this);
							_alt = 1;
							do {
								switch (_alt) {
								case 1:
									{
									{
									setState(158);
									eol();
									}
									}
									break;
								default:
									throw new NoViableAltException(this);
								}
								setState(161); 
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
							} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
							setState(174); 
							_errHandler.sync(this);
							_alt = 1;
							do {
								switch (_alt) {
								case 1:
									{
									{
									setState(167);
									_errHandler.sync(this);
									switch (_input.LA(1)) {
									case WSS:
										{
										{
										setState(163);
										wss();
										setState(164);
										replique();
										}
										}
										break;
									case Punctuation:
									case LeftParenthesis:
									case Extra:
									case Minus:
									case CapitalWord:
									case Number:
									case MinusculeWord:
										{
										setState(166);
										parenthesis();
										}
										break;
									default:
										throw new NoViableAltException(this);
									}
									setState(170); 
									_errHandler.sync(this);
									_alt = 1;
									do {
										switch (_alt) {
										case 1:
											{
											{
											setState(169);
											eol();
											}
											}
											break;
										default:
											throw new NoViableAltException(this);
										}
										setState(172); 
										_errHandler.sync(this);
										_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
									} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
									}
									}
									break;
								default:
									throw new NoViableAltException(this);
								}
								setState(176); 
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
							} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(180); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(184); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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
		enterRule(_localctx, 30, RULE_sceneHeading);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
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
		public List<TerminalNode> Minus() { return getTokens(ManuscriptParser.Minus); }
		public TerminalNode Minus(int i) {
			return getToken(ManuscriptParser.Minus, i);
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
		enterRule(_localctx, 32, RULE_heading);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(189); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(188);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Punctuation) | (1L << Extra) | (1L << Minus) | (1L << CapitalWord) | (1L << Number))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(191); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Punctuation) | (1L << Extra) | (1L << Minus) | (1L << CapitalWord) | (1L << Number))) != 0) );
			setState(201);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(193);
					wss();
					setState(195); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(194);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Punctuation) | (1L << Extra) | (1L << Minus) | (1L << CapitalWord) | (1L << Number))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						}
						setState(197); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Punctuation) | (1L << Extra) | (1L << Minus) | (1L << CapitalWord) | (1L << Number))) != 0) );
					}
					} 
				}
				setState(203);
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
		enterRule(_localctx, 34, RULE_name);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(CapitalWord);
			setState(210);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(205);
					wss();
					setState(206);
					match(CapitalWord);
					}
					} 
				}
				setState(212);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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
		public AnyTextOrCommandContext anyTextOrCommand() {
			return getRuleContext(AnyTextOrCommandContext.class,0);
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
		enterRule(_localctx, 36, RULE_replique);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			anyTextOrCommand();
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
		public AnyTextOrCommandContext anyTextOrCommand() {
			return getRuleContext(AnyTextOrCommandContext.class,0);
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
		enterRule(_localctx, 38, RULE_parenthesis);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			anyTextOrCommand();
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

	public static class AnyTextOrCommandContext extends ParserRuleContext {
		public List<AnyTextContext> anyText() {
			return getRuleContexts(AnyTextContext.class);
		}
		public AnyTextContext anyText(int i) {
			return getRuleContext(AnyTextContext.class,i);
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
		public AnyTextOrCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anyTextOrCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuscriptParserListener ) ((ManuscriptParserListener)listener).enterAnyTextOrCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuscriptParserListener ) ((ManuscriptParserListener)listener).exitAnyTextOrCommand(this);
		}
	}

	public final AnyTextOrCommandContext anyTextOrCommand() throws RecognitionException {
		AnyTextOrCommandContext _localctx = new AnyTextOrCommandContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_anyTextOrCommand);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Punctuation:
			case Extra:
			case Minus:
			case CapitalWord:
			case Number:
			case MinusculeWord:
				{
				setState(217);
				anyText();
				setState(234);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(222); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(219);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==WSS) {
									{
									setState(218);
									wss();
									}
								}

								setState(221);
								command();
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(224); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						setState(230);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
						case 1:
							{
							setState(227);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==WSS) {
								{
								setState(226);
								wss();
								}
							}

							setState(229);
							anyText();
							}
							break;
						}
						}
						} 
					}
					setState(236);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				}
				}
				break;
			case LeftParenthesis:
				{
				setState(253); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(237);
					command();
					setState(244);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(239);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==WSS) {
								{
								setState(238);
								wss();
								}
							}

							setState(241);
							command();
							}
							} 
						}
						setState(246);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
					}
					setState(251);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
					case 1:
						{
						setState(248);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WSS) {
							{
							setState(247);
							wss();
							}
						}

						setState(250);
						anyText();
						}
						break;
					}
					}
					}
					setState(255); 
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
		public AnyTextContext anyText() {
			return getRuleContext(AnyTextContext.class,0);
		}
		public TerminalNode RightParenthesis() { return getToken(ManuscriptParser.RightParenthesis, 0); }
		public List<WssContext> wss() {
			return getRuleContexts(WssContext.class);
		}
		public WssContext wss(int i) {
			return getRuleContext(WssContext.class,i);
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
		enterRule(_localctx, 42, RULE_command);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(LeftParenthesis);
			setState(261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WSS) {
				{
				setState(260);
				wss();
				}
			}

			setState(263);
			anyText();
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WSS) {
				{
				setState(264);
				wss();
				}
			}

			setState(267);
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

	public static class CapitalwordContext extends ParserRuleContext {
		public TerminalNode CapitalWord() { return getToken(ManuscriptParser.CapitalWord, 0); }
		public CapitalwordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_capitalword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuscriptParserListener ) ((ManuscriptParserListener)listener).enterCapitalword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuscriptParserListener ) ((ManuscriptParserListener)listener).exitCapitalword(this);
		}
	}

	public final CapitalwordContext capitalword() throws RecognitionException {
		CapitalwordContext _localctx = new CapitalwordContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_capitalword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
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

	public static class AnyTextContext extends ParserRuleContext {
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
		public List<TerminalNode> Minus() { return getTokens(ManuscriptParser.Minus); }
		public TerminalNode Minus(int i) {
			return getToken(ManuscriptParser.Minus, i);
		}
		public List<TerminalNode> MinusculeWord() { return getTokens(ManuscriptParser.MinusculeWord); }
		public TerminalNode MinusculeWord(int i) {
			return getToken(ManuscriptParser.MinusculeWord, i);
		}
		public AnyTextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anyText; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuscriptParserListener ) ((ManuscriptParserListener)listener).enterAnyText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuscriptParserListener ) ((ManuscriptParserListener)listener).exitAnyText(this);
		}
	}

	public final AnyTextContext anyText() throws RecognitionException {
		AnyTextContext _localctx = new AnyTextContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_anyText);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(272); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(271);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Punctuation) | (1L << Extra) | (1L << Minus) | (1L << CapitalWord) | (1L << Number) | (1L << MinusculeWord))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(274); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(284);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(276);
					wss();
					setState(278); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(277);
							_la = _input.LA(1);
							if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Punctuation) | (1L << Extra) | (1L << Minus) | (1L << CapitalWord) | (1L << Number) | (1L << MinusculeWord))) != 0)) ) {
							_errHandler.recoverInline(this);
							}
							else {
								if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(280); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					} 
				}
				setState(286);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\22\u0122\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\5\2\64\n\2\3\2\5\2\67\n\2\3\2\5\2:\n\2\3\2\5\2=\n\2\3\2\5\2@\n\2"+
		"\3\2\3\2\3\3\3\3\3\3\6\3G\n\3\r\3\16\3H\3\4\3\4\3\5\3\5\3\5\6\5P\n\5\r"+
		"\5\16\5Q\3\6\3\6\3\7\3\7\3\7\6\7Y\n\7\r\7\16\7Z\3\b\3\b\3\t\3\t\6\ta\n"+
		"\t\r\t\16\tb\3\t\5\tf\n\t\3\n\6\ni\n\n\r\n\16\nj\3\n\7\nn\n\n\f\n\16\n"+
		"q\13\n\6\ns\n\n\r\n\16\nt\3\13\3\13\3\f\3\f\3\r\5\r|\n\r\3\r\3\r\3\16"+
		"\3\16\6\16\u0082\n\16\r\16\16\16\u0083\3\16\5\16\u0087\n\16\3\17\6\17"+
		"\u008a\n\17\r\17\16\17\u008b\3\20\3\20\6\20\u0090\n\20\r\20\16\20\u0091"+
		"\3\20\3\20\6\20\u0096\n\20\r\20\16\20\u0097\7\20\u009a\n\20\f\20\16\20"+
		"\u009d\13\20\3\20\3\20\3\20\6\20\u00a2\n\20\r\20\16\20\u00a3\3\20\3\20"+
		"\3\20\3\20\5\20\u00aa\n\20\3\20\6\20\u00ad\n\20\r\20\16\20\u00ae\6\20"+
		"\u00b1\n\20\r\20\16\20\u00b2\6\20\u00b5\n\20\r\20\16\20\u00b6\6\20\u00b9"+
		"\n\20\r\20\16\20\u00ba\3\21\3\21\3\22\6\22\u00c0\n\22\r\22\16\22\u00c1"+
		"\3\22\3\22\6\22\u00c6\n\22\r\22\16\22\u00c7\7\22\u00ca\n\22\f\22\16\22"+
		"\u00cd\13\22\3\23\3\23\3\23\3\23\7\23\u00d3\n\23\f\23\16\23\u00d6\13\23"+
		"\3\24\3\24\3\25\3\25\3\26\3\26\5\26\u00de\n\26\3\26\6\26\u00e1\n\26\r"+
		"\26\16\26\u00e2\3\26\5\26\u00e6\n\26\3\26\5\26\u00e9\n\26\7\26\u00eb\n"+
		"\26\f\26\16\26\u00ee\13\26\3\26\3\26\5\26\u00f2\n\26\3\26\7\26\u00f5\n"+
		"\26\f\26\16\26\u00f8\13\26\3\26\5\26\u00fb\n\26\3\26\5\26\u00fe\n\26\6"+
		"\26\u0100\n\26\r\26\16\26\u0101\5\26\u0104\n\26\3\27\3\27\5\27\u0108\n"+
		"\27\3\27\3\27\5\27\u010c\n\27\3\27\3\27\3\30\3\30\3\31\6\31\u0113\n\31"+
		"\r\31\16\31\u0114\3\31\3\31\6\31\u0119\n\31\r\31\16\31\u011a\7\31\u011d"+
		"\n\31\f\31\16\31\u0120\13\31\3\31\2\2\32\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\2\4\5\2\t\t\f\r\20\21\5\2\t\t\f\r\20\22\2\u0137"+
		"\2\63\3\2\2\2\4C\3\2\2\2\6J\3\2\2\2\bL\3\2\2\2\nS\3\2\2\2\fU\3\2\2\2\16"+
		"\\\3\2\2\2\20^\3\2\2\2\22r\3\2\2\2\24v\3\2\2\2\26x\3\2\2\2\30{\3\2\2\2"+
		"\32\177\3\2\2\2\34\u0089\3\2\2\2\36\u008d\3\2\2\2 \u00bc\3\2\2\2\"\u00bf"+
		"\3\2\2\2$\u00ce\3\2\2\2&\u00d7\3\2\2\2(\u00d9\3\2\2\2*\u0103\3\2\2\2,"+
		"\u0105\3\2\2\2.\u010f\3\2\2\2\60\u0112\3\2\2\2\62\64\5\4\3\2\63\62\3\2"+
		"\2\2\63\64\3\2\2\2\64\66\3\2\2\2\65\67\5\b\5\2\66\65\3\2\2\2\66\67\3\2"+
		"\2\2\679\3\2\2\28:\5\f\7\298\3\2\2\29:\3\2\2\2:<\3\2\2\2;=\5\20\t\2<;"+
		"\3\2\2\2<=\3\2\2\2=?\3\2\2\2>@\5\32\16\2?>\3\2\2\2?@\3\2\2\2@A\3\2\2\2"+
		"AB\7\2\2\3B\3\3\2\2\2CD\5\26\f\2DF\5\6\4\2EG\5\30\r\2FE\3\2\2\2GH\3\2"+
		"\2\2HF\3\2\2\2HI\3\2\2\2I\5\3\2\2\2JK\5\"\22\2K\7\3\2\2\2LM\5\26\f\2M"+
		"O\5\n\6\2NP\5\30\r\2ON\3\2\2\2PQ\3\2\2\2QO\3\2\2\2QR\3\2\2\2R\t\3\2\2"+
		"\2ST\5\60\31\2T\13\3\2\2\2UV\5\26\f\2VX\5\16\b\2WY\5\30\r\2XW\3\2\2\2"+
		"YZ\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[\r\3\2\2\2\\]\5\60\31\2]\17\3\2\2\2^`\7"+
		"\16\2\2_a\5\30\r\2`_\3\2\2\2ab\3\2\2\2b`\3\2\2\2bc\3\2\2\2ce\3\2\2\2d"+
		"f\5\22\n\2ed\3\2\2\2ef\3\2\2\2f\21\3\2\2\2gi\5\24\13\2hg\3\2\2\2ij\3\2"+
		"\2\2jh\3\2\2\2jk\3\2\2\2ko\3\2\2\2ln\5\30\r\2ml\3\2\2\2nq\3\2\2\2om\3"+
		"\2\2\2op\3\2\2\2ps\3\2\2\2qo\3\2\2\2rh\3\2\2\2st\3\2\2\2tr\3\2\2\2tu\3"+
		"\2\2\2u\23\3\2\2\2vw\5\60\31\2w\25\3\2\2\2xy\7\5\2\2y\27\3\2\2\2z|\5\26"+
		"\f\2{z\3\2\2\2{|\3\2\2\2|}\3\2\2\2}~\7\6\2\2~\31\3\2\2\2\177\u0081\7\17"+
		"\2\2\u0080\u0082\5\30\r\2\u0081\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083"+
		"\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0086\3\2\2\2\u0085\u0087\5\34"+
		"\17\2\u0086\u0085\3\2\2\2\u0086\u0087\3\2\2\2\u0087\33\3\2\2\2\u0088\u008a"+
		"\5\36\20\2\u0089\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u0089\3\2\2\2"+
		"\u008b\u008c\3\2\2\2\u008c\35\3\2\2\2\u008d\u008f\5 \21\2\u008e\u0090"+
		"\5\30\r\2\u008f\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u008f\3\2\2\2"+
		"\u0091\u0092\3\2\2\2\u0092\u00b8\3\2\2\2\u0093\u0095\5(\25\2\u0094\u0096"+
		"\5\30\r\2\u0095\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0095\3\2\2\2"+
		"\u0097\u0098\3\2\2\2\u0098\u009a\3\2\2\2\u0099\u0093\3\2\2\2\u009a\u009d"+
		"\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u00b4\3\2\2\2\u009d"+
		"\u009b\3\2\2\2\u009e\u009f\5\26\f\2\u009f\u00a1\5$\23\2\u00a0\u00a2\5"+
		"\30\r\2\u00a1\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3"+
		"\u00a4\3\2\2\2\u00a4\u00b0\3\2\2\2\u00a5\u00a6\5\26\f\2\u00a6\u00a7\5"+
		"&\24\2\u00a7\u00aa\3\2\2\2\u00a8\u00aa\5(\25\2\u00a9\u00a5\3\2\2\2\u00a9"+
		"\u00a8\3\2\2\2\u00aa\u00ac\3\2\2\2\u00ab\u00ad\5\30\r\2\u00ac\u00ab\3"+
		"\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af"+
		"\u00b1\3\2\2\2\u00b0\u00a9\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b0\3\2"+
		"\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b5\3\2\2\2\u00b4\u009e\3\2\2\2\u00b5"+
		"\u00b6\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b9\3\2"+
		"\2\2\u00b8\u009b\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba"+
		"\u00bb\3\2\2\2\u00bb\37\3\2\2\2\u00bc\u00bd\5\"\22\2\u00bd!\3\2\2\2\u00be"+
		"\u00c0\t\2\2\2\u00bf\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00bf\3\2"+
		"\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00cb\3\2\2\2\u00c3\u00c5\5\26\f\2\u00c4"+
		"\u00c6\t\2\2\2\u00c5\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c5\3\2"+
		"\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00ca\3\2\2\2\u00c9\u00c3\3\2\2\2\u00ca"+
		"\u00cd\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc#\3\2\2\2"+
		"\u00cd\u00cb\3\2\2\2\u00ce\u00d4\7\20\2\2\u00cf\u00d0\5\26\f\2\u00d0\u00d1"+
		"\7\20\2\2\u00d1\u00d3\3\2\2\2\u00d2\u00cf\3\2\2\2\u00d3\u00d6\3\2\2\2"+
		"\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5%\3\2\2\2\u00d6\u00d4\3"+
		"\2\2\2\u00d7\u00d8\5*\26\2\u00d8\'\3\2\2\2\u00d9\u00da\5*\26\2\u00da)"+
		"\3\2\2\2\u00db\u00ec\5\60\31\2\u00dc\u00de\5\26\f\2\u00dd\u00dc\3\2\2"+
		"\2\u00dd\u00de\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e1\5,\27\2\u00e0\u00dd"+
		"\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3"+
		"\u00e8\3\2\2\2\u00e4\u00e6\5\26\f\2\u00e5\u00e4\3\2\2\2\u00e5\u00e6\3"+
		"\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e9\5\60\31\2\u00e8\u00e5\3\2\2\2\u00e8"+
		"\u00e9\3\2\2\2\u00e9\u00eb\3\2\2\2\u00ea\u00e0\3\2\2\2\u00eb\u00ee\3\2"+
		"\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u0104\3\2\2\2\u00ee"+
		"\u00ec\3\2\2\2\u00ef\u00f6\5,\27\2\u00f0\u00f2\5\26\f\2\u00f1\u00f0\3"+
		"\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f5\5,\27\2\u00f4"+
		"\u00f1\3\2\2\2\u00f5\u00f8\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2"+
		"\2\2\u00f7\u00fd\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f9\u00fb\5\26\f\2\u00fa"+
		"\u00f9\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fe\5\60"+
		"\31\2\u00fd\u00fa\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u0100\3\2\2\2\u00ff"+
		"\u00ef\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u00ff\3\2\2\2\u0101\u0102\3\2"+
		"\2\2\u0102\u0104\3\2\2\2\u0103\u00db\3\2\2\2\u0103\u00ff\3\2\2\2\u0104"+
		"+\3\2\2\2\u0105\u0107\7\n\2\2\u0106\u0108\5\26\f\2\u0107\u0106\3\2\2\2"+
		"\u0107\u0108\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010b\5\60\31\2\u010a\u010c"+
		"\5\26\f\2\u010b\u010a\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010d\3\2\2\2"+
		"\u010d\u010e\7\13\2\2\u010e-\3\2\2\2\u010f\u0110\7\20\2\2\u0110/\3\2\2"+
		"\2\u0111\u0113\t\3\2\2\u0112\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0112"+
		"\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u011e\3\2\2\2\u0116\u0118\5\26\f\2"+
		"\u0117\u0119\t\3\2\2\u0118\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u0118"+
		"\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011d\3\2\2\2\u011c\u0116\3\2\2\2\u011d"+
		"\u0120\3\2\2\2\u011e\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f\61\3\2\2"+
		"\2\u0120\u011e\3\2\2\2\60\63\669<?HQZbejot{\u0083\u0086\u008b\u0091\u0097"+
		"\u009b\u00a3\u00a9\u00ae\u00b2\u00b6\u00ba\u00c1\u00c7\u00cb\u00d4\u00dd"+
		"\u00e2\u00e5\u00e8\u00ec\u00f1\u00f6\u00fa\u00fd\u0101\u0103\u0107\u010b"+
		"\u0114\u011a\u011e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}