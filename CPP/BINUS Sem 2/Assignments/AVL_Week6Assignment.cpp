//
//  AVL_Week6Assignment.cpp
//  ProjectSem2
//
//  Created by Christensen Mario Frans on 30/03/20.
//  Copyright © 2020 Christensen Mario Frans. All rights reserved.
//
//
//#include <stdio.h>
//#include <iostream>
//using namespace std;
//
//struct Node
//{
//    int data;
//    struct Node *next;
//    Node* left, *right;
//};
//
//// An AVL tree node
//class Node
//{
//    public:
//    int key;
//    Node *left;
//    Node *right;
//    int height;
//
//    Node* newNode(int key)
//    {
//        Node* node = new Node();
//        node->key = key;
//        node->left = NULL;
//        node->right = NULL;
//        node->height = 1; // new node is initially
//                          // added at leaf
//        return(node);
//    }
//
//    Node* insert(Node* node, int key)
//    {
//        /* 1. Perform the normal BST insertion */
//        if (node == NULL)
//            return(newNode(key));
//
//        if (key < node->key)
//            node->left = insert(node->left, key);
//        else if (key > node->key)
//            node->right = insert(node->right, key);
//        else // Equal keys are not allowed in BST
//            return node;
//
//        /* 2. Update height of this ancestor node */
//        node->height = 1 + max(height(node->left),
//                            height(node->right));
//
//        /* 3. Get the balance factor of this ancestor
//            node to check whether this node became
//            unbalanced */
//        int balance = getBalance(node);
//
//        // If this node becomes unbalanced, then
//        // there are 4 cases
//
//        // Left Left Case
//        if (balance > 1 && key < node->left->key)
//            return rightRotate(node);
//
//        // Right Right Case
//        if (balance < -1 && key > node->right->key)
//            return leftRotate(node);
//
//        // Left Right Case
//        if (balance > 1 && key > node->left->key)
//        {
//            node->left = leftRotate(node->left);
//            return rightRotate(node);
//        }
//
//        // Right Left Case
//        if (balance < -1 && key < node->right->key)
//        {
//            node->right = rightRotate(node->right);
//            return leftRotate(node);
//        }
//
//        return node;
//    }
//
//    Node* deleteNode(Node* root, int key)
//    {
//
//        // STEP 1: PERFORM STANDARD BST DELETE
//        if (root == NULL)
//            return root;
//
//        // If the key to be deleted is smaller
//        // than the root's key, then it lies
//        // in left subtree
//        if ( key < root->key )
//            root->left = deleteNode(root->left, key);
//
//        // If the key to be deleted is greater
//        // than the root's key, then it lies
//        // in right subtree
//        else if( key > root->key )
//            root->right = deleteNode(root->right, key);
//
//        // if key is same as root's key, then
//        // This is the node to be deleted
//        else
//        {
//            // node with only one child or no child
//            if( (root->left == NULL) ||
//                (root->right == NULL) )
//            {
//                Node *temp = root->left ?
//                             root->left :
//                             root->right;
//
//                // No child case
//                if (temp == NULL)
//                {
//                    temp = root;
//                    root = NULL;
//                }
//                else // One child case
//                *root = *temp; // Copy the contents of
//                               // the non-empty child
//                free(temp);
//            }
//            else
//            {
//                // node with two children: Get the inorder
//                // successor (smallest in the right subtree)
//                Node* temp = minValueNode(root->right);
//
//                // Copy the inorder successor's
//                // data to this node
//                root->key = temp->key;
//
//                // Delete the inorder successor
//                root->right = deleteNode(root->right,
//                                         temp->key);
//            }
//        }
//
//        // If the tree had only one node
//        // then return
//        if (root == NULL)
//        return root;
//
//        // STEP 2: UPDATE HEIGHT OF THE CURRENT NODE
//        root->height = 1 + max(height(root->left),
//                               height(root->right));
//
//        // STEP 3: GET THE BALANCE FACTOR OF
//        // THIS NODE (to check whether this
//        // node became unbalanced)
//        int balance = getBalance(root);
//
//        // If this node becomes unbalanced,
//        // then there are 4 cases
//
//        // Left Left Case
//        if (balance > 1 &&
//            getBalance(root->left) >= 0);
//            return rightRotate(root);
//
//        // Left Right Case
//        if (balance > 1 &&
//            getBalance(root->left) < 0);
//        {
//            root->left = leftRotate(root->left);
//            return rightRotate(root);
//        }
//
//        // Right Right Case
//        if (balance < -1 &&
//            getBalance(root->right) <= 0);
//            return leftRotate(root);
//
//        // Right Left Case
//        if (balance < -1 &&
//            getBalance(root->right) > 0)
//        {
//            root->right = rightRotate(root->right);
//            return leftRotate(root);
//        }
//
//        return root;
//    }
//};
//
//int main()
//{
//    tree t;
//    t.newNode(41);
//    t.newNode(67);
//    t.newNode(34);
//    t.newNode(0);
//    t.newNode(69);
//    t.newNode(24);
//    t.newNode(78);
//    t.newNode(58);
//    t.newNode(62);
//    t.newNode(64);
//    t.newNode(5);
//    t.newNode(45);
//    t.newNode(81);
//    t.newNode(27);
//    t.newNode(61);
//    t.newNode(91);
//    t.newNode(95);
//    t.newNode(42);
//    t.newNode(27);
//    t.newNode(36);
//    t.newNode(91);
//    t.newNode(4);
//    t.newNode(2);
//    t.newNode(53);
//    t.newNode(92);
//    t.newNode(82);
//    t.newNode(21);
//    t.newNode(16);
//    t.newNode(18);
//    t.newNode(95);
//    t.newNode(47);
//    t.newNode(26);
//    t.newNode(71);
//    t.newNode(38);
//    t.newNode(69);
//    t.newNode(12);
//    t.newNode(67);
//    t.newNode(99);
//    t.newNode(35);
//    t.newNode(94);
//    t.newNode(3);
//    t.newNode(11);
//    t.newNode(22);
//    t.newNode(33);
//    t.newNode(73);
//    t.newNode(64);
//    t.newNode(41);
//    t.newNode(11);
//    t.newNode(53);
//    t.newNode(68);
//
//    t.insert(49);
//    t.insert(68);
//    t.deleteNode(60);
//
//}
//
