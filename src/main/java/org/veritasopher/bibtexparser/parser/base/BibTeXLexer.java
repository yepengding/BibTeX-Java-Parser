// Generated from /BibTeX-Grammar/BibTeXLexer.g4 by ANTLR 4.9.2
package org.veritasopher.bibtexparser.parser.base;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BibTeXLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ARTICLE", "BOOK", "BOOKLET", "INBOOK", "INCOLLECTION", "INPROCEEDINGS", 
			"PROCEEDINGS", "MANUAL", "MASTERTHESIS", "PHDTHESIS", "MISC", "TECHREPORT", 
			"UNPUBLISHED", "IDENTIFIER", "EQ", "COMMA", "DQUOTE", "LPAREN", "RPAREN", 
			"LBRACE", "RBRACE", "STRING_LITERAL", "INTEGER_LITERAL", "ESC", "UNICODE", 
			"INTEGER", "HEX", "QUOTE_ENCLOSED_SAFECODEPOINT", "BRACE_ENCLOSED_SAFECODEPOINT", 
			"WS", "LINE_COMMENT"
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


	public BibTeXLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "BibTeXLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\33\u012b\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\17\3\17\7\17\u00cf\n\17\f\17\16\17\u00d2\13"+
		"\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3"+
		"\26\3\27\3\27\3\27\7\27\u00e5\n\27\f\27\16\27\u00e8\13\27\3\27\3\27\3"+
		"\27\3\27\3\27\7\27\u00ef\n\27\f\27\16\27\u00f2\13\27\3\27\3\27\5\27\u00f6"+
		"\n\27\3\30\3\30\5\30\u00fa\n\30\3\30\3\30\3\30\5\30\u00ff\n\30\3\31\3"+
		"\31\3\31\5\31\u0104\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33"+
		"\7\33\u010f\n\33\f\33\16\33\u0112\13\33\5\33\u0114\n\33\3\34\3\34\3\35"+
		"\3\35\3\36\3\36\3\37\6\37\u011d\n\37\r\37\16\37\u011e\3\37\3\37\3 \3 "+
		"\7 \u0125\n \f \16 \u0128\13 \3 \3 \2\2!\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27"+
		"-\30/\31\61\2\63\2\65\2\67\29\2;\2=\32?\33\3\2\f\5\2C\\aac|\7\2//\62;"+
		"C\\aac|\n\2$$\61\61^^ddhhppttvv\3\2\63;\3\2\62;\5\2\62;CHch\5\2\2!$$^"+
		"^\4\2\2!^^\5\2\13\f\16\17\"\"\4\2\f\f\17\17\2\u0133\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'"+
		"\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2=\3\2\2\2\2?\3\2"+
		"\2\2\3A\3\2\2\2\5J\3\2\2\2\7P\3\2\2\2\tY\3\2\2\2\13a\3\2\2\2\ro\3\2\2"+
		"\2\17~\3\2\2\2\21\u008b\3\2\2\2\23\u0093\3\2\2\2\25\u00a2\3\2\2\2\27\u00ad"+
		"\3\2\2\2\31\u00b3\3\2\2\2\33\u00bf\3\2\2\2\35\u00cc\3\2\2\2\37\u00d3\3"+
		"\2\2\2!\u00d5\3\2\2\2#\u00d7\3\2\2\2%\u00d9\3\2\2\2\'\u00db\3\2\2\2)\u00dd"+
		"\3\2\2\2+\u00df\3\2\2\2-\u00f5\3\2\2\2/\u00f9\3\2\2\2\61\u0100\3\2\2\2"+
		"\63\u0105\3\2\2\2\65\u0113\3\2\2\2\67\u0115\3\2\2\29\u0117\3\2\2\2;\u0119"+
		"\3\2\2\2=\u011c\3\2\2\2?\u0122\3\2\2\2AB\7B\2\2BC\7c\2\2CD\7t\2\2DE\7"+
		"v\2\2EF\7k\2\2FG\7e\2\2GH\7n\2\2HI\7g\2\2I\4\3\2\2\2JK\7B\2\2KL\7d\2\2"+
		"LM\7q\2\2MN\7q\2\2NO\7m\2\2O\6\3\2\2\2PQ\7B\2\2QR\7d\2\2RS\7q\2\2ST\7"+
		"q\2\2TU\7m\2\2UV\7n\2\2VW\7g\2\2WX\7v\2\2X\b\3\2\2\2YZ\7B\2\2Z[\7k\2\2"+
		"[\\\7p\2\2\\]\7d\2\2]^\7q\2\2^_\7q\2\2_`\7m\2\2`\n\3\2\2\2ab\7B\2\2bc"+
		"\7k\2\2cd\7p\2\2de\7e\2\2ef\7q\2\2fg\7n\2\2gh\7n\2\2hi\7g\2\2ij\7e\2\2"+
		"jk\7v\2\2kl\7k\2\2lm\7q\2\2mn\7p\2\2n\f\3\2\2\2op\7B\2\2pq\7k\2\2qr\7"+
		"p\2\2rs\7r\2\2st\7t\2\2tu\7q\2\2uv\7e\2\2vw\7g\2\2wx\7g\2\2xy\7f\2\2y"+
		"z\7k\2\2z{\7p\2\2{|\7i\2\2|}\7u\2\2}\16\3\2\2\2~\177\7B\2\2\177\u0080"+
		"\7r\2\2\u0080\u0081\7t\2\2\u0081\u0082\7q\2\2\u0082\u0083\7e\2\2\u0083"+
		"\u0084\7g\2\2\u0084\u0085\7g\2\2\u0085\u0086\7f\2\2\u0086\u0087\7k\2\2"+
		"\u0087\u0088\7p\2\2\u0088\u0089\7i\2\2\u0089\u008a\7u\2\2\u008a\20\3\2"+
		"\2\2\u008b\u008c\7B\2\2\u008c\u008d\7o\2\2\u008d\u008e\7c\2\2\u008e\u008f"+
		"\7p\2\2\u008f\u0090\7w\2\2\u0090\u0091\7c\2\2\u0091\u0092\7n\2\2\u0092"+
		"\22\3\2\2\2\u0093\u0094\7B\2\2\u0094\u0095\7o\2\2\u0095\u0096\7c\2\2\u0096"+
		"\u0097\7u\2\2\u0097\u0098\7v\2\2\u0098\u0099\7g\2\2\u0099\u009a\7t\2\2"+
		"\u009a\u009b\7u\2\2\u009b\u009c\7v\2\2\u009c\u009d\7j\2\2\u009d\u009e"+
		"\7g\2\2\u009e\u009f\7u\2\2\u009f\u00a0\7k\2\2\u00a0\u00a1\7u\2\2\u00a1"+
		"\24\3\2\2\2\u00a2\u00a3\7B\2\2\u00a3\u00a4\7r\2\2\u00a4\u00a5\7j\2\2\u00a5"+
		"\u00a6\7f\2\2\u00a6\u00a7\7v\2\2\u00a7\u00a8\7j\2\2\u00a8\u00a9\7g\2\2"+
		"\u00a9\u00aa\7u\2\2\u00aa\u00ab\7k\2\2\u00ab\u00ac\7u\2\2\u00ac\26\3\2"+
		"\2\2\u00ad\u00ae\7B\2\2\u00ae\u00af\7o\2\2\u00af\u00b0\7k\2\2\u00b0\u00b1"+
		"\7u\2\2\u00b1\u00b2\7e\2\2\u00b2\30\3\2\2\2\u00b3\u00b4\7B\2\2\u00b4\u00b5"+
		"\7v\2\2\u00b5\u00b6\7g\2\2\u00b6\u00b7\7e\2\2\u00b7\u00b8\7j\2\2\u00b8"+
		"\u00b9\7t\2\2\u00b9\u00ba\7g\2\2\u00ba\u00bb\7r\2\2\u00bb\u00bc\7q\2\2"+
		"\u00bc\u00bd\7t\2\2\u00bd\u00be\7v\2\2\u00be\32\3\2\2\2\u00bf\u00c0\7"+
		"B\2\2\u00c0\u00c1\7w\2\2\u00c1\u00c2\7p\2\2\u00c2\u00c3\7r\2\2\u00c3\u00c4"+
		"\7w\2\2\u00c4\u00c5\7d\2\2\u00c5\u00c6\7n\2\2\u00c6\u00c7\7k\2\2\u00c7"+
		"\u00c8\7u\2\2\u00c8\u00c9\7j\2\2\u00c9\u00ca\7g\2\2\u00ca\u00cb\7f\2\2"+
		"\u00cb\34\3\2\2\2\u00cc\u00d0\t\2\2\2\u00cd\u00cf\t\3\2\2\u00ce\u00cd"+
		"\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1"+
		"\36\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3\u00d4\7?\2\2\u00d4 \3\2\2\2\u00d5"+
		"\u00d6\7.\2\2\u00d6\"\3\2\2\2\u00d7\u00d8\7$\2\2\u00d8$\3\2\2\2\u00d9"+
		"\u00da\7*\2\2\u00da&\3\2\2\2\u00db\u00dc\7+\2\2\u00dc(\3\2\2\2\u00dd\u00de"+
		"\7}\2\2\u00de*\3\2\2\2\u00df\u00e0\7\177\2\2\u00e0,\3\2\2\2\u00e1\u00e6"+
		"\5)\25\2\u00e2\u00e5\5\61\31\2\u00e3\u00e5\5;\36\2\u00e4\u00e2\3\2\2\2"+
		"\u00e4\u00e3\3\2\2\2\u00e5\u00e8\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7"+
		"\3\2\2\2\u00e7\u00e9\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e9\u00ea\5+\26\2\u00ea"+
		"\u00f6\3\2\2\2\u00eb\u00f0\5#\22\2\u00ec\u00ef\5\61\31\2\u00ed\u00ef\5"+
		"9\35\2\u00ee\u00ec\3\2\2\2\u00ee\u00ed\3\2\2\2\u00ef\u00f2\3\2\2\2\u00f0"+
		"\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f3\3\2\2\2\u00f2\u00f0\3\2"+
		"\2\2\u00f3\u00f4\5#\22\2\u00f4\u00f6\3\2\2\2\u00f5\u00e1\3\2\2\2\u00f5"+
		"\u00eb\3\2\2\2\u00f6.\3\2\2\2\u00f7\u00fa\5)\25\2\u00f8\u00fa\5#\22\2"+
		"\u00f9\u00f7\3\2\2\2\u00f9\u00f8\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fb"+
		"\3\2\2\2\u00fb\u00fe\5\65\33\2\u00fc\u00ff\5+\26\2\u00fd\u00ff\5#\22\2"+
		"\u00fe\u00fc\3\2\2\2\u00fe\u00fd\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\60"+
		"\3\2\2\2\u0100\u0103\7^\2\2\u0101\u0104\t\4\2\2\u0102\u0104\5\63\32\2"+
		"\u0103\u0101\3\2\2\2\u0103\u0102\3\2\2\2\u0104\62\3\2\2\2\u0105\u0106"+
		"\7w\2\2\u0106\u0107\5\67\34\2\u0107\u0108\5\67\34\2\u0108\u0109\5\67\34"+
		"\2\u0109\u010a\5\67\34\2\u010a\64\3\2\2\2\u010b\u0114\7\62\2\2\u010c\u0110"+
		"\t\5\2\2\u010d\u010f\t\6\2\2\u010e\u010d\3\2\2\2\u010f\u0112\3\2\2\2\u0110"+
		"\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0114\3\2\2\2\u0112\u0110\3\2"+
		"\2\2\u0113\u010b\3\2\2\2\u0113\u010c\3\2\2\2\u0114\66\3\2\2\2\u0115\u0116"+
		"\t\7\2\2\u01168\3\2\2\2\u0117\u0118\n\b\2\2\u0118:\3\2\2\2\u0119\u011a"+
		"\n\t\2\2\u011a<\3\2\2\2\u011b\u011d\t\n\2\2\u011c\u011b\3\2\2\2\u011d"+
		"\u011e\3\2\2\2\u011e\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0120\3\2"+
		"\2\2\u0120\u0121\b\37\2\2\u0121>\3\2\2\2\u0122\u0126\7\'\2\2\u0123\u0125"+
		"\n\13\2\2\u0124\u0123\3\2\2\2\u0125\u0128\3\2\2\2\u0126\u0124\3\2\2\2"+
		"\u0126\u0127\3\2\2\2\u0127\u0129\3\2\2\2\u0128\u0126\3\2\2\2\u0129\u012a"+
		"\b \2\2\u012a@\3\2\2\2\20\2\u00d0\u00e4\u00e6\u00ee\u00f0\u00f5\u00f9"+
		"\u00fe\u0103\u0110\u0113\u011e\u0126\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}