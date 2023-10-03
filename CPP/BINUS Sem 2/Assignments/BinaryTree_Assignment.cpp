//
//  BinaryTree_Assignment.cpp
//  ProjectSem2
//
//  Created by Christensen Mario Frans on 22/03/20.
//  Copyright © 2020 Christensen Mario Frans. All rights reserved.
//

//#include <stdio.h>
//#include<iostream>
//using namespace std;
//
//class node
//{
//    public:
//    int data;
//    node* left, *right;
//};
//  
//void printGivenLevel(node* root, int level);
//int height(node* node);
//node* newNode(int data);
//
//void traverse_bfs(node* root)
//{
//    int h = height(root);
//    int i;
//    for (i = 1; i <= h; i++)
//        printGivenLevel(root, i);
//}
//
//void printGivenLevel(node* root, int level)
//{
//    if (root == NULL)
//        return;
//    if (level == 1)
//        cout << root->data << " ";
//    else if (level > 1)
//    {
//        printGivenLevel(root->left, level-1);
//        printGivenLevel(root->right, level-1);
//    }
//}
//
//int height(node* node)
//{
//    if (node == NULL)
//        return 0;
//    else
//    {
//        int lheight = height(node->left);
//        int rheight = height(node->right);
//
//        if (lheight > rheight)
//            return(lheight + 1);
//        else return(rheight + 1);
//    }
//}
//
//node* newNode(int data)
//{
//    node* Node = new node();
//    Node->data = data;
//    Node->left = NULL;
//    Node->right = NULL;
//
//    return(Node);
//}
//
//int main()
//{
//    node *root = newNode(1);
//    root->left = newNode(2);
//    root->right = newNode(3);
//    root->left->left = newNode(4);
//    root->left->right = newNode(5);
//
//    cout << "Level Order traversal of binary tree is \n";
//    traverse_bfs(root);
//
//    return 0;
//}

