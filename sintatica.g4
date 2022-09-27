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

cmdIf: (IF Expr THEN cmd) | (IF Expr THEN cmd ELSE cmd);
cmdWhile: WHILE Expr DO cmd;
cmdRead: READ ABPAR listId FPAR;
cmdWrite: WRITE ABPAR listW FPAR;
listW: elemW | (elemW VIG listW);
elemW: Expr | CADEIA;

cmdAtrib: ID ATRIB Expr;

//Expr: (ABPAR Expr FPAR) ;

//Expr: (ABPAR Expr FPAR) | (Expr OPREL Expr) | (Expr OPAD Expr) | (Expr OPMUT Expr) | ID | CTE | TRUE | FALSE | (OPNEG? Expr);

Expr: ABPAR Expr FPAR | Terms | Terms OPS Terms | OPNEG? Terms;
Terms: ID | CTE | TRUE | FALSE;
OPS: OPREL | OPAD | OPMUT;


//Expr: ABPAR Expr FPAR | Expr (OPREL | OPAD | OPMUT) Expr | ID | CTE | TRUE | FALSE; | OPNEG? Expr;
 
