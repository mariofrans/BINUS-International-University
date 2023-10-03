//
//  Week3_Queue.cpp
//  ProjectSem2
//
//  Created by Christensen Mario Frans on 06/06/20.
//  Copyright © 2020 Christensen Mario Frans. All rights reserved.
//

//#include "Week3_Queue.hpp"
//#include <iostream>
//using namespace std;
//  
//struct QNode {
//    int data;
//    QNode* next;
//    QNode(int d)
//    {
//        data = d;
//        next = NULL;
//    }
//};
//  
//struct Queue {
//    QNode *front, *rear;
//    Queue()
//    {
//        front = rear = NULL;
//    }
//  
//    void push(int x)
//    {
//  
//        // Create a new LL node
//        QNode* temp = new QNode(x);
//  
//        // If queue is empty, then
//        // new node is front and rear both
//        if (rear == NULL) {
//            front = rear = temp;
//            return;
//        }
//  
//        // Add the new node at
//        // the end of queue and change rear
//        rear->next = temp;
//        rear = temp;
//    }
//  
//    // Function to remove
//    // a key from given queue q
//    void pop()
//    {
//        // If queue is empty, return NULL.
//        if (front == NULL)
//            return;
//  
//        // Store previous front and
//        // move front one node ahead
//        QNode* temp = front;
//        front = front->next;
//  
//        // If front becomes NULL, then
//        // change rear also as NULL
//        if (front == NULL)
//            rear = NULL;
//  
//        delete (temp);
//    }
//};
//  
//// Driven Program
//int main()
//{
//  
//    Queue q;
//    q.push(10);
//    q.push(20);
//    q.pop();
//    q.pop();
//    q.push(30);
//    q.push(40);
//    q.push(50);
//    q.pop();
//    cout << "Queue Front : " << (q.front)->data << endl;
//    cout << "Queue Rear : " << (q.rear)->data;
//}
