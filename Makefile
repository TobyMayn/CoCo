antlr4 = java org.antlr.v4.Tool
grun = java org.antlr.v4.gui.TestRig
SRCFILES = main.java AST.java
GENERATED = a1Parser.java a1BaseVisitor.java a1Visitor.java a1Lexer.java
	

all:
	make tree_02

main.class:	$(SRCFILES) $(GENERATED) a1.g4
	javac  $(SRCFILES) $(GENERATED)

a1Lexer.java:	a1.g4
	$(antlr4) -visitor a1.g4

a1Lexer.class: a1Lexer.java
	javac $(GENERATED)

test:	a1Lexer.class main.class a1.g4 01-hello-world.hw
	java main 01-hello-world.hw

tree_01:	a1Lexer.class 01-hello-world.hw
	$(grun) a1 start -gui -tokens 01-hello-world.hw
	
tree_02:	a1Lexer.class 02-trafiklys-minimal.hw
	$(grun) a1 start -gui -tokens 02-trafiklys-minimal.hw
	
tree_03:	a1Lexer.class 03-trafiklys.hw
	$(grun) a1 start -gui -tokens 03-trafiklys.hw
	
	
	
