import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.CharStreams;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) throws IOException{

	// we expect exactly one argument: the name of the input file
	if (args.length!=1) {
	    System.err.println("\n");
	    System.err.println("Impl Interpreter\n");
	    System.err.println("=================\n\n");
	    System.err.println("Please give as input argument a filename\n");
	    System.exit(-1);
	}
	String filename=args[0];

	// open the input file
	CharStream input = CharStreams.fromFileName(filename);
	    //new ANTLRFileStream (filename); // depricated
	
	// create a lexer/scanner
	implLexer lex = new implLexer(input);
	
	// get the stream of tokens from the scanner
	CommonTokenStream tokens = new CommonTokenStream(lex);
	
	// create a parser
	implParser parser = new implParser(tokens);
	
	// and parse anything from the grammar for "start"
	ParseTree parseTree = parser.start();

	// Construct an interpreter and run it on the parse tree
	Interpreter interpreter = new Interpreter();
	Expr result=interpreter.visit(parseTree);
	System.out.println("The result is: "+result.eval());
    }
}

// We write an interpreter that implements interface
// "implVisitor<T>" that is automatically generated by ANTLR
// This is parameterized over a return type "<T>" which is in our case
// simply a Integer.

class Interpreter extends AbstractParseTreeVisitor<Expr> implements implVisitor<Expr> {

    public Expr visitStart(implParser.StartContext ctx){
	return visit(ctx.e1);
    };
    public Expr visitMultiplication(implParser.MultiplicationContext ctx){
	if (ctx.op.getText().equals("*"))
	    return new Multiplication(visit(ctx.e1),visit(ctx.e2));
	else
	    return new Division(visit(ctx.e1),visit(ctx.e2));
    };
    public Expr visitAddition(implParser.AdditionContext ctx){
	if (ctx.op.getText().equals("+"))
	    return new Addition(visit(ctx.e1),visit(ctx.e2));
	else
	    return new Subtraction(visit(ctx.e1),visit(ctx.e2));
    };
    public Expr visitVariable(implParser.VariableContext ctx){
	return new Variable(ctx.x.getText());
    };
    public Expr visitConstant(implParser.ConstantContext ctx){
	return new Constant(Integer.parseInt(ctx.c.getText()));
    };
    public Expr visitParentheses(implParser.ParenthesesContext ctx){
	return visit(ctx.e1);
    };
}
