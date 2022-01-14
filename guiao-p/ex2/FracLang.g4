grammar FracLang;

main: (stat? ';')* EOF;

stat: display
    | assignment
    ;

display: 'display' expr;

assignment: ID '<=' expr;

expr: NUM '/' NUM                   #exprFractionNumDen
    | NUM                           #exprFractionNum
    | ID                            #exprID
    | op=('+'|'-') expr             #exprUnary
    | expr op=('+'|'-') expr        #exprAddSub
    | expr op=('*'|':') expr        #exprMultDiv
    | '(' expr ')'                  #exprParent
    | 'read' '"' ID '"'             #exprRead
    | 'reduce' expr                 #exprReduce
    ;

NUM: [0-9]+;
ID: [a-z]+;

COMMENT: '--' .*? -> skip;
WS: [ \t\r\n] -> skip;