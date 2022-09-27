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
		Decls=1, ListDecl=2, DeclTip=3, ListId=4, Tip=5, CmdComp=6, ListCmd=7, 
		Cmd=8, CmdIf=9, CmdWhile=10, CmdRead=11, CmdWrite=12, ListW=13, ElemW=14, 
		CmdAtrib=15, Expr=16, Terms=17, OPS=18, PROGRAM=19, INTEGER=20, BOOLEAN=21, 
		BEGIN=22, END=23, WHILE=24, DO=25, READ=26, VAR=27, FALSE=28, TRUE=29, 
		WRITE=30, IF=31, THEN=32, ELSE=33, STRING=34, ID=35, CTE=36, MAIS=37, 
		MENOS=38, MULT=39, DIV=40, OR=41, AND=42, NEG=43, OPAD=44, OPMUT=45, OPLOG=46, 
		OPNEG=47, MENOR=48, MAIOR=49, MENORIG=50, MAIORIG=51, IGUAL=52, DIFERENTE=53, 
		OPREL=54, PVIG=55, PONTO=56, DPONTOS=57, VIG=58, ABPAR=59, FPAR=60, ATRIB=61, 
		CADEIA=62, WS=63, COMMENT=64;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"Decls", "ListDecl", "DeclTip", "ListId", "Tip", "CmdComp", "ListCmd", 
			"Cmd", "CmdIf", "CmdWhile", "CmdRead", "CmdWrite", "ListW", "ElemW", 
			"CmdAtrib", "Expr", "Terms", "OPS", "PROGRAM", "INTEGER", "BOOLEAN", 
			"BEGIN", "END", "WHILE", "DO", "READ", "VAR", "FALSE", "TRUE", "WRITE", 
			"IF", "THEN", "ELSE", "STRING", "ID", "CTE", "MAIS", "MENOS", "MULT", 
			"DIV", "OR", "AND", "NEG", "OPAD", "OPMUT", "OPLOG", "OPNEG", "MENOR", 
			"MAIOR", "MENORIG", "MAIORIG", "IGUAL", "DIFERENTE", "OPREL", "PVIG", 
			"PONTO", "DPONTOS", "VIG", "ABPAR", "FPAR", "ATRIB", "CADEIA", "WS", 
			"COMMENT", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", 
			"M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", 
			"LETTER", "NUMBER", "UNDERSCORE", "SYMBOLS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "'+'", "'-'", "'*'", "'/'", null, null, "'~'", null, null, null, 
			null, "'<'", "'>'", "'<='", "'>='", "'=='", "'<>'", null, "';'", "'.'", 
			"':'", "','", "'('", "')'", "':='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Decls", "ListDecl", "DeclTip", "ListId", "Tip", "CmdComp", "ListCmd", 
			"Cmd", "CmdIf", "CmdWhile", "CmdRead", "CmdWrite", "ListW", "ElemW", 
			"CmdAtrib", "Expr", "Terms", "OPS", "PROGRAM", "INTEGER", "BOOLEAN", 
			"BEGIN", "END", "WHILE", "DO", "READ", "VAR", "FALSE", "TRUE", "WRITE", 
			"IF", "THEN", "ELSE", "STRING", "ID", "CTE", "MAIS", "MENOS", "MULT", 
			"DIV", "OR", "AND", "NEG", "OPAD", "OPMUT", "OPLOG", "OPNEG", "MENOR", 
			"MAIOR", "MENORIG", "MAIORIG", "IGUAL", "DIFERENTE", "OPREL", "PVIG", 
			"PONTO", "DPONTOS", "VIG", "ABPAR", "FPAR", "ATRIB", "CADEIA", "WS", 
			"COMMENT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2B\u023f\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\3"+
		"\2\3\2\3\2\3\2\5\2\u00c4\n\2\3\3\3\3\3\3\3\3\5\3\u00ca\n\3\3\4\3\4\3\4"+
		"\3\4\3\4\3\5\3\5\3\5\3\5\3\5\5\5\u00d6\n\5\3\6\3\6\3\6\5\6\u00db\n\6\3"+
		"\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\5\b\u00e6\n\b\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\5\t\u00ee\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00fc"+
		"\n\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r"+
		"\3\16\3\16\3\16\3\16\3\16\5\16\u0112\n\16\3\17\3\17\5\17\u0116\n\17\3"+
		"\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5"+
		"\21\u0126\n\21\3\21\5\21\u0129\n\21\3\22\3\22\3\22\3\22\5\22\u012f\n\22"+
		"\3\23\3\23\3\23\5\23\u0134\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34"+
		"\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\""+
		"\3#\3#\3#\3#\3#\3#\3#\3$\3$\5$\u0191\n$\3$\3$\3$\7$\u0196\n$\f$\16$\u0199"+
		"\13$\3%\6%\u019c\n%\r%\16%\u019d\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3*\3"+
		"+\3+\3+\3+\3,\3,\3-\3-\5-\u01b3\n-\3.\3.\5.\u01b7\n.\3/\3/\5/\u01bb\n"+
		"/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\63\3\64\3\64\3\64\3\65\3\65"+
		"\3\65\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\5\67\u01d5\n\67\38"+
		"\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3>\3?\3?\3?\3?\3?\7?\u01eb\n?"+
		"\f?\16?\u01ee\13?\3?\3?\3@\6@\u01f3\n@\r@\16@\u01f4\3@\3@\3A\3A\7A\u01fb"+
		"\nA\fA\16A\u01fe\13A\3A\3A\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3F\3F\3G\3G\3"+
		"H\3H\3I\3I\3J\3J\3K\3K\3L\3L\3M\3M\3N\3N\3O\3O\3P\3P\3Q\3Q\3R\3R\3S\3"+
		"S\3T\3T\3U\3U\3V\3V\3W\3W\3X\3X\3Y\3Y\3Z\3Z\3[\3[\3\\\3\\\3]\3]\3^\3^"+
		"\3_\3_\3\u01fc\2`\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64"+
		"g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083\2\u0085\2\u0087\2\u0089"+
		"\2\u008b\2\u008d\2\u008f\2\u0091\2\u0093\2\u0095\2\u0097\2\u0099\2\u009b"+
		"\2\u009d\2\u009f\2\u00a1\2\u00a3\2\u00a5\2\u00a7\2\u00a9\2\u00ab\2\u00ad"+
		"\2\u00af\2\u00b1\2\u00b3\2\u00b5\2\u00b7\2\u00b9\2\u00bb\2\u00bd\2\3\2"+
		" \5\2\13\f\17\17\"\"\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4"+
		"\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQq"+
		"q\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2"+
		"ZZzz\4\2[[{{\4\2\\\\||\4\2C\\c|\3\2\62;\b\2##%(,-//??BB\2\u024a\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2"+
		"%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61"+
		"\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2"+
		"\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I"+
		"\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2"+
		"\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2"+
		"\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o"+
		"\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2"+
		"\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\3\u00c3\3\2\2\2\5\u00c9"+
		"\3\2\2\2\7\u00cb\3\2\2\2\t\u00d5\3\2\2\2\13\u00da\3\2\2\2\r\u00dc\3\2"+
		"\2\2\17\u00e5\3\2\2\2\21\u00ed\3\2\2\2\23\u00fb\3\2\2\2\25\u00fd\3\2\2"+
		"\2\27\u0102\3\2\2\2\31\u0107\3\2\2\2\33\u0111\3\2\2\2\35\u0115\3\2\2\2"+
		"\37\u0117\3\2\2\2!\u0128\3\2\2\2#\u012e\3\2\2\2%\u0133\3\2\2\2\'\u0135"+
		"\3\2\2\2)\u013d\3\2\2\2+\u0145\3\2\2\2-\u014d\3\2\2\2/\u0153\3\2\2\2\61"+
		"\u0157\3\2\2\2\63\u015d\3\2\2\2\65\u0160\3\2\2\2\67\u0165\3\2\2\29\u0169"+
		"\3\2\2\2;\u016f\3\2\2\2=\u0174\3\2\2\2?\u017a\3\2\2\2A\u017d\3\2\2\2C"+
		"\u0182\3\2\2\2E\u0187\3\2\2\2G\u0190\3\2\2\2I\u019b\3\2\2\2K\u019f\3\2"+
		"\2\2M\u01a1\3\2\2\2O\u01a3\3\2\2\2Q\u01a5\3\2\2\2S\u01a7\3\2\2\2U\u01aa"+
		"\3\2\2\2W\u01ae\3\2\2\2Y\u01b2\3\2\2\2[\u01b6\3\2\2\2]\u01ba\3\2\2\2_"+
		"\u01bc\3\2\2\2a\u01be\3\2\2\2c\u01c0\3\2\2\2e\u01c2\3\2\2\2g\u01c5\3\2"+
		"\2\2i\u01c8\3\2\2\2k\u01cb\3\2\2\2m\u01d4\3\2\2\2o\u01d6\3\2\2\2q\u01d8"+
		"\3\2\2\2s\u01da\3\2\2\2u\u01dc\3\2\2\2w\u01de\3\2\2\2y\u01e0\3\2\2\2{"+
		"\u01e2\3\2\2\2}\u01e5\3\2\2\2\177\u01f2\3\2\2\2\u0081\u01f8\3\2\2\2\u0083"+
		"\u0203\3\2\2\2\u0085\u0205\3\2\2\2\u0087\u0207\3\2\2\2\u0089\u0209\3\2"+
		"\2\2\u008b\u020b\3\2\2\2\u008d\u020d\3\2\2\2\u008f\u020f\3\2\2\2\u0091"+
		"\u0211\3\2\2\2\u0093\u0213\3\2\2\2\u0095\u0215\3\2\2\2\u0097\u0217\3\2"+
		"\2\2\u0099\u0219\3\2\2\2\u009b\u021b\3\2\2\2\u009d\u021d\3\2\2\2\u009f"+
		"\u021f\3\2\2\2\u00a1\u0221\3\2\2\2\u00a3\u0223\3\2\2\2\u00a5\u0225\3\2"+
		"\2\2\u00a7\u0227\3\2\2\2\u00a9\u0229\3\2\2\2\u00ab\u022b\3\2\2\2\u00ad"+
		"\u022d\3\2\2\2\u00af\u022f\3\2\2\2\u00b1\u0231\3\2\2\2\u00b3\u0233\3\2"+
		"\2\2\u00b5\u0235\3\2\2\2\u00b7\u0237\3\2\2\2\u00b9\u0239\3\2\2\2\u00bb"+
		"\u023b\3\2\2\2\u00bd\u023d\3\2\2\2\u00bf\u00c4\5\177@\2\u00c0\u00c1\5"+
		"\67\34\2\u00c1\u00c2\5\5\3\2\u00c2\u00c4\3\2\2\2\u00c3\u00bf\3\2\2\2\u00c3"+
		"\u00c0\3\2\2\2\u00c4\4\3\2\2\2\u00c5\u00ca\5\7\4\2\u00c6\u00c7\5\7\4\2"+
		"\u00c7\u00c8\5\5\3\2\u00c8\u00ca\3\2\2\2\u00c9\u00c5\3\2\2\2\u00c9\u00c6"+
		"\3\2\2\2\u00ca\6\3\2\2\2\u00cb\u00cc\5\t\5\2\u00cc\u00cd\5s:\2\u00cd\u00ce"+
		"\5\13\6\2\u00ce\u00cf\5o8\2\u00cf\b\3\2\2\2\u00d0\u00d6\5G$\2\u00d1\u00d2"+
		"\5G$\2\u00d2\u00d3\5u;\2\u00d3\u00d4\5\t\5\2\u00d4\u00d6\3\2\2\2\u00d5"+
		"\u00d0\3\2\2\2\u00d5\u00d1\3\2\2\2\u00d6\n\3\2\2\2\u00d7\u00db\5)\25\2"+
		"\u00d8\u00db\5+\26\2\u00d9\u00db\5E#\2\u00da\u00d7\3\2\2\2\u00da\u00d8"+
		"\3\2\2\2\u00da\u00d9\3\2\2\2\u00db\f\3\2\2\2\u00dc\u00dd\5-\27\2\u00dd"+
		"\u00de\5\17\b\2\u00de\u00df\5/\30\2\u00df\16\3\2\2\2\u00e0\u00e6\5\21"+
		"\t\2\u00e1\u00e2\5\21\t\2\u00e2\u00e3\5o8\2\u00e3\u00e4\5\17\b\2\u00e4"+
		"\u00e6\3\2\2\2\u00e5\u00e0\3\2\2\2\u00e5\u00e1\3\2\2\2\u00e6\20\3\2\2"+
		"\2\u00e7\u00ee\5\23\n\2\u00e8\u00ee\5\25\13\2\u00e9\u00ee\5\27\f\2\u00ea"+
		"\u00ee\5\31\r\2\u00eb\u00ee\5\37\20\2\u00ec\u00ee\5\r\7\2\u00ed\u00e7"+
		"\3\2\2\2\u00ed\u00e8\3\2\2\2\u00ed\u00e9\3\2\2\2\u00ed\u00ea\3\2\2\2\u00ed"+
		"\u00eb\3\2\2\2\u00ed\u00ec\3\2\2\2\u00ee\22\3\2\2\2\u00ef\u00f0\5? \2"+
		"\u00f0\u00f1\5!\21\2\u00f1\u00f2\5A!\2\u00f2\u00f3\5\21\t\2\u00f3\u00fc"+
		"\3\2\2\2\u00f4\u00f5\5? \2\u00f5\u00f6\5!\21\2\u00f6\u00f7\5A!\2\u00f7"+
		"\u00f8\5\21\t\2\u00f8\u00f9\5C\"\2\u00f9\u00fa\5\21\t\2\u00fa\u00fc\3"+
		"\2\2\2\u00fb\u00ef\3\2\2\2\u00fb\u00f4\3\2\2\2\u00fc\24\3\2\2\2\u00fd"+
		"\u00fe\5\61\31\2\u00fe\u00ff\5!\21\2\u00ff\u0100\5\63\32\2\u0100\u0101"+
		"\5\21\t\2\u0101\26\3\2\2\2\u0102\u0103\5\65\33\2\u0103\u0104\5w<\2\u0104"+
		"\u0105\5\t\5\2\u0105\u0106\5y=\2\u0106\30\3\2\2\2\u0107\u0108\5=\37\2"+
		"\u0108\u0109\5w<\2\u0109\u010a\5\33\16\2\u010a\u010b\5y=\2\u010b\32\3"+
		"\2\2\2\u010c\u0112\5\35\17\2\u010d\u010e\5\35\17\2\u010e\u010f\5u;\2\u010f"+
		"\u0110\5\33\16\2\u0110\u0112\3\2\2\2\u0111\u010c\3\2\2\2\u0111\u010d\3"+
		"\2\2\2\u0112\34\3\2\2\2\u0113\u0116\5!\21\2\u0114\u0116\5}?\2\u0115\u0113"+
		"\3\2\2\2\u0115\u0114\3\2\2\2\u0116\36\3\2\2\2\u0117\u0118\5G$\2\u0118"+
		"\u0119\5{>\2\u0119\u011a\5!\21\2\u011a \3\2\2\2\u011b\u011c\5w<\2\u011c"+
		"\u011d\5!\21\2\u011d\u011e\5y=\2\u011e\u0129\3\2\2\2\u011f\u0129\5#\22"+
		"\2\u0120\u0121\5#\22\2\u0121\u0122\5%\23\2\u0122\u0123\5#\22\2\u0123\u0129"+
		"\3\2\2\2\u0124\u0126\5_\60\2\u0125\u0124\3\2\2\2\u0125\u0126\3\2\2\2\u0126"+
		"\u0127\3\2\2\2\u0127\u0129\5#\22\2\u0128\u011b\3\2\2\2\u0128\u011f\3\2"+
		"\2\2\u0128\u0120\3\2\2\2\u0128\u0125\3\2\2\2\u0129\"\3\2\2\2\u012a\u012f"+
		"\5G$\2\u012b\u012f\5I%\2\u012c\u012f\5;\36\2\u012d\u012f\59\35\2\u012e"+
		"\u012a\3\2\2\2\u012e\u012b\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012d\3\2"+
		"\2\2\u012f$\3\2\2\2\u0130\u0134\5m\67\2\u0131\u0134\5Y-\2\u0132\u0134"+
		"\5[.\2\u0133\u0130\3\2\2\2\u0133\u0131\3\2\2\2\u0133\u0132\3\2\2\2\u0134"+
		"&\3\2\2\2\u0135\u0136\5\u00a1Q\2\u0136\u0137\5\u00a5S\2\u0137\u0138\5"+
		"\u009fP\2\u0138\u0139\5\u008fH\2\u0139\u013a\5\u00a5S\2\u013a\u013b\5"+
		"\u0083B\2\u013b\u013c\5\u009bN\2\u013c(\3\2\2\2\u013d\u013e\5\u0093J\2"+
		"\u013e\u013f\5\u009dO\2\u013f\u0140\5\u00a9U\2\u0140\u0141\5\u008bF\2"+
		"\u0141\u0142\5\u008fH\2\u0142\u0143\5\u008bF\2\u0143\u0144\5\u00a5S\2"+
		"\u0144*\3\2\2\2\u0145\u0146\5\u0085C\2\u0146\u0147\5\u009fP\2\u0147\u0148"+
		"\5\u009fP\2\u0148\u0149\5\u0099M\2\u0149\u014a\5\u008bF\2\u014a\u014b"+
		"\5\u0083B\2\u014b\u014c\5\u009dO\2\u014c,\3\2\2\2\u014d\u014e\5\u0085"+
		"C\2\u014e\u014f\5\u008bF\2\u014f\u0150\5\u008fH\2\u0150\u0151\5\u0093"+
		"J\2\u0151\u0152\5\u009dO\2\u0152.\3\2\2\2\u0153\u0154\5\u008bF\2\u0154"+
		"\u0155\5\u009dO\2\u0155\u0156\5\u0089E\2\u0156\60\3\2\2\2\u0157\u0158"+
		"\5\u00afX\2\u0158\u0159\5\u0091I\2\u0159\u015a\5\u0093J\2\u015a\u015b"+
		"\5\u0099M\2\u015b\u015c\5\u008bF\2\u015c\62\3\2\2\2\u015d\u015e\5\u0089"+
		"E\2\u015e\u015f\5\u009fP\2\u015f\64\3\2\2\2\u0160\u0161\5\u00a5S\2\u0161"+
		"\u0162\5\u008bF\2\u0162\u0163\5\u0083B\2\u0163\u0164\5\u0089E\2\u0164"+
		"\66\3\2\2\2\u0165\u0166\5\u00adW\2\u0166\u0167\5\u0083B\2\u0167\u0168"+
		"\5\u00a5S\2\u01688\3\2\2\2\u0169\u016a\5\u008dG\2\u016a\u016b\5\u0083"+
		"B\2\u016b\u016c\5\u0099M\2\u016c\u016d\5\u00a7T\2\u016d\u016e\5\u008b"+
		"F\2\u016e:\3\2\2\2\u016f\u0170\5\u00a9U\2\u0170\u0171\5\u00a5S\2\u0171"+
		"\u0172\5\u00abV\2\u0172\u0173\5\u008bF\2\u0173<\3\2\2\2\u0174\u0175\5"+
		"\u00afX\2\u0175\u0176\5\u00a5S\2\u0176\u0177\5\u0093J\2\u0177\u0178\5"+
		"\u00a9U\2\u0178\u0179\5\u008bF\2\u0179>\3\2\2\2\u017a\u017b\5\u0093J\2"+
		"\u017b\u017c\5\u008dG\2\u017c@\3\2\2\2\u017d\u017e\5\u00a9U\2\u017e\u017f"+
		"\5\u0091I\2\u017f\u0180\5\u008bF\2\u0180\u0181\5\u009dO\2\u0181B\3\2\2"+
		"\2\u0182\u0183\5\u008bF\2\u0183\u0184\5\u0099M\2\u0184\u0185\5\u00a7T"+
		"\2\u0185\u0186\5\u008bF\2\u0186D\3\2\2\2\u0187\u0188\5\u00a7T\2\u0188"+
		"\u0189\5\u00a9U\2\u0189\u018a\5\u00a5S\2\u018a\u018b\5\u0093J\2\u018b"+
		"\u018c\5\u009dO\2\u018c\u018d\5\u008fH\2\u018dF\3\2\2\2\u018e\u0191\5"+
		"\u00b7\\\2\u018f\u0191\5\u00bb^\2\u0190\u018e\3\2\2\2\u0190\u018f\3\2"+
		"\2\2\u0191\u0197\3\2\2\2\u0192\u0196\5\u00b7\\\2\u0193\u0196\5\u00b9]"+
		"\2\u0194\u0196\5\u00bb^\2\u0195\u0192\3\2\2\2\u0195\u0193\3\2\2\2\u0195"+
		"\u0194\3\2\2\2\u0196\u0199\3\2\2\2\u0197\u0195\3\2\2\2\u0197\u0198\3\2"+
		"\2\2\u0198H\3\2\2\2\u0199\u0197\3\2\2\2\u019a\u019c\5\u00b9]\2\u019b\u019a"+
		"\3\2\2\2\u019c\u019d\3\2\2\2\u019d\u019b\3\2\2\2\u019d\u019e\3\2\2\2\u019e"+
		"J\3\2\2\2\u019f\u01a0\7-\2\2\u01a0L\3\2\2\2\u01a1\u01a2\7/\2\2\u01a2N"+
		"\3\2\2\2\u01a3\u01a4\7,\2\2\u01a4P\3\2\2\2\u01a5\u01a6\7\61\2\2\u01a6"+
		"R\3\2\2\2\u01a7\u01a8\5\u009fP\2\u01a8\u01a9\5\u00a5S\2\u01a9T\3\2\2\2"+
		"\u01aa\u01ab\5\u0083B\2\u01ab\u01ac\5\u009dO\2\u01ac\u01ad\5\u0089E\2"+
		"\u01adV\3\2\2\2\u01ae\u01af\7\u0080\2\2\u01afX\3\2\2\2\u01b0\u01b3\5K"+
		"&\2\u01b1\u01b3\5M\'\2\u01b2\u01b0\3\2\2\2\u01b2\u01b1\3\2\2\2\u01b3Z"+
		"\3\2\2\2\u01b4\u01b7\5O(\2\u01b5\u01b7\5Q)\2\u01b6\u01b4\3\2\2\2\u01b6"+
		"\u01b5\3\2\2\2\u01b7\\\3\2\2\2\u01b8\u01bb\5S*\2\u01b9\u01bb\5U+\2\u01ba"+
		"\u01b8\3\2\2\2\u01ba\u01b9\3\2\2\2\u01bb^\3\2\2\2\u01bc\u01bd\5W,\2\u01bd"+
		"`\3\2\2\2\u01be\u01bf\7>\2\2\u01bfb\3\2\2\2\u01c0\u01c1\7@\2\2\u01c1d"+
		"\3\2\2\2\u01c2\u01c3\7>\2\2\u01c3\u01c4\7?\2\2\u01c4f\3\2\2\2\u01c5\u01c6"+
		"\7@\2\2\u01c6\u01c7\7?\2\2\u01c7h\3\2\2\2\u01c8\u01c9\7?\2\2\u01c9\u01ca"+
		"\7?\2\2\u01caj\3\2\2\2\u01cb\u01cc\7>\2\2\u01cc\u01cd\7@\2\2\u01cdl\3"+
		"\2\2\2\u01ce\u01d5\5a\61\2\u01cf\u01d5\5c\62\2\u01d0\u01d5\5e\63\2\u01d1"+
		"\u01d5\5g\64\2\u01d2\u01d5\5i\65\2\u01d3\u01d5\5k\66\2\u01d4\u01ce\3\2"+
		"\2\2\u01d4\u01cf\3\2\2\2\u01d4\u01d0\3\2\2\2\u01d4\u01d1\3\2\2\2\u01d4"+
		"\u01d2\3\2\2\2\u01d4\u01d3\3\2\2\2\u01d5n\3\2\2\2\u01d6\u01d7\7=\2\2\u01d7"+
		"p\3\2\2\2\u01d8\u01d9\7\60\2\2\u01d9r\3\2\2\2\u01da\u01db\7<\2\2\u01db"+
		"t\3\2\2\2\u01dc\u01dd\7.\2\2\u01ddv\3\2\2\2\u01de\u01df\7*\2\2\u01dfx"+
		"\3\2\2\2\u01e0\u01e1\7+\2\2\u01e1z\3\2\2\2\u01e2\u01e3\7<\2\2\u01e3\u01e4"+
		"\7?\2\2\u01e4|\3\2\2\2\u01e5\u01ec\7$\2\2\u01e6\u01eb\5\u00b7\\\2\u01e7"+
		"\u01eb\5\u00b9]\2\u01e8\u01eb\5\u00bb^\2\u01e9\u01eb\5\u00bd_\2\u01ea"+
		"\u01e6\3\2\2\2\u01ea\u01e7\3\2\2\2\u01ea\u01e8\3\2\2\2\u01ea\u01e9\3\2"+
		"\2\2\u01eb\u01ee\3\2\2\2\u01ec\u01ea\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed"+
		"\u01ef\3\2\2\2\u01ee\u01ec\3\2\2\2\u01ef\u01f0\7$\2\2\u01f0~\3\2\2\2\u01f1"+
		"\u01f3\t\2\2\2\u01f2\u01f1\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4\u01f2\3\2"+
		"\2\2\u01f4\u01f5\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6\u01f7\b@\2\2\u01f7"+
		"\u0080\3\2\2\2\u01f8\u01fc\7\61\2\2\u01f9\u01fb\13\2\2\2\u01fa\u01f9\3"+
		"\2\2\2\u01fb\u01fe\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fc\u01fa\3\2\2\2\u01fd"+
		"\u01ff\3\2\2\2\u01fe\u01fc\3\2\2\2\u01ff\u0200\7\61\2\2\u0200\u0201\3"+
		"\2\2\2\u0201\u0202\bA\2\2\u0202\u0082\3\2\2\2\u0203\u0204\t\3\2\2\u0204"+
		"\u0084\3\2\2\2\u0205\u0206\t\4\2\2\u0206\u0086\3\2\2\2\u0207\u0208\t\5"+
		"\2\2\u0208\u0088\3\2\2\2\u0209\u020a\t\6\2\2\u020a\u008a\3\2\2\2\u020b"+
		"\u020c\t\7\2\2\u020c\u008c\3\2\2\2\u020d\u020e\t\b\2\2\u020e\u008e\3\2"+
		"\2\2\u020f\u0210\t\t\2\2\u0210\u0090\3\2\2\2\u0211\u0212\t\n\2\2\u0212"+
		"\u0092\3\2\2\2\u0213\u0214\t\13\2\2\u0214\u0094\3\2\2\2\u0215\u0216\t"+
		"\f\2\2\u0216\u0096\3\2\2\2\u0217\u0218\t\r\2\2\u0218\u0098\3\2\2\2\u0219"+
		"\u021a\t\16\2\2\u021a\u009a\3\2\2\2\u021b\u021c\t\17\2\2\u021c\u009c\3"+
		"\2\2\2\u021d\u021e\t\20\2\2\u021e\u009e\3\2\2\2\u021f\u0220\t\21\2\2\u0220"+
		"\u00a0\3\2\2\2\u0221\u0222\t\22\2\2\u0222\u00a2\3\2\2\2\u0223\u0224\t"+
		"\23\2\2\u0224\u00a4\3\2\2\2\u0225\u0226\t\24\2\2\u0226\u00a6\3\2\2\2\u0227"+
		"\u0228\t\25\2\2\u0228\u00a8\3\2\2\2\u0229\u022a\t\26\2\2\u022a\u00aa\3"+
		"\2\2\2\u022b\u022c\t\27\2\2\u022c\u00ac\3\2\2\2\u022d\u022e\t\30\2\2\u022e"+
		"\u00ae\3\2\2\2\u022f\u0230\t\31\2\2\u0230\u00b0\3\2\2\2\u0231\u0232\t"+
		"\32\2\2\u0232\u00b2\3\2\2\2\u0233\u0234\t\33\2\2\u0234\u00b4\3\2\2\2\u0235"+
		"\u0236\t\34\2\2\u0236\u00b6\3\2\2\2\u0237\u0238\t\35\2\2\u0238\u00b8\3"+
		"\2\2\2\u0239\u023a\t\36\2\2\u023a\u00ba\3\2\2\2\u023b\u023c\7a\2\2\u023c"+
		"\u00bc\3\2\2\2\u023d\u023e\t\37\2\2\u023e\u00be\3\2\2\2\34\2\u00c3\u00c9"+
		"\u00d5\u00da\u00e5\u00ed\u00fb\u0111\u0115\u0125\u0128\u012e\u0133\u0190"+
		"\u0195\u0197\u019d\u01b2\u01b6\u01ba\u01d4\u01ea\u01ec\u01f4\u01fc\3\b"+
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