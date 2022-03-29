// Generated from /Users/michaeltei/Projects/PracticeProjects/BibTeXParser/BibTeXJavaParser/BibTeX-Grammar/BibTeX.g4 by ANTLR 4.9.2
package org.veritasopher.bibtexparser.parser.base;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BibTeX extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ARTICLE=1, BOOK=2, BOOKLET=3, INBOOK=4, INCOLLECTION=5, INPROCEEDINGS=6, 
		PROCEEDINGS=7, MANUAL=8, MASTERTHESIS=9, PHDTHESIS=10, MISC=11, TECHREPORT=12, 
		UNPUBLISHED=13, IDENTIFIER=14, EQ=15, COMMA=16, DQUOTE=17, LPAREN=18, 
		RPAREN=19, LBRACE=20, RBRACE=21, STRING_LITERAL=22, INTEGER_LITERAL=23, 
		WS=24, LINE_COMMENT=25;
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
			null, "'@article'", "'@book'", "'@booklet'", "'@inbook'", "'@incollection'", 
			"'@inproceedings'", "'@proceedings'", "'@manual'", "'@mastersthesis'", 
			"'@phdthesis'", "'@misc'", "'@techreport'", "'@unpublished'", null, "'='", 
			"','", "'\"'", "'('", "')'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ARTICLE", "BOOK", "BOOKLET", "INBOOK", "INCOLLECTION", "INPROCEEDINGS", 
			"PROCEEDINGS", "MANUAL", "MASTERTHESIS", "PHDTHESIS", "MISC", "TECHREPORT", 
			"UNPUBLISHED", "IDENTIFIER", "EQ", "COMMA", "DQUOTE", "LPAREN", "RPAREN", 
			"LBRACE", "RBRACE", "STRING_LITERAL", "INTEGER_LITERAL", "WS", "LINE_COMMENT"
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
	public String getGrammarFileName() { return "BibTeX.g4"; }

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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ARTICLE) | (1L << BOOK) | (1L << BOOKLET) | (1L << INBOOK) | (1L << INCOLLECTION) | (1L << INPROCEEDINGS) | (1L << PROCEEDINGS) | (1L << MANUAL) | (1L << MASTERTHESIS) | (1L << PHDTHESIS) | (1L << MISC) | (1L << TECHREPORT) | (1L << UNPUBLISHED))) != 0)) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\33\u00d4\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\7\2(\n\2\f\2\16\2+\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\5\3:\n\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7"+
		"\3\7\3\7\3\7\3\7\6\7J\n\7\r\7\16\7K\3\7\3\7\3\b\3\b\3\b\3\b\3\b\6\bU\n"+
		"\b\r\b\16\bV\3\b\3\b\3\t\3\t\3\t\3\t\3\t\6\t`\n\t\r\t\16\ta\3\t\3\t\3"+
		"\n\3\n\3\n\3\n\3\n\6\nk\n\n\r\n\16\nl\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\6\13v\n\13\r\13\16\13w\3\13\3\13\3\f\3\f\3\f\3\f\3\f\6\f\u0081\n\f\r"+
		"\f\16\f\u0082\3\f\3\f\3\r\3\r\3\r\3\r\3\r\6\r\u008c\n\r\r\r\16\r\u008d"+
		"\3\r\3\r\3\16\3\16\3\16\3\16\3\16\6\16\u0097\n\16\r\16\16\16\u0098\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\17\6\17\u00a2\n\17\r\17\16\17\u00a3\3\17\3"+
		"\17\3\20\3\20\3\20\3\20\3\20\6\20\u00ad\n\20\r\20\16\20\u00ae\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\3\21\6\21\u00b8\n\21\r\21\16\21\u00b9\3\21\3\21\3"+
		"\22\3\22\3\22\3\22\3\22\6\22\u00c3\n\22\r\22\16\22\u00c4\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\3\23\6\23\u00ce\n\23\r\23\16\23\u00cf\3\23\3\23\3\23\2"+
		"\2\24\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$\2\3\3\2\30\31\2\u00db"+
		"\2)\3\2\2\2\49\3\2\2\2\6;\3\2\2\2\b@\3\2\2\2\nB\3\2\2\2\fD\3\2\2\2\16"+
		"O\3\2\2\2\20Z\3\2\2\2\22e\3\2\2\2\24p\3\2\2\2\26{\3\2\2\2\30\u0086\3\2"+
		"\2\2\32\u0091\3\2\2\2\34\u009c\3\2\2\2\36\u00a7\3\2\2\2 \u00b2\3\2\2\2"+
		"\"\u00bd\3\2\2\2$\u00c8\3\2\2\2&(\5\4\3\2\'&\3\2\2\2(+\3\2\2\2)\'\3\2"+
		"\2\2)*\3\2\2\2*\3\3\2\2\2+)\3\2\2\2,:\5\f\7\2-:\5\16\b\2.:\5\20\t\2/:"+
		"\5\22\n\2\60:\5\24\13\2\61:\5\26\f\2\62:\5\30\r\2\63:\5\32\16\2\64:\5"+
		"\34\17\2\65:\5\36\20\2\66:\5 \21\2\67:\5\"\22\28:\5$\23\29,\3\2\2\29-"+
		"\3\2\2\29.\3\2\2\29/\3\2\2\29\60\3\2\2\29\61\3\2\2\29\62\3\2\2\29\63\3"+
		"\2\2\29\64\3\2\2\29\65\3\2\2\29\66\3\2\2\29\67\3\2\2\298\3\2\2\2:\5\3"+
		"\2\2\2;<\5\b\5\2<=\7\21\2\2=>\5\n\6\2>?\7\22\2\2?\7\3\2\2\2@A\7\20\2\2"+
		"A\t\3\2\2\2BC\t\2\2\2C\13\3\2\2\2DE\7\3\2\2EF\7\26\2\2FG\7\20\2\2GI\7"+
		"\22\2\2HJ\5\6\4\2IH\3\2\2\2JK\3\2\2\2KI\3\2\2\2KL\3\2\2\2LM\3\2\2\2MN"+
		"\7\27\2\2N\r\3\2\2\2OP\7\4\2\2PQ\7\26\2\2QR\7\20\2\2RT\7\22\2\2SU\5\6"+
		"\4\2TS\3\2\2\2UV\3\2\2\2VT\3\2\2\2VW\3\2\2\2WX\3\2\2\2XY\7\27\2\2Y\17"+
		"\3\2\2\2Z[\7\5\2\2[\\\7\26\2\2\\]\7\20\2\2]_\7\22\2\2^`\5\6\4\2_^\3\2"+
		"\2\2`a\3\2\2\2a_\3\2\2\2ab\3\2\2\2bc\3\2\2\2cd\7\27\2\2d\21\3\2\2\2ef"+
		"\7\6\2\2fg\7\26\2\2gh\7\20\2\2hj\7\22\2\2ik\5\6\4\2ji\3\2\2\2kl\3\2\2"+
		"\2lj\3\2\2\2lm\3\2\2\2mn\3\2\2\2no\7\27\2\2o\23\3\2\2\2pq\7\7\2\2qr\7"+
		"\26\2\2rs\7\20\2\2su\7\22\2\2tv\5\6\4\2ut\3\2\2\2vw\3\2\2\2wu\3\2\2\2"+
		"wx\3\2\2\2xy\3\2\2\2yz\7\27\2\2z\25\3\2\2\2{|\7\b\2\2|}\7\26\2\2}~\7\20"+
		"\2\2~\u0080\7\22\2\2\177\u0081\5\6\4\2\u0080\177\3\2\2\2\u0081\u0082\3"+
		"\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084\3\2\2\2\u0084"+
		"\u0085\7\27\2\2\u0085\27\3\2\2\2\u0086\u0087\7\t\2\2\u0087\u0088\7\26"+
		"\2\2\u0088\u0089\7\20\2\2\u0089\u008b\7\22\2\2\u008a\u008c\5\6\4\2\u008b"+
		"\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2"+
		"\2\2\u008e\u008f\3\2\2\2\u008f\u0090\7\27\2\2\u0090\31\3\2\2\2\u0091\u0092"+
		"\7\n\2\2\u0092\u0093\7\26\2\2\u0093\u0094\7\20\2\2\u0094\u0096\7\22\2"+
		"\2\u0095\u0097\5\6\4\2\u0096\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0096"+
		"\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b\7\27\2\2"+
		"\u009b\33\3\2\2\2\u009c\u009d\7\13\2\2\u009d\u009e\7\26\2\2\u009e\u009f"+
		"\7\20\2\2\u009f\u00a1\7\22\2\2\u00a0\u00a2\5\6\4\2\u00a1\u00a0\3\2\2\2"+
		"\u00a2\u00a3\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5"+
		"\3\2\2\2\u00a5\u00a6\7\27\2\2\u00a6\35\3\2\2\2\u00a7\u00a8\7\f\2\2\u00a8"+
		"\u00a9\7\26\2\2\u00a9\u00aa\7\20\2\2\u00aa\u00ac\7\22\2\2\u00ab\u00ad"+
		"\5\6\4\2\u00ac\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae"+
		"\u00af\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\7\27\2\2\u00b1\37\3\2\2"+
		"\2\u00b2\u00b3\7\r\2\2\u00b3\u00b4\7\26\2\2\u00b4\u00b5\7\20\2\2\u00b5"+
		"\u00b7\7\22\2\2\u00b6\u00b8\5\6\4\2\u00b7\u00b6\3\2\2\2\u00b8\u00b9\3"+
		"\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb"+
		"\u00bc\7\27\2\2\u00bc!\3\2\2\2\u00bd\u00be\7\16\2\2\u00be\u00bf\7\26\2"+
		"\2\u00bf\u00c0\7\20\2\2\u00c0\u00c2\7\22\2\2\u00c1\u00c3\5\6\4\2\u00c2"+
		"\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2"+
		"\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7\7\27\2\2\u00c7#\3\2\2\2\u00c8\u00c9"+
		"\7\17\2\2\u00c9\u00ca\7\26\2\2\u00ca\u00cb\7\20\2\2\u00cb\u00cd\7\22\2"+
		"\2\u00cc\u00ce\5\6\4\2\u00cd\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00cd"+
		"\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2\7\27\2\2"+
		"\u00d2%\3\2\2\2\21)9KValw\u0082\u008d\u0098\u00a3\u00ae\u00b9\u00c4\u00cf";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}