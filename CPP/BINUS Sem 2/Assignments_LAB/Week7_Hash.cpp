////
////  Week7_Hash.cpp
////  ProjectSem2
////
////  Created by Christensen Mario Frans on 06/06/20.
////  Copyright © 2020 Christensen Mario Frans. All rights reserved.
////
//
//#include "Week7_Hash.hpp"
//#include <iostream>
//#include <stdlib.h>
//using namespace std;
//
//// method of hashing: modulo-division
//int mod(int key)
//{
//    return (key%20)+3;
//}
//
//int main()
//{
//    int key[19] = {224562, 137456, 214562, 140145, 214576, 162145, 144467, 199645, 234534};
//    int address[19] = {};
//    int collision = 0;
//    int count = 0;
//
//    // inputting the mod of key to the address array
//    // each time the address array is occupied, the 'collision' count is increased by 1
//    for(int i = 0; i<19; i++)
//    {
//        for(int j = 0; j<19; j++)
//        {
//            if(mod(key[i]) == j)
//            {
//                if (address[j] == NULL)
//                {
////                    address[j] = mod(key[i]);
//                    address[j] = key[i];
//                }
//                else
//                {
//                    collision = collision + 1;
//                }
//            }
//        }
//    }
//
//    cout<< "The address list is: "<< endl;
//    // print the address list
//    for(int j = 0; j<19; j++)
//    {
//        cout<< address[j] << ",";
//    }
//
//    // print the number of collision/s
//    cout<< " "<< endl;
//    cout<< "The number of collision/s: "<< collision << endl;
//
//    // print the density of the address array after all the keys have been inserted
//    for(int z = 0; z<19; z++)
//    {
//        if(address[z] != 0)
//        {
//            count = count+1;
//        }
//    }
//    double density = count*100/19;
//    cout<< "The density of the address list is: "<< density <<"%"<< endl;
//}
