// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link a1Parser}.
 */
public interface a1Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link a1Parser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(a1Parser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link a1Parser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(a1Parser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link a1Parser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(a1Parser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link a1Parser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(a1Parser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link a1Parser#updateDecl}.
	 * @param ctx the parse tree
	 */
	void enterUpdateDecl(a1Parser.UpdateDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link a1Parser#updateDecl}.
	 * @param ctx the parse tree
	 */
	void exitUpdateDecl(a1Parser.UpdateDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link a1Parser#simInp}.
	 * @param ctx the parse tree
	 */
	void enterSimInp(a1Parser.SimInpContext ctx);
	/**
	 * Exit a parse tree produced by {@link a1Parser#simInp}.
	 * @param ctx the parse tree
	 */
	void exitSimInp(a1Parser.SimInpContext ctx);
	/**
	 * Enter a parse tree produced by {@link a1Parser#latchDec}.
	 * @param ctx the parse tree
	 */
	void enterLatchDec(a1Parser.LatchDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link a1Parser#latchDec}.
	 * @param ctx the parse tree
	 */
	void exitLatchDec(a1Parser.LatchDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link a1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(a1Parser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link a1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(a1Parser.ExprContext ctx);
}