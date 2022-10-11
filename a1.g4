grammar a1;

// Parser:
start: cmd=command* EOF;


command : t=TOKEN v1=VARIABLE+
	| latchDec+
	| u=UPDATE updateDecl+
	| t=TOKEN expr
	| t=TOKEN
	| simInp
	;
updateDecl: v1=VARIABLE op='=' e1=expr*
;

simInp: v1=VARIABLE op='=' c=CONST;

latchDec: lat=LATCH v1=VARIABLE op='->' v2=VARIABLE;

expr: NOT e1=expr 				// NOT
	| e1=expr op='&&' e2=expr		// AND
	| e1=expr op='||' e2=expr		// OR
	| '(' e1=expr ')'			// Parenthesis
	| v1=VARIABLE				// VARIABLE
	| c=CONST					// CONST
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

WHITESPACE : [ \t\n] -> skip;

KOMMENTAR : '//' ~[\n]* -> skip ;
MULTILINEKOMMENTAR :  '/*'  ( '*'~[/] | ~[*]  )* '*/' -> skip; 
