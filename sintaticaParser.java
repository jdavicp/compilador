// Generated from sintatica.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class sintaticaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

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
	public static final int
		RULE_prog = 0;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog"
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

	@Override
	public String getGrammarFileName() { return "sintatica.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public sintaticaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public TerminalNode PROGRAM() { return getToken(sintaticaParser.PROGRAM, 0); }
		public TerminalNode ID() { return getToken(sintaticaParser.ID, 0); }
		public TerminalNode PVIG() { return getToken(sintaticaParser.PVIG, 0); }
		public TerminalNode Decls() { return getToken(sintaticaParser.Decls, 0); }
		public TerminalNode CmdComp() { return getToken(sintaticaParser.CmdComp, 0); }
		public TerminalNode PONTO() { return getToken(sintaticaParser.PONTO, 0); }
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintaticaListener ) ((sintaticaListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintaticaListener ) ((sintaticaListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2);
			match(PROGRAM);
			setState(3);
			match(ID);
			setState(4);
			match(PVIG);
			setState(5);
			match(Decls);
			setState(6);
			match(CmdComp);
			setState(7);
			match(PONTO);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3B\f\4\2\t\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\2\2\3\2\2\2\2\n\2\4\3\2\2\2\4\5\7\25\2\2\5"+
		"\6\7%\2\2\6\7\79\2\2\7\b\7\3\2\2\b\t\7\b\2\2\t\n\7:\2\2\n\3\3\2\2\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}