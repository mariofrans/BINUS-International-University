//
//  AVL_Seatwork.cpp
//  ProjectSem2
//
//  Created by Christensen Mario Frans on 26/03/20.
//  Copyright © 2020 Christensen Mario Frans. All rights reserved.
//

//#include <stdio.h>
//#include <iostream>
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
//node* insert(node* node, int key)
//{
//    if (node == NULL)
//        return(newNode(key));
//
//    if (key < node->key)
//        node->left = insert(node->left, key);
//    else if (key > node->key)
//        node->right = insert(node->right, key);
//    else
//        return node;
//
//    node->height = 1 + max(height(node->left),
//                        height(node->right));
//
//    int balance = getBalance(node);
//
//    if (balance > 1 && key < node->left->key)
//        return rightRotate(node);
//
//    if (balance < -1 && key > node->right->key)
//        return leftRotate(node);
//
//    if (balance > 1 && key > node->left->key)
//    {
//        node->left = leftRotate(node->left);
//        return rightRotate(node);
//    }
//
//    if (balance < -1 && key < node->right->key)
//    {
//        node->right = rightRotate(node->right);
//        return leftRotate(node);
//    }
//    return node;
//}
//
//int main()
//{
//    node *root = newNode(70);
//    root->left = newNode(60);
//    root->right = newNode(80);
//    root->left->left = newNode(50);
//    root->left->right = newNode(65);
//    insert(node* root, int 49)
//    insert(node* root, int 68)
//
//    cout << "Level Order traversal of binary tree is \n";
//    traverse_bfs(root);
//
//    return 0;
//
//
//}
