grammar sintatica;

import lexica;

Prog: PROGRAM ID PVIG Decls CmdComp PONTO;
Decls: | VAR ListDecl;
ListDecl: DeclTip | DeclTip ListDecl;
DeclTip: ListId DPONTOS Tip PVIG;
ListId: ID | ID VIG ListId;
Tip: INTEGER | BOOLEAN | STRING;

CmdComp: BEGIN ListCmd END;
ListCmd: Cmd | Cmd PVIG ListCmd;
Cmd: CmdIf | CmdWhile | CmdRead | CmdWrite | CmdAtrib | CmdComp;

CmdIf: IF Expr THEN Cmd | IF Expr THEN Cmd ELSE Cmd;
CmdWhile: WHILE Expr DO Cmd;
CmdRead: READ (ListId);
CmdWrite: WRITE (ListW);
ListW: ElemW | ElemW VIG ListW;
ElemW: Expr | CADEIA;

CmdAtrib: ID ATRIB Expr;

Expr: Expr OPREL Expr | Expr OPAD Expr | Expr OPMUT Expr | ID | CTE | ABPAR Expr FPAR | TRUE | FALSE | OPNEG Expr;
 
