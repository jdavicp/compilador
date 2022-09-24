// Generated from /home/jdavicp/Desktop/compilador/sintatica.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class sintaticaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PROGRAM=1, INTEGER=2, BOOLEAN=3, BEGIN=4, END=5, WHILE=6, DO=7, READ=8, 
		VAR=9, FALSE=10, TRUE=11, WRITE=12, ID=13, CTE=14, OPAD=15, OPMUT=16, 
		OPLOG=17, OPNEG=18, OPREL=19, PVIG=20, PONTO=21, DPONTOS=22, VIG=23, ABPAR=24, 
		FPAR=25, ATRIB=26, WS=27, COMMENT=28;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PROGRAM", "INTEGER", "BOOLEAN", "BEGIN", "END", "WHILE", "DO", "READ", 
			"VAR", "FALSE", "TRUE", "WRITE", "ID", "CTE", "OPAD", "OPMUT", "OPLOG", 
			"OPNEG", "OPREL", "PVIG", "PONTO", "DPONTOS", "VIG", "ABPAR", "FPAR", 
			"ATRIB", "WS", "COMMENT", "A", "B", "C", "D", "E", "F", "G", "H", "I", 
			"J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", 
			"X", "Y", "Z", "LETTER", "NUMBER", "UNDERSCORE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "'~'", null, "';'", "'.'", "':'", 
			"','", "'('", "')'", "':='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PROGRAM", "INTEGER", "BOOLEAN", "BEGIN", "END", "WHILE", "DO", 
			"READ", "VAR", "FALSE", "TRUE", "WRITE", "ID", "CTE", "OPAD", "OPMUT", 
			"OPLOG", "OPNEG", "OPREL", "PVIG", "PONTO", "DPONTOS", "VIG", "ABPAR", 
			"FPAR", "ATRIB", "WS", "COMMENT"
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


	public sintaticaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "sintatica.g4"; }

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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 12:
			ID_action((RuleContext)_localctx, actionIndex);
			break;
		case 13:
			CTE_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void ID_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			1, 16
			break;
		}
	}
	private void CTE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			1, 5
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\36\u0138\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\5"+
		"\16\u00bd\n\16\3\16\3\16\3\16\5\16\u00c2\n\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\5\22\u00d2\n\22\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00df\n\24\3\25\3\25"+
		"\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\34"+
		"\3\34\3\34\3\34\3\35\3\35\7\35\u00f6\n\35\f\35\16\35\u00f9\13\35\3\35"+
		"\3\35\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3"+
		"%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60"+
		"\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67"+
		"\3\67\38\38\39\39\3:\3:\3\u00f7\2;\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\2=\2?\2A\2C\2E\2G\2I\2K\2M\2O\2Q\2S"+
		"\2U\2W\2Y\2[\2]\2_\2a\2c\2e\2g\2i\2k\2m\2o\2q\2s\2\3\2\"\3\2\62;\4\2-"+
		"-//\4\2,,\61\61\4\2>>@@\5\2\13\f\17\17\"\"\4\2CCcc\4\2DDdd\4\2EEee\4\2"+
		"FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4"+
		"\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWw"+
		"w\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\4\2C\\c|\2\u0123\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2"+
		"\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2"+
		"\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\3u\3\2\2\2\5}\3"+
		"\2\2\2\7\u0085\3\2\2\2\t\u008d\3\2\2\2\13\u0093\3\2\2\2\r\u0097\3\2\2"+
		"\2\17\u009d\3\2\2\2\21\u00a0\3\2\2\2\23\u00a5\3\2\2\2\25\u00a9\3\2\2\2"+
		"\27\u00af\3\2\2\2\31\u00b4\3\2\2\2\33\u00bc\3\2\2\2\35\u00c5\3\2\2\2\37"+
		"\u00c8\3\2\2\2!\u00ca\3\2\2\2#\u00d1\3\2\2\2%\u00d3\3\2\2\2\'\u00de\3"+
		"\2\2\2)\u00e0\3\2\2\2+\u00e2\3\2\2\2-\u00e4\3\2\2\2/\u00e6\3\2\2\2\61"+
		"\u00e8\3\2\2\2\63\u00ea\3\2\2\2\65\u00ec\3\2\2\2\67\u00ef\3\2\2\29\u00f3"+
		"\3\2\2\2;\u00fe\3\2\2\2=\u0100\3\2\2\2?\u0102\3\2\2\2A\u0104\3\2\2\2C"+
		"\u0106\3\2\2\2E\u0108\3\2\2\2G\u010a\3\2\2\2I\u010c\3\2\2\2K\u010e\3\2"+
		"\2\2M\u0110\3\2\2\2O\u0112\3\2\2\2Q\u0114\3\2\2\2S\u0116\3\2\2\2U\u0118"+
		"\3\2\2\2W\u011a\3\2\2\2Y\u011c\3\2\2\2[\u011e\3\2\2\2]\u0120\3\2\2\2_"+
		"\u0122\3\2\2\2a\u0124\3\2\2\2c\u0126\3\2\2\2e\u0128\3\2\2\2g\u012a\3\2"+
		"\2\2i\u012c\3\2\2\2k\u012e\3\2\2\2m\u0130\3\2\2\2o\u0132\3\2\2\2q\u0134"+
		"\3\2\2\2s\u0136\3\2\2\2uv\5Y-\2vw\5]/\2wx\5W,\2xy\5G$\2yz\5]/\2z{\5;\36"+
		"\2{|\5S*\2|\4\3\2\2\2}~\5K&\2~\177\5U+\2\177\u0080\5a\61\2\u0080\u0081"+
		"\5C\"\2\u0081\u0082\5G$\2\u0082\u0083\5C\"\2\u0083\u0084\5]/\2\u0084\6"+
		"\3\2\2\2\u0085\u0086\5=\37\2\u0086\u0087\5W,\2\u0087\u0088\5W,\2\u0088"+
		"\u0089\5Q)\2\u0089\u008a\5C\"\2\u008a\u008b\5;\36\2\u008b\u008c\5U+\2"+
		"\u008c\b\3\2\2\2\u008d\u008e\5=\37\2\u008e\u008f\5C\"\2\u008f\u0090\5"+
		"G$\2\u0090\u0091\5K&\2\u0091\u0092\5U+\2\u0092\n\3\2\2\2\u0093\u0094\5"+
		"C\"\2\u0094\u0095\5U+\2\u0095\u0096\5A!\2\u0096\f\3\2\2\2\u0097\u0098"+
		"\5g\64\2\u0098\u0099\5I%\2\u0099\u009a\5K&\2\u009a\u009b\5Q)\2\u009b\u009c"+
		"\5C\"\2\u009c\16\3\2\2\2\u009d\u009e\5A!\2\u009e\u009f\5W,\2\u009f\20"+
		"\3\2\2\2\u00a0\u00a1\5]/\2\u00a1\u00a2\5C\"\2\u00a2\u00a3\5;\36\2\u00a3"+
		"\u00a4\5A!\2\u00a4\22\3\2\2\2\u00a5\u00a6\5e\63\2\u00a6\u00a7\5;\36\2"+
		"\u00a7\u00a8\5]/\2\u00a8\24\3\2\2\2\u00a9\u00aa\5E#\2\u00aa\u00ab\5;\36"+
		"\2\u00ab\u00ac\5Q)\2\u00ac\u00ad\5_\60\2\u00ad\u00ae\5C\"\2\u00ae\26\3"+
		"\2\2\2\u00af\u00b0\5a\61\2\u00b0\u00b1\5]/\2\u00b1\u00b2\5c\62\2\u00b2"+
		"\u00b3\5C\"\2\u00b3\30\3\2\2\2\u00b4\u00b5\5g\64\2\u00b5\u00b6\5]/\2\u00b6"+
		"\u00b7\5K&\2\u00b7\u00b8\5a\61\2\u00b8\u00b9\5C\"\2\u00b9\32\3\2\2\2\u00ba"+
		"\u00bd\5o8\2\u00bb\u00bd\5s:\2\u00bc\u00ba\3\2\2\2\u00bc\u00bb\3\2\2\2"+
		"\u00bd\u00c1\3\2\2\2\u00be\u00c2\5o8\2\u00bf\u00c2\5q9\2\u00c0\u00c2\5"+
		"s:\2\u00c1\u00be\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c0\3\2\2\2\u00c2"+
		"\u00c3\3\2\2\2\u00c3\u00c4\b\16\2\2\u00c4\34\3\2\2\2\u00c5\u00c6\t\2\2"+
		"\2\u00c6\u00c7\b\17\3\2\u00c7\36\3\2\2\2\u00c8\u00c9\t\3\2\2\u00c9 \3"+
		"\2\2\2\u00ca\u00cb\t\4\2\2\u00cb\"\3\2\2\2\u00cc\u00cd\7Q\2\2\u00cd\u00d2"+
		"\7T\2\2\u00ce\u00cf\7C\2\2\u00cf\u00d0\7P\2\2\u00d0\u00d2\7F\2\2\u00d1"+
		"\u00cc\3\2\2\2\u00d1\u00ce\3\2\2\2\u00d2$\3\2\2\2\u00d3\u00d4\7\u0080"+
		"\2\2\u00d4&\3\2\2\2\u00d5\u00df\t\5\2\2\u00d6\u00d7\7>\2\2\u00d7\u00df"+
		"\7?\2\2\u00d8\u00d9\7@\2\2\u00d9\u00df\7?\2\2\u00da\u00db\7?\2\2\u00db"+
		"\u00df\7?\2\2\u00dc\u00dd\7>\2\2\u00dd\u00df\7@\2\2\u00de\u00d5\3\2\2"+
		"\2\u00de\u00d6\3\2\2\2\u00de\u00d8\3\2\2\2\u00de\u00da\3\2\2\2\u00de\u00dc"+
		"\3\2\2\2\u00df(\3\2\2\2\u00e0\u00e1\7=\2\2\u00e1*\3\2\2\2\u00e2\u00e3"+
		"\7\60\2\2\u00e3,\3\2\2\2\u00e4\u00e5\7<\2\2\u00e5.\3\2\2\2\u00e6\u00e7"+
		"\7.\2\2\u00e7\60\3\2\2\2\u00e8\u00e9\7*\2\2\u00e9\62\3\2\2\2\u00ea\u00eb"+
		"\7+\2\2\u00eb\64\3\2\2\2\u00ec\u00ed\7<\2\2\u00ed\u00ee\7?\2\2\u00ee\66"+
		"\3\2\2\2\u00ef\u00f0\t\6\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f2\b\34\4\2"+
		"\u00f28\3\2\2\2\u00f3\u00f7\7\61\2\2\u00f4\u00f6\13\2\2\2\u00f5\u00f4"+
		"\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f8"+
		"\u00fa\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa\u00fb\7\61\2\2\u00fb\u00fc\3"+
		"\2\2\2\u00fc\u00fd\b\35\4\2\u00fd:\3\2\2\2\u00fe\u00ff\t\7\2\2\u00ff<"+
		"\3\2\2\2\u0100\u0101\t\b\2\2\u0101>\3\2\2\2\u0102\u0103\t\t\2\2\u0103"+
		"@\3\2\2\2\u0104\u0105\t\n\2\2\u0105B\3\2\2\2\u0106\u0107\t\13\2\2\u0107"+
		"D\3\2\2\2\u0108\u0109\t\f\2\2\u0109F\3\2\2\2\u010a\u010b\t\r\2\2\u010b"+
		"H\3\2\2\2\u010c\u010d\t\16\2\2\u010dJ\3\2\2\2\u010e\u010f\t\17\2\2\u010f"+
		"L\3\2\2\2\u0110\u0111\t\20\2\2\u0111N\3\2\2\2\u0112\u0113\t\21\2\2\u0113"+
		"P\3\2\2\2\u0114\u0115\t\22\2\2\u0115R\3\2\2\2\u0116\u0117\t\23\2\2\u0117"+
		"T\3\2\2\2\u0118\u0119\t\24\2\2\u0119V\3\2\2\2\u011a\u011b\t\25\2\2\u011b"+
		"X\3\2\2\2\u011c\u011d\t\26\2\2\u011dZ\3\2\2\2\u011e\u011f\t\27\2\2\u011f"+
		"\\\3\2\2\2\u0120\u0121\t\30\2\2\u0121^\3\2\2\2\u0122\u0123\t\31\2\2\u0123"+
		"`\3\2\2\2\u0124\u0125\t\32\2\2\u0125b\3\2\2\2\u0126\u0127\t\33\2\2\u0127"+
		"d\3\2\2\2\u0128\u0129\t\34\2\2\u0129f\3\2\2\2\u012a\u012b\t\35\2\2\u012b"+
		"h\3\2\2\2\u012c\u012d\t\36\2\2\u012dj\3\2\2\2\u012e\u012f\t\37\2\2\u012f"+
		"l\3\2\2\2\u0130\u0131\t \2\2\u0131n\3\2\2\2\u0132\u0133\t!\2\2\u0133p"+
		"\3\2\2\2\u0134\u0135\t\2\2\2\u0135r\3\2\2\2\u0136\u0137\7a\2\2\u0137t"+
		"\3\2\2\2\b\2\u00bc\u00c1\u00d1\u00de\u00f7\5\3\16\2\3\17\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}