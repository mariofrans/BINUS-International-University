import ply.lex as lex
import ply.yacc as yacc
# lex and yacc are tools used to generate lexical analyzers and parsers.
import sys

#========================================
#<expr> -> <term> <addop> <term> | <term>
#<addop> -> + | -
#<term> -> <factor> <mulop> <factor> | <factor>
#<mulop> -> *
#<factor> -> ( <expr> ) | number
#========================================

# describe what kind of token that we're gonna use in here
tokens = [
    'INT',
    'FLOAT',
    'NAME',
    'PLUS',
    'MINUS',
    'MULTIPLY',
    'DIVIDE',
    'EQUALS'
]

# to recognize the string based on the sign
t_PLUS = r'\+'
t_MINUS = r'\-'
t_MULTIPLY = r'\*'
t_DIVIDE = r'\/'
t_EQUALS = r'='

# ignore spaces
t_ignore = r' '

def t_FLOAT(t):
    r'\d+\.\d+'
    t.value = float(t.value)
    return t

def t_INT(t):
    r'\d+'
    # convert token's value into string from int'
    t.value = int(t.value)
    return t

# for variable name
def t_NAME(t):
    # the first can be character and the following character can be int or char again
    r'[a-zA-Z_][a-zA-Z_0-9]*'
    t.type = 'NAME'
    return t

# if we find an error while getting the tokens, we will run this function
def t_error(t):
    print("Illegal characters!")
    t.lexer.skip(1)

lexer = lex.lex()

# # create an input using lexer
# lexer.input("abc=123.456")
#
# while True:
#     token = lexer.token()
#     if not token:
#         break
#     print(token)

precedence = (
    ('left', 'PLUS', 'MINUS'),
    ('left', 'MULTIPLY', 'DIVIDE')

)

def p_calculator(p):
    '''
    calc : expression
         | var_assign
         | empty
    '''

    # this print(run(p[1]) is for print the result of the calculation
    print(run(p[1]))


    # uncomment this print(p[1]) if you want to see the Abstract Syntax Tree (AST)
    print(p[1])

def p_var_assign(p):
    '''
    var_assign : NAME EQUALS expression
    '''
    p[0] = ('=', p[1], p[3])

def p_expression(p):

    # p[0]          p[1]      p[2]      p[3]
    '''
    expression : expression MULTIPLY expression
               | expression DIVIDE expression
               | expression PLUS expression
               | expression MINUS expression
    '''
    p[0] = (p[2], p[1], p[3])


def p_expression_int_float(p):
    '''
    expression : INT
               | FLOAT
    '''
    p[0] = p[1]

def p_expression_var(p):
    '''
    expression : NAME
    '''
    p[0] = ('var', p[1])

def p_error(p):
    print("Syntax error !")

def p_empty(p):
    '''
    empty :
    '''
    p[0] = None

env = {}
def run(p):
    global env
    if type(p) == tuple:
        if p[0] == '+':
            return run(p[1]) + run(p[2])
        elif p[0] == '-':
            return run(p[1]) - run(p[2])
        elif p[0] == '*':
            return run(p[1]) * run(p[2])
        elif p[0] == '/':
            return run(p[1]) / run(p[2])
        elif p[0] == '=':
            env[p[1]] = run(p[2])
            print(env)
        elif p[0] == 'var':
            if p[1] not in env:
                return 'Undeclared variable found !'
            else:
                return env[p[1]]
    else:
        return p

# create a abstract syntax tree
#     +
# 10      *
#     5       4

# result in my output :
# ('+', 10, ('*', 5, 4))

parser = yacc.yacc()

# create a user input using yacc (parser)
print("A RECURSIVE-DESCENT CALCULATOR.")
print("----------------------------------")
print("the valid operations are +, -, /, *, and u can define variables (a = 1)")

while True:
    try:
        s = input("Enter the calculation string, e.g. \'34+6*56\': ")
    except EOFError:
        break
    parser.parse(s)

