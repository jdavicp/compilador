// Generated from sintatica.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link sintaticaParser}.
 */
public interface sintaticaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link sintaticaParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(sintaticaParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintaticaParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(sintaticaParser.ProgContext ctx);
}