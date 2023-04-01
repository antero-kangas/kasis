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

	public static class AuthorsContext extends ParserRuleContext {
		public NonCapitalTextContext nonCapitalText() {
			return getRuleContext(NonCapitalTextContext.class,0);
		}
		public AuthorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_authors; }
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

	public static class DateContext extends ParserRuleContext {
		public NonCapitalTextContext nonCapitalText() {
			return getRuleContext(NonCapitalTextContext.class,0);
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
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Punctuation) | (1L << Extra) | (1L << CapitalWord) | (1L << MinusculeWord) | (1L << Number))) != 0)) {
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

	public static class EffectsTitleContext extends ParserRuleContext {
		public TerminalNode Effects() { return getToken(ManuscriptParser.Effects, 0); }
		public EffectsTitleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_effectsTitle; }
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
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Punctuation) | (1L << Extra) | (1L << CapitalWord) | (1L << Number))) != 0)) {
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

	public static class ScenesHeadingContext extends ParserRuleContext {
		public TerminalNode Scene() { return getToken(ManuscriptParser.Scene, 0); }
		public ScenesHeadingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scenesHeading; }
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
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Punctuation) | (1L << LeftParenthesis) | (1L << Extra) | (1L << CapitalWord) | (1L << MinusculeWord) | (1L << Number))) != 0)) {
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
				setState(239); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Punctuation) | (1L << Extra) | (1L << CapitalWord) | (1L << Number))) != 0) );
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
						setState(245); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Punctuation) | (1L << Extra) | (1L << CapitalWord) | (1L << Number))) != 0) );
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

	public static class RepliqueContext extends ParserRuleContext {
		public NonCapitalTextOrCommandContext nonCapitalTextOrCommand() {
			return getRuleContext(NonCapitalTextOrCommandContext.class,0);
		}
		public RepliqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_replique; }
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

	public static class ParenthesisContext extends ParserRuleContext {
		public NonCapitalTextOrCommandContext nonCapitalTextOrCommand() {
			return getRuleContext(NonCapitalTextOrCommandContext.class,0);
		}
		public ParenthesisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parenthesis; }
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

	public static class CapitalWordContext extends ParserRuleContext {
		public TerminalNode CapitalWord() { return getToken(ManuscriptParser.CapitalWord, 0); }
		public CapitalWordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_capitalWord; }
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
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WSS) | (1L << Punctuation) | (1L << Extra) | (1L << CapitalWord) | (1L << MinusculeWord) | (1L << Number))) != 0) );
			}
		}
		catch (RecognitionException re) {
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
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Punctuation) | (1L << Extra) | (1L << MinusculeWord) | (1L << Number))) != 0)) ) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\20\u016b\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\5\2B\n\2\3\2\5\2E\n\2\3\2\5\2H\n\2\3\2\5\2K\n\2\3\2\5\2N\n\2\3\2\5\2"+
		"Q\n\2\3\2\3\2\3\3\3\3\3\3\6\3X\n\3\r\3\16\3Y\6\3\\\n\3\r\3\16\3]\3\4\3"+
		"\4\3\5\3\5\3\5\6\5e\n\5\r\5\16\5f\6\5i\n\5\r\5\16\5j\3\6\3\6\3\7\3\7\3"+
		"\7\6\7r\n\7\r\7\16\7s\3\b\3\b\3\t\3\t\6\tz\n\t\r\t\16\t{\3\t\5\t\177\n"+
		"\t\3\n\3\n\3\13\3\13\6\13\u0085\n\13\r\13\16\13\u0086\6\13\u0089\n\13"+
		"\r\13\16\13\u008a\3\f\3\f\3\r\3\r\3\16\5\16\u0092\n\16\3\16\3\16\3\17"+
		"\3\17\6\17\u0098\n\17\r\17\16\17\u0099\3\17\5\17\u009d\n\17\3\20\3\20"+
		"\3\21\5\21\u00a2\n\21\3\21\3\21\6\21\u00a6\n\21\r\21\16\21\u00a7\6\21"+
		"\u00aa\n\21\r\21\16\21\u00ab\3\22\3\22\6\22\u00b0\n\22\r\22\16\22\u00b1"+
		"\3\22\5\22\u00b5\n\22\3\23\3\23\3\24\6\24\u00ba\n\24\r\24\16\24\u00bb"+
		"\3\25\3\25\6\25\u00c0\n\25\r\25\16\25\u00c1\3\25\3\25\6\25\u00c6\n\25"+
		"\r\25\16\25\u00c7\7\25\u00ca\n\25\f\25\16\25\u00cd\13\25\3\25\3\25\3\25"+
		"\6\25\u00d2\n\25\r\25\16\25\u00d3\3\25\3\25\3\25\3\25\5\25\u00da\n\25"+
		"\3\25\6\25\u00dd\n\25\r\25\16\25\u00de\6\25\u00e1\n\25\r\25\16\25\u00e2"+
		"\6\25\u00e5\n\25\r\25\16\25\u00e6\6\25\u00e9\n\25\r\25\16\25\u00ea\3\26"+
		"\3\26\3\27\6\27\u00f0\n\27\r\27\16\27\u00f1\3\27\3\27\6\27\u00f6\n\27"+
		"\r\27\16\27\u00f7\7\27\u00fa\n\27\f\27\16\27\u00fd\13\27\3\30\3\30\3\30"+
		"\3\30\7\30\u0103\n\30\f\30\16\30\u0106\13\30\3\31\3\31\3\32\3\32\3\33"+
		"\3\33\5\33\u010e\n\33\3\33\6\33\u0111\n\33\r\33\16\33\u0112\3\33\5\33"+
		"\u0116\n\33\3\33\5\33\u0119\n\33\7\33\u011b\n\33\f\33\16\33\u011e\13\33"+
		"\3\33\3\33\5\33\u0122\n\33\3\33\7\33\u0125\n\33\f\33\16\33\u0128\13\33"+
		"\3\33\5\33\u012b\n\33\3\33\5\33\u012e\n\33\6\33\u0130\n\33\r\33\16\33"+
		"\u0131\5\33\u0134\n\33\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\6"+
		"\36\u013f\n\36\r\36\16\36\u0140\3\37\7\37\u0144\n\37\f\37\16\37\u0147"+
		"\13\37\3\37\3\37\7\37\u014b\n\37\f\37\16\37\u014e\13\37\3 \3 \3 \3 \5"+
		" \u0154\n \7 \u0156\n \f \16 \u0159\13 \3 \3 \3 \3 \3 \3 \3 \5 \u0162"+
		"\n \7 \u0164\n \f \16 \u0167\13 \5 \u0169\n \3 \2\2!\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>\2\5\6\2\7\7\n\n\16\16\20"+
		"\20\5\2\7\7\n\n\17\20\5\2\7\7\n\n\16\20\2\u0185\2A\3\2\2\2\4T\3\2\2\2"+
		"\6_\3\2\2\2\ba\3\2\2\2\nl\3\2\2\2\fn\3\2\2\2\16u\3\2\2\2\20w\3\2\2\2\22"+
		"\u0080\3\2\2\2\24\u0088\3\2\2\2\26\u008c\3\2\2\2\30\u008e\3\2\2\2\32\u0091"+
		"\3\2\2\2\34\u0095\3\2\2\2\36\u009e\3\2\2\2 \u00a9\3\2\2\2\"\u00ad\3\2"+
		"\2\2$\u00b6\3\2\2\2&\u00b9\3\2\2\2(\u00bd\3\2\2\2*\u00ec\3\2\2\2,\u00ef"+
		"\3\2\2\2.\u00fe\3\2\2\2\60\u0107\3\2\2\2\62\u0109\3\2\2\2\64\u0133\3\2"+
		"\2\2\66\u0135\3\2\2\28\u0137\3\2\2\2:\u013e\3\2\2\2<\u0145\3\2\2\2>\u0168"+
		"\3\2\2\2@B\5\4\3\2A@\3\2\2\2AB\3\2\2\2BD\3\2\2\2CE\5\b\5\2DC\3\2\2\2D"+
		"E\3\2\2\2EG\3\2\2\2FH\5\f\7\2GF\3\2\2\2GH\3\2\2\2HJ\3\2\2\2IK\5\20\t\2"+
		"JI\3\2\2\2JK\3\2\2\2KM\3\2\2\2LN\5\34\17\2ML\3\2\2\2MN\3\2\2\2NP\3\2\2"+
		"\2OQ\5\"\22\2PO\3\2\2\2PQ\3\2\2\2QR\3\2\2\2RS\7\2\2\3S\3\3\2\2\2T[\5\30"+
		"\r\2UW\5\6\4\2VX\5\32\16\2WV\3\2\2\2XY\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\\"+
		"\3\2\2\2[U\3\2\2\2\\]\3\2\2\2][\3\2\2\2]^\3\2\2\2^\5\3\2\2\2_`\5,\27\2"+
		"`\7\3\2\2\2ah\5\30\r\2bd\5\n\6\2ce\5\32\16\2dc\3\2\2\2ef\3\2\2\2fd\3\2"+
		"\2\2fg\3\2\2\2gi\3\2\2\2hb\3\2\2\2ij\3\2\2\2jh\3\2\2\2jk\3\2\2\2k\t\3"+
		"\2\2\2lm\5> \2m\13\3\2\2\2no\5\30\r\2oq\5\16\b\2pr\5\32\16\2qp\3\2\2\2"+
		"rs\3\2\2\2sq\3\2\2\2st\3\2\2\2t\r\3\2\2\2uv\5> \2v\17\3\2\2\2wy\5\22\n"+
		"\2xz\5\32\16\2yx\3\2\2\2z{\3\2\2\2{y\3\2\2\2{|\3\2\2\2|~\3\2\2\2}\177"+
		"\5\24\13\2~}\3\2\2\2~\177\3\2\2\2\177\21\3\2\2\2\u0080\u0081\7\13\2\2"+
		"\u0081\23\3\2\2\2\u0082\u0084\5\26\f\2\u0083\u0085\5\32\16\2\u0084\u0083"+
		"\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087"+
		"\u0089\3\2\2\2\u0088\u0082\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u0088\3\2"+
		"\2\2\u008a\u008b\3\2\2\2\u008b\25\3\2\2\2\u008c\u008d\5> \2\u008d\27\3"+
		"\2\2\2\u008e\u008f\7\5\2\2\u008f\31\3\2\2\2\u0090\u0092\5\30\r\2\u0091"+
		"\u0090\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0094\7\6"+
		"\2\2\u0094\33\3\2\2\2\u0095\u0097\5\36\20\2\u0096\u0098\5\32\16\2\u0097"+
		"\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2"+
		"\2\2\u009a\u009c\3\2\2\2\u009b\u009d\5 \21\2\u009c\u009b\3\2\2\2\u009c"+
		"\u009d\3\2\2\2\u009d\35\3\2\2\2\u009e\u009f\7\r\2\2\u009f\37\3\2\2\2\u00a0"+
		"\u00a2\5\30\r\2\u00a1\u00a0\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\3"+
		"\2\2\2\u00a3\u00a5\58\35\2\u00a4\u00a6\5\32\16\2\u00a5\u00a4\3\2\2\2\u00a6"+
		"\u00a7\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00aa\3\2"+
		"\2\2\u00a9\u00a1\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab"+
		"\u00ac\3\2\2\2\u00ac!\3\2\2\2\u00ad\u00af\5$\23\2\u00ae\u00b0\5\32\16"+
		"\2\u00af\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2"+
		"\3\2\2\2\u00b2\u00b4\3\2\2\2\u00b3\u00b5\5&\24\2\u00b4\u00b3\3\2\2\2\u00b4"+
		"\u00b5\3\2\2\2\u00b5#\3\2\2\2\u00b6\u00b7\7\f\2\2\u00b7%\3\2\2\2\u00b8"+
		"\u00ba\5(\25\2\u00b9\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00b9\3\2"+
		"\2\2\u00bb\u00bc\3\2\2\2\u00bc\'\3\2\2\2\u00bd\u00bf\5*\26\2\u00be\u00c0"+
		"\5\32\16\2\u00bf\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00bf\3\2\2\2"+
		"\u00c1\u00c2\3\2\2\2\u00c2\u00e8\3\2\2\2\u00c3\u00c5\5\62\32\2\u00c4\u00c6"+
		"\5\32\16\2\u00c5\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c5\3\2\2\2"+
		"\u00c7\u00c8\3\2\2\2\u00c8\u00ca\3\2\2\2\u00c9\u00c3\3\2\2\2\u00ca\u00cd"+
		"\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00e4\3\2\2\2\u00cd"+
		"\u00cb\3\2\2\2\u00ce\u00cf\5\30\r\2\u00cf\u00d1\5.\30\2\u00d0\u00d2\5"+
		"\32\16\2\u00d1\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3"+
		"\u00d4\3\2\2\2\u00d4\u00e0\3\2\2\2\u00d5\u00d6\5\30\r\2\u00d6\u00d7\5"+
		"\60\31\2\u00d7\u00da\3\2\2\2\u00d8\u00da\5\62\32\2\u00d9\u00d5\3\2\2\2"+
		"\u00d9\u00d8\3\2\2\2\u00da\u00dc\3\2\2\2\u00db\u00dd\5\32\16\2\u00dc\u00db"+
		"\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df"+
		"\u00e1\3\2\2\2\u00e0\u00d9\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e0\3\2"+
		"\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e5\3\2\2\2\u00e4\u00ce\3\2\2\2\u00e5"+
		"\u00e6\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e9\3\2"+
		"\2\2\u00e8\u00cb\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea"+
		"\u00eb\3\2\2\2\u00eb)\3\2\2\2\u00ec\u00ed\5,\27\2\u00ed+\3\2\2\2\u00ee"+
		"\u00f0\t\2\2\2\u00ef\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00ef\3\2"+
		"\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00fb\3\2\2\2\u00f3\u00f5\5\30\r\2\u00f4"+
		"\u00f6\t\2\2\2\u00f5\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f5\3\2"+
		"\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00fa\3\2\2\2\u00f9\u00f3\3\2\2\2\u00fa"+
		"\u00fd\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc-\3\2\2\2"+
		"\u00fd\u00fb\3\2\2\2\u00fe\u0104\7\16\2\2\u00ff\u0100\5\30\r\2\u0100\u0101"+
		"\7\16\2\2\u0101\u0103\3\2\2\2\u0102\u00ff\3\2\2\2\u0103\u0106\3\2\2\2"+
		"\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105/\3\2\2\2\u0106\u0104\3"+
		"\2\2\2\u0107\u0108\5\64\33\2\u0108\61\3\2\2\2\u0109\u010a\5\64\33\2\u010a"+
		"\63\3\2\2\2\u010b\u011c\5> \2\u010c\u010e\5\30\r\2\u010d\u010c\3\2\2\2"+
		"\u010d\u010e\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0111\58\35\2\u0110\u010d"+
		"\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113"+
		"\u0118\3\2\2\2\u0114\u0116\5\30\r\2\u0115\u0114\3\2\2\2\u0115\u0116\3"+
		"\2\2\2\u0116\u0117\3\2\2\2\u0117\u0119\5> \2\u0118\u0115\3\2\2\2\u0118"+
		"\u0119\3\2\2\2\u0119\u011b\3\2\2\2\u011a\u0110\3\2\2\2\u011b\u011e\3\2"+
		"\2\2\u011c\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u0134\3\2\2\2\u011e"+
		"\u011c\3\2\2\2\u011f\u0126\58\35\2\u0120\u0122\5\30\r\2\u0121\u0120\3"+
		"\2\2\2\u0121\u0122\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0125\58\35\2\u0124"+
		"\u0121\3\2\2\2\u0125\u0128\3\2\2\2\u0126\u0124\3\2\2\2\u0126\u0127\3\2"+
		"\2\2\u0127\u012d\3\2\2\2\u0128\u0126\3\2\2\2\u0129\u012b\5\30\r\2\u012a"+
		"\u0129\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012e\5>"+
		" \2\u012d\u012a\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u0130\3\2\2\2\u012f"+
		"\u011f\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u012f\3\2\2\2\u0131\u0132\3\2"+
		"\2\2\u0132\u0134\3\2\2\2\u0133\u010b\3\2\2\2\u0133\u012f\3\2\2\2\u0134"+
		"\65\3\2\2\2\u0135\u0136\7\16\2\2\u0136\67\3\2\2\2\u0137\u0138\7\b\2\2"+
		"\u0138\u0139\5:\36\2\u0139\u013a\7\t\2\2\u013a9\3\2\2\2\u013b\u013f\5"+
		"\30\r\2\u013c\u013f\5> \2\u013d\u013f\5\66\34\2\u013e\u013b\3\2\2\2\u013e"+
		"\u013c\3\2\2\2\u013e\u013d\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u013e\3\2"+
		"\2\2\u0140\u0141\3\2\2\2\u0141;\3\2\2\2\u0142\u0144\7\16\2\2\u0143\u0142"+
		"\3\2\2\2\u0144\u0147\3\2\2\2\u0145\u0143\3\2\2\2\u0145\u0146\3\2\2\2\u0146"+
		"\u0148\3\2\2\2\u0147\u0145\3\2\2\2\u0148\u014c\t\3\2\2\u0149\u014b\t\4"+
		"\2\2\u014a\u0149\3\2\2\2\u014b\u014e\3\2\2\2\u014c\u014a\3\2\2\2\u014c"+
		"\u014d\3\2\2\2\u014d=\3\2\2\2\u014e\u014c\3\2\2\2\u014f\u0157\7\16\2\2"+
		"\u0150\u0153\5\30\r\2\u0151\u0154\7\16\2\2\u0152\u0154\5<\37\2\u0153\u0151"+
		"\3\2\2\2\u0153\u0152\3\2\2\2\u0154\u0156\3\2\2\2\u0155\u0150\3\2\2\2\u0156"+
		"\u0159\3\2\2\2\u0157\u0155\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u015a\3\2"+
		"\2\2\u0159\u0157\3\2\2\2\u015a\u015b\5\30\r\2\u015b\u015c\5<\37\2\u015c"+
		"\u0169\3\2\2\2\u015d\u0165\5<\37\2\u015e\u0161\5\30\r\2\u015f\u0162\7"+
		"\16\2\2\u0160\u0162\5<\37\2\u0161\u015f\3\2\2\2\u0161\u0160\3\2\2\2\u0162"+
		"\u0164\3\2\2\2\u0163\u015e\3\2\2\2\u0164\u0167\3\2\2\2\u0165\u0163\3\2"+
		"\2\2\u0165\u0166\3\2\2\2\u0166\u0169\3\2\2\2\u0167\u0165\3\2\2\2\u0168"+
		"\u014f\3\2\2\2\u0168\u015d\3\2\2\2\u0169?\3\2\2\2;ADGJMPY]fjs{~\u0086"+
		"\u008a\u0091\u0099\u009c\u00a1\u00a7\u00ab\u00b1\u00b4\u00bb\u00c1\u00c7"+
		"\u00cb\u00d3\u00d9\u00de\u00e2\u00e6\u00ea\u00f1\u00f7\u00fb\u0104\u010d"+
		"\u0112\u0115\u0118\u011c\u0121\u0126\u012a\u012d\u0131\u0133\u013e\u0140"+
		"\u0145\u014c\u0153\u0157\u0161\u0165\u0168";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}