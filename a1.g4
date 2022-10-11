grammar a1;

// Parser:
start: co=command* EOF;


command : TOKEN VARIABLE+
	 latchDec+
	| UPDATE updateDecl+
	| TOKEN expr
	| TOKEN
	| simInp
	;
updateDecl: VARIABLE '=' expr*
;

simInp: VARIABLE '=' CONST;

latchDec: LATCH VARIABLE '->' VARIABLE;

expr	: NOT expr
	| expr ('&&') expr
	| expr ('||') expr	
	| '(' expr ')'
	| VARIABLE
	| CONST
	;

// Lexer:
UPDATE: '.update';
LATCH: '.latch';
TOKEN : '.' ID ;

VARIABLE : [a-zA-Z][a-zA-Z]* ;

CONST : [0-9]+ ('.' [0-9]+)? ;

NOT : '!';

LOGIC : '&&' | '||' | '==';

fragment
ID : [a-z][a-z_]* ; 

//TEXT : ~[<>/ \t\n]+ ;

WHITESPACE : [ \t\n] -> skip;

KOMMENTAR : '//' ~[\n]* -> skip ;
MULTILINEKOMMENTAR :  '/*'  ( '*'~[/] | ~[*]  )* '*/' -> skip; 
