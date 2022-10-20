grammar a1;

// Parser:
start: '.hardware' in+=VARIABLE+  (latchDec+) (u=UPDATE updateDecl+) '.simulate' simInp EOF;


updateDecl: v1=VARIABLE op='=' e1=expr*
;

simInp: v1=VARIABLE op='=' c=CONST;

latchDec: lat=LATCH v1=VARIABLE op='->' v2=VARIABLE;

expr: op=NOT e1=expr 				# Not
	| e1=expr op='&&' e2=expr		# And
	| e1=expr op='||' e2=expr		# Or
	| '(' e1=expr ')'			# Parenthesis
	| v1=VARIABLE				# Variable
	| c=CONST					# Const
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
