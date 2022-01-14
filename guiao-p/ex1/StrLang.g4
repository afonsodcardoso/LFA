grammar StrLang;

main: instruction* EOF;

instruction: print
            |assignment
            ;

print: 'print' string;

assignment: ID ':' string;

string: s1=string '+' s2=string                      #concat
      | s1=string '-' s2=string                      #textRem
      | 'trim' string                                #wsRem
      | '(' string ')'                               #priority
      | '(' s1=string '/' s2=string '/' s3=string ')'#replace
      | 'input(' STRING ')'                          #input
      | STRING                                       #literal
      | ID                                           #variable
      ;

STRING: '"' .*? '"';
ID: [a-zA-Z] [a-zA-Z0-9]*;

COMMENT: '//' .*? '\n' -> skip;
WS: [ \t\r\n] -> skip;

//expr() instead of string()!!