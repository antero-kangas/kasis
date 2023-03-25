// Generated from /Users/antero/Rojektit/kasis/grammar/ManuscriptParser.g4 by ANTLR 4.9.2
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
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

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
		RULE_synopsisTitle = 8, RULE_synopsisParagraphs = 9, RULE_synopsisParagraph = 10, 
		RULE_wss = 11, RULE_eol = 12, RULE_scenesPart = 13, RULE_scenesHeading = 14, 
		RULE_scenes = 15, RULE_scene = 16, RULE_sceneHeading = 17, RULE_heading = 18, 
		RULE_name = 19, RULE_replique = 20, RULE_parenthesis = 21, RULE_anyTextOrCommand = 22, 
		RULE_command = 23, RULE_capitalword = 24, RULE_anyText = 25;
	private static String[] makeRuleNames() {
		return new String[] {
			"manuscript", "titleParagraph", "title", "authorParagraph", "author", 
			"dateParagraph", "date", "synopsisPart", "synopsisTitle", "synopsisParagraphs", 
			"synopsisParagraph", "wss", "eol", "scenesPart", "scenesHeading", "scenes", 
			"scene", "sceneHeading", "heading", "name", "replique", "parenthesis", 
			"anyTextOrCommand", "command", "capitalword", "anyText"
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
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Punctuation) | (1L << Extra) | (1L << Minus) | (1L << CapitalWord) | (1L << Number))) != 0)) {
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
		public AnyTextContext anyText() {
			return getRuleContext(AnyTextContext.class,0);
		}
		public AuthorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_author; }
	}

	public final AuthorContext author() throws RecognitionException {
		AuthorContext _localctx = new AuthorContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_author);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
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
		public AnyTextContext anyText() {
			return getRuleContext(AnyTextContext.class,0);
		}
		public DateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date; }
	}

	public final DateContext date() throws RecognitionException {
		DateContext _localctx = new DateContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_date);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
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
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(102);
				synopsisParagraphs();
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

	public static class SynopsisTitleContext extends ParserRuleContext {
		public TerminalNode Synopsis() { return getToken(ManuscriptParser.Synopsis, 0); }
		public SynopsisTitleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_synopsisTitle; }
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
	}

	public final SynopsisParagraphsContext synopsisParagraphs() throws RecognitionException {
		SynopsisParagraphsContext _localctx = new SynopsisParagraphsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_synopsisParagraphs);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(118); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(108); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(107);
							synopsisParagraph();
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(110); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					setState(115);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WSS || _la==EOL) {
						{
						{
						setState(112);
						eol();
						}
						}
						setState(117);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(120); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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

	public static class SynopsisParagraphContext extends ParserRuleContext {
		public AnyTextContext anyText() {
			return getRuleContext(AnyTextContext.class,0);
		}
		public SynopsisParagraphContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_synopsisParagraph; }
	}

	public final SynopsisParagraphContext synopsisParagraph() throws RecognitionException {
		SynopsisParagraphContext _localctx = new SynopsisParagraphContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_synopsisParagraph);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
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
	}

	public final WssContext wss() throws RecognitionException {
		WssContext _localctx = new WssContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_wss);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
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
	}

	public final EolContext eol() throws RecognitionException {
		EolContext _localctx = new EolContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_eol);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WSS) {
				{
				setState(126);
				wss();
				}
			}

			setState(129);
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
		public SceneHeadingContext sceneHeading() {
			return getRuleContext(SceneHeadingContext.class,0);
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
	}

	public final ScenesPartContext scenesPart() throws RecognitionException {
		ScenesPartContext _localctx = new ScenesPartContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_scenesPart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			sceneHeading();
			setState(133); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(132);
				eol();
				}
				}
				setState(135); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WSS || _la==EOL );
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Punctuation) | (1L << Extra) | (1L << Minus) | (1L << CapitalWord) | (1L << Number))) != 0)) {
				{
				setState(137);
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
	}

	public final ScenesHeadingContext scenesHeading() throws RecognitionException {
		ScenesHeadingContext _localctx = new ScenesHeadingContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_scenesHeading);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
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
	}

	public final ScenesContext scenes() throws RecognitionException {
		ScenesContext _localctx = new ScenesContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_scenes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(142);
				scene();
				}
				}
				setState(145); 
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
	}

	public final SceneContext scene() throws RecognitionException {
		SceneContext _localctx = new SceneContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_scene);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			sceneHeading();
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
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(190); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(161);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Punctuation) | (1L << LeftParenthesis) | (1L << Extra) | (1L << Minus) | (1L << CapitalWord) | (1L << Number) | (1L << MinusculeWord))) != 0)) {
						{
						{
						setState(153);
						parenthesis();
						setState(155); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(154);
								eol();
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(157); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						}
						setState(163);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(186); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(164);
							wss();
							setState(165);
							name();
							setState(167); 
							_errHandler.sync(this);
							_alt = 1;
							do {
								switch (_alt) {
								case 1:
									{
									{
									setState(166);
									eol();
									}
									}
									break;
								default:
									throw new NoViableAltException(this);
								}
								setState(169); 
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
							} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
							setState(182); 
							_errHandler.sync(this);
							_alt = 1;
							do {
								switch (_alt) {
								case 1:
									{
									{
									setState(175);
									_errHandler.sync(this);
									switch (_input.LA(1)) {
									case WSS:
										{
										{
										setState(171);
										wss();
										setState(172);
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
										setState(174);
										parenthesis();
										}
										break;
									default:
										throw new NoViableAltException(this);
									}
									setState(178); 
									_errHandler.sync(this);
									_alt = 1;
									do {
										switch (_alt) {
										case 1:
											{
											{
											setState(177);
											eol();
											}
											}
											break;
										default:
											throw new NoViableAltException(this);
										}
										setState(180); 
										_errHandler.sync(this);
										_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
									} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
									}
									}
									break;
								default:
									throw new NoViableAltException(this);
								}
								setState(184); 
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
							} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(188); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(192); 
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
	}

	public final SceneHeadingContext sceneHeading() throws RecognitionException {
		SceneHeadingContext _localctx = new SceneHeadingContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_sceneHeading);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
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
	}

	public final HeadingContext heading() throws RecognitionException {
		HeadingContext _localctx = new HeadingContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_heading);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(197); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(196);
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
				setState(199); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Punctuation) | (1L << Extra) | (1L << Minus) | (1L << CapitalWord) | (1L << Number))) != 0) );
			setState(209);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(201);
					wss();
					setState(203); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(202);
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
						setState(205); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Punctuation) | (1L << Extra) | (1L << Minus) | (1L << CapitalWord) | (1L << Number))) != 0) );
					}
					} 
				}
				setState(211);
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
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_name);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(CapitalWord);
			setState(218);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(213);
					wss();
					setState(214);
					match(CapitalWord);
					}
					} 
				}
				setState(220);
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
	}

	public final RepliqueContext replique() throws RecognitionException {
		RepliqueContext _localctx = new RepliqueContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_replique);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
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
	}

	public final ParenthesisContext parenthesis() throws RecognitionException {
		ParenthesisContext _localctx = new ParenthesisContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_parenthesis);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
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
	}

	public final AnyTextOrCommandContext anyTextOrCommand() throws RecognitionException {
		AnyTextOrCommandContext _localctx = new AnyTextOrCommandContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_anyTextOrCommand);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Punctuation:
			case Extra:
			case Minus:
			case CapitalWord:
			case Number:
			case MinusculeWord:
				{
				setState(225);
				anyText();
				setState(242);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(230); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
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
								command();
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(232); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						setState(238);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
						case 1:
							{
							setState(235);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==WSS) {
								{
								setState(234);
								wss();
								}
							}

							setState(237);
							anyText();
							}
							break;
						}
						}
						} 
					}
					setState(244);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				}
				}
				break;
			case LeftParenthesis:
				{
				setState(261); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(245);
					command();
					setState(252);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(247);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==WSS) {
								{
								setState(246);
								wss();
								}
							}

							setState(249);
							command();
							}
							} 
						}
						setState(254);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
					}
					setState(259);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
					case 1:
						{
						setState(256);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WSS) {
							{
							setState(255);
							wss();
							}
						}

						setState(258);
						anyText();
						}
						break;
					}
					}
					}
					setState(263); 
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
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_command);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(LeftParenthesis);
			setState(269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WSS) {
				{
				setState(268);
				wss();
				}
			}

			setState(271);
			anyText();
			setState(273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WSS) {
				{
				setState(272);
				wss();
				}
			}

			setState(275);
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
	}

	public final CapitalwordContext capitalword() throws RecognitionException {
		CapitalwordContext _localctx = new CapitalwordContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_capitalword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
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
	}

	public final AnyTextContext anyText() throws RecognitionException {
		AnyTextContext _localctx = new AnyTextContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_anyText);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(280); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(279);
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
				setState(282); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(292);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(284);
					wss();
					setState(286); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(285);
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
						setState(288); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					} 
				}
				setState(294);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\22\u012a\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\5\28\n\2\3\2\5\2;\n\2\3\2\5\2>\n\2\3\2\5\2A\n"+
		"\2\3\2\5\2D\n\2\3\2\3\2\3\3\3\3\3\3\6\3K\n\3\r\3\16\3L\3\4\3\4\3\5\3\5"+
		"\3\5\6\5T\n\5\r\5\16\5U\3\6\3\6\3\7\3\7\3\7\6\7]\n\7\r\7\16\7^\3\b\3\b"+
		"\3\t\3\t\6\te\n\t\r\t\16\tf\3\t\5\tj\n\t\3\n\3\n\3\13\6\13o\n\13\r\13"+
		"\16\13p\3\13\7\13t\n\13\f\13\16\13w\13\13\6\13y\n\13\r\13\16\13z\3\f\3"+
		"\f\3\r\3\r\3\16\5\16\u0082\n\16\3\16\3\16\3\17\3\17\6\17\u0088\n\17\r"+
		"\17\16\17\u0089\3\17\5\17\u008d\n\17\3\20\3\20\3\21\6\21\u0092\n\21\r"+
		"\21\16\21\u0093\3\22\3\22\6\22\u0098\n\22\r\22\16\22\u0099\3\22\3\22\6"+
		"\22\u009e\n\22\r\22\16\22\u009f\7\22\u00a2\n\22\f\22\16\22\u00a5\13\22"+
		"\3\22\3\22\3\22\6\22\u00aa\n\22\r\22\16\22\u00ab\3\22\3\22\3\22\3\22\5"+
		"\22\u00b2\n\22\3\22\6\22\u00b5\n\22\r\22\16\22\u00b6\6\22\u00b9\n\22\r"+
		"\22\16\22\u00ba\6\22\u00bd\n\22\r\22\16\22\u00be\6\22\u00c1\n\22\r\22"+
		"\16\22\u00c2\3\23\3\23\3\24\6\24\u00c8\n\24\r\24\16\24\u00c9\3\24\3\24"+
		"\6\24\u00ce\n\24\r\24\16\24\u00cf\7\24\u00d2\n\24\f\24\16\24\u00d5\13"+
		"\24\3\25\3\25\3\25\3\25\7\25\u00db\n\25\f\25\16\25\u00de\13\25\3\26\3"+
		"\26\3\27\3\27\3\30\3\30\5\30\u00e6\n\30\3\30\6\30\u00e9\n\30\r\30\16\30"+
		"\u00ea\3\30\5\30\u00ee\n\30\3\30\5\30\u00f1\n\30\7\30\u00f3\n\30\f\30"+
		"\16\30\u00f6\13\30\3\30\3\30\5\30\u00fa\n\30\3\30\7\30\u00fd\n\30\f\30"+
		"\16\30\u0100\13\30\3\30\5\30\u0103\n\30\3\30\5\30\u0106\n\30\6\30\u0108"+
		"\n\30\r\30\16\30\u0109\5\30\u010c\n\30\3\31\3\31\5\31\u0110\n\31\3\31"+
		"\3\31\5\31\u0114\n\31\3\31\3\31\3\32\3\32\3\33\6\33\u011b\n\33\r\33\16"+
		"\33\u011c\3\33\3\33\6\33\u0121\n\33\r\33\16\33\u0122\7\33\u0125\n\33\f"+
		"\33\16\33\u0128\13\33\3\33\2\2\34\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\2\4\5\2\t\t\f\r\20\21\5\2\t\t\f\r\20\22\2\u013d"+
		"\2\67\3\2\2\2\4G\3\2\2\2\6N\3\2\2\2\bP\3\2\2\2\nW\3\2\2\2\fY\3\2\2\2\16"+
		"`\3\2\2\2\20b\3\2\2\2\22k\3\2\2\2\24x\3\2\2\2\26|\3\2\2\2\30~\3\2\2\2"+
		"\32\u0081\3\2\2\2\34\u0085\3\2\2\2\36\u008e\3\2\2\2 \u0091\3\2\2\2\"\u0095"+
		"\3\2\2\2$\u00c4\3\2\2\2&\u00c7\3\2\2\2(\u00d6\3\2\2\2*\u00df\3\2\2\2,"+
		"\u00e1\3\2\2\2.\u010b\3\2\2\2\60\u010d\3\2\2\2\62\u0117\3\2\2\2\64\u011a"+
		"\3\2\2\2\668\5\4\3\2\67\66\3\2\2\2\678\3\2\2\28:\3\2\2\29;\5\b\5\2:9\3"+
		"\2\2\2:;\3\2\2\2;=\3\2\2\2<>\5\f\7\2=<\3\2\2\2=>\3\2\2\2>@\3\2\2\2?A\5"+
		"\20\t\2@?\3\2\2\2@A\3\2\2\2AC\3\2\2\2BD\5\34\17\2CB\3\2\2\2CD\3\2\2\2"+
		"DE\3\2\2\2EF\7\2\2\3F\3\3\2\2\2GH\5\30\r\2HJ\5\6\4\2IK\5\32\16\2JI\3\2"+
		"\2\2KL\3\2\2\2LJ\3\2\2\2LM\3\2\2\2M\5\3\2\2\2NO\5&\24\2O\7\3\2\2\2PQ\5"+
		"\30\r\2QS\5\n\6\2RT\5\32\16\2SR\3\2\2\2TU\3\2\2\2US\3\2\2\2UV\3\2\2\2"+
		"V\t\3\2\2\2WX\5\64\33\2X\13\3\2\2\2YZ\5\30\r\2Z\\\5\16\b\2[]\5\32\16\2"+
		"\\[\3\2\2\2]^\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_\r\3\2\2\2`a\5\64\33\2a\17"+
		"\3\2\2\2bd\5\22\n\2ce\5\32\16\2dc\3\2\2\2ef\3\2\2\2fd\3\2\2\2fg\3\2\2"+
		"\2gi\3\2\2\2hj\5\24\13\2ih\3\2\2\2ij\3\2\2\2j\21\3\2\2\2kl\7\16\2\2l\23"+
		"\3\2\2\2mo\5\26\f\2nm\3\2\2\2op\3\2\2\2pn\3\2\2\2pq\3\2\2\2qu\3\2\2\2"+
		"rt\5\32\16\2sr\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2vy\3\2\2\2wu\3\2\2"+
		"\2xn\3\2\2\2yz\3\2\2\2zx\3\2\2\2z{\3\2\2\2{\25\3\2\2\2|}\5\64\33\2}\27"+
		"\3\2\2\2~\177\7\5\2\2\177\31\3\2\2\2\u0080\u0082\5\30\r\2\u0081\u0080"+
		"\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084\7\6\2\2\u0084"+
		"\33\3\2\2\2\u0085\u0087\5$\23\2\u0086\u0088\5\32\16\2\u0087\u0086\3\2"+
		"\2\2\u0088\u0089\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a"+
		"\u008c\3\2\2\2\u008b\u008d\5 \21\2\u008c\u008b\3\2\2\2\u008c\u008d\3\2"+
		"\2\2\u008d\35\3\2\2\2\u008e\u008f\7\17\2\2\u008f\37\3\2\2\2\u0090\u0092"+
		"\5\"\22\2\u0091\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0091\3\2\2\2"+
		"\u0093\u0094\3\2\2\2\u0094!\3\2\2\2\u0095\u0097\5$\23\2\u0096\u0098\5"+
		"\32\16\2\u0097\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u0097\3\2\2\2\u0099"+
		"\u009a\3\2\2\2\u009a\u00c0\3\2\2\2\u009b\u009d\5,\27\2\u009c\u009e\5\32"+
		"\16\2\u009d\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u009d\3\2\2\2\u009f"+
		"\u00a0\3\2\2\2\u00a0\u00a2\3\2\2\2\u00a1\u009b\3\2\2\2\u00a2\u00a5\3\2"+
		"\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00bc\3\2\2\2\u00a5"+
		"\u00a3\3\2\2\2\u00a6\u00a7\5\30\r\2\u00a7\u00a9\5(\25\2\u00a8\u00aa\5"+
		"\32\16\2\u00a9\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab"+
		"\u00ac\3\2\2\2\u00ac\u00b8\3\2\2\2\u00ad\u00ae\5\30\r\2\u00ae\u00af\5"+
		"*\26\2\u00af\u00b2\3\2\2\2\u00b0\u00b2\5,\27\2\u00b1\u00ad\3\2\2\2\u00b1"+
		"\u00b0\3\2\2\2\u00b2\u00b4\3\2\2\2\u00b3\u00b5\5\32\16\2\u00b4\u00b3\3"+
		"\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7"+
		"\u00b9\3\2\2\2\u00b8\u00b1\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00b8\3\2"+
		"\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bd\3\2\2\2\u00bc\u00a6\3\2\2\2\u00bd"+
		"\u00be\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c1\3\2"+
		"\2\2\u00c0\u00a3\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2"+
		"\u00c3\3\2\2\2\u00c3#\3\2\2\2\u00c4\u00c5\5&\24\2\u00c5%\3\2\2\2\u00c6"+
		"\u00c8\t\2\2\2\u00c7\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00c7\3\2"+
		"\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00d3\3\2\2\2\u00cb\u00cd\5\30\r\2\u00cc"+
		"\u00ce\t\2\2\2\u00cd\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00cd\3\2"+
		"\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d2\3\2\2\2\u00d1\u00cb\3\2\2\2\u00d2"+
		"\u00d5\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\'\3\2\2\2"+
		"\u00d5\u00d3\3\2\2\2\u00d6\u00dc\7\20\2\2\u00d7\u00d8\5\30\r\2\u00d8\u00d9"+
		"\7\20\2\2\u00d9\u00db\3\2\2\2\u00da\u00d7\3\2\2\2\u00db\u00de\3\2\2\2"+
		"\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd)\3\2\2\2\u00de\u00dc\3"+
		"\2\2\2\u00df\u00e0\5.\30\2\u00e0+\3\2\2\2\u00e1\u00e2\5.\30\2\u00e2-\3"+
		"\2\2\2\u00e3\u00f4\5\64\33\2\u00e4\u00e6\5\30\r\2\u00e5\u00e4\3\2\2\2"+
		"\u00e5\u00e6\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e9\5\60\31\2\u00e8\u00e5"+
		"\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb"+
		"\u00f0\3\2\2\2\u00ec\u00ee\5\30\r\2\u00ed\u00ec\3\2\2\2\u00ed\u00ee\3"+
		"\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f1\5\64\33\2\u00f0\u00ed\3\2\2\2\u00f0"+
		"\u00f1\3\2\2\2\u00f1\u00f3\3\2\2\2\u00f2\u00e8\3\2\2\2\u00f3\u00f6\3\2"+
		"\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u010c\3\2\2\2\u00f6"+
		"\u00f4\3\2\2\2\u00f7\u00fe\5\60\31\2\u00f8\u00fa\5\30\r\2\u00f9\u00f8"+
		"\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fd\5\60\31\2"+
		"\u00fc\u00f9\3\2\2\2\u00fd\u0100\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff"+
		"\3\2\2\2\u00ff\u0105\3\2\2\2\u0100\u00fe\3\2\2\2\u0101\u0103\5\30\r\2"+
		"\u0102\u0101\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0106"+
		"\5\64\33\2\u0105\u0102\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0108\3\2\2\2"+
		"\u0107\u00f7\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u010a"+
		"\3\2\2\2\u010a\u010c\3\2\2\2\u010b\u00e3\3\2\2\2\u010b\u0107\3\2\2\2\u010c"+
		"/\3\2\2\2\u010d\u010f\7\n\2\2\u010e\u0110\5\30\r\2\u010f\u010e\3\2\2\2"+
		"\u010f\u0110\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0113\5\64\33\2\u0112\u0114"+
		"\5\30\r\2\u0113\u0112\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0115\3\2\2\2"+
		"\u0115\u0116\7\13\2\2\u0116\61\3\2\2\2\u0117\u0118\7\20\2\2\u0118\63\3"+
		"\2\2\2\u0119\u011b\t\3\2\2\u011a\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c"+
		"\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u0126\3\2\2\2\u011e\u0120\5\30"+
		"\r\2\u011f\u0121\t\3\2\2\u0120\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122"+
		"\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0125\3\2\2\2\u0124\u011e\3\2"+
		"\2\2\u0125\u0128\3\2\2\2\u0126\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127"+
		"\65\3\2\2\2\u0128\u0126\3\2\2\2\60\67:=@CLU^fipuz\u0081\u0089\u008c\u0093"+
		"\u0099\u009f\u00a3\u00ab\u00b1\u00b6\u00ba\u00be\u00c2\u00c9\u00cf\u00d3"+
		"\u00dc\u00e5\u00ea\u00ed\u00f0\u00f4\u00f9\u00fe\u0102\u0105\u0109\u010b"+
		"\u010f\u0113\u011c\u0122\u0126";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}