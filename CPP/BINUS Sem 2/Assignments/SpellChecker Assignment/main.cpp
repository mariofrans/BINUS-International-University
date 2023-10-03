////
////  main.cpp
////  ProjectSem2
////
////  Created by Christensen Mario Frans on 15/04/20.
////  Copyright © 2020 Christensen Mario Frans. All rights reserved.
////
//
//#include <stdio.h>
//#include <iostream>
//#include <fstream>
//#include <string>
//#include "Dictionary.hpp"
//#include "SpellChecker.hpp"
//using namespace std;
//
//int main(int argc, const char * argv[]) {
//    
//    //create object of class dictionary and spellchecker.
//    Dictionary dict;
//    SpellChecker spl;
//    
//    
//    //read from the file with words to create the hash table.
//    string line;
//    ifstream myfile("wordlist.txt");
//    char character = myfile.get();
//    int index = 0;
//    char* word = new char();
//     if (myfile.is_open())
//     {
//         while (!myfile.eof()) {
//             if (isalpha(character)) {
//                 word[index++] = tolower(character);
//                }
//             if (character == '\n') {
//                word[index] = '\0';
//                 if(!strcmp(word, "")){
//                 character = myfile.get();
//                 continue;
//                 }
//                 dict.add(word);
//                 memset(word, '\0', index);
//                 index = 0;
//             }
//             character = myfile.get();
//        }
//     
//     myfile.close();
//     }
//     
//     else cout << "Unable to open file"<<endl;
//    
//    //read from the input file and print the input.
//    ifstream infile("input.txt");
////    ifstream infile(argv[1]);
//    if(infile.is_open()){
//        cout<<"INPUT:";
//        while(getline(infile,line)){
//            cout<<line<<endl;
//        }
//        cout<<endl;
//        cout<<endl;
//        infile.close();
//    }
//    
//    else cout<<"Unable to open file"<<endl;
//
//    
//    //again read the input file and check for all the miss spelled words and send for correection.
////    ifstream inputfile(argv[1]);
//    ifstream inputfile("input.txt");
//    char alphabet = inputfile.get();
//    int ind = 0;
//    char* new_word = new char();
//     if(inputfile.is_open()){
//        while(!inputfile.eof()){
//            if(isalpha(alphabet)){
//                new_word[ind++] = tolower(alphabet);
//                }
//            if(isspace(alphabet)){
//                new_word[ind] = '\0';
//                
//                if(!strcmp(new_word, "")){
//                    alphabet = inputfile.get();
//                    continue;
//                }
//                if(!dict.lookup(new_word)){
//                    spl.correcting_algorithm(new_word);
//                }
//                dict.add(new_word);
//                memset(new_word, '\0', ind);
//                ind = 0;
//            }
//            alphabet = inputfile.get();
//            
//        }
//        
//        
//        inputfile.close();
//    }
//    else cout<<"unable to open file"<<endl;
//    return 0;
//}
