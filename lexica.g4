lexer grammar lexica;

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
