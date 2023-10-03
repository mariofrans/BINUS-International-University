////
////  FinalExam_Number11.cpp
////  ProjectSem2
////
////  Created by Christensen Mario Frans on 03/07/20.
////  Copyright © 2020 Christensen Mario Frans. All rights reserved.
////
//
//
//// DSA Final Exam Number 11
//
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
//    void createnode(int value);
//    void display();
//    list()
//    {
//        head = NULL;
//        tail = NULL;
//    }
//
//};
//
//void list::createnode(int value)
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
//           cout<<endl;
//           temp=temp->next;
//       }
//}
//
//int main()
//{
//    list mario;
//    mario.createnode(10);
//    mario.createnode(5);
//    mario.createnode(40);
//    mario.display();
//}
