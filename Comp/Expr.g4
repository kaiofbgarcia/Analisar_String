grammar Expr;

prog            : (global|function)+
                ;

global          : decl ';'
                ;

num             : NUMINT                                                        
                | NDOUBLE                                                       
                ;

function        : type ID '(' param? ')' block
                ;

type            : 'int'                                                           
                | 'double'                                                        
                | 'char'                                                          
                ;

param           : paramcomplx ',' param                                        
                | paramcomplx                                                   
                ;

paramcomplx     : type ID                                                       
                | type '*' ID                                                   
                | type ID '[' ']'                                               
                ;

block           : '{' cmd+ '}'                                                  
                ;

cmd             : atrib ';'                                                     
                | print ';'                                                     
                | scan ';'                                                      
                | decl ';'                                                      
                | retrn ';'                                                     
                | funccallact ';'                                               
                | ifstm                                                         
                | swtstm                                                       
                | whilee                                                        
                | dowhile ';'                                                   
                | forr                                                          
                ;

forr            : 'for' '(' forinit ';' cond ';' atrib ')' block
                ;

forinit         : atrib                                                        
                | declatrib                                                     
                ;

dowhile         : 'do' block 'while' '(' cond ')'
                ;

whilee          : 'while' '(' cond ')' block;

swtstm          : 'switch' '(' expr ')' '{' cases+ '}'  
                ;

cases           : 'case' NUMINT ':' '{' cmd+ 'break' ';' '}'                        
                ;

retrn           : 'return' expr 
                ;

atrib           : ID '=' expr                                                  
                | '*' ID '=' expr                                               
                | ID '[' expr ']' '=' expr                                      
                | ID '+' '+'                                                    
                | ID '-' '-'                                                    
                ; 

print           : 'printf' '(' STR ')'                                           
                | 'printf' '(' STR ',' printargs ')'                             
                ;

printargs       : expr ',' printargs                                            
                | expr                                                          
                ;

scan            : 'scanf' '(' STR ',' scanargs')'      
                ;

scanargs        : scanargstype  ',' scanargs                                    
                | scanargstype                                                  
                ;

scanargstype    : '&' ID                                                       
                | ID                                                                                                         
                | '&' ID '[' expr ']'                                            
                ;

expr            : expr '+' term                                                 
                | expr '-' term                                                 
                | expr term                                                    
                | term                                                          
                ;

term            : term '*' fact                                                 
                | term '/' fact                                                 
                | fact                                                          
                ;

fact            : num                                                           
                | STR                                                           
                | CHARC                                                        
                | funccall                                                      
                ;

funccallact     : ID '(' funcargs? ')'
                ;

funccall        : funccallact                                                   
                | downfact                                                     
                ;

downfact        : ID                                                            
                | '&' ID                                                        
                | '*' ID                                                        
                | ID '[' expr ']'                                               
                | '(' expr ')'                                                  
                ;

funcargs        : expr ',' funcargs                                             
                | expr                                                          
                ;

decl            : type ID                                                       
                | type '*' ID                                                  
                | type ID '[' expr ']'                                           
                | declatrib                                                    
                ;

declatrib       : type ID '=' expr                                             
                | type '*' ID '=' '&'? ID                                    
                | 'char' ID '[' ']' '=' STR                                       
                ;

ifstm           : 'if' '(' cond ')' block                                         
                | 'if' '(' cond ')' block 'else' block                              
                ;

cond            : cond '||' cdand                                                 
                | cdand                                                                 
                ;

cdand           : cdand '&&' cndts                                               
                | cndts                                                        
                ;

cndts           : expr relop expr                                                                                           
                | '(' cond ')'                                                  
                ;

relop           : '>'
                | '<' 
                | '>=' 
                | '<=' 
                | '=='
                | '!=' 
                ;

CHARC   : ['] (~[']) ['];
NUMINT  : '-'?[0-9]+;
NDOUBLE : NUMINT'.'[0-9]+;
ID      : [_a-zA-Z][_a-zA-Z0-9]*;
STR     : '"'(~["\r\n])*'"';
WS      : [ \t\r\n]+ -> skip;
COM     : '//'(~[\r\n])*'\r'?'\n' -> skip;