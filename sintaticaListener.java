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
	/**
	 * Enter a parse tree produced by {@link sintaticaParser#decls}.
	 * @param ctx the parse tree
	 */
	void enterDecls(sintaticaParser.DeclsContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintaticaParser#decls}.
	 * @param ctx the parse tree
	 */
	void exitDecls(sintaticaParser.DeclsContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintaticaParser#listDecl}.
	 * @param ctx the parse tree
	 */
	void enterListDecl(sintaticaParser.ListDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintaticaParser#listDecl}.
	 * @param ctx the parse tree
	 */
	void exitListDecl(sintaticaParser.ListDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintaticaParser#declTip}.
	 * @param ctx the parse tree
	 */
	void enterDeclTip(sintaticaParser.DeclTipContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintaticaParser#declTip}.
	 * @param ctx the parse tree
	 */
	void exitDeclTip(sintaticaParser.DeclTipContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintaticaParser#listId}.
	 * @param ctx the parse tree
	 */
	void enterListId(sintaticaParser.ListIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintaticaParser#listId}.
	 * @param ctx the parse tree
	 */
	void exitListId(sintaticaParser.ListIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintaticaParser#tip}.
	 * @param ctx the parse tree
	 */
	void enterTip(sintaticaParser.TipContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintaticaParser#tip}.
	 * @param ctx the parse tree
	 */
	void exitTip(sintaticaParser.TipContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintaticaParser#cmdComp}.
	 * @param ctx the parse tree
	 */
	void enterCmdComp(sintaticaParser.CmdCompContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintaticaParser#cmdComp}.
	 * @param ctx the parse tree
	 */
	void exitCmdComp(sintaticaParser.CmdCompContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintaticaParser#listCmd}.
	 * @param ctx the parse tree
	 */
	void enterListCmd(sintaticaParser.ListCmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintaticaParser#listCmd}.
	 * @param ctx the parse tree
	 */
	void exitListCmd(sintaticaParser.ListCmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintaticaParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmd(sintaticaParser.CmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintaticaParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmd(sintaticaParser.CmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintaticaParser#cmdIf}.
	 * @param ctx the parse tree
	 */
	void enterCmdIf(sintaticaParser.CmdIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintaticaParser#cmdIf}.
	 * @param ctx the parse tree
	 */
	void exitCmdIf(sintaticaParser.CmdIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintaticaParser#cmdWhile}.
	 * @param ctx the parse tree
	 */
	void enterCmdWhile(sintaticaParser.CmdWhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintaticaParser#cmdWhile}.
	 * @param ctx the parse tree
	 */
	void exitCmdWhile(sintaticaParser.CmdWhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintaticaParser#cmdRead}.
	 * @param ctx the parse tree
	 */
	void enterCmdRead(sintaticaParser.CmdReadContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintaticaParser#cmdRead}.
	 * @param ctx the parse tree
	 */
	void exitCmdRead(sintaticaParser.CmdReadContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintaticaParser#cmdWrite}.
	 * @param ctx the parse tree
	 */
	void enterCmdWrite(sintaticaParser.CmdWriteContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintaticaParser#cmdWrite}.
	 * @param ctx the parse tree
	 */
	void exitCmdWrite(sintaticaParser.CmdWriteContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintaticaParser#listW}.
	 * @param ctx the parse tree
	 */
	void enterListW(sintaticaParser.ListWContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintaticaParser#listW}.
	 * @param ctx the parse tree
	 */
	void exitListW(sintaticaParser.ListWContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintaticaParser#elemW}.
	 * @param ctx the parse tree
	 */
	void enterElemW(sintaticaParser.ElemWContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintaticaParser#elemW}.
	 * @param ctx the parse tree
	 */
	void exitElemW(sintaticaParser.ElemWContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintaticaParser#cmdAtrib}.
	 * @param ctx the parse tree
	 */
	void enterCmdAtrib(sintaticaParser.CmdAtribContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintaticaParser#cmdAtrib}.
	 * @param ctx the parse tree
	 */
	void exitCmdAtrib(sintaticaParser.CmdAtribContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(sintaticaParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(sintaticaParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintaticaParser#terms}.
	 * @param ctx the parse tree
	 */
	void enterTerms(sintaticaParser.TermsContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintaticaParser#terms}.
	 * @param ctx the parse tree
	 */
	void exitTerms(sintaticaParser.TermsContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintaticaParser#oPS}.
	 * @param ctx the parse tree
	 */
	void enterOPS(sintaticaParser.OPSContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintaticaParser#oPS}.
	 * @param ctx the parse tree
	 */
	void exitOPS(sintaticaParser.OPSContext ctx);
}