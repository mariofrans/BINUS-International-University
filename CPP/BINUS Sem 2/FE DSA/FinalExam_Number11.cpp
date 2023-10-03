////
////  FinalExam_Number11.cpp
////  ProjectSem2
////
////  Created by Christensen Mario Frans on 03/07/20.
////  Copyright © 2020 Christensen Mario Frans. All rights reserved.
////
//
////#include "FinalExam_Number11.hpp"
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
//    void insertNode(char value);
//    void deleteNode(struct node **head, char key);
//    void display();
//    void remove2ndbeginning(node **head_ref);
//
//    list()
//    {
//        head = NULL;
//        tail = NULL;
//    }
//
//};
//
//void list::insertNode(char value)
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
////remove 2nd node from beginning
//void list::remove2ndbeginning(node **head_ref)
//{
//     //if linked list is empty
//    if(*head_ref ==  NULL)
//    {
//        return;
//    }
//    
//    //store head node
//    node* temp = *head_ref;
//
//    int position = 1;
//
//    //find previous node of the node to be deleted
//    for (int i = 0; temp!=NULL && i<position-1;i++)
//        temp = temp->next;
//    
//    //if position is more than number of nodes
//    if(temp == NULL || temp->next ==NULL)
//        return;
//    
//    //store pointer to the next of node to be deleted
//    node *next = temp->next->next;
//
//    //unlink node from linked list
//    free(temp->next); //free memory
//
//    temp->next = next; //unlink delteed node from list
//}
//
//
//void list::deleteNode(struct node **head, char key)
//{
//    // Store head node
//    struct node* temp = *head, *prev;
//
//    // If head node itself holds the key to be deleted
//    if (temp != NULL && temp -> data == key)
//    {
//        *head = temp -> next;   // Changed head
//        free(temp);               // free old head
//        return;
//    }
//
//    // Search for the key to be deleted, keep track of the
//    // previous node as we need to change 'prev->next'
//    while (temp != NULL && temp -> data != key)
//    {
//        prev = temp;
//        temp = temp -> next;
//    }
//
//    // If key was not present in linked list
//    if (temp == NULL) return;
//
//    // Unlink the node from linked list
//    prev -> next = temp->next;
//
//    free(temp);  // Free memory
//}
//   
//int main()
//{
//    // display the data
//    cout << "Data: 'CHRISTENSE'" << endl;
//    
////    Letter C: 2%10 = 2 = C
////    Letter H: 7%10 = 7 = H
////    Letter R: 17%10 = 7 = H
////    Letter I: 8%10 = 8 = I
////    Letter S: 18%10 = 8 = I
////    Letter T: 19%10 = 9 = J
////    Letter E: 4%10 = 4 = E
////    Letter N: 13%10 = 3 = D
////    Letter S: 18%10 = 8 = I
////    Letter E: 4%10 = 4 = E
//    
//    cout << "The questions I will be answering are: C, E, H, I, J" << endl;
//
//    
//    
//    list mario;
//    mario.insertNode('C');
//    mario.insertNode('E');
//    mario.insertNode('H');
//    mario.insertNode('I');
//    mario.insertNode('J');
//    mario.remove2ndbeginning('C');
//    mario.display();
//}
//
//
