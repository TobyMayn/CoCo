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
	 * Enter a parse tree produced by the {@code Update}
	 * labeled alternative in {@link a1Parser#updateDecl}.
	 * @param ctx the parse tree
	 */
	void enterUpdate(a1Parser.UpdateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Update}
	 * labeled alternative in {@link a1Parser#updateDecl}.
	 * @param ctx the parse tree
	 */
	void exitUpdate(a1Parser.UpdateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Simulate}
	 * labeled alternative in {@link a1Parser#simInp}.
	 * @param ctx the parse tree
	 */
	void enterSimulate(a1Parser.SimulateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Simulate}
	 * labeled alternative in {@link a1Parser#simInp}.
	 * @param ctx the parse tree
	 */
	void exitSimulate(a1Parser.SimulateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Latch}
	 * labeled alternative in {@link a1Parser#latchDec}.
	 * @param ctx the parse tree
	 */
	void enterLatch(a1Parser.LatchContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Latch}
	 * labeled alternative in {@link a1Parser#latchDec}.
	 * @param ctx the parse tree
	 */
	void exitLatch(a1Parser.LatchContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Not}
	 * labeled alternative in {@link a1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNot(a1Parser.NotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Not}
	 * labeled alternative in {@link a1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNot(a1Parser.NotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parenthesis}
	 * labeled alternative in {@link a1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParenthesis(a1Parser.ParenthesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parenthesis}
	 * labeled alternative in {@link a1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParenthesis(a1Parser.ParenthesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link a1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVariable(a1Parser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link a1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVariable(a1Parser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Or}
	 * labeled alternative in {@link a1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOr(a1Parser.OrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Or}
	 * labeled alternative in {@link a1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOr(a1Parser.OrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code And}
	 * labeled alternative in {@link a1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAnd(a1Parser.AndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code And}
	 * labeled alternative in {@link a1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAnd(a1Parser.AndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Const}
	 * labeled alternative in {@link a1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterConst(a1Parser.ConstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Const}
	 * labeled alternative in {@link a1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitConst(a1Parser.ConstContext ctx);
}