grammar calculator;

prog:   (expr)*                     # Program
    ;
expr:   expr '^' expr               # Power
    |   expr '*' expr               # Multiplication
    |   expr '/' expr               # Division
    |   expr '+' expr               # Addition
    |   expr '-' expr               # Subtraction
    |   INT                         # Integers
    |   '(' expr ')'                # NestedExpressions
    |   dummy                       # DummyExpression
    ;

dummy
    :   'dummy'
    ;

INT :    [0-9]+;