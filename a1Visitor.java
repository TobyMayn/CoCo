// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link a1Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface a1Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link a1Parser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(a1Parser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link a1Parser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommand(a1Parser.CommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link a1Parser#updateDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdateDecl(a1Parser.UpdateDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link a1Parser#simInp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimInp(a1Parser.SimInpContext ctx);
	/**
	 * Visit a parse tree produced by {@link a1Parser#latchDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLatchDec(a1Parser.LatchDecContext ctx);
	/**
	 * Visit a parse tree produced by {@link a1Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(a1Parser.ExprContext ctx);
}