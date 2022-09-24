lexer grammar lexica;

PROGRAM: P R O G R A M; 
INTEGER: I N T E G E R; 
BOOLEAN: B O O L E A N;
BEGIN: B E G I N;
END: E N D;
WHILE: W H I L E;
DO: D O;
READ: R E A D;
VAR: V A R;
FALSE: F A L S E;
TRUE: T R U E;
WRITE: W R I T E;

ID: [a-zA-Z]{1, 16};
CTE: [0-9]{1, 5};

OPAD: '+' | '-';
OPMUT: '*' | '/';
OPLOG: 'OR' | 'AND';
OPNEG: '~';

OPREL: '<' | '>' | '<=' | '>=' | '==' | '<>';

PVIG: ';';
PONTO: '.';
DPONTOS: ':';
VIG: ',';
ABPAR: '(';
FPAR: ')';
ATRIB: ':=';

WS: [ \n\t\r] -> skip;
COMMENT : '/' .*? '/' -> skip;


fragment A:('a'|'A');
fragment B:('b'|'B');
fragment C:('c'|'C');
fragment D:('d'|'D');
fragment E:('e'|'E');
fragment F:('f'|'F');
fragment G:('g'|'G');
fragment H:('h'|'H');
fragment I:('i'|'I');
fragment J:('j'|'J');
fragment K:('k'|'K');
fragment L:('l'|'L');
fragment M:('m'|'M');
fragment N:('n'|'N');
fragment O:('o'|'O');
fragment P:('p'|'P');
fragment Q:('q'|'Q');
fragment R:('r'|'R');
fragment S:('s'|'S');
fragment T:('t'|'T');
fragment U:('u'|'U');
fragment V:('v'|'V');
fragment W:('w'|'W');
fragment X:('x'|'X');
fragment Y:('y'|'Y');
fragment Z:('z'|'Z');