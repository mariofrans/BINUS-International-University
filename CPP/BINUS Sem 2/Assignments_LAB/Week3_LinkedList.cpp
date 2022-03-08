//
//  Week3_LinkedList.cpp
//  ProjectSem2
//
//  Created by Christensen Mario Frans on 06/06/20.
//  Copyright © 2020 Christensen Mario Frans. All rights reserved.
//

//#include "Week3_LinkedList.hpp"

//#include <stdio.h>
//#include<iostream>
//using namespace std;
//
//struct node
//{
//    int data;
//    struct node *next;
//};
//
//class list
//{
//    private:
//    node *head, *tail;
//    public:
//    void insertNode(int value);
//    void deleteNode(struct Node **head, int key)
//    void display();
//
//    list()
//    {
//        head = NULL;
//        tail = NULL;
//    }
//
//};
//
//void list::insertNode(int value)
//{
//       node *temp=new node;
//       temp->data=value;
//       temp->next=NULL;
//       if(head==NULL)
//       {
//           head=temp;
//           tail=temp;
//           temp=NULL;
//       }
//       else
//       {
//           tail->next=temp;
//           tail=temp;
//       }
//}
//
//void list::display()
//{
//       node *temp=new node;
//       temp=head;
//       while(temp!=NULL)
//       {
//           cout<<temp->data<<"\t";
//           temp=temp->next;
//       }
//}
//
//void list::deleteNode(struct Node **head, int key)
//{
//    // Store head node
//    struct Node* temp = *head, *prev;
//
//    // If head node itself holds the key to be deleted
//    if (temp != NULL && temp->data == key)
//    {
//        *head = temp->next;   // Changed head
//        free(temp);               // free old head
//        return;
//    }
//
//    // Search for the key to be deleted, keep track of the
//    // previous node as we need to change 'prev->next'
//    while (temp != NULL && temp->data != key)
//    {
//        prev = temp;
//        temp = temp->next;
//    }
//
//    // If key was not present in linked list
//    if (temp == NULL) return;
//
//    // Unlink the node from linked list
//    prev->next = temp->next;
//
//    free(temp);  // Free memory
//}
//
//int main()
//{
//    list mario;
//    mario.insertNode(10);
//    mario.insertNode(5);
//    mario.insertNode(40);
//    mario.display();
//}
