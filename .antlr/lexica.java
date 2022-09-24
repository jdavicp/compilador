// Generated from /home/jdavicp/Desktop/compilador/lexica.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class lexica extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ID=1, CTE=2, OPAD=3, OPMUT=4, OPLOG=5, OPNEG=6, OPREL=7, PVIG=8, PONTO=9, 
		DPONTOS=10, VIG=11, ABPAR=12, FPAR=13, ATRIB=14, WS=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ID", "CTE", "OPAD", "OPMUT", "OPLOG", "OPNEG", "OPREL", "PVIG", "PONTO", 
			"DPONTOS", "VIG", "ABPAR", "FPAR", "ATRIB", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, "'~'", null, "';'", "'.'", "':'", 
			"','", "'('", "')'", "':='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ID", "CTE", "OPAD", "OPMUT", "OPLOG", "OPNEG", "OPREL", "PVIG", 
			"PONTO", "DPONTOS", "VIG", "ABPAR", "FPAR", "ATRIB", "WS"
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


	public lexica(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "lexica.g4"; }

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
		case 0:
			ID_action((RuleContext)_localctx, actionIndex);
			break;
		case 1:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\21R\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\5\6\61\n\6\3\7\3\7\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b>\n\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f"+
		"\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\2\2\21\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21\3\2"+
		"\b\4\2C\\c|\3\2\62;\4\2--//\4\2,,\61\61\4\2>>@@\5\2\13\f\17\17\"\"\2V"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\3!\3\2\2\2\5$\3\2"+
		"\2\2\7\'\3\2\2\2\t)\3\2\2\2\13\60\3\2\2\2\r\62\3\2\2\2\17=\3\2\2\2\21"+
		"?\3\2\2\2\23A\3\2\2\2\25C\3\2\2\2\27E\3\2\2\2\31G\3\2\2\2\33I\3\2\2\2"+
		"\35K\3\2\2\2\37N\3\2\2\2!\"\t\2\2\2\"#\b\2\2\2#\4\3\2\2\2$%\t\3\2\2%&"+
		"\b\3\3\2&\6\3\2\2\2\'(\t\4\2\2(\b\3\2\2\2)*\t\5\2\2*\n\3\2\2\2+,\7Q\2"+
		"\2,\61\7T\2\2-.\7C\2\2./\7P\2\2/\61\7F\2\2\60+\3\2\2\2\60-\3\2\2\2\61"+
		"\f\3\2\2\2\62\63\7\u0080\2\2\63\16\3\2\2\2\64>\t\6\2\2\65\66\7>\2\2\66"+
		">\7?\2\2\678\7@\2\28>\7?\2\29:\7?\2\2:>\7?\2\2;<\7>\2\2<>\7@\2\2=\64\3"+
		"\2\2\2=\65\3\2\2\2=\67\3\2\2\2=9\3\2\2\2=;\3\2\2\2>\20\3\2\2\2?@\7=\2"+
		"\2@\22\3\2\2\2AB\7\60\2\2B\24\3\2\2\2CD\7<\2\2D\26\3\2\2\2EF\7.\2\2F\30"+
		"\3\2\2\2GH\7*\2\2H\32\3\2\2\2IJ\7+\2\2J\34\3\2\2\2KL\7<\2\2LM\7?\2\2M"+
		"\36\3\2\2\2NO\t\7\2\2OP\3\2\2\2PQ\b\20\4\2Q \3\2\2\2\5\2\60=\5\3\2\2\3"+
		"\3\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}