//
//  SpellingChecker_Assignment.cpp
//  ProjectSem2
//
//  Created by Christensen Mario Frans on 13/04/20.
//  Copyright © 2020 Christensen Mario Frans. All rights reserved.
//
//
//#include <iostream>
//#include <fstream>
//#include <string>
//using namespace std;
//
//#include <stdio.h>
//#define table_len 69997
//#define prime_for_hash2 69931
//
//class Hash{
//public:
//    char* hash_table[table_len];
//    Hash();
//    bool add(const char*);
//    bool lookup(const char*);
//    bool remove(const char*);
//    static Hash* getInstance();
//    void print_table();
//private:
//
//    unsigned int hash_code(const char*, int);
//    unsigned int hash_code_two(int,int);
//
//
//};
////constructor to instialize hash table
//Hash::Hash(){
//    for(int i = 0; i < table_len ; i++){
//        hash_table[i] = new char();
//        strcpy(hash_table[i] , "&e");
//    }
//}
//
//
////calculating first hash function
//unsigned int Hash::hash_code(const char* p, int len){
//    unsigned int h = 0;
//    for(int i = 0; i <len ; i++){
//        h = (h<<5)|(h>>27);
//        h += (unsigned int)p[i];
//    }
//    return h;
//}
//
//
////calculate second hash function value in case of collison
//unsigned int Hash::hash_code_two(int key , int count){
//    int second_key = prime_for_hash2 - (key % prime_for_hash2);
//    second_key *= count;
//    return second_key;
//}
//
//
//
//
//
//
//// method to add word in dictionary
//bool Hash::add(const char* word){
//    bool result = false;
//    int len =  int(strlen(word));
//    unsigned int key = (hash_code(word , len)) % table_len;
//    //cout<<key<<endl;
//    unsigned int second_key = 0;
//    if(strcmp(hash_table[key], "&e")== 0 || strcmp(hash_table[key] , "d") == 0){
//        strcpy(hash_table[key] , word);
//        result = true;
//    }
//    else{
//        for(int i = 1; i <= table_len ; i++){
//            unsigned int new_key = hash_code_two(key, i);
//            second_key = (key + new_key) % table_len;
//            if(strcmp(hash_table[second_key] , "&e") == 0 || strcmp(hash_table[second_key] , "d") == 0){
//                strcpy(hash_table[second_key] , word);
//                result = true;
//                break;
//
//            }
//        }
//
//    }
//    return result;
//}
//
//
//
//
//
//
////method for looking up for a word in dictionary
//bool Hash::lookup(const char* word){
//    bool result = false;
//    int len = int(strlen(word));
//    unsigned int key = (hash_code(word, len)) % table_len;
//    unsigned int second_key = 0;
//    if(strcmp(word, hash_table[key]) == 0){
//        return true;
//    }
//    else{
//        for(int i = 1 ; i <= prime_for_hash2 ; i++){
//            unsigned int new_key = hash_code_two(key, i);
//            second_key = (key + new_key) % table_len;
//            if(strcmp(word , hash_table[second_key]) == 0){
//                result = true;
//                break;
//            }
//        }
//    }
//
//
//
//    return result;
//}
//
//
//
////method for deleting a word in dictioanry
//bool Hash::remove(const char * word){
//    bool result = false;
//    int len = int(strlen(word));
//    unsigned int key = (hash_code(word , len))% table_len;
//    unsigned int second_key = 0;
//    if(strcmp(word , hash_table[key]) == 0){
//        strcpy((hash_table[key]) , "d");
//        result = true;
//    }
//    else{
//        for (int i = 1 ; i<= table_len ; i++){
//            unsigned int new_key = hash_code_two(key, i);
//            second_key = (key + new_key) % table_len;
//            if(strcmp(word, hash_table[second_key]) == 0){
//                strcpy(hash_table[second_key], "d");
//                result = true;
//                break;
//
//            }
//        }
//    }
//    return result;
//}
//
//
//static Hash* hash_instance = NULL;
//
//Hash* Hash::getInstance()
//{
//    if (hash_instance == NULL) {
//        hash_instance = new Hash();
//    }
//    return hash_instance;
//}
//
//void Hash::print_table(){
//    for(int i = 0;  i< table_len ; i ++){
//        cout<<hash_table[i]<<endl;
//    }
//}
//
//int main()
//{
//    ifstream file;
//    file.open("dictionary.txt");
//    string dictionary[10000];
//    int index = 0;
//
//    if (file.is_open())
//    {
//        while (!file.eof())
//        {
//            getline(file, dictionary[index]);
//            index = index+1;
//        }
//    }
//    else
//    {
//        cout << "Unable to open file";
//    }
//
//    file.close();
//    return 0;
//}
