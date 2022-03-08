# A Simple integer arithmetic calculator
#according to the EBNF Notation.
#Non-terminal: characters within <> symbol

#========================================
#<expr> -> <term> <addop> <term> | <term>
#<addop> -> + | -
#<term> -> <factor> <mulop> <factor> | <factor>
#<mulop> -> *
#<factor> -> ( <expr> ) | number
#========================================

#This calculator program:
#- inputs a line of text from stdin
#- outputs "Error" or the result.
#

#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>

#char token; ??? HOW TO DECLARE A GLOBAL VARIABLE IN PYTHON
token = ""

# function prototypes for recursive calls 

# a function to print error message
def error():
    print("Result = Error\n")
    quit()

#
#	This function:
#	(1) matches the current next token with its parameter, 
#	(2) advances the input if it succeeds, and 
#	(3) declares error if it does not
#
def match(expectedToken, token):
    if (token == expectedToken):
        token = input()
    else: 
        error()


#
#This function implements the following grammar rule:
#<expr> -> <term> { <addop> <term> }
#<addop> -> + | -
#
def expr():
    temp = term()

    while ((token =='+') or (token=='-')):
        if(token == '+'):
            match('+')
            temp += term()
            break
        else:
           # match('-')
            temp -= term()
            break

    return temp

#This function implements the following grammar rule:
#<term> -> <factor> { <mulop> <factor> }

def term():
    temp = factor()
    while (token=='*'):
        match('*')
        temp *= factor()

    return temp

#This function implements the following grammar rule:
#<factor> -> ( <expr> ) | number

def factor():
    token = ""
    if (token=='('):
        match('(')
        temp = expr()
        match(')')
    elif (token.isdigit()):
        #ungetc(token,stdin) # ??? HOW TO UNGETC IN PYTHON
        temp = input()
        token = input()
    else:
        error()
    return temp

# the main function to load the lookahead and 
# call the exp start symbol in the grammar
def main():
    print("A RECURSIVE-DESCENT CALCULATOR.")
    print("Note: The valid operations are +, - and *, for example: '34+6*56'")

    # load token with first character for lookahead
    token = input(("Enter the calculation string: "))
    # split() allows the expressions to be typed in with a character/string in between
    # token = input(("Enter the calculation string: ")).split(" ")
    result = expr()

    # check for end of line 
    if(token =='\n'): 
        print("Result = %d\n" % result)
    else: 
        error()
    # extraneous chars on line

# this means that if this script is executed, then 
# main() will be executed
if __name__ == '__main__':
    main()