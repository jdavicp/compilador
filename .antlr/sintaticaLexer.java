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
		Expr=1, Terms=2, OPS=3, PROGRAM=4, INTEGER=5, BOOLEAN=6, BEGIN=7, END=8, 
		WHILE=9, DO=10, READ=11, VAR=12, FALSE=13, TRUE=14, WRITE=15, IF=16, THEN=17, 
		ELSE=18, STRING=19, ID=20, CTE=21, MAIS=22, MENOS=23, MULT=24, DIV=25, 
		OR=26, AND=27, NEG=28, OPAD=29, OPMUT=30, OPLOG=31, OPNEG=32, MENOR=33, 
		MAIOR=34, MENORIG=35, MAIORIG=36, IGUAL=37, DIFERENTE=38, OPREL=39, PVIG=40, 
		PONTO=41, DPONTOS=42, VIG=43, ABPAR=44, FPAR=45, ATRIB=46, CADEIA=47, 
		WS=48, COMMENT=49;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"Expr", "Terms", "OPS", "PROGRAM", "INTEGER", "BOOLEAN", "BEGIN", "END", 
			"WHILE", "DO", "READ", "VAR", "FALSE", "TRUE", "WRITE", "IF", "THEN", 
			"ELSE", "STRING", "ID", "CTE", "MAIS", "MENOS", "MULT", "DIV", "OR", 
			"AND", "NEG", "OPAD", "OPMUT", "OPLOG", "OPNEG", "MENOR", "MAIOR", "MENORIG", 
			"MAIORIG", "IGUAL", "DIFERENTE", "OPREL", "PVIG", "PONTO", "DPONTOS", 
			"VIG", "ABPAR", "FPAR", "ATRIB", "CADEIA", "WS", "COMMENT", "A", "B", 
			"C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", 
			"Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "LETTER", "NUMBER", 
			"UNDERSCORE", "SYMBOLS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "'+'", "'-'", 
			"'*'", "'/'", null, null, "'~'", null, null, null, null, "'<'", "'>'", 
			"'<='", "'>='", "'=='", "'<>'", null, "';'", "'.'", "':'", "','", "'('", 
			"')'", "':='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Expr", "Terms", "OPS", "PROGRAM", "INTEGER", "BOOLEAN", "BEGIN", 
			"END", "WHILE", "DO", "READ", "VAR", "FALSE", "TRUE", "WRITE", "IF", 
			"THEN", "ELSE", "STRING", "ID", "CTE", "MAIS", "MENOS", "MULT", "DIV", 
			"OR", "AND", "NEG", "OPAD", "OPMUT", "OPLOG", "OPNEG", "MENOR", "MAIOR", 
			"MENORIG", "MAIORIG", "IGUAL", "DIFERENTE", "OPREL", "PVIG", "PONTO", 
			"DPONTOS", "VIG", "ABPAR", "FPAR", "ATRIB", "CADEIA", "WS", "COMMENT"
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\63\u01c5\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t"+
		"=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4"+
		"I\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\5\2\u00ac\n\2\3\2\5\2\u00af\n\2\3\3\3\3\3\3\3\3\5\3\u00b5"+
		"\n\3\3\4\3\4\3\4\5\4\u00ba\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f"+
		"\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3"+
		"\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3"+
		"\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\25\3\25\5\25\u0117\n\25\3\25\3\25\3\25\7\25\u011c\n\25\f\25"+
		"\16\25\u011f\13\25\3\26\6\26\u0122\n\26\r\26\16\26\u0123\3\27\3\27\3\30"+
		"\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35"+
		"\3\36\3\36\5\36\u0139\n\36\3\37\3\37\5\37\u013d\n\37\3 \3 \5 \u0141\n"+
		" \3!\3!\3\"\3\"\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3(\3(\3("+
		"\3(\3(\3(\5(\u015b\n(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3/\3\60"+
		"\3\60\3\60\3\60\3\60\7\60\u0171\n\60\f\60\16\60\u0174\13\60\3\60\3\60"+
		"\3\61\6\61\u0179\n\61\r\61\16\61\u017a\3\61\3\61\3\62\3\62\7\62\u0181"+
		"\n\62\f\62\16\62\u0184\13\62\3\62\3\62\3\62\3\62\3\63\3\63\3\64\3\64\3"+
		"\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3"+
		">\3?\3?\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3F\3F\3G\3G\3H\3H\3I\3I\3"+
		"J\3J\3K\3K\3L\3L\3M\3M\3N\3N\3O\3O\3P\3P\3\u0182\2Q\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'"+
		"M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\2g\2i\2k\2m\2o\2q\2s\2u\2w\2y\2{\2}"+
		"\2\177\2\u0081\2\u0083\2\u0085\2\u0087\2\u0089\2\u008b\2\u008d\2\u008f"+
		"\2\u0091\2\u0093\2\u0095\2\u0097\2\u0099\2\u009b\2\u009d\2\u009f\2\3\2"+
		" \5\2\13\f\17\17\"\"\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4"+
		"\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQq"+
		"q\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2"+
		"ZZzz\4\2[[{{\4\2\\\\||\4\2C\\c|\3\2\62;\b\2##%(,-//??BB\2\u01c2\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2"+
		"%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61"+
		"\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2"+
		"\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I"+
		"\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2"+
		"\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2"+
		"\2c\3\2\2\2\3\u00ae\3\2\2\2\5\u00b4\3\2\2\2\7\u00b9\3\2\2\2\t\u00bb\3"+
		"\2\2\2\13\u00c3\3\2\2\2\r\u00cb\3\2\2\2\17\u00d3\3\2\2\2\21\u00d9\3\2"+
		"\2\2\23\u00dd\3\2\2\2\25\u00e3\3\2\2\2\27\u00e6\3\2\2\2\31\u00eb\3\2\2"+
		"\2\33\u00ef\3\2\2\2\35\u00f5\3\2\2\2\37\u00fa\3\2\2\2!\u0100\3\2\2\2#"+
		"\u0103\3\2\2\2%\u0108\3\2\2\2\'\u010d\3\2\2\2)\u0116\3\2\2\2+\u0121\3"+
		"\2\2\2-\u0125\3\2\2\2/\u0127\3\2\2\2\61\u0129\3\2\2\2\63\u012b\3\2\2\2"+
		"\65\u012d\3\2\2\2\67\u0130\3\2\2\29\u0134\3\2\2\2;\u0138\3\2\2\2=\u013c"+
		"\3\2\2\2?\u0140\3\2\2\2A\u0142\3\2\2\2C\u0144\3\2\2\2E\u0146\3\2\2\2G"+
		"\u0148\3\2\2\2I\u014b\3\2\2\2K\u014e\3\2\2\2M\u0151\3\2\2\2O\u015a\3\2"+
		"\2\2Q\u015c\3\2\2\2S\u015e\3\2\2\2U\u0160\3\2\2\2W\u0162\3\2\2\2Y\u0164"+
		"\3\2\2\2[\u0166\3\2\2\2]\u0168\3\2\2\2_\u016b\3\2\2\2a\u0178\3\2\2\2c"+
		"\u017e\3\2\2\2e\u0189\3\2\2\2g\u018b\3\2\2\2i\u018d\3\2\2\2k\u018f\3\2"+
		"\2\2m\u0191\3\2\2\2o\u0193\3\2\2\2q\u0195\3\2\2\2s\u0197\3\2\2\2u\u0199"+
		"\3\2\2\2w\u019b\3\2\2\2y\u019d\3\2\2\2{\u019f\3\2\2\2}\u01a1\3\2\2\2\177"+
		"\u01a3\3\2\2\2\u0081\u01a5\3\2\2\2\u0083\u01a7\3\2\2\2\u0085\u01a9\3\2"+
		"\2\2\u0087\u01ab\3\2\2\2\u0089\u01ad\3\2\2\2\u008b\u01af\3\2\2\2\u008d"+
		"\u01b1\3\2\2\2\u008f\u01b3\3\2\2\2\u0091\u01b5\3\2\2\2\u0093\u01b7\3\2"+
		"\2\2\u0095\u01b9\3\2\2\2\u0097\u01bb\3\2\2\2\u0099\u01bd\3\2\2\2\u009b"+
		"\u01bf\3\2\2\2\u009d\u01c1\3\2\2\2\u009f\u01c3\3\2\2\2\u00a1\u00a2\5Y"+
		"-\2\u00a2\u00a3\5\3\2\2\u00a3\u00a4\5[.\2\u00a4\u00af\3\2\2\2\u00a5\u00af"+
		"\5\5\3\2\u00a6\u00a7\5\5\3\2\u00a7\u00a8\5\7\4\2\u00a8\u00a9\5\5\3\2\u00a9"+
		"\u00af\3\2\2\2\u00aa\u00ac\5A!\2\u00ab\u00aa\3\2\2\2\u00ab\u00ac\3\2\2"+
		"\2\u00ac\u00ad\3\2\2\2\u00ad\u00af\5\5\3\2\u00ae\u00a1\3\2\2\2\u00ae\u00a5"+
		"\3\2\2\2\u00ae\u00a6\3\2\2\2\u00ae\u00ab\3\2\2\2\u00af\4\3\2\2\2\u00b0"+
		"\u00b5\5)\25\2\u00b1\u00b5\5+\26\2\u00b2\u00b5\5\35\17\2\u00b3\u00b5\5"+
		"\33\16\2\u00b4\u00b0\3\2\2\2\u00b4\u00b1\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4"+
		"\u00b3\3\2\2\2\u00b5\6\3\2\2\2\u00b6\u00ba\5O(\2\u00b7\u00ba\5;\36\2\u00b8"+
		"\u00ba\5=\37\2\u00b9\u00b6\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00b8\3\2"+
		"\2\2\u00ba\b\3\2\2\2\u00bb\u00bc\5\u0083B\2\u00bc\u00bd\5\u0087D\2\u00bd"+
		"\u00be\5\u0081A\2\u00be\u00bf\5q9\2\u00bf\u00c0\5\u0087D\2\u00c0\u00c1"+
		"\5e\63\2\u00c1\u00c2\5}?\2\u00c2\n\3\2\2\2\u00c3\u00c4\5u;\2\u00c4\u00c5"+
		"\5\177@\2\u00c5\u00c6\5\u008bF\2\u00c6\u00c7\5m\67\2\u00c7\u00c8\5q9\2"+
		"\u00c8\u00c9\5m\67\2\u00c9\u00ca\5\u0087D\2\u00ca\f\3\2\2\2\u00cb\u00cc"+
		"\5g\64\2\u00cc\u00cd\5\u0081A\2\u00cd\u00ce\5\u0081A\2\u00ce\u00cf\5{"+
		">\2\u00cf\u00d0\5m\67\2\u00d0\u00d1\5e\63\2\u00d1\u00d2\5\177@\2\u00d2"+
		"\16\3\2\2\2\u00d3\u00d4\5g\64\2\u00d4\u00d5\5m\67\2\u00d5\u00d6\5q9\2"+
		"\u00d6\u00d7\5u;\2\u00d7\u00d8\5\177@\2\u00d8\20\3\2\2\2\u00d9\u00da\5"+
		"m\67\2\u00da\u00db\5\177@\2\u00db\u00dc\5k\66\2\u00dc\22\3\2\2\2\u00dd"+
		"\u00de\5\u0091I\2\u00de\u00df\5s:\2\u00df\u00e0\5u;\2\u00e0\u00e1\5{>"+
		"\2\u00e1\u00e2\5m\67\2\u00e2\24\3\2\2\2\u00e3\u00e4\5k\66\2\u00e4\u00e5"+
		"\5\u0081A\2\u00e5\26\3\2\2\2\u00e6\u00e7\5\u0087D\2\u00e7\u00e8\5m\67"+
		"\2\u00e8\u00e9\5e\63\2\u00e9\u00ea\5k\66\2\u00ea\30\3\2\2\2\u00eb\u00ec"+
		"\5\u008fH\2\u00ec\u00ed\5e\63\2\u00ed\u00ee\5\u0087D\2\u00ee\32\3\2\2"+
		"\2\u00ef\u00f0\5o8\2\u00f0\u00f1\5e\63\2\u00f1\u00f2\5{>\2\u00f2\u00f3"+
		"\5\u0089E\2\u00f3\u00f4\5m\67\2\u00f4\34\3\2\2\2\u00f5\u00f6\5\u008bF"+
		"\2\u00f6\u00f7\5\u0087D\2\u00f7\u00f8\5\u008dG\2\u00f8\u00f9\5m\67\2\u00f9"+
		"\36\3\2\2\2\u00fa\u00fb\5\u0091I\2\u00fb\u00fc\5\u0087D\2\u00fc\u00fd"+
		"\5u;\2\u00fd\u00fe\5\u008bF\2\u00fe\u00ff\5m\67\2\u00ff \3\2\2\2\u0100"+
		"\u0101\5u;\2\u0101\u0102\5o8\2\u0102\"\3\2\2\2\u0103\u0104\5\u008bF\2"+
		"\u0104\u0105\5s:\2\u0105\u0106\5m\67\2\u0106\u0107\5\177@\2\u0107$\3\2"+
		"\2\2\u0108\u0109\5m\67\2\u0109\u010a\5{>\2\u010a\u010b\5\u0089E\2\u010b"+
		"\u010c\5m\67\2\u010c&\3\2\2\2\u010d\u010e\5\u0089E\2\u010e\u010f\5\u008b"+
		"F\2\u010f\u0110\5\u0087D\2\u0110\u0111\5u;\2\u0111\u0112\5\177@\2\u0112"+
		"\u0113\5q9\2\u0113(\3\2\2\2\u0114\u0117\5\u0099M\2\u0115\u0117\5\u009d"+
		"O\2\u0116\u0114\3\2\2\2\u0116\u0115\3\2\2\2\u0117\u011d\3\2\2\2\u0118"+
		"\u011c\5\u0099M\2\u0119\u011c\5\u009bN\2\u011a\u011c\5\u009dO\2\u011b"+
		"\u0118\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011a\3\2\2\2\u011c\u011f\3\2"+
		"\2\2\u011d\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e*\3\2\2\2\u011f\u011d"+
		"\3\2\2\2\u0120\u0122\5\u009bN\2\u0121\u0120\3\2\2\2\u0122\u0123\3\2\2"+
		"\2\u0123\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124,\3\2\2\2\u0125\u0126"+
		"\7-\2\2\u0126.\3\2\2\2\u0127\u0128\7/\2\2\u0128\60\3\2\2\2\u0129\u012a"+
		"\7,\2\2\u012a\62\3\2\2\2\u012b\u012c\7\61\2\2\u012c\64\3\2\2\2\u012d\u012e"+
		"\5\u0081A\2\u012e\u012f\5\u0087D\2\u012f\66\3\2\2\2\u0130\u0131\5e\63"+
		"\2\u0131\u0132\5\177@\2\u0132\u0133\5k\66\2\u01338\3\2\2\2\u0134\u0135"+
		"\7\u0080\2\2\u0135:\3\2\2\2\u0136\u0139\5-\27\2\u0137\u0139\5/\30\2\u0138"+
		"\u0136\3\2\2\2\u0138\u0137\3\2\2\2\u0139<\3\2\2\2\u013a\u013d\5\61\31"+
		"\2\u013b\u013d\5\63\32\2\u013c\u013a\3\2\2\2\u013c\u013b\3\2\2\2\u013d"+
		">\3\2\2\2\u013e\u0141\5\65\33\2\u013f\u0141\5\67\34\2\u0140\u013e\3\2"+
		"\2\2\u0140\u013f\3\2\2\2\u0141@\3\2\2\2\u0142\u0143\59\35\2\u0143B\3\2"+
		"\2\2\u0144\u0145\7>\2\2\u0145D\3\2\2\2\u0146\u0147\7@\2\2\u0147F\3\2\2"+
		"\2\u0148\u0149\7>\2\2\u0149\u014a\7?\2\2\u014aH\3\2\2\2\u014b\u014c\7"+
		"@\2\2\u014c\u014d\7?\2\2\u014dJ\3\2\2\2\u014e\u014f\7?\2\2\u014f\u0150"+
		"\7?\2\2\u0150L\3\2\2\2\u0151\u0152\7>\2\2\u0152\u0153\7@\2\2\u0153N\3"+
		"\2\2\2\u0154\u015b\5C\"\2\u0155\u015b\5E#\2\u0156\u015b\5G$\2\u0157\u015b"+
		"\5I%\2\u0158\u015b\5K&\2\u0159\u015b\5M\'\2\u015a\u0154\3\2\2\2\u015a"+
		"\u0155\3\2\2\2\u015a\u0156\3\2\2\2\u015a\u0157\3\2\2\2\u015a\u0158\3\2"+
		"\2\2\u015a\u0159\3\2\2\2\u015bP\3\2\2\2\u015c\u015d\7=\2\2\u015dR\3\2"+
		"\2\2\u015e\u015f\7\60\2\2\u015fT\3\2\2\2\u0160\u0161\7<\2\2\u0161V\3\2"+
		"\2\2\u0162\u0163\7.\2\2\u0163X\3\2\2\2\u0164\u0165\7*\2\2\u0165Z\3\2\2"+
		"\2\u0166\u0167\7+\2\2\u0167\\\3\2\2\2\u0168\u0169\7<\2\2\u0169\u016a\7"+
		"?\2\2\u016a^\3\2\2\2\u016b\u0172\7$\2\2\u016c\u0171\5\u0099M\2\u016d\u0171"+
		"\5\u009bN\2\u016e\u0171\5\u009dO\2\u016f\u0171\5\u009fP\2\u0170\u016c"+
		"\3\2\2\2\u0170\u016d\3\2\2\2\u0170\u016e\3\2\2\2\u0170\u016f\3\2\2\2\u0171"+
		"\u0174\3\2\2\2\u0172\u0170\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u0175\3\2"+
		"\2\2\u0174\u0172\3\2\2\2\u0175\u0176\7$\2\2\u0176`\3\2\2\2\u0177\u0179"+
		"\t\2\2\2\u0178\u0177\3\2\2\2\u0179\u017a\3\2\2\2\u017a\u0178\3\2\2\2\u017a"+
		"\u017b\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u017d\b\61\2\2\u017db\3\2\2\2"+
		"\u017e\u0182\7\61\2\2\u017f\u0181\13\2\2\2\u0180\u017f\3\2\2\2\u0181\u0184"+
		"\3\2\2\2\u0182\u0183\3\2\2\2\u0182\u0180\3\2\2\2\u0183\u0185\3\2\2\2\u0184"+
		"\u0182\3\2\2\2\u0185\u0186\7\61\2\2\u0186\u0187\3\2\2\2\u0187\u0188\b"+
		"\62\2\2\u0188d\3\2\2\2\u0189\u018a\t\3\2\2\u018af\3\2\2\2\u018b\u018c"+
		"\t\4\2\2\u018ch\3\2\2\2\u018d\u018e\t\5\2\2\u018ej\3\2\2\2\u018f\u0190"+
		"\t\6\2\2\u0190l\3\2\2\2\u0191\u0192\t\7\2\2\u0192n\3\2\2\2\u0193\u0194"+
		"\t\b\2\2\u0194p\3\2\2\2\u0195\u0196\t\t\2\2\u0196r\3\2\2\2\u0197\u0198"+
		"\t\n\2\2\u0198t\3\2\2\2\u0199\u019a\t\13\2\2\u019av\3\2\2\2\u019b\u019c"+
		"\t\f\2\2\u019cx\3\2\2\2\u019d\u019e\t\r\2\2\u019ez\3\2\2\2\u019f\u01a0"+
		"\t\16\2\2\u01a0|\3\2\2\2\u01a1\u01a2\t\17\2\2\u01a2~\3\2\2\2\u01a3\u01a4"+
		"\t\20\2\2\u01a4\u0080\3\2\2\2\u01a5\u01a6\t\21\2\2\u01a6\u0082\3\2\2\2"+
		"\u01a7\u01a8\t\22\2\2\u01a8\u0084\3\2\2\2\u01a9\u01aa\t\23\2\2\u01aa\u0086"+
		"\3\2\2\2\u01ab\u01ac\t\24\2\2\u01ac\u0088\3\2\2\2\u01ad\u01ae\t\25\2\2"+
		"\u01ae\u008a\3\2\2\2\u01af\u01b0\t\26\2\2\u01b0\u008c\3\2\2\2\u01b1\u01b2"+
		"\t\27\2\2\u01b2\u008e\3\2\2\2\u01b3\u01b4\t\30\2\2\u01b4\u0090\3\2\2\2"+
		"\u01b5\u01b6\t\31\2\2\u01b6\u0092\3\2\2\2\u01b7\u01b8\t\32\2\2\u01b8\u0094"+
		"\3\2\2\2\u01b9\u01ba\t\33\2\2\u01ba\u0096\3\2\2\2\u01bb\u01bc\t\34\2\2"+
		"\u01bc\u0098\3\2\2\2\u01bd\u01be\t\35\2\2\u01be\u009a\3\2\2\2\u01bf\u01c0"+
		"\t\36\2\2\u01c0\u009c\3\2\2\2\u01c1\u01c2\7a\2\2\u01c2\u009e\3\2\2\2\u01c3"+
		"\u01c4\t\37\2\2\u01c4\u00a0\3\2\2\2\23\2\u00ab\u00ae\u00b4\u00b9\u0116"+
		"\u011b\u011d\u0123\u0138\u013c\u0140\u015a\u0170\u0172\u017a\u0182\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}