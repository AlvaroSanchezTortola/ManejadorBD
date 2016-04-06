// Generated by ANTLR 4.4
package Parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SQLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__12=1, T__11=2, T__10=3, T__9=4, T__8=5, T__7=6, T__6=7, T__5=8, T__4=9, 
		T__3=10, T__2=11, T__1=12, T__0=13, K_CREATE=14, K_DATABASE=15, K_DATABASES=16, 
		K_DROP=17, K_USE=18, K_SHOW=19, K_ALTER=20, K_RENAME=21, K_TO=22, K_TABLE=23, 
		K_TABLES=24, K_CONSTRAINT=25, K_COLUMN=26, K_COLUMNS=27, K_FROM=28, K_ADD=29, 
		K_SELECT=30, K_WHERE=31, K_INT=32, K_DATE=33, K_CHAR=34, K_FLOAT=35, K_PRIMARY=36, 
		K_CHECK=37, K_REFERENCES=38, K_FOREIGN=39, K_KEY=40, K_INSERT=41, K_INTO=42, 
		K_VALUES=43, K_ORDER=44, K_SET=45, K_UPDATE=46, K_BY=47, K_ASC=48, K_DESC=49, 
		K_AND=50, K_OR=51, K_NOT=52, K_NULL=53, K_DELETE=54, SPACES=55, SINGLE_LINE_COMMENT=56, 
		MULTILINE_COMMENT=57, ID=58, NUM=59, UNUM=60, DATE=61, CHAR=62;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'", 
		"'\\u001F'", "' '", "'!'", "'\"'", "'#'", "'$'", "'%'", "'&'", "'''", 
		"'('", "')'", "'*'", "'+'", "','", "'-'", "'.'", "'/'", "'0'", "'1'", 
		"'2'", "'3'", "'4'", "'5'", "'6'", "'7'", "'8'", "'9'", "':'", "';'", 
		"'<'", "'='", "'>'"
	};
	public static final String[] ruleNames = {
		"T__12", "T__11", "T__10", "T__9", "T__8", "T__7", "T__6", "T__5", "T__4", 
		"T__3", "T__2", "T__1", "T__0", "LETTER", "DIGIT", "K_CREATE", "K_DATABASE", 
		"K_DATABASES", "K_DROP", "K_USE", "K_SHOW", "K_ALTER", "K_RENAME", "K_TO", 
		"K_TABLE", "K_TABLES", "K_CONSTRAINT", "K_COLUMN", "K_COLUMNS", "K_FROM", 
		"K_ADD", "K_SELECT", "K_WHERE", "K_INT", "K_DATE", "K_CHAR", "K_FLOAT", 
		"K_PRIMARY", "K_CHECK", "K_REFERENCES", "K_FOREIGN", "K_KEY", "K_INSERT", 
		"K_INTO", "K_VALUES", "K_ORDER", "K_SET", "K_UPDATE", "K_BY", "K_ASC", 
		"K_DESC", "K_AND", "K_OR", "K_NOT", "K_NULL", "K_DELETE", "SPACES", "SINGLE_LINE_COMMENT", 
		"MULTILINE_COMMENT", "ID", "NUM", "UNUM", "DATE", "CHAR"
	};


	public SQLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SQL.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2@\u01e2\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3"+
		"\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16"+
		"\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3&\3"+
		"&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3)\3)"+
		"\3)\3)\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3,\3,"+
		"\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/"+
		"\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62"+
		"\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\66"+
		"\3\66\3\66\3\67\3\67\3\67\3\67\38\38\38\38\38\39\39\39\39\39\39\39\3:"+
		"\6:\u019b\n:\r:\16:\u019c\3:\3:\3;\3;\3;\3;\7;\u01a5\n;\f;\16;\u01a8\13"+
		";\3;\3;\3<\3<\3<\3<\7<\u01b0\n<\f<\16<\u01b3\13<\3<\3<\3<\5<\u01b8\n<"+
		"\3<\3<\3=\3=\3=\7=\u01bf\n=\f=\16=\u01c2\13=\3>\3>\7>\u01c6\n>\f>\16>"+
		"\u01c9\13>\3?\3?\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3A\3A\7A\u01dc"+
		"\nA\fA\16A\u01df\13A\3A\3A\3\u01b1\2B\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\2\37\2!\20#\21%\22\'\23)\24+\25-\26"+
		"/\27\61\30\63\31\65\32\67\339\34;\35=\36?\37A C!E\"G#I$K%M&O\'Q(S)U*W"+
		"+Y,[-]._/a\60c\61e\62g\63i\64k\65m\66o\67q8s9u:w;y<{=}>\177?\u0081@\3"+
		"\2\34\4\2C\\c|\4\2EEee\4\2TTtt\4\2GGgg\4\2CCcc\4\2VVvv\4\2FFff\4\2DDd"+
		"d\4\2UUuu\4\2QQqq\4\2RRrr\4\2WWww\4\2JJjj\4\2YYyy\4\2NNnn\4\2PPpp\4\2"+
		"OOoo\4\2KKkk\4\2HHhh\4\2[[{{\4\2MMmm\4\2IIii\4\2XXxx\5\2\13\f\16\17\""+
		"\"\4\2\f\f\17\17\5\2\f\f\17\17))\u01e7\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2"+
		"\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3"+
		"\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2"+
		"\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2"+
		"S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3"+
		"\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2"+
		"\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2"+
		"y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\3\u0083"+
		"\3\2\2\2\5\u0086\3\2\2\2\7\u0088\3\2\2\2\t\u008a\3\2\2\2\13\u008c\3\2"+
		"\2\2\r\u008e\3\2\2\2\17\u0091\3\2\2\2\21\u0094\3\2\2\2\23\u0096\3\2\2"+
		"\2\25\u0098\3\2\2\2\27\u009a\3\2\2\2\31\u009c\3\2\2\2\33\u009e\3\2\2\2"+
		"\35\u00a0\3\2\2\2\37\u00a2\3\2\2\2!\u00a4\3\2\2\2#\u00ab\3\2\2\2%\u00b4"+
		"\3\2\2\2\'\u00be\3\2\2\2)\u00c3\3\2\2\2+\u00c7\3\2\2\2-\u00cc\3\2\2\2"+
		"/\u00d2\3\2\2\2\61\u00d9\3\2\2\2\63\u00dc\3\2\2\2\65\u00e2\3\2\2\2\67"+
		"\u00e9\3\2\2\29\u00f4\3\2\2\2;\u00fb\3\2\2\2=\u0103\3\2\2\2?\u0108\3\2"+
		"\2\2A\u010c\3\2\2\2C\u0113\3\2\2\2E\u0119\3\2\2\2G\u011d\3\2\2\2I\u0122"+
		"\3\2\2\2K\u0127\3\2\2\2M\u012d\3\2\2\2O\u0135\3\2\2\2Q\u013b\3\2\2\2S"+
		"\u0146\3\2\2\2U\u014e\3\2\2\2W\u0152\3\2\2\2Y\u0159\3\2\2\2[\u015e\3\2"+
		"\2\2]\u0165\3\2\2\2_\u016b\3\2\2\2a\u016f\3\2\2\2c\u0176\3\2\2\2e\u0179"+
		"\3\2\2\2g\u017d\3\2\2\2i\u0182\3\2\2\2k\u0186\3\2\2\2m\u0189\3\2\2\2o"+
		"\u018d\3\2\2\2q\u0192\3\2\2\2s\u019a\3\2\2\2u\u01a0\3\2\2\2w\u01ab\3\2"+
		"\2\2y\u01bb\3\2\2\2{\u01c3\3\2\2\2}\u01ca\3\2\2\2\177\u01cc\3\2\2\2\u0081"+
		"\u01d9\3\2\2\2\u0083\u0084\7@\2\2\u0084\u0085\7?\2\2\u0085\4\3\2\2\2\u0086"+
		"\u0087\7=\2\2\u0087\6\3\2\2\2\u0088\u0089\7>\2\2\u0089\b\3\2\2\2\u008a"+
		"\u008b\7?\2\2\u008b\n\3\2\2\2\u008c\u008d\7@\2\2\u008d\f\3\2\2\2\u008e"+
		"\u008f\7>\2\2\u008f\u0090\7?\2\2\u0090\16\3\2\2\2\u0091\u0092\7>\2\2\u0092"+
		"\u0093\7@\2\2\u0093\20\3\2\2\2\u0094\u0095\7*\2\2\u0095\22\3\2\2\2\u0096"+
		"\u0097\7+\2\2\u0097\24\3\2\2\2\u0098\u0099\7,\2\2\u0099\26\3\2\2\2\u009a"+
		"\u009b\7.\2\2\u009b\30\3\2\2\2\u009c\u009d\7/\2\2\u009d\32\3\2\2\2\u009e"+
		"\u009f\7\60\2\2\u009f\34\3\2\2\2\u00a0\u00a1\t\2\2\2\u00a1\36\3\2\2\2"+
		"\u00a2\u00a3\4\62;\2\u00a3 \3\2\2\2\u00a4\u00a5\t\3\2\2\u00a5\u00a6\t"+
		"\4\2\2\u00a6\u00a7\t\5\2\2\u00a7\u00a8\t\6\2\2\u00a8\u00a9\t\7\2\2\u00a9"+
		"\u00aa\t\5\2\2\u00aa\"\3\2\2\2\u00ab\u00ac\t\b\2\2\u00ac\u00ad\t\6\2\2"+
		"\u00ad\u00ae\t\7\2\2\u00ae\u00af\t\6\2\2\u00af\u00b0\t\t\2\2\u00b0\u00b1"+
		"\t\6\2\2\u00b1\u00b2\t\n\2\2\u00b2\u00b3\t\5\2\2\u00b3$\3\2\2\2\u00b4"+
		"\u00b5\t\b\2\2\u00b5\u00b6\t\6\2\2\u00b6\u00b7\t\7\2\2\u00b7\u00b8\t\6"+
		"\2\2\u00b8\u00b9\t\t\2\2\u00b9\u00ba\t\6\2\2\u00ba\u00bb\t\n\2\2\u00bb"+
		"\u00bc\t\5\2\2\u00bc\u00bd\t\n\2\2\u00bd&\3\2\2\2\u00be\u00bf\t\b\2\2"+
		"\u00bf\u00c0\t\4\2\2\u00c0\u00c1\t\13\2\2\u00c1\u00c2\t\f\2\2\u00c2(\3"+
		"\2\2\2\u00c3\u00c4\t\r\2\2\u00c4\u00c5\t\n\2\2\u00c5\u00c6\t\5\2\2\u00c6"+
		"*\3\2\2\2\u00c7\u00c8\t\n\2\2\u00c8\u00c9\t\16\2\2\u00c9\u00ca\t\13\2"+
		"\2\u00ca\u00cb\t\17\2\2\u00cb,\3\2\2\2\u00cc\u00cd\t\6\2\2\u00cd\u00ce"+
		"\t\20\2\2\u00ce\u00cf\t\7\2\2\u00cf\u00d0\t\5\2\2\u00d0\u00d1\t\4\2\2"+
		"\u00d1.\3\2\2\2\u00d2\u00d3\t\4\2\2\u00d3\u00d4\t\5\2\2\u00d4\u00d5\t"+
		"\21\2\2\u00d5\u00d6\t\6\2\2\u00d6\u00d7\t\22\2\2\u00d7\u00d8\t\5\2\2\u00d8"+
		"\60\3\2\2\2\u00d9\u00da\t\7\2\2\u00da\u00db\t\13\2\2\u00db\62\3\2\2\2"+
		"\u00dc\u00dd\t\7\2\2\u00dd\u00de\t\6\2\2\u00de\u00df\t\t\2\2\u00df\u00e0"+
		"\t\20\2\2\u00e0\u00e1\t\5\2\2\u00e1\64\3\2\2\2\u00e2\u00e3\t\7\2\2\u00e3"+
		"\u00e4\t\6\2\2\u00e4\u00e5\t\t\2\2\u00e5\u00e6\t\20\2\2\u00e6\u00e7\t"+
		"\5\2\2\u00e7\u00e8\t\n\2\2\u00e8\66\3\2\2\2\u00e9\u00ea\t\3\2\2\u00ea"+
		"\u00eb\t\13\2\2\u00eb\u00ec\t\21\2\2\u00ec\u00ed\t\n\2\2\u00ed\u00ee\t"+
		"\7\2\2\u00ee\u00ef\t\4\2\2\u00ef\u00f0\t\6\2\2\u00f0\u00f1\t\23\2\2\u00f1"+
		"\u00f2\t\21\2\2\u00f2\u00f3\t\7\2\2\u00f38\3\2\2\2\u00f4\u00f5\t\3\2\2"+
		"\u00f5\u00f6\t\13\2\2\u00f6\u00f7\t\20\2\2\u00f7\u00f8\t\r\2\2\u00f8\u00f9"+
		"\t\22\2\2\u00f9\u00fa\t\21\2\2\u00fa:\3\2\2\2\u00fb\u00fc\t\3\2\2\u00fc"+
		"\u00fd\t\13\2\2\u00fd\u00fe\t\20\2\2\u00fe\u00ff\t\r\2\2\u00ff\u0100\t"+
		"\22\2\2\u0100\u0101\t\21\2\2\u0101\u0102\t\n\2\2\u0102<\3\2\2\2\u0103"+
		"\u0104\t\24\2\2\u0104\u0105\t\4\2\2\u0105\u0106\t\13\2\2\u0106\u0107\t"+
		"\22\2\2\u0107>\3\2\2\2\u0108\u0109\t\6\2\2\u0109\u010a\t\b\2\2\u010a\u010b"+
		"\t\b\2\2\u010b@\3\2\2\2\u010c\u010d\t\n\2\2\u010d\u010e\t\5\2\2\u010e"+
		"\u010f\t\20\2\2\u010f\u0110\t\5\2\2\u0110\u0111\t\3\2\2\u0111\u0112\t"+
		"\7\2\2\u0112B\3\2\2\2\u0113\u0114\t\17\2\2\u0114\u0115\t\16\2\2\u0115"+
		"\u0116\t\5\2\2\u0116\u0117\t\4\2\2\u0117\u0118\t\5\2\2\u0118D\3\2\2\2"+
		"\u0119\u011a\t\23\2\2\u011a\u011b\t\21\2\2\u011b\u011c\t\7\2\2\u011cF"+
		"\3\2\2\2\u011d\u011e\t\b\2\2\u011e\u011f\t\6\2\2\u011f\u0120\t\7\2\2\u0120"+
		"\u0121\t\5\2\2\u0121H\3\2\2\2\u0122\u0123\t\3\2\2\u0123\u0124\t\16\2\2"+
		"\u0124\u0125\t\6\2\2\u0125\u0126\t\4\2\2\u0126J\3\2\2\2\u0127\u0128\t"+
		"\24\2\2\u0128\u0129\t\20\2\2\u0129\u012a\t\13\2\2\u012a\u012b\t\6\2\2"+
		"\u012b\u012c\t\7\2\2\u012cL\3\2\2\2\u012d\u012e\t\f\2\2\u012e\u012f\t"+
		"\4\2\2\u012f\u0130\t\23\2\2\u0130\u0131\t\22\2\2\u0131\u0132\t\6\2\2\u0132"+
		"\u0133\t\4\2\2\u0133\u0134\t\25\2\2\u0134N\3\2\2\2\u0135\u0136\t\3\2\2"+
		"\u0136\u0137\t\16\2\2\u0137\u0138\t\5\2\2\u0138\u0139\t\3\2\2\u0139\u013a"+
		"\t\26\2\2\u013aP\3\2\2\2\u013b\u013c\t\4\2\2\u013c\u013d\t\5\2\2\u013d"+
		"\u013e\t\24\2\2\u013e\u013f\t\5\2\2\u013f\u0140\t\4\2\2\u0140\u0141\t"+
		"\5\2\2\u0141\u0142\t\21\2\2\u0142\u0143\t\3\2\2\u0143\u0144\t\5\2\2\u0144"+
		"\u0145\t\n\2\2\u0145R\3\2\2\2\u0146\u0147\t\24\2\2\u0147\u0148\t\13\2"+
		"\2\u0148\u0149\t\4\2\2\u0149\u014a\t\5\2\2\u014a\u014b\t\23\2\2\u014b"+
		"\u014c\t\27\2\2\u014c\u014d\t\21\2\2\u014dT\3\2\2\2\u014e\u014f\t\26\2"+
		"\2\u014f\u0150\t\5\2\2\u0150\u0151\t\25\2\2\u0151V\3\2\2\2\u0152\u0153"+
		"\t\23\2\2\u0153\u0154\t\21\2\2\u0154\u0155\t\n\2\2\u0155\u0156\t\5\2\2"+
		"\u0156\u0157\t\4\2\2\u0157\u0158\t\7\2\2\u0158X\3\2\2\2\u0159\u015a\t"+
		"\23\2\2\u015a\u015b\t\21\2\2\u015b\u015c\t\7\2\2\u015c\u015d\t\13\2\2"+
		"\u015dZ\3\2\2\2\u015e\u015f\t\30\2\2\u015f\u0160\t\6\2\2\u0160\u0161\t"+
		"\20\2\2\u0161\u0162\t\r\2\2\u0162\u0163\t\5\2\2\u0163\u0164\t\n\2\2\u0164"+
		"\\\3\2\2\2\u0165\u0166\t\13\2\2\u0166\u0167\t\4\2\2\u0167\u0168\t\b\2"+
		"\2\u0168\u0169\t\5\2\2\u0169\u016a\t\4\2\2\u016a^\3\2\2\2\u016b\u016c"+
		"\t\n\2\2\u016c\u016d\t\5\2\2\u016d\u016e\t\7\2\2\u016e`\3\2\2\2\u016f"+
		"\u0170\t\r\2\2\u0170\u0171\t\f\2\2\u0171\u0172\t\b\2\2\u0172\u0173\t\6"+
		"\2\2\u0173\u0174\t\7\2\2\u0174\u0175\t\5\2\2\u0175b\3\2\2\2\u0176\u0177"+
		"\t\t\2\2\u0177\u0178\t\25\2\2\u0178d\3\2\2\2\u0179\u017a\t\6\2\2\u017a"+
		"\u017b\t\n\2\2\u017b\u017c\t\3\2\2\u017cf\3\2\2\2\u017d\u017e\t\b\2\2"+
		"\u017e\u017f\t\5\2\2\u017f\u0180\t\n\2\2\u0180\u0181\t\3\2\2\u0181h\3"+
		"\2\2\2\u0182\u0183\t\6\2\2\u0183\u0184\t\21\2\2\u0184\u0185\t\b\2\2\u0185"+
		"j\3\2\2\2\u0186\u0187\t\13\2\2\u0187\u0188\t\4\2\2\u0188l\3\2\2\2\u0189"+
		"\u018a\t\21\2\2\u018a\u018b\t\13\2\2\u018b\u018c\t\7\2\2\u018cn\3\2\2"+
		"\2\u018d\u018e\t\21\2\2\u018e\u018f\t\r\2\2\u018f\u0190\t\20\2\2\u0190"+
		"\u0191\t\20\2\2\u0191p\3\2\2\2\u0192\u0193\t\b\2\2\u0193\u0194\t\5\2\2"+
		"\u0194\u0195\t\20\2\2\u0195\u0196\t\5\2\2\u0196\u0197\t\7\2\2\u0197\u0198"+
		"\t\5\2\2\u0198r\3\2\2\2\u0199\u019b\t\31\2\2\u019a\u0199\3\2\2\2\u019b"+
		"\u019c\3\2\2\2\u019c\u019a\3\2\2\2\u019c\u019d\3\2\2\2\u019d\u019e\3\2"+
		"\2\2\u019e\u019f\b:\2\2\u019ft\3\2\2\2\u01a0\u01a1\7\61\2\2\u01a1\u01a2"+
		"\7\61\2\2\u01a2\u01a6\3\2\2\2\u01a3\u01a5\n\32\2\2\u01a4\u01a3\3\2\2\2"+
		"\u01a5\u01a8\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7\u01a9"+
		"\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a9\u01aa\b;\2\2\u01aav\3\2\2\2\u01ab\u01ac"+
		"\7\61\2\2\u01ac\u01ad\7,\2\2\u01ad\u01b1\3\2\2\2\u01ae\u01b0\13\2\2\2"+
		"\u01af\u01ae\3\2\2\2\u01b0\u01b3\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b1\u01af"+
		"\3\2\2\2\u01b2\u01b7\3\2\2\2\u01b3\u01b1\3\2\2\2\u01b4\u01b5\7,\2\2\u01b5"+
		"\u01b8\7\61\2\2\u01b6\u01b8\7\2\2\3\u01b7\u01b4\3\2\2\2\u01b7\u01b6\3"+
		"\2\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01ba\b<\2\2\u01bax\3\2\2\2\u01bb\u01c0"+
		"\5\35\17\2\u01bc\u01bf\5\35\17\2\u01bd\u01bf\5\37\20\2\u01be\u01bc\3\2"+
		"\2\2\u01be\u01bd\3\2\2\2\u01bf\u01c2\3\2\2\2\u01c0\u01be\3\2\2\2\u01c0"+
		"\u01c1\3\2\2\2\u01c1z\3\2\2\2\u01c2\u01c0\3\2\2\2\u01c3\u01c7\5}?\2\u01c4"+
		"\u01c6\5}?\2\u01c5\u01c4\3\2\2\2\u01c6\u01c9\3\2\2\2\u01c7\u01c5\3\2\2"+
		"\2\u01c7\u01c8\3\2\2\2\u01c8|\3\2\2\2\u01c9\u01c7\3\2\2\2\u01ca\u01cb"+
		"\5\37\20\2\u01cb~\3\2\2\2\u01cc\u01cd\7)\2\2\u01cd\u01ce\5}?\2\u01ce\u01cf"+
		"\5}?\2\u01cf\u01d0\5}?\2\u01d0\u01d1\5}?\2\u01d1\u01d2\7/\2\2\u01d2\u01d3"+
		"\5}?\2\u01d3\u01d4\5}?\2\u01d4\u01d5\7/\2\2\u01d5\u01d6\5}?\2\u01d6\u01d7"+
		"\5}?\2\u01d7\u01d8\7)\2\2\u01d8\u0080\3\2\2\2\u01d9\u01dd\7)\2\2\u01da"+
		"\u01dc\n\33\2\2\u01db\u01da\3\2\2\2\u01dc\u01df\3\2\2\2\u01dd\u01db\3"+
		"\2\2\2\u01dd\u01de\3\2\2\2\u01de\u01e0\3\2\2\2\u01df\u01dd\3\2\2\2\u01e0"+
		"\u01e1\7)\2\2\u01e1\u0082\3\2\2\2\13\2\u019c\u01a6\u01b1\u01b7\u01be\u01c0"+
		"\u01c7\u01dd\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}