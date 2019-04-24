grammar Maple;

maple_stmt_list
 : ';'* maple_stmt ( ';'+ maple_stmt )* ';'*
 ;

maple_stmt
 : ( select_stmt
 | insert_stmt
 | update_stmt
 | embedded_sql)
 ;

update_stmt
 : ( database_name '.' )? table_name ( '(' column_name ( ',' column_name )* ')' )?
 ( K_UPDATE '(' expr ( ',' expr )* ')' ( ',' '(' expr ( ',' expr )* ')' )*
 | select_stmt
 ) (conditional)?
 ;

insert_stmt
 : ( database_name '.' )? table_name ( '(' column_name ( ',' column_name )* ')' )?
 ( K_INSERT '(' expr ( ',' expr )* ')' ( ',' '(' expr ( ',' expr )* ')' )*
 | select_stmt
 )
 ;

select_stmt
 : table_name table_alias? (K_SELECT result_column ( ',' result_column )*?)? (conditional)?
 ;

conditional
 : K_WHERE expr
 ;

expr
  : literal_value
  | ( ( database_name '.' )? table_name '.' )? column_name
  | expr '||' expr
  | expr ( '*' | '/' | '%' ) expr
  | expr ( '+' | '-' ) expr
  | expr ( '<<' | '>>' | '&' | '|' ) expr
  | expr ( '<' | '<=' | '>' | '>=' ) expr
  | expr ( '=' | '==' | '!=' | '<>' | K_IS | K_IS K_NOT | K_IN | K_LIKE | K_GLOB | K_MATCH | K_REGEXP ) expr
  | expr 'AND' expr
  | expr 'OR' expr
  | function_name '(' ( expr ( ',' expr )* | '*')? ')'
  | '(' select_stmt ')'
  | '(' expr ')'
  | expr K_NOT? ( K_LIKE | K_GLOB | K_REGEXP | K_MATCH ) expr ( K_ESCAPE expr )?
  | expr ( K_ISNULL | K_NOTNULL | K_NOT K_NULL )
  | expr K_IS K_NOT? expr
  | expr K_NOT? K_BETWEEN expr K_AND expr
  | expr K_NOT? K_IN ( '(' ( select_stmt
                           | expr ( ',' expr )*
                           )?
                       ')'
                     | ( database_name '.' )? table_name )
  ;

result_column
 : '*'
 | table_name '.' '*'
 | expr
 ;

column_name
 : any_name
 ;

table_name
 : any_name
 ;

table_alias
 : any_name
 ;

database_name
 : any_name
 ;

function_name
 : any_name
 ;

literal_value
 : NUMERIC_LITERAL
 | STRING_LITERAL
 ;

any_name
 : WORD
 ;

embedded_sql
 : K_OPEN_SQL_STMT any_sql_stmt K_CLOSE_SQL_STMT
 ;

any_sql_stmt
 : .*?
 ;

K_SELECT : '>';
K_INSERT : '<';
K_UPDATE : '<<';
K_OPEN_SQL_STMT : '<?';
K_CLOSE_SQL_STMT : '?>';

K_AND : A N D;
K_IN : I N;
K_INNER : I N N E R;
K_INTO : I N T O;
K_IS : I S;
K_ISNULL : I S N U L L;
K_LIKE : L I K E;
K_LIMIT : L I M I T;
K_MATCH : M A T C H;
K_NATURAL : N A T U R A L;
K_NO : N O;
K_NOT : N O T;
K_NOTNULL : N O T N U L L;
K_NULL : N U L L;
K_OF : O F;
K_ON : O N;
K_OR : O R;
K_VIRTUAL : V I R T U A L;
K_WHEN : W H E N;
K_WHERE : '?';
K_WITH : W I T H;
K_WITHOUT : W I T H O U T;

NUMERIC_LITERAL
 : DIGIT+ ( '.' DIGIT* )? ( E [-+]? DIGIT+ )?
 | '.' DIGIT+ ( E [-+]? DIGIT+ )?
 ;

STRING_LITERAL
 : '\'' ( ~'\'' | '\'\'' )* '\''
 ;

SINGLE_LINE_COMMENT
 : '--' ~[\r\n]* -> channel(HIDDEN)
 ;

MULTILINE_COMMENT
 : '/*' .*? ( '*/' | EOF ) -> channel(HIDDEN)
 ;

SPACES
 : [ \u000B\t\r\n] -> channel(HIDDEN)
 ;

WORD : ('a'..'z' | 'A'..'Z')+;
DIGIT : [0-9];
fragment A : [aA];
fragment B : [bB];
fragment C : [cC];
fragment D : [dD];
fragment E : [eE];
fragment F : [fF];
fragment G : [gG];
fragment H : [hH];
fragment I : [iI];
fragment J : [jJ];
fragment K : [kK];
fragment L : [lL];
fragment M : [mM];
fragment N : [nN];
fragment O : [oO];
fragment P : [pP];
fragment Q : [qQ];
fragment R : [rR];
fragment S : [sS];
fragment T : [tT];
fragment U : [uU];
fragment V : [vV];
fragment W : [wW];
fragment X : [xX];
fragment Y : [yY];
fragment Z : [zZ];