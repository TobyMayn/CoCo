grammar a1;

// Parser:
start: '.hardware' hard=VARIABLE '.inputs' in+=VARIABLE+ '.outputs' out+=VARIABLE+ latch+=latchDec+ '.update' up+=updateDecl+ '.simulate' sim+=simInp+ EOF;


updateDecl: v1=VARIABLE '=' e1=expr* #Update;

simInp: v1=VARIABLE '=' c=CONST #Simulate;

latchDec: LATCH v1=VARIABLE '->' v2=VARIABLE #Latch;

expr: '!' e1=expr 				# Not
	| e1=expr '&&' e2=expr		# And
	| e1=expr '||' e2=expr		# Or
	| '(' e1=expr ')'			# Parenthesis
	| v1=VARIABLE				# Variable
	| c=CONST					# Const
	;

// Lexer:
LATCH: '.latch';

VARIABLE : [a-zA-Z][a-zA-Z]* ;

CONST : [0-9]+ ('.' [0-9]+)? ;

WHITESPACE : [ \t\n] -> skip;

KOMMENTAR : '//' ~[\n]* -> skip ;
MULTILINEKOMMENTAR :  '/*'  ( '*'~[/] | ~[*]  )* '*/' -> skip; 
