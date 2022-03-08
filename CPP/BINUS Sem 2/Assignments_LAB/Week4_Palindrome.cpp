//
//  Week4_Palindrome.cpp
//  ProjectSem2
//
//  Created by Christensen Mario Frans on 06/06/20.
//  Copyright © 2020 Christensen Mario Frans. All rights reserved.
//

//#include "Week4_Palindrome.hpp"
//
//#include <iostream>
//#include <stack>
//#include <queue>
//#include <string>
//using namespace std;
//
//int main (void)
//{
//    stack <char> s;
//    queue <char> q;
//    string letter;
//    int length;
//    bool isPalindrome = true;
//
//    cout<<"Please enter a word: "<<endl;
//    getline (cin, letter);
//    length = letter.size();
//
//    for (int i=0; i<length; i++)
//    {
//        q.push(letter[i]);
//        s.push(letter[i]);
//    }
//
//    while (isPalindrome == true && !s.empty() && !q.empty())
//    {
//        if (s.top() != q.front())
//        {
//            isPalindrome = false;
//            cout<<"Is not a palindrome"<<endl;
//        }
//        else
//        {
//            q.pop();
//            s.pop();
//            cout<<"Is a palindrome"<<endl;
//            break;
//        }
//    }
//
//}
