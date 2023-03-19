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
			null, null, null, null, null, null, "'@inproceedings'", null, null, null, 
			null, null, null, null, null, "'='", "','", "'\"'", "'('", "')'", "'{'", 
			"'}'", "'@'"
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
		public TerminalNode EOF() { return getToken(BibTeX.EOF, 0); }
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
			setState(42);
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
			setState(57);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ARTICLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(44);
				article();
				}
				break;
			case BOOK:
				enterOuterAlt(_localctx, 2);
				{
				setState(45);
				book();
				}
				break;
			case BOOKLET:
				enterOuterAlt(_localctx, 3);
				{
				setState(46);
				booklet();
				}
				break;
			case INBOOK:
				enterOuterAlt(_localctx, 4);
				{
				setState(47);
				inbook();
				}
				break;
			case INCOLLECTION:
				enterOuterAlt(_localctx, 5);
				{
				setState(48);
				incollection();
				}
				break;
			case INPROCEEDINGS:
				enterOuterAlt(_localctx, 6);
				{
				setState(49);
				inproceedings();
				}
				break;
			case PROCEEDINGS:
				enterOuterAlt(_localctx, 7);
				{
				setState(50);
				proceedings();
				}
				break;
			case MANUAL:
				enterOuterAlt(_localctx, 8);
				{
				setState(51);
				manual();
				}
				break;
			case MASTERTHESIS:
				enterOuterAlt(_localctx, 9);
				{
				setState(52);
				mastersthesis();
				}
				break;
			case PHDTHESIS:
				enterOuterAlt(_localctx, 10);
				{
				setState(53);
				phdthesis();
				}
				break;
			case MISC:
				enterOuterAlt(_localctx, 11);
				{
				setState(54);
				misc();
				}
				break;
			case TECHREPORT:
				enterOuterAlt(_localctx, 12);
				{
				setState(55);
				techreport();
				}
				break;
			case UNPUBLISHED:
				enterOuterAlt(_localctx, 13);
				{
				setState(56);
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
			setState(59);
			key();
			setState(60);
			match(EQ);
			setState(61);
			value();
			setState(62);
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
			setState(64);
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
			setState(66);
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
			setState(68);
			match(ARTICLE);
			setState(69);
			match(LBRACE);
			setState(70);
			match(IDENTIFIER);
			setState(71);
			match(COMMA);
			setState(73); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(72);
				field();
				}
				}
				setState(75); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER );
			setState(77);
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
			setState(79);
			match(BOOK);
			setState(80);
			match(LBRACE);
			setState(81);
			match(IDENTIFIER);
			setState(82);
			match(COMMA);
			setState(84); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(83);
				field();
				}
				}
				setState(86); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER );
			setState(88);
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
			setState(90);
			match(BOOKLET);
			setState(91);
			match(LBRACE);
			setState(92);
			match(IDENTIFIER);
			setState(93);
			match(COMMA);
			setState(95); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(94);
				field();
				}
				}
				setState(97); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER );
			setState(99);
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
			setState(101);
			match(INBOOK);
			setState(102);
			match(LBRACE);
			setState(103);
			match(IDENTIFIER);
			setState(104);
			match(COMMA);
			setState(106); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(105);
				field();
				}
				}
				setState(108); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER );
			setState(110);
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
			setState(112);
			match(INCOLLECTION);
			setState(113);
			match(LBRACE);
			setState(114);
			match(IDENTIFIER);
			setState(115);
			match(COMMA);
			setState(117); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(116);
				field();
				}
				}
				setState(119); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER );
			setState(121);
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
			setState(123);
			match(INPROCEEDINGS);
			setState(124);
			match(LBRACE);
			setState(125);
			match(IDENTIFIER);
			setState(126);
			match(COMMA);
			setState(128); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(127);
				field();
				}
				}
				setState(130); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER );
			setState(132);
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
			setState(134);
			match(PROCEEDINGS);
			setState(135);
			match(LBRACE);
			setState(136);
			match(IDENTIFIER);
			setState(137);
			match(COMMA);
			setState(139); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(138);
				field();
				}
				}
				setState(141); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER );
			setState(143);
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
			setState(145);
			match(MANUAL);
			setState(146);
			match(LBRACE);
			setState(147);
			match(IDENTIFIER);
			setState(148);
			match(COMMA);
			setState(150); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(149);
				field();
				}
				}
				setState(152); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER );
			setState(154);
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
			setState(156);
			match(MASTERTHESIS);
			setState(157);
			match(LBRACE);
			setState(158);
			match(IDENTIFIER);
			setState(159);
			match(COMMA);
			setState(161); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(160);
				field();
				}
				}
				setState(163); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER );
			setState(165);
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
			setState(167);
			match(PHDTHESIS);
			setState(168);
			match(LBRACE);
			setState(169);
			match(IDENTIFIER);
			setState(170);
			match(COMMA);
			setState(172); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(171);
				field();
				}
				}
				setState(174); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER );
			setState(176);
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
			setState(178);
			match(MISC);
			setState(179);
			match(LBRACE);
			setState(180);
			match(IDENTIFIER);
			setState(181);
			match(COMMA);
			setState(183); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(182);
				field();
				}
				}
				setState(185); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER );
			setState(187);
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
			setState(189);
			match(TECHREPORT);
			setState(190);
			match(LBRACE);
			setState(191);
			match(IDENTIFIER);
			setState(192);
			match(COMMA);
			setState(194); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(193);
				field();
				}
				}
				setState(196); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER );
			setState(198);
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
			setState(200);
			match(UNPUBLISHED);
			setState(201);
			match(LBRACE);
			setState(202);
			match(IDENTIFIER);
			setState(203);
			match(COMMA);
			setState(205); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(204);
				field();
				}
				}
				setState(207); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER );
			setState(209);
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
		"\u0004\u0001\u001a\u00d4\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0001\u0000\u0005"+
		"\u0000&\b\u0000\n\u0000\f\u0000)\t\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0003\u0001:\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0004\u0005J\b"+
		"\u0005\u000b\u0005\f\u0005K\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0004\u0006U\b\u0006\u000b"+
		"\u0006\f\u0006V\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0004\u0007`\b\u0007\u000b\u0007\f\u0007"+
		"a\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0004"+
		"\bk\b\b\u000b\b\f\bl\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0004\tv\b\t\u000b\t\f\tw\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0004\n\u0081\b\n\u000b\n\f\n\u0082\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0004\u000b\u008c\b\u000b"+
		"\u000b\u000b\f\u000b\u008d\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0004\f\u0097\b\f\u000b\f\f\f\u0098\u0001\f\u0001\f"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0004\r\u00a2\b\r\u000b\r\f\r"+
		"\u00a3\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0004\u000e\u00ad\b\u000e\u000b\u000e\f\u000e\u00ae\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0004\u000f\u00b8\b\u000f\u000b\u000f\f\u000f\u00b9\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0004\u0010\u00c3\b\u0010\u000b\u0010\f\u0010\u00c4\u0001\u0010\u0001"+
		"\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0004"+
		"\u0011\u00ce\b\u0011\u000b\u0011\f\u0011\u00cf\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0000\u0000\u0012\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"\u0000\u0001\u0001\u0000"+
		"\u0017\u0018\u00db\u0000\'\u0001\u0000\u0000\u0000\u00029\u0001\u0000"+
		"\u0000\u0000\u0004;\u0001\u0000\u0000\u0000\u0006@\u0001\u0000\u0000\u0000"+
		"\bB\u0001\u0000\u0000\u0000\nD\u0001\u0000\u0000\u0000\fO\u0001\u0000"+
		"\u0000\u0000\u000eZ\u0001\u0000\u0000\u0000\u0010e\u0001\u0000\u0000\u0000"+
		"\u0012p\u0001\u0000\u0000\u0000\u0014{\u0001\u0000\u0000\u0000\u0016\u0086"+
		"\u0001\u0000\u0000\u0000\u0018\u0091\u0001\u0000\u0000\u0000\u001a\u009c"+
		"\u0001\u0000\u0000\u0000\u001c\u00a7\u0001\u0000\u0000\u0000\u001e\u00b2"+
		"\u0001\u0000\u0000\u0000 \u00bd\u0001\u0000\u0000\u0000\"\u00c8\u0001"+
		"\u0000\u0000\u0000$&\u0003\u0002\u0001\u0000%$\u0001\u0000\u0000\u0000"+
		"&)\u0001\u0000\u0000\u0000\'%\u0001\u0000\u0000\u0000\'(\u0001\u0000\u0000"+
		"\u0000(*\u0001\u0000\u0000\u0000)\'\u0001\u0000\u0000\u0000*+\u0005\u0000"+
		"\u0000\u0001+\u0001\u0001\u0000\u0000\u0000,:\u0003\n\u0005\u0000-:\u0003"+
		"\f\u0006\u0000.:\u0003\u000e\u0007\u0000/:\u0003\u0010\b\u00000:\u0003"+
		"\u0012\t\u00001:\u0003\u0014\n\u00002:\u0003\u0016\u000b\u00003:\u0003"+
		"\u0018\f\u00004:\u0003\u001a\r\u00005:\u0003\u001c\u000e\u00006:\u0003"+
		"\u001e\u000f\u00007:\u0003 \u0010\u00008:\u0003\"\u0011\u00009,\u0001"+
		"\u0000\u0000\u00009-\u0001\u0000\u0000\u00009.\u0001\u0000\u0000\u0000"+
		"9/\u0001\u0000\u0000\u000090\u0001\u0000\u0000\u000091\u0001\u0000\u0000"+
		"\u000092\u0001\u0000\u0000\u000093\u0001\u0000\u0000\u000094\u0001\u0000"+
		"\u0000\u000095\u0001\u0000\u0000\u000096\u0001\u0000\u0000\u000097\u0001"+
		"\u0000\u0000\u000098\u0001\u0000\u0000\u0000:\u0003\u0001\u0000\u0000"+
		"\u0000;<\u0003\u0006\u0003\u0000<=\u0005\u000f\u0000\u0000=>\u0003\b\u0004"+
		"\u0000>?\u0005\u0010\u0000\u0000?\u0005\u0001\u0000\u0000\u0000@A\u0005"+
		"\u000e\u0000\u0000A\u0007\u0001\u0000\u0000\u0000BC\u0007\u0000\u0000"+
		"\u0000C\t\u0001\u0000\u0000\u0000DE\u0005\u0001\u0000\u0000EF\u0005\u0014"+
		"\u0000\u0000FG\u0005\u000e\u0000\u0000GI\u0005\u0010\u0000\u0000HJ\u0003"+
		"\u0004\u0002\u0000IH\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000"+
		"KI\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000"+
		"\u0000MN\u0005\u0015\u0000\u0000N\u000b\u0001\u0000\u0000\u0000OP\u0005"+
		"\u0002\u0000\u0000PQ\u0005\u0014\u0000\u0000QR\u0005\u000e\u0000\u0000"+
		"RT\u0005\u0010\u0000\u0000SU\u0003\u0004\u0002\u0000TS\u0001\u0000\u0000"+
		"\u0000UV\u0001\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000VW\u0001\u0000"+
		"\u0000\u0000WX\u0001\u0000\u0000\u0000XY\u0005\u0015\u0000\u0000Y\r\u0001"+
		"\u0000\u0000\u0000Z[\u0005\u0003\u0000\u0000[\\\u0005\u0014\u0000\u0000"+
		"\\]\u0005\u000e\u0000\u0000]_\u0005\u0010\u0000\u0000^`\u0003\u0004\u0002"+
		"\u0000_^\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000a_\u0001\u0000"+
		"\u0000\u0000ab\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000cd\u0005"+
		"\u0015\u0000\u0000d\u000f\u0001\u0000\u0000\u0000ef\u0005\u0004\u0000"+
		"\u0000fg\u0005\u0014\u0000\u0000gh\u0005\u000e\u0000\u0000hj\u0005\u0010"+
		"\u0000\u0000ik\u0003\u0004\u0002\u0000ji\u0001\u0000\u0000\u0000kl\u0001"+
		"\u0000\u0000\u0000lj\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000"+
		"mn\u0001\u0000\u0000\u0000no\u0005\u0015\u0000\u0000o\u0011\u0001\u0000"+
		"\u0000\u0000pq\u0005\u0005\u0000\u0000qr\u0005\u0014\u0000\u0000rs\u0005"+
		"\u000e\u0000\u0000su\u0005\u0010\u0000\u0000tv\u0003\u0004\u0002\u0000"+
		"ut\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000wu\u0001\u0000\u0000"+
		"\u0000wx\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000yz\u0005\u0015"+
		"\u0000\u0000z\u0013\u0001\u0000\u0000\u0000{|\u0005\u0006\u0000\u0000"+
		"|}\u0005\u0014\u0000\u0000}~\u0005\u000e\u0000\u0000~\u0080\u0005\u0010"+
		"\u0000\u0000\u007f\u0081\u0003\u0004\u0002\u0000\u0080\u007f\u0001\u0000"+
		"\u0000\u0000\u0081\u0082\u0001\u0000\u0000\u0000\u0082\u0080\u0001\u0000"+
		"\u0000\u0000\u0082\u0083\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000"+
		"\u0000\u0000\u0084\u0085\u0005\u0015\u0000\u0000\u0085\u0015\u0001\u0000"+
		"\u0000\u0000\u0086\u0087\u0005\u0007\u0000\u0000\u0087\u0088\u0005\u0014"+
		"\u0000\u0000\u0088\u0089\u0005\u000e\u0000\u0000\u0089\u008b\u0005\u0010"+
		"\u0000\u0000\u008a\u008c\u0003\u0004\u0002\u0000\u008b\u008a\u0001\u0000"+
		"\u0000\u0000\u008c\u008d\u0001\u0000\u0000\u0000\u008d\u008b\u0001\u0000"+
		"\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000\u008e\u008f\u0001\u0000"+
		"\u0000\u0000\u008f\u0090\u0005\u0015\u0000\u0000\u0090\u0017\u0001\u0000"+
		"\u0000\u0000\u0091\u0092\u0005\b\u0000\u0000\u0092\u0093\u0005\u0014\u0000"+
		"\u0000\u0093\u0094\u0005\u000e\u0000\u0000\u0094\u0096\u0005\u0010\u0000"+
		"\u0000\u0095\u0097\u0003\u0004\u0002\u0000\u0096\u0095\u0001\u0000\u0000"+
		"\u0000\u0097\u0098\u0001\u0000\u0000\u0000\u0098\u0096\u0001\u0000\u0000"+
		"\u0000\u0098\u0099\u0001\u0000\u0000\u0000\u0099\u009a\u0001\u0000\u0000"+
		"\u0000\u009a\u009b\u0005\u0015\u0000\u0000\u009b\u0019\u0001\u0000\u0000"+
		"\u0000\u009c\u009d\u0005\t\u0000\u0000\u009d\u009e\u0005\u0014\u0000\u0000"+
		"\u009e\u009f\u0005\u000e\u0000\u0000\u009f\u00a1\u0005\u0010\u0000\u0000"+
		"\u00a0\u00a2\u0003\u0004\u0002\u0000\u00a1\u00a0\u0001\u0000\u0000\u0000"+
		"\u00a2\u00a3\u0001\u0000\u0000\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000"+
		"\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000"+
		"\u00a5\u00a6\u0005\u0015\u0000\u0000\u00a6\u001b\u0001\u0000\u0000\u0000"+
		"\u00a7\u00a8\u0005\n\u0000\u0000\u00a8\u00a9\u0005\u0014\u0000\u0000\u00a9"+
		"\u00aa\u0005\u000e\u0000\u0000\u00aa\u00ac\u0005\u0010\u0000\u0000\u00ab"+
		"\u00ad\u0003\u0004\u0002\u0000\u00ac\u00ab\u0001\u0000\u0000\u0000\u00ad"+
		"\u00ae\u0001\u0000\u0000\u0000\u00ae\u00ac\u0001\u0000\u0000\u0000\u00ae"+
		"\u00af\u0001\u0000\u0000\u0000\u00af\u00b0\u0001\u0000\u0000\u0000\u00b0"+
		"\u00b1\u0005\u0015\u0000\u0000\u00b1\u001d\u0001\u0000\u0000\u0000\u00b2"+
		"\u00b3\u0005\u000b\u0000\u0000\u00b3\u00b4\u0005\u0014\u0000\u0000\u00b4"+
		"\u00b5\u0005\u000e\u0000\u0000\u00b5\u00b7\u0005\u0010\u0000\u0000\u00b6"+
		"\u00b8\u0003\u0004\u0002\u0000\u00b7\u00b6\u0001\u0000\u0000\u0000\u00b8"+
		"\u00b9\u0001\u0000\u0000\u0000\u00b9\u00b7\u0001\u0000\u0000\u0000\u00b9"+
		"\u00ba\u0001\u0000\u0000\u0000\u00ba\u00bb\u0001\u0000\u0000\u0000\u00bb"+
		"\u00bc\u0005\u0015\u0000\u0000\u00bc\u001f\u0001\u0000\u0000\u0000\u00bd"+
		"\u00be\u0005\f\u0000\u0000\u00be\u00bf\u0005\u0014\u0000\u0000\u00bf\u00c0"+
		"\u0005\u000e\u0000\u0000\u00c0\u00c2\u0005\u0010\u0000\u0000\u00c1\u00c3"+
		"\u0003\u0004\u0002\u0000\u00c2\u00c1\u0001\u0000\u0000\u0000\u00c3\u00c4"+
		"\u0001\u0000\u0000\u0000\u00c4\u00c2\u0001\u0000\u0000\u0000\u00c4\u00c5"+
		"\u0001\u0000\u0000\u0000\u00c5\u00c6\u0001\u0000\u0000\u0000\u00c6\u00c7"+
		"\u0005\u0015\u0000\u0000\u00c7!\u0001\u0000\u0000\u0000\u00c8\u00c9\u0005"+
		"\r\u0000\u0000\u00c9\u00ca\u0005\u0014\u0000\u0000\u00ca\u00cb\u0005\u000e"+
		"\u0000\u0000\u00cb\u00cd\u0005\u0010\u0000\u0000\u00cc\u00ce\u0003\u0004"+
		"\u0002\u0000\u00cd\u00cc\u0001\u0000\u0000\u0000\u00ce\u00cf\u0001\u0000"+
		"\u0000\u0000\u00cf\u00cd\u0001\u0000\u0000\u0000\u00cf\u00d0\u0001\u0000"+
		"\u0000\u0000\u00d0\u00d1\u0001\u0000\u0000\u0000\u00d1\u00d2\u0005\u0015"+
		"\u0000\u0000\u00d2#\u0001\u0000\u0000\u0000\u000f\'9KValw\u0082\u008d"+
		"\u0098\u00a3\u00ae\u00b9\u00c4\u00cf";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}