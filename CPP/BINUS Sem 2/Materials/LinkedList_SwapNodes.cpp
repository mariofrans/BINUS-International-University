////
////  LinkedList_SwapNodes.cpp
////  ProjectSem2
////
////  Created by Christensen Mario Frans on 04/07/20.
////  Copyright © 2020 Christensen Mario Frans. All rights reserved.
////
//
//#include <iostream>
//#include <stdlib.h>
//using namespace std;
//
//// class to create a node
//class Node
//{
//    public:
//    int data;
//    Node *next;
//};
//
//// creating a new node for linked list
//void createnode(Node** head, int newData)
//{
//    // create new node
//    Node* new_node =new Node();
//
//    // insert data
//    new_node->data = newData;
//
//    // link new node with previous linked list
//    new_node->next = (*head);
//    (*head) = new_node;
//}
//
//// swap nodes/pointers function, parameters = x to be swapped with y
//void swap_pointers(Node **head, int x, int y)
//{
//    // check if x and y is the same, if it is, then no need to swap
//    if (x == y) return;
//
//    // Search for x in linked list
//    Node *previousX = NULL, *currentX = *head;
//    while (currentX && currentX->data != x)
//    {
//        previousX = currentX;
//        currentX = currentX->next;
//    }
//
//    // Search for y in linked list
//    Node *prevY = NULL, *currentY = *head;
//    while (currentY && currentY->data != y)
//    {
//        prevY = currentY;
//        currentY = currentY->next;
//    }
//
//    // If x and y is not present, then nothing to swap
//    if (currentX == NULL || currentY == NULL)
//        return;
//
//    // If x is not the head of linked list
//    if (previousX != NULL)
//        previousX->next = currentY;
//    else // Else make y as the new head
//        *head = currentY;
//
//    // If y is not the head of linked list
//    if (prevY != NULL)
//        prevY->next = currentX;
//    else // Else make x as the new head
//        *head = currentX;
//
//    // Swap the next pointers
//    Node *temp = currentY->next;
//    currentY->next = currentX->next;
//    currentX->next = temp;
//}
//
//// display the current linked list
//void display(Node *node)
//{
//    while(node != NULL)
//    {
//        cout<<node->data<<" ";
//        node = node->next;
//    }
//}
//
//// main function to test program
//int main()
//{
//    Node *pointers = NULL;
//
//    // insert values for first and second nodes
//    int first = 1;
//    int second = 2;
//
//    // create new nodes
//    createnode(&pointers, first);
//    createnode(&pointers, second);
//
//    // display current pointers
//    cout << "Initial pointers:  ";
//    display(pointers);
//    cout<<endl;
//
//    // swap pointers
//    swap_pointers(&pointers, 1, 2);
//
//    // display linked list after swapping pointers
//    cout << "After swapping pointers:  ";
//    display(pointers);
//    cout<<endl;
//
//    return 0;
//}
