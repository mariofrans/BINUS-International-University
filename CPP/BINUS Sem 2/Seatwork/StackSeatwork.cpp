//
//  StackSeatwork.cpp
//  ProjectSem2
//
//  Created by Christensen Mario Frans on 12/03/20.
//  Copyright © 2020 Christensen Mario Frans. All rights reserved.
//

//GROUP SEATWORK 1

//#include <iostream>
//#include <stdio.h>
//#include <stdlib.h> // pulls in declaration of malloc, free
//#include <string.h> // pulls in declaration for strlen.
//// CPP program to reverse a string using stack
////#include <bits/stdc++.h>
//using namespace std;
//
//// A structure to represent a stack
//class Stack
//{
//    public:
//    int top;
//    unsigned capacity;
//    char* array;
//};
//
//// function to create a stack of given
//// capacity. It initializes size of stack as 0
//Stack* createStack(unsigned capacity)
//{
//    Stack* stack = new Stack();
//    stack->capacity = capacity;
//    stack->top = -1;
//    stack->array = new char[(stack->capacity * sizeof(char))];
//    return stack;
//}
//
//// Stack is full when top is equal to the last index
//int isFull(Stack* stack)
//{ return stack->top == stack->capacity - 1; }
//
//// Stack is empty when top is equal to -1
//int isEmpty(Stack* stack)
//{ return stack->top == -1; }
//
//// Function to add an item to stack.
//// It increases top by 1
//void push(Stack* stack, char item)
//{
//    if (isFull(stack))
//        return;
//    stack->array[++stack->top] = item;
//}
//
//// Function to remove an item from stack.
//// It decreases top by 1
//char pop(Stack* stack)
//{
//    if (isEmpty(stack))
//        return -1;
//    return stack->array[stack->top--];
//}
//
//// A stack based function to reverse a string
//void reverse(char str[])
//{
//    // Create a stack of capacity
//    //equal to length of string
//    int n = strlen(str);
//    Stack* stack = createStack(n);
//
//    // Push all characters of string to stack
//    int i;
//    for (i = 0; i < n; i++)
//        push(stack, str[i]);
//
//    // Pop all characters of string and
//    // put them back to str
//    for (i = 0; i < n; i++)
//        str[i] = pop(stack);
//}
//
//// Driver code
//int main()
//{
//    char str[] = "Christensen Mario Frans";
//
//    reverse(str);
//    cout << "Reversed string is: " << str << endl;
//
//    return 0;
//}

//GROUP SEATWORK 2
// infix to postfix
//#include<iostream>
//#include<stack>
//using namespace std;
//
//void Postfix(char *a)
//{    stack <char> s;
//    char output[50],t;
//    for(int i=0;a[i]!='\0';i++)
//    {   char ch = a[i];
//        switch(ch)
//        {
//        case '^':
//        case '-':
//        case '+':
//        case '/':
//        case '*':   s.push(ch);
//                    break;
//        case ')': t=s.top();
//                    s.pop();
//                   cout<<t;
//                    break;
//        }
//        if (isalpha(ch))
//            cout<<ch;
//    }
//}
//
//int main()
//{
//    char a[] = "(A+B)*(C+D)–E";
//    Postfix(a);
//    cout<<" "<<endl;
//    return 0;
//}

//GROUP SEATWORK 3

//#include <iostream>
//#include <string.h>
//
//using namespace std;
//
//// Stack type
//struct Stack
//{
//    int top;
//    unsigned capacity;
//    int* array;
//};
//
//// Stack Operations
//struct Stack* createStack( unsigned capacity )
//{
//    struct Stack* stack = (struct Stack*) malloc(sizeof(struct Stack));
//
//    if (!stack) return NULL;
//
//    stack->top = -1;
//    stack->capacity = capacity;
//    stack->array = (int*) malloc(stack->capacity * sizeof(int));
//
//    if (!stack->array) return NULL;
//
//    return stack;
//}
//
//int isEmpty(struct Stack* stack)
//{
//    return stack->top == -1 ;
//}
//
//char peek(struct Stack* stack)
//{
//    return stack->array[stack->top];
//}
//
//char pop(struct Stack* stack)
//{
//    if (!isEmpty(stack))
//        return stack->array[stack->top--] ;
//    return '$';
//}
//
//void push(struct Stack* stack, char op)
//{
//    stack->array[++stack->top] = op;
//}
//
//
//// The main function that returns value of a given postfix expression
//int evaluatePostfix(char* exp)
//{
//    // Create a stack of capacity equal to expression size
//    struct Stack* stack = createStack(strlen(exp));
//    int i;
//
//    // See if stack was created successfully
//    if (!stack) return -1;
//
//    // Scan all characters one by one
//    for (i = 0; exp[i]; ++i)
//    {
//        // If the scanned character is an operand (number here),
//        // push it to the stack.
//        if (isdigit(exp[i]))
//            push(stack, exp[i] - '0');
//
//        // If the scanned character is an operator, pop two
//        // elements from stack apply the operator
//        else
//        {
//            int val1 = pop(stack);
//            int val2 = pop(stack);
//            switch (exp[i])
//            {
//            case '+': push(stack, val2 + val1); break;
//            case '-': push(stack, val2 - val1); break;
//            case '*': push(stack, val2 * val1); break;
//            case '/': push(stack, val2/val1); break;
//            }
//        }
//    }
//    return pop(stack);
//}
//
//// Driver program to test above functions
//int main()
//{
//    char exp[] = "63+2*=";
//    cout<<"postfix evaluation: "<< evaluatePostfix(exp) <<endl;
//    return 0;
//}
