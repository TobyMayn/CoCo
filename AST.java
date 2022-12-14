import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.CharStreams;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public abstract class AST{
    abstract public void eval(Environment env);
};


abstract class Start extends AST {}

class Simulator extends Start {

    List<Variable> in;
    List<Variable> out;
    List<LatchDec> latch;
    List<UpdateDecl> up;
    List<SimInp> sim;

    Simulator(List<Variable> in, List<Variable> out,
    List<LatchDec> latch, List<UpdateDecl> up, List<SimInp> sim){
        this.in = in;
        this.out = out;
        this.latch = latch;
        this.up = up;
        this.sim = sim;
    }

    public void eval(Environment env) {}
}

class UpdateDecl extends Start {
    Variable v1;
    Expr e1;

    UpdateDecl(Variable v1, Expr e1) {
        this.v1 = v1;
        this.e1 = e1;
    }

    public void eval(Environment env){}
}

class SimInp extends Start {
    Variable v1;
    Constant c;

    SimInp (Variable v1, Constant c) {
        this.v1 = v1;
        this.c = c;
    }

    public void eval(Environment env){}
}
class LatchDec extends Start {
    Variable v1, v2;

    LatchDec(Variable v1, Variable v2) {
        this.v1 = v1;
        this.v2 = v2;
    }
    public void eval(Environment env){}
}

abstract class Expr extends AST{
    abstract public void eval(Environment env);
}

class Not extends Expr {
    Expr e1;
    Not(Expr e1){
        this.e1 = e1;
    }
    public void eval(Environment env){}
}

class And extends Expr {
    Expr e1, e2;
    And (Expr e1, Expr e2){
        this.e1 = e1;
        this.e2 = e2;
    }
    public void eval(Environment env){}
}

class Or extends Expr {
    Expr e1, e2;
    Or (Expr e1, Expr e2){
        this.e1 = e1;
        this.e2 = e2;
    }

    public void eval(Environment env){}
}

class Constant {
    public Integer i;
    Constant(Integer i){ this.i=i;}
    public void eval(Environment env){}
};


class Variable extends Expr{
    public String varname;
    Variable(String varname){this.varname=varname;}
    public void eval(Environment env){
	System.out.println("Variable not implemented, assuming "+varname+"=0");
    }
};

