grammar sintatica;

import lexica;

prog: PROGRAM ID PVIG decls cmdComp PONTO;
decls: WS | VAR listDecl;
listDecl: declTip | (declTip listDecl);
declTip: listId DPONTOS tip PVIG;
listId: ID | (ID VIG listId);
tip: INTEGER | BOOLEAN | STRING;

cmdComp: BEGIN listCmd END;
listCmd: cmd | (cmd PVIG listCmd);
cmd: cmdIf | cmdWhile | cmdRead | cmdWrite | cmdAtrib | cmdComp;

cmdIf: (IF expr THEN cmd) | (IF expr THEN cmd ELSE cmd);
cmdWhile: WHILE expr DO cmd;
cmdRead: READ ABPAR listId FPAR;
cmdWrite: WRITE ABPAR listW FPAR;
listW: elemW | (elemW VIG listW);
elemW: expr | CADEIA;

cmdAtrib: ID ATRIB expr;

expr: ABPAR expr FPAR | terms | terms oPS terms | OPNEG? terms;
terms: ID | CTE | TRUE | FALSE;
oPS: OPREL | OPAD | OPMUT;

