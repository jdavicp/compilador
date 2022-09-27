grammar sintatica;

import lexica;

prog: PROGRAM ID PVIG Decls CmdComp PONTO;
Decls: WS | VAR ListDecl;
ListDecl: DeclTip | (DeclTip ListDecl);
DeclTip: ListId DPONTOS Tip PVIG;
ListId: ID | (ID VIG ListId);
Tip: INTEGER | BOOLEAN | STRING;

CmdComp: BEGIN ListCmd END;
ListCmd: Cmd | (Cmd PVIG ListCmd);
Cmd: CmdIf | CmdWhile | CmdRead | CmdWrite | CmdAtrib | CmdComp;

CmdIf: (IF Expr THEN Cmd) | (IF Expr THEN Cmd ELSE Cmd);
CmdWhile: WHILE Expr DO Cmd;
CmdRead: READ ABPAR ListId FPAR;
CmdWrite: WRITE ABPAR ListW FPAR;
ListW: ElemW | (ElemW VIG ListW);
ElemW: Expr | CADEIA;

CmdAtrib: ID ATRIB Expr;

//Expr: (ABPAR Expr FPAR) ;

//Expr: (ABPAR Expr FPAR) | (Expr OPREL Expr) | (Expr OPAD Expr) | (Expr OPMUT Expr) | ID | CTE | TRUE | FALSE | (OPNEG? Expr);

Expr: ABPAR Expr FPAR | Terms | Terms OPS Terms | OPNEG? Terms;
Terms: ID | CTE | TRUE | FALSE;
OPS: OPREL | OPAD | OPMUT;


//Expr: ABPAR Expr FPAR | Expr (OPREL | OPAD | OPMUT) Expr | ID | CTE | TRUE | FALSE; | OPNEG? Expr;
 
