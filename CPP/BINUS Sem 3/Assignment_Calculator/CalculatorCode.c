//
//  CalculatorCode.c
//  ProjectSem3
//
//  Created by Christensen Mario Frans on 14/12/20.
//  Copyright © 2020 Christensen Mario Frans. All rights reserved.
//

//#include "CalculatorCode.h"

/* A Simple integer arithmetic calculator
according to the EBNF Notation.
Non-terminal: characters within <> symbol

========================================
<expr> -> <term> { <addop> <term> }
<addop> -> + | -
<term> -> <factor> { <mulop> <factor> }
<mulop> -> *
<factor> -> ( <expr> ) | number
========================================

This calculator program:
- inputs a line of text from stdin
- outputs "Error" or the result.
*/

#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>


char token; /* global token variable */
/* function prototypes for recursive calls */
int expr(void);
int term(void);
int factor(void);

// a function to print error message
void error(void)
{
    fprintf(stderr, "Error\n");
    exit(1);
}

/*
    This function:
    (1) matches the current next token with its parameter,
    (2) advances the input if it succeeds, and
    (3) declares error if it does not
*/
void match(char expectedToken)
{
    if (token == expectedToken)
        token = getchar();
    else
        error();
}

// the main function to load the lookahead and
// call the exp start symbol in the grammar
int main()
{
    int result;
    printf("A RECURSIVE-DESCENT CALCULATOR.\n");
    printf("\t the valid operations are +, - and *\n");
    printf("\nEnter the calculation string, e.g. \'34+6*56\'\n");

    token = getchar(); /* load token with first
                        character for lookahead */
    result = expr();
    if(token =='\n') /* check for end of line */
        printf("Result = %d\n", result);
    else
        error(); /* extraneous chars on line */
    
    return 0;
}

/*
This function implements the following grammar rule:
<expr> -> <term> { <addop> <term> }
<addop> -> + | -
*/
int expr(void)
{
    int temp = term();

    while ((token =='+') || (token=='-')) {
        switch(token) {
            case '+':     match('+');
                        temp += term();
                        break;
            case '-':     match('-');
                        temp -= term();
                        break;
        }
    }
    return temp;
}

/*
This function implements the following grammar rule:
<term> -> <factor> { <mulop> <factor> }
*/
int term(void)
{
    int temp = factor();
    while (token=='*') {
        match('*');
        temp *= factor();
    }
    return temp;
}

/*
This function implements the following grammar rule:
<factor> -> ( <expr> ) | number
*/
int factor(void)
{
    int temp;
    if (token=='(') {
        match('(');
        temp = expr();
        match(')');
    }
    else if(isdigit(token))
    {
        ungetc(token,stdin);
        scanf("%d", &temp);
        token = getchar();
    }
    else
    {
        error();
    }
        
    return temp;
}
