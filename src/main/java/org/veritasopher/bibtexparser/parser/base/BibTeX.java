// Generated from java-escape by ANTLR 4.11.1
package org.veritasopher.bibtexparser.parser.base;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class BibTeX extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ARTICLE=1, BOOK=2, BOOKLET=3, INBOOK=4, INCOLLECTION=5, INPROCEEDINGS=6, 
		PROCEEDINGS=7, MANUAL=8, MASTERTHESIS=9, PHDTHESIS=10, MISC=11, TECHREPORT=12, 
		UNPUBLISHED=13, IDENTIFIER=14, EQ=15, COMMA=16, DQUOTE=17, LPAREN=18, 
		RPAREN=19, LBRACE=20, RBRACE=21, AT=22, STRING_LITERAL=23, INTEGER_LITERAL=24, 
		WS=25, LINE_COMMENT=26;
	public static final int
		RULE_bibTex = 0, RULE_entry = 1, RULE_field = 2, RULE_key = 3, RULE_value = 4, 
		RULE_article = 5, RULE_book = 6, RULE_booklet = 7, RULE_inbook = 8, RULE_incollection = 9, 
		RULE_inproceedings = 10, RULE_proceedings = 11, RULE_manual = 12, RULE_mastersthesis = 13, 
		RULE_phdthesis = 14, RULE_misc = 15, RULE_techreport = 16, RULE_unpublished = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"bibTex", "entry", "field", "key", "value", "article", "book", "booklet", 
			"inbook", "incollection", "inproceedings", "proceedings", "manual", "mastersthesis", 
			"phdthesis", "misc", "techreport", "unpublished"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "'='", "','", "'\"'", "'('", "')'", "'{'", "'}'", "'@'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ARTICLE", "BOOK", "BOOKLET", "INBOOK", "INCOLLECTION", "INPROCEEDINGS", 
			"PROCEEDINGS", "MANUAL", "MASTERTHESIS", "PHDTHESIS", "MISC", "TECHREPORT", 
			"UNPUBLISHED", "IDENTIFIER", "EQ", "COMMA", "DQUOTE", "LPAREN", "RPAREN", 
			"LBRACE", "RBRACE", "AT", "STRING_LITERAL", "INTEGER_LITERAL", "WS", 
			"LINE_COMMENT"
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

	public BibTeX(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BibTexContext extends ParserRuleContext {
		public List<EntryContext> entry() {
			return getRuleContexts(EntryContext.class);
		}
		public EntryContext entry(int i) {
			return getRuleContext(EntryContext.class,i);
		}
		public BibTexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bibTex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BibTeXListener ) ((BibTeXListener)listener).enterBibTex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BibTeXListener ) ((BibTeXListener)listener).exitBibTex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BibTeXVisitor ) return ((BibTeXVisitor<? extends T>)visitor).visitBibTex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BibTexContext bibTex() throws RecognitionException {
		BibTexContext _localctx = new BibTexContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_bibTex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 16382L) != 0) {
				{
				{
				setState(36);
				entry();
				}
				}
				setState(41);
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
	public static class EntryContext extends ParserRuleContext {
		public ArticleContext article() {
			return getRuleContext(ArticleContext.class,0);
		}
		public BookContext book() {
			return getRuleContext(BookContext.class,0);
		}
		public BookletContext booklet() {
			return getRuleContext(BookletContext.class,0);
		}
		public InbookContext inbook() {
			return getRuleContext(InbookContext.class,0);
		}
		public IncollectionContext incollection() {
			return getRuleContext(IncollectionContext.class,0);
		}
		public InproceedingsContext inproceedings() {
			return getRuleContext(InproceedingsContext.class,0);
		}
		public ProceedingsContext proceedings() {
			return getRuleContext(ProceedingsContext.class,0);
		}
		public ManualContext manual() {
			return getRuleContext(ManualContext.class,0);
		}
		public MastersthesisContext mastersthesis() {
			return getRuleContext(MastersthesisContext.class,0);
		}
		public PhdthesisContext phdthesis() {
			return getRuleContext(PhdthesisContext.class,0);
		}
		public MiscContext misc() {
			return getRuleContext(MiscContext.class,0);
		}
		public TechreportContext techreport() {
			return getRuleContext(TechreportContext.class,0);
		}
		public UnpublishedContext unpublished() {
			return getRuleContext(UnpublishedContext.class,0);
		}
		public EntryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BibTeXListener ) ((BibTeXListener)listener).enterEntry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BibTeXListener ) ((BibTeXListener)listener).exitEntry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BibTeXVisitor ) return ((BibTeXVisitor<? extends T>)visitor).visitEntry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EntryContext entry() throws RecognitionException {
		EntryContext _localctx = new EntryContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_entry);
		try {
			setState(55);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ARTICLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				article();
				}
				break;
			case BOOK:
				enterOuterAlt(_localctx, 2);
				{
				setState(43);
				book();
				}
				break;
			case BOOKLET:
				enterOuterAlt(_localctx, 3);
				{
				setState(44);
				booklet();
				}
				break;
			case INBOOK:
				enterOuterAlt(_localctx, 4);
				{
				setState(45);
				inbook();
				}
				break;
			case INCOLLECTION:
				enterOuterAlt(_localctx, 5);
				{
				setState(46);
				incollection();
				}
				break;
			case INPROCEEDINGS:
				enterOuterAlt(_localctx, 6);
				{
				setState(47);
				inproceedings();
				}
				break;
			case PROCEEDINGS:
				enterOuterAlt(_localctx, 7);
				{
				setState(48);
				proceedings();
				}
				break;
			case MANUAL:
				enterOuterAlt(_localctx, 8);
				{
				setState(49);
				manual();
				}
				break;
			case MASTERTHESIS:
				enterOuterAlt(_localctx, 9);
				{
				setState(50);
				mastersthesis();
				}
				break;
			case PHDTHESIS:
				enterOuterAlt(_localctx, 10);
				{
				setState(51);
				phdthesis();
				}
				break;
			case MISC:
				enterOuterAlt(_localctx, 11);
				{
				setState(52);
				misc();
				}
				break;
			case TECHREPORT:
				enterOuterAlt(_localctx, 12);
				{
				setState(53);
				techreport();
				}
				break;
			case UNPUBLISHED:
				enterOuterAlt(_localctx, 13);
				{
				setState(54);
				unpublished();
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
	public static class FieldContext extends ParserRuleContext {
		public KeyContext key() {
			return getRuleContext(KeyContext.class,0);
		}
		public TerminalNode EQ() { return getToken(BibTeX.EQ, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(BibTeX.COMMA, 0); }
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BibTeXListener ) ((BibTeXListener)listener).enterField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BibTeXListener ) ((BibTeXListener)listener).exitField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BibTeXVisitor ) return ((BibTeXVisitor<? extends T>)visitor).visitField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			key();
			setState(58);
			match(EQ);
			setState(59);
			value();
			setState(60);
			match(COMMA);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode IDENTIFIER() { return getToken(BibTeX.IDENTIFIER, 0); }
		public KeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BibTeXListener ) ((BibTeXListener)listener).enterKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BibTeXListener ) ((BibTeXListener)listener).exitKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BibTeXVisitor ) return ((BibTeXVisitor<? extends T>)visitor).visitKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyContext key() throws RecognitionException {
		KeyContext _localctx = new KeyContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_key);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode INTEGER_LITERAL() { return getToken(BibTeX.INTEGER_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(BibTeX.STRING_LITERAL, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BibTeXListener ) ((BibTeXListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BibTeXListener ) ((BibTeXListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BibTeXVisitor ) return ((BibTeXVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			_la = _input.LA(1);
			if ( !(_la==STRING_LITERAL || _la==INTEGER_LITERAL) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArticleContext extends ParserRuleContext {
		public TerminalNode ARTICLE() { return getToken(BibTeX.ARTICLE, 0); }
		public TerminalNode LBRACE() { return getToken(BibTeX.LBRACE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(BibTeX.IDENTIFIER, 0); }
		public TerminalNode COMMA() { return getToken(BibTeX.COMMA, 0); }
		public TerminalNode RBRACE() { return getToken(BibTeX.RBRACE, 0); }
		public List<FieldContext> field() {
			return getRuleContexts(FieldContext.class);
		}
		public FieldContext field(int i) {
			return getRuleContext(FieldContext.class,i);
		}
		public ArticleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_article; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BibTeXListener ) ((BibTeXListener)listener).enterArticle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BibTeXListener ) ((BibTeXListener)listener).exitArticle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BibTeXVisitor ) return ((BibTeXVisitor<? extends T>)visitor).visitArticle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArticleContext article() throws RecognitionException {
		ArticleContext _localctx = new ArticleContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_article);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(ARTICLE);
			setState(67);
			match(LBRACE);
			setState(68);
			match(IDENTIFIER);
			setState(69);
			match(COMMA);
			setState(71); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(70);
				field();
				}
				}
				setState(73); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER );
			setState(75);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
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
	public static class BookContext extends ParserRuleContext {
		public TerminalNode BOOK() { return getToken(BibTeX.BOOK, 0); }
		public TerminalNode LBRACE() { return getToken(BibTeX.LBRACE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(BibTeX.IDENTIFIER, 0); }
		public TerminalNode COMMA() { return getToken(BibTeX.COMMA, 0); }
		public TerminalNode RBRACE() { return getToken(BibTeX.RBRACE, 0); }
		public List<FieldContext> field() {
			return getRuleContexts(FieldContext.class);
		}
		public FieldContext field(int i) {
			return getRuleContext(FieldContext.class,i);
		}
		public BookContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_book; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BibTeXListener ) ((BibTeXListener)listener).enterBook(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BibTeXListener ) ((BibTeXListener)listener).exitBook(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BibTeXVisitor ) return ((BibTeXVisitor<? extends T>)visitor).visitBook(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BookContext book() throws RecognitionException {
		BookContext _localctx = new BookContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_book);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(BOOK);
			setState(78);
			match(LBRACE);
			setState(79);
			match(IDENTIFIER);
			setState(80);
			match(COMMA);
			setState(82); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(81);
				field();
				}
				}
				setState(84); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER );
			setState(86);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
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
	public static class BookletContext extends ParserRuleContext {
		public TerminalNode BOOKLET() { return getToken(BibTeX.BOOKLET, 0); }
		public TerminalNode LBRACE() { return getToken(BibTeX.LBRACE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(BibTeX.IDENTIFIER, 0); }
		public TerminalNode COMMA() { return getToken(BibTeX.COMMA, 0); }
		public TerminalNode RBRACE() { return getToken(BibTeX.RBRACE, 0); }
		public List<FieldContext> field() {
			return getRuleContexts(FieldContext.class);
		}
		public FieldContext field(int i) {
			return getRuleContext(FieldContext.class,i);
		}
		public BookletContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booklet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BibTeXListener ) ((BibTeXListener)listener).enterBooklet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BibTeXListener ) ((BibTeXListener)listener).exitBooklet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BibTeXVisitor ) return ((BibTeXVisitor<? extends T>)visitor).visitBooklet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BookletContext booklet() throws RecognitionException {
		BookletContext _localctx = new BookletContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_booklet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(BOOKLET);
			setState(89);
			match(LBRACE);
			setState(90);
			match(IDENTIFIER);
			setState(91);
			match(COMMA);
			setState(93); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(92);
				field();
				}
				}
				setState(95); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER );
			setState(97);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
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
	public static class InbookContext extends ParserRuleContext {
		public TerminalNode INBOOK() { return getToken(BibTeX.INBOOK, 0); }
		public TerminalNode LBRACE() { return getToken(BibTeX.LBRACE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(BibTeX.IDENTIFIER, 0); }
		public TerminalNode COMMA() { return getToken(BibTeX.COMMA, 0); }
		public TerminalNode RBRACE() { return getToken(BibTeX.RBRACE, 0); }
		public List<FieldContext> field() {
			return getRuleContexts(FieldContext.class);
		}
		public FieldContext field(int i) {
			return getRuleContext(FieldContext.class,i);
		}
		public InbookContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inbook; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BibTeXListener ) ((BibTeXListener)listener).enterInbook(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BibTeXListener ) ((BibTeXListener)listener).exitInbook(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BibTeXVisitor ) return ((BibTeXVisitor<? extends T>)visitor).visitInbook(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InbookContext inbook() throws RecognitionException {
		InbookContext _localctx = new InbookContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_inbook);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(INBOOK);
			setState(100);
			match(LBRACE);
			setState(101);
			match(IDENTIFIER);
			setState(102);
			match(COMMA);
			setState(104); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(103);
				field();
				}
				}
				setState(106); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER );
			setState(108);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
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
	public static class IncollectionContext extends ParserRuleContext {
		public TerminalNode INCOLLECTION() { return getToken(BibTeX.INCOLLECTION, 0); }
		public TerminalNode LBRACE() { return getToken(BibTeX.LBRACE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(BibTeX.IDENTIFIER, 0); }
		public TerminalNode COMMA() { return getToken(BibTeX.COMMA, 0); }
		public TerminalNode RBRACE() { return getToken(BibTeX.RBRACE, 0); }
		public List<FieldContext> field() {
			return getRuleContexts(FieldContext.class);
		}
		public FieldContext field(int i) {
			return getRuleContext(FieldContext.class,i);
		}
		public IncollectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incollection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BibTeXListener ) ((BibTeXListener)listener).enterIncollection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BibTeXListener ) ((BibTeXListener)listener).exitIncollection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BibTeXVisitor ) return ((BibTeXVisitor<? extends T>)visitor).visitIncollection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncollectionContext incollection() throws RecognitionException {
		IncollectionContext _localctx = new IncollectionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_incollection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(INCOLLECTION);
			setState(111);
			match(LBRACE);
			setState(112);
			match(IDENTIFIER);
			setState(113);
			match(COMMA);
			setState(115); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(114);
				field();
				}
				}
				setState(117); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER );
			setState(119);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
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
	public static class InproceedingsContext extends ParserRuleContext {
		public TerminalNode INPROCEEDINGS() { return getToken(BibTeX.INPROCEEDINGS, 0); }
		public TerminalNode LBRACE() { return getToken(BibTeX.LBRACE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(BibTeX.IDENTIFIER, 0); }
		public TerminalNode COMMA() { return getToken(BibTeX.COMMA, 0); }
		public TerminalNode RBRACE() { return getToken(BibTeX.RBRACE, 0); }
		public List<FieldContext> field() {
			return getRuleContexts(FieldContext.class);
		}
		public FieldContext field(int i) {
			return getRuleContext(FieldContext.class,i);
		}
		public InproceedingsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inproceedings; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BibTeXListener ) ((BibTeXListener)listener).enterInproceedings(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BibTeXListener ) ((BibTeXListener)listener).exitInproceedings(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BibTeXVisitor ) return ((BibTeXVisitor<? extends T>)visitor).visitInproceedings(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InproceedingsContext inproceedings() throws RecognitionException {
		InproceedingsContext _localctx = new InproceedingsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_inproceedings);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(INPROCEEDINGS);
			setState(122);
			match(LBRACE);
			setState(123);
			match(IDENTIFIER);
			setState(124);
			match(COMMA);
			setState(126); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(125);
				field();
				}
				}
				setState(128); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER );
			setState(130);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
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
	public static class ProceedingsContext extends ParserRuleContext {
		public TerminalNode PROCEEDINGS() { return getToken(BibTeX.PROCEEDINGS, 0); }
		public TerminalNode LBRACE() { return getToken(BibTeX.LBRACE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(BibTeX.IDENTIFIER, 0); }
		public TerminalNode COMMA() { return getToken(BibTeX.COMMA, 0); }
		public TerminalNode RBRACE() { return getToken(BibTeX.RBRACE, 0); }
		public List<FieldContext> field() {
			return getRuleContexts(FieldContext.class);
		}
		public FieldContext field(int i) {
			return getRuleContext(FieldContext.class,i);
		}
		public ProceedingsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proceedings; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BibTeXListener ) ((BibTeXListener)listener).enterProceedings(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BibTeXListener ) ((BibTeXListener)listener).exitProceedings(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BibTeXVisitor ) return ((BibTeXVisitor<? extends T>)visitor).visitProceedings(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProceedingsContext proceedings() throws RecognitionException {
		ProceedingsContext _localctx = new ProceedingsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_proceedings);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(PROCEEDINGS);
			setState(133);
			match(LBRACE);
			setState(134);
			match(IDENTIFIER);
			setState(135);
			match(COMMA);
			setState(137); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(136);
				field();
				}
				}
				setState(139); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER );
			setState(141);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
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
	public static class ManualContext extends ParserRuleContext {
		public TerminalNode MANUAL() { return getToken(BibTeX.MANUAL, 0); }
		public TerminalNode LBRACE() { return getToken(BibTeX.LBRACE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(BibTeX.IDENTIFIER, 0); }
		public TerminalNode COMMA() { return getToken(BibTeX.COMMA, 0); }
		public TerminalNode RBRACE() { return getToken(BibTeX.RBRACE, 0); }
		public List<FieldContext> field() {
			return getRuleContexts(FieldContext.class);
		}
		public FieldContext field(int i) {
			return getRuleContext(FieldContext.class,i);
		}
		public ManualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_manual; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BibTeXListener ) ((BibTeXListener)listener).enterManual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BibTeXListener ) ((BibTeXListener)listener).exitManual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BibTeXVisitor ) return ((BibTeXVisitor<? extends T>)visitor).visitManual(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ManualContext manual() throws RecognitionException {
		ManualContext _localctx = new ManualContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_manual);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(MANUAL);
			setState(144);
			match(LBRACE);
			setState(145);
			match(IDENTIFIER);
			setState(146);
			match(COMMA);
			setState(148); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(147);
				field();
				}
				}
				setState(150); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER );
			setState(152);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
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
	public static class MastersthesisContext extends ParserRuleContext {
		public TerminalNode MASTERTHESIS() { return getToken(BibTeX.MASTERTHESIS, 0); }
		public TerminalNode LBRACE() { return getToken(BibTeX.LBRACE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(BibTeX.IDENTIFIER, 0); }
		public TerminalNode COMMA() { return getToken(BibTeX.COMMA, 0); }
		public TerminalNode RBRACE() { return getToken(BibTeX.RBRACE, 0); }
		public List<FieldContext> field() {
			return getRuleContexts(FieldContext.class);
		}
		public FieldContext field(int i) {
			return getRuleContext(FieldContext.class,i);
		}
		public MastersthesisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mastersthesis; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BibTeXListener ) ((BibTeXListener)listener).enterMastersthesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BibTeXListener ) ((BibTeXListener)listener).exitMastersthesis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BibTeXVisitor ) return ((BibTeXVisitor<? extends T>)visitor).visitMastersthesis(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MastersthesisContext mastersthesis() throws RecognitionException {
		MastersthesisContext _localctx = new MastersthesisContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_mastersthesis);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(MASTERTHESIS);
			setState(155);
			match(LBRACE);
			setState(156);
			match(IDENTIFIER);
			setState(157);
			match(COMMA);
			setState(159); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(158);
				field();
				}
				}
				setState(161); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER );
			setState(163);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
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
	public static class PhdthesisContext extends ParserRuleContext {
		public TerminalNode PHDTHESIS() { return getToken(BibTeX.PHDTHESIS, 0); }
		public TerminalNode LBRACE() { return getToken(BibTeX.LBRACE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(BibTeX.IDENTIFIER, 0); }
		public TerminalNode COMMA() { return getToken(BibTeX.COMMA, 0); }
		public TerminalNode RBRACE() { return getToken(BibTeX.RBRACE, 0); }
		public List<FieldContext> field() {
			return getRuleContexts(FieldContext.class);
		}
		public FieldContext field(int i) {
			return getRuleContext(FieldContext.class,i);
		}
		public PhdthesisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_phdthesis; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BibTeXListener ) ((BibTeXListener)listener).enterPhdthesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BibTeXListener ) ((BibTeXListener)listener).exitPhdthesis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BibTeXVisitor ) return ((BibTeXVisitor<? extends T>)visitor).visitPhdthesis(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PhdthesisContext phdthesis() throws RecognitionException {
		PhdthesisContext _localctx = new PhdthesisContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_phdthesis);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(PHDTHESIS);
			setState(166);
			match(LBRACE);
			setState(167);
			match(IDENTIFIER);
			setState(168);
			match(COMMA);
			setState(170); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(169);
				field();
				}
				}
				setState(172); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER );
			setState(174);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
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
	public static class MiscContext extends ParserRuleContext {
		public TerminalNode MISC() { return getToken(BibTeX.MISC, 0); }
		public TerminalNode LBRACE() { return getToken(BibTeX.LBRACE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(BibTeX.IDENTIFIER, 0); }
		public TerminalNode COMMA() { return getToken(BibTeX.COMMA, 0); }
		public TerminalNode RBRACE() { return getToken(BibTeX.RBRACE, 0); }
		public List<FieldContext> field() {
			return getRuleContexts(FieldContext.class);
		}
		public FieldContext field(int i) {
			return getRuleContext(FieldContext.class,i);
		}
		public MiscContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_misc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BibTeXListener ) ((BibTeXListener)listener).enterMisc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BibTeXListener ) ((BibTeXListener)listener).exitMisc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BibTeXVisitor ) return ((BibTeXVisitor<? extends T>)visitor).visitMisc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MiscContext misc() throws RecognitionException {
		MiscContext _localctx = new MiscContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_misc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(MISC);
			setState(177);
			match(LBRACE);
			setState(178);
			match(IDENTIFIER);
			setState(179);
			match(COMMA);
			setState(181); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(180);
				field();
				}
				}
				setState(183); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER );
			setState(185);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
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
	public static class TechreportContext extends ParserRuleContext {
		public TerminalNode TECHREPORT() { return getToken(BibTeX.TECHREPORT, 0); }
		public TerminalNode LBRACE() { return getToken(BibTeX.LBRACE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(BibTeX.IDENTIFIER, 0); }
		public TerminalNode COMMA() { return getToken(BibTeX.COMMA, 0); }
		public TerminalNode RBRACE() { return getToken(BibTeX.RBRACE, 0); }
		public List<FieldContext> field() {
			return getRuleContexts(FieldContext.class);
		}
		public FieldContext field(int i) {
			return getRuleContext(FieldContext.class,i);
		}
		public TechreportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_techreport; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BibTeXListener ) ((BibTeXListener)listener).enterTechreport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BibTeXListener ) ((BibTeXListener)listener).exitTechreport(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BibTeXVisitor ) return ((BibTeXVisitor<? extends T>)visitor).visitTechreport(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TechreportContext techreport() throws RecognitionException {
		TechreportContext _localctx = new TechreportContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_techreport);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(TECHREPORT);
			setState(188);
			match(LBRACE);
			setState(189);
			match(IDENTIFIER);
			setState(190);
			match(COMMA);
			setState(192); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(191);
				field();
				}
				}
				setState(194); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER );
			setState(196);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
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
	public static class UnpublishedContext extends ParserRuleContext {
		public TerminalNode UNPUBLISHED() { return getToken(BibTeX.UNPUBLISHED, 0); }
		public TerminalNode LBRACE() { return getToken(BibTeX.LBRACE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(BibTeX.IDENTIFIER, 0); }
		public TerminalNode COMMA() { return getToken(BibTeX.COMMA, 0); }
		public TerminalNode RBRACE() { return getToken(BibTeX.RBRACE, 0); }
		public List<FieldContext> field() {
			return getRuleContexts(FieldContext.class);
		}
		public FieldContext field(int i) {
			return getRuleContext(FieldContext.class,i);
		}
		public UnpublishedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unpublished; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BibTeXListener ) ((BibTeXListener)listener).enterUnpublished(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BibTeXListener ) ((BibTeXListener)listener).exitUnpublished(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BibTeXVisitor ) return ((BibTeXVisitor<? extends T>)visitor).visitUnpublished(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnpublishedContext unpublished() throws RecognitionException {
		UnpublishedContext _localctx = new UnpublishedContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_unpublished);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(UNPUBLISHED);
			setState(199);
			match(LBRACE);
			setState(200);
			match(IDENTIFIER);
			setState(201);
			match(COMMA);
			setState(203); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(202);
				field();
				}
				}
				setState(205); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER );
			setState(207);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
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
		"\u0004\u0001\u001a\u00d2\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0001\u0000\u0005"+
		"\u0000&\b\u0000\n\u0000\f\u0000)\t\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u00018\b"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0004\u0005H\b\u0005\u000b\u0005\f\u0005"+
		"I\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0004\u0006S\b\u0006\u000b\u0006\f\u0006T\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0004"+
		"\u0007^\b\u0007\u000b\u0007\f\u0007_\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0004\bi\b\b\u000b\b\f\bj\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0004\tt\b\t\u000b\t\f\tu\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0004\n\u007f\b\n\u000b\n\f"+
		"\n\u0080\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0004\u000b\u008a\b\u000b\u000b\u000b\f\u000b\u008b\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0004\f\u0095"+
		"\b\f\u000b\f\f\f\u0096\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r"+
		"\u0001\r\u0004\r\u00a0\b\r\u000b\r\f\r\u00a1\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0004\u000e\u00ab\b\u000e"+
		"\u000b\u000e\f\u000e\u00ac\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0004\u000f\u00b6\b\u000f\u000b\u000f"+
		"\f\u000f\u00b7\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0004\u0010\u00c1\b\u0010\u000b\u0010\f\u0010"+
		"\u00c2\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0004\u0011\u00cc\b\u0011\u000b\u0011\f\u0011\u00cd"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0000\u0000\u0012\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"\u0000\u0001\u0001\u0000\u0017\u0018\u00d9\u0000\'\u0001\u0000\u0000\u0000"+
		"\u00027\u0001\u0000\u0000\u0000\u00049\u0001\u0000\u0000\u0000\u0006>"+
		"\u0001\u0000\u0000\u0000\b@\u0001\u0000\u0000\u0000\nB\u0001\u0000\u0000"+
		"\u0000\fM\u0001\u0000\u0000\u0000\u000eX\u0001\u0000\u0000\u0000\u0010"+
		"c\u0001\u0000\u0000\u0000\u0012n\u0001\u0000\u0000\u0000\u0014y\u0001"+
		"\u0000\u0000\u0000\u0016\u0084\u0001\u0000\u0000\u0000\u0018\u008f\u0001"+
		"\u0000\u0000\u0000\u001a\u009a\u0001\u0000\u0000\u0000\u001c\u00a5\u0001"+
		"\u0000\u0000\u0000\u001e\u00b0\u0001\u0000\u0000\u0000 \u00bb\u0001\u0000"+
		"\u0000\u0000\"\u00c6\u0001\u0000\u0000\u0000$&\u0003\u0002\u0001\u0000"+
		"%$\u0001\u0000\u0000\u0000&)\u0001\u0000\u0000\u0000\'%\u0001\u0000\u0000"+
		"\u0000\'(\u0001\u0000\u0000\u0000(\u0001\u0001\u0000\u0000\u0000)\'\u0001"+
		"\u0000\u0000\u0000*8\u0003\n\u0005\u0000+8\u0003\f\u0006\u0000,8\u0003"+
		"\u000e\u0007\u0000-8\u0003\u0010\b\u0000.8\u0003\u0012\t\u0000/8\u0003"+
		"\u0014\n\u000008\u0003\u0016\u000b\u000018\u0003\u0018\f\u000028\u0003"+
		"\u001a\r\u000038\u0003\u001c\u000e\u000048\u0003\u001e\u000f\u000058\u0003"+
		" \u0010\u000068\u0003\"\u0011\u00007*\u0001\u0000\u0000\u00007+\u0001"+
		"\u0000\u0000\u00007,\u0001\u0000\u0000\u00007-\u0001\u0000\u0000\u0000"+
		"7.\u0001\u0000\u0000\u00007/\u0001\u0000\u0000\u000070\u0001\u0000\u0000"+
		"\u000071\u0001\u0000\u0000\u000072\u0001\u0000\u0000\u000073\u0001\u0000"+
		"\u0000\u000074\u0001\u0000\u0000\u000075\u0001\u0000\u0000\u000076\u0001"+
		"\u0000\u0000\u00008\u0003\u0001\u0000\u0000\u00009:\u0003\u0006\u0003"+
		"\u0000:;\u0005\u000f\u0000\u0000;<\u0003\b\u0004\u0000<=\u0005\u0010\u0000"+
		"\u0000=\u0005\u0001\u0000\u0000\u0000>?\u0005\u000e\u0000\u0000?\u0007"+
		"\u0001\u0000\u0000\u0000@A\u0007\u0000\u0000\u0000A\t\u0001\u0000\u0000"+
		"\u0000BC\u0005\u0001\u0000\u0000CD\u0005\u0014\u0000\u0000DE\u0005\u000e"+
		"\u0000\u0000EG\u0005\u0010\u0000\u0000FH\u0003\u0004\u0002\u0000GF\u0001"+
		"\u0000\u0000\u0000HI\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000"+
		"IJ\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000KL\u0005\u0015\u0000"+
		"\u0000L\u000b\u0001\u0000\u0000\u0000MN\u0005\u0002\u0000\u0000NO\u0005"+
		"\u0014\u0000\u0000OP\u0005\u000e\u0000\u0000PR\u0005\u0010\u0000\u0000"+
		"QS\u0003\u0004\u0002\u0000RQ\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000"+
		"\u0000TR\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000UV\u0001\u0000"+
		"\u0000\u0000VW\u0005\u0015\u0000\u0000W\r\u0001\u0000\u0000\u0000XY\u0005"+
		"\u0003\u0000\u0000YZ\u0005\u0014\u0000\u0000Z[\u0005\u000e\u0000\u0000"+
		"[]\u0005\u0010\u0000\u0000\\^\u0003\u0004\u0002\u0000]\\\u0001\u0000\u0000"+
		"\u0000^_\u0001\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000_`\u0001\u0000"+
		"\u0000\u0000`a\u0001\u0000\u0000\u0000ab\u0005\u0015\u0000\u0000b\u000f"+
		"\u0001\u0000\u0000\u0000cd\u0005\u0004\u0000\u0000de\u0005\u0014\u0000"+
		"\u0000ef\u0005\u000e\u0000\u0000fh\u0005\u0010\u0000\u0000gi\u0003\u0004"+
		"\u0002\u0000hg\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000jh\u0001"+
		"\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000"+
		"lm\u0005\u0015\u0000\u0000m\u0011\u0001\u0000\u0000\u0000no\u0005\u0005"+
		"\u0000\u0000op\u0005\u0014\u0000\u0000pq\u0005\u000e\u0000\u0000qs\u0005"+
		"\u0010\u0000\u0000rt\u0003\u0004\u0002\u0000sr\u0001\u0000\u0000\u0000"+
		"tu\u0001\u0000\u0000\u0000us\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000"+
		"\u0000vw\u0001\u0000\u0000\u0000wx\u0005\u0015\u0000\u0000x\u0013\u0001"+
		"\u0000\u0000\u0000yz\u0005\u0006\u0000\u0000z{\u0005\u0014\u0000\u0000"+
		"{|\u0005\u000e\u0000\u0000|~\u0005\u0010\u0000\u0000}\u007f\u0003\u0004"+
		"\u0002\u0000~}\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000"+
		"\u0080~\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081"+
		"\u0082\u0001\u0000\u0000\u0000\u0082\u0083\u0005\u0015\u0000\u0000\u0083"+
		"\u0015\u0001\u0000\u0000\u0000\u0084\u0085\u0005\u0007\u0000\u0000\u0085"+
		"\u0086\u0005\u0014\u0000\u0000\u0086\u0087\u0005\u000e\u0000\u0000\u0087"+
		"\u0089\u0005\u0010\u0000\u0000\u0088\u008a\u0003\u0004\u0002\u0000\u0089"+
		"\u0088\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b"+
		"\u0089\u0001\u0000\u0000\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c"+
		"\u008d\u0001\u0000\u0000\u0000\u008d\u008e\u0005\u0015\u0000\u0000\u008e"+
		"\u0017\u0001\u0000\u0000\u0000\u008f\u0090\u0005\b\u0000\u0000\u0090\u0091"+
		"\u0005\u0014\u0000\u0000\u0091\u0092\u0005\u000e\u0000\u0000\u0092\u0094"+
		"\u0005\u0010\u0000\u0000\u0093\u0095\u0003\u0004\u0002\u0000\u0094\u0093"+
		"\u0001\u0000\u0000\u0000\u0095\u0096\u0001\u0000\u0000\u0000\u0096\u0094"+
		"\u0001\u0000\u0000\u0000\u0096\u0097\u0001\u0000\u0000\u0000\u0097\u0098"+
		"\u0001\u0000\u0000\u0000\u0098\u0099\u0005\u0015\u0000\u0000\u0099\u0019"+
		"\u0001\u0000\u0000\u0000\u009a\u009b\u0005\t\u0000\u0000\u009b\u009c\u0005"+
		"\u0014\u0000\u0000\u009c\u009d\u0005\u000e\u0000\u0000\u009d\u009f\u0005"+
		"\u0010\u0000\u0000\u009e\u00a0\u0003\u0004\u0002\u0000\u009f\u009e\u0001"+
		"\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1\u009f\u0001"+
		"\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2\u00a3\u0001"+
		"\u0000\u0000\u0000\u00a3\u00a4\u0005\u0015\u0000\u0000\u00a4\u001b\u0001"+
		"\u0000\u0000\u0000\u00a5\u00a6\u0005\n\u0000\u0000\u00a6\u00a7\u0005\u0014"+
		"\u0000\u0000\u00a7\u00a8\u0005\u000e\u0000\u0000\u00a8\u00aa\u0005\u0010"+
		"\u0000\u0000\u00a9\u00ab\u0003\u0004\u0002\u0000\u00aa\u00a9\u0001\u0000"+
		"\u0000\u0000\u00ab\u00ac\u0001\u0000\u0000\u0000\u00ac\u00aa\u0001\u0000"+
		"\u0000\u0000\u00ac\u00ad\u0001\u0000\u0000\u0000\u00ad\u00ae\u0001\u0000"+
		"\u0000\u0000\u00ae\u00af\u0005\u0015\u0000\u0000\u00af\u001d\u0001\u0000"+
		"\u0000\u0000\u00b0\u00b1\u0005\u000b\u0000\u0000\u00b1\u00b2\u0005\u0014"+
		"\u0000\u0000\u00b2\u00b3\u0005\u000e\u0000\u0000\u00b3\u00b5\u0005\u0010"+
		"\u0000\u0000\u00b4\u00b6\u0003\u0004\u0002\u0000\u00b5\u00b4\u0001\u0000"+
		"\u0000\u0000\u00b6\u00b7\u0001\u0000\u0000\u0000\u00b7\u00b5\u0001\u0000"+
		"\u0000\u0000\u00b7\u00b8\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001\u0000"+
		"\u0000\u0000\u00b9\u00ba\u0005\u0015\u0000\u0000\u00ba\u001f\u0001\u0000"+
		"\u0000\u0000\u00bb\u00bc\u0005\f\u0000\u0000\u00bc\u00bd\u0005\u0014\u0000"+
		"\u0000\u00bd\u00be\u0005\u000e\u0000\u0000\u00be\u00c0\u0005\u0010\u0000"+
		"\u0000\u00bf\u00c1\u0003\u0004\u0002\u0000\u00c0\u00bf\u0001\u0000\u0000"+
		"\u0000\u00c1\u00c2\u0001\u0000\u0000\u0000\u00c2\u00c0\u0001\u0000\u0000"+
		"\u0000\u00c2\u00c3\u0001\u0000\u0000\u0000\u00c3\u00c4\u0001\u0000\u0000"+
		"\u0000\u00c4\u00c5\u0005\u0015\u0000\u0000\u00c5!\u0001\u0000\u0000\u0000"+
		"\u00c6\u00c7\u0005\r\u0000\u0000\u00c7\u00c8\u0005\u0014\u0000\u0000\u00c8"+
		"\u00c9\u0005\u000e\u0000\u0000\u00c9\u00cb\u0005\u0010\u0000\u0000\u00ca"+
		"\u00cc\u0003\u0004\u0002\u0000\u00cb\u00ca\u0001\u0000\u0000\u0000\u00cc"+
		"\u00cd\u0001\u0000\u0000\u0000\u00cd\u00cb\u0001\u0000\u0000\u0000\u00cd"+
		"\u00ce\u0001\u0000\u0000\u0000\u00ce\u00cf\u0001\u0000\u0000\u0000\u00cf"+
		"\u00d0\u0005\u0015\u0000\u0000\u00d0#\u0001\u0000\u0000\u0000\u000f\'"+
		"7IT_ju\u0080\u008b\u0096\u00a1\u00ac\u00b7\u00c2\u00cd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}