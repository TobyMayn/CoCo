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