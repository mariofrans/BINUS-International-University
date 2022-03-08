//
//  LinkedList.cpp
//  ProjectSem2
//
//  Created by Christensen Mario Frans on 19/03/20.
//  Copyright © 2020 Christensen Mario Frans. All rights reserved.
//
//
//creating linked list

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


//struct node
//{
//    int key;
//    struct node*left;
//    struct node*right;
//};
//
//class tree
//{
//    private:
//    node *root, *current;
//    public:
//    void insertBST(node* root, node* newnode);
//    void display();
//    tree()
//    {
//        root = NULL;
//        current = NULL;
//    }
//};
//
//void tree::insertBST(node* root, node* newnode)
//{
//    if(root == NULL)
//    {
//        root = newnode;
//        root->left = NULL;
//        root->right = NULL;
//    }
//    else
//    {
//        if(newnode->key < root->key)
//        {
//            insertBST(root->left, newnode);
//        }
//        else
//        {
//            insertBST(root->right, newnode);
//        }
//    }
//}


