////
////  SpellChecker.cpp
////  ProjectSem2
////
////  Created by Christensen Mario Frans on 15/04/20.
////  Copyright © 2020 Christensen Mario Frans. All rights reserved.
////
//
//#include "SpellChecker.hpp"
////#include "SpellChecker.h"
//#include "Dictionary.hpp"
//#include <iostream>
//#include <fstream>
//#include <string>
//#include <stdio.h>
//using namespace std;
//
//Dictionary dict;
//
//SpellChecker::SpellChecker(){
//    count_num =0;
//}
//
//
//
////the only public method of class Spellchecker. only this method can be accesed from the main. we call
////each correct word finding technique one by one from here and finally call the printing method.
//void SpellChecker::correcting_algorithm(char* word){
//    check_delete(word);
//    check_swap(word);
//    check_split(word);
//    print_result(word);
//    empty();
//}
//
//
//
////dlete each letter of the word one by one and check for the remain of the word in dictionary.
////if found push it into the array
//void SpellChecker::check_delete(char* word){
//    int len = int(strlen(word));
//    char* new_word = new char();
//    int index = 0;
//    for(int i = 0 ; i< len ; i++){
//        for(int j=0 ; j<len ; j++){
//            if(i != j){
//                new_word[index++] = word[j];
//                
//            }
//         }
//        new_word[index++] = '\0';
//        index = 0;
//        if(dict.lookup(new_word)){
//            bool present = false;
//            for(int k=0 ;k<count_num ;k++ ){
//                if(strcmp(list_of_words[k], new_word)==0){
//                    present = true;
//                }
//            }
//            if(!present){
//                list_of_words[count_num] = new char();
//                strcpy(list_of_words[count_num], new_word);
//                count_num++;
//            }
//            
//        }
//    }
//    return;
//}
//
//
//
//
////swap the adjascent pair of the word and check for the correct words from dictionary.store it in array
////when found
//void SpellChecker::check_swap(char* word){
//    int len = int(strlen(word));
//    for(int i=0 ; i <len-1 ; i++){
//        char* temp_word = new char();
//        strcpy(temp_word, word);
//        char temp;
//        temp = temp_word[i];
//        temp_word[i] = temp_word[i+1];
//        temp_word[i+1] = temp ;
//        if(dict.lookup(temp_word)){
//            list_of_words[count_num] =  new char();
//            strcpy(list_of_words[count_num], temp_word);
//            count_num++;
//        }
//        delete temp_word;
//        temp_word = NULL;
//    }
//    return;
//}
//
//
//
////split the word into the pair and check whether each word from the pair are correct
//void SpellChecker::check_split(char* word){
//    int len = int(strlen(word));
//    for(int i= 0; i< len; i++){
//        int ind1 = 0;
//        int ind2 = 0;
//        char* first_part = new char();
//        char* second_part = new char();
//        for(int j = 0 ; j<=i ; j++){
//            first_part[ind1++] = word[j];
//        }
//        first_part[ind1++] = '\0';
//        for(int k = i+1 ;k < len ; k++){
//            second_part[ind2++] = word[k];
//        }
//        second_part[ind2++] = '\0';
//        if(dict.lookup(first_part) && dict.lookup(second_part)){
//            strcat(first_part, " ");
//            strcat(first_part, second_part);
//            list_of_words[count_num] = new char();
//            strcpy(list_of_words[count_num], first_part);
//            count_num++;
//        }
//        delete first_part;
//        first_part = NULL;
//        delete second_part;
//        second_part = NULL;
//    }
//}
//
//
//
////print the correct word suggestions
//void SpellChecker::print_result(char* word){
//    cout<<"Word not found:"<<word<<endl;
//    cout<<"Perhaps you meant:"<<endl;
//    //sort the words in ascending order
//    char* temp = new char();
//    if(count_num >1){
//        for(int first = 0 ; first< count_num ; first++){
//            for(int second = 1; second <count_num ; second++){
//                if(strcmp(list_of_words[first], list_of_words[second]) > 0){
//                    strcpy(temp,list_of_words[first]);
//                    strcpy(list_of_words[first] , list_of_words[second]);
//                    strcpy(list_of_words[second] , temp);
//                }
//            }
//        }
//    }
//    if(temp != NULL){
//        delete temp;
//        temp = NULL;
//    }
//    for(int i =0 ; i < count_num; i++){
//        cout<<list_of_words[i]<<endl;
//    }
//    cout<<endl;
//    cout<<endl;
//    
//}
//
//
//
//
////empty the array used to store the suggested correct words from dictionary
//void SpellChecker::empty(){
//    for(int i=0; i< count_num ; i++){
//        if(list_of_words != NULL){
//        delete list_of_words[i];
//        list_of_words[i] = NULL;
//        }
//    }
//    count_num = 0;
//    
//}
