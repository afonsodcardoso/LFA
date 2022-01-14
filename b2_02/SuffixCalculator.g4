grammar SuffixCalculator;
program : stat*EOF;     // zero or more repetitions of stat
stat : expr? NEWLINE;   // Optative expr followed by an end-of-line
expr : expr expr op=('*'|'/'|'+'|'-')   #ExprSuffix
     | Number                           #ExprNumber
     ;

Number : [0-9]+('.'[0-9]+)?;
NEWLINE: '\r'? '\n';
WS : [ \t]+ -> skip;