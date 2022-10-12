import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.CharStreams;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public abstract class AST{};

abstract class Expr extends AST{
    abstract public void eval(Environment env);
}

class Not extends Expr {
    Expr e1;
    Not(Expr e1){
        this.e1 = e1;
    }
    public void eval(Environment env){
    };
}

class And extends Expr {
    Expr e1, e2;
    And (Expr e1, Expr e2){
        this.e1 = e1;
        this.e2 = e2;
    }
    public void eval(Environment env){
    }
}

class Or extends Expr {
    Expr e1, e2;
    Or (Expr e1, Expr e2){
        this.e1 = e1;
        this.e2 = e2;
    }

    public void eval(Environment env){
    }
}

class Constant {
    public Integer i;
    Constant(Integer i){ this.i=i;}
    public void eval(Environment env){
    };
};


class Variable extends Expr{
    public String varname;
    Variable(String varname){this.varname=varname;}
    public void eval(Environment env){
	System.out.println("Variable not implemented, assuming "+varname+"=0");
    };
};
