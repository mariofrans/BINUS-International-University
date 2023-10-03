//
//  Sorting_Seatwork.cpp
//  ProjectSem2
//
//  Created by Christensen Mario Frans on 14/05/20.
//  Copyright © 2020 Christensen Mario Frans. All rights reserved.
//

//#include <stdio.h>
//#include <iostream>
//#include <cstdlib>
//#include<iomanip>
//using namespace std::chrono;
//using namespace std;
//
//void swap(int *xp, int *yp)
//{
//    int temp = *xp;
//    *xp = *yp;
//    *yp = temp;
//}
//
//// A function to implement bubble sort
//long bubbleSort(int arr[], int n)
//{
//    auto start = high_resolution_clock::now();
//    int i, j;
//    for (i = 0; i < n-1; i++)
//
//    // Last i elements are already in place
//    for (j = 0; j < n-i-1; j++)
//        if (arr[j] > arr[j+1])
//            swap(&arr[j], &arr[j+1]);
//    auto stop = high_resolution_clock::now();
//    auto duration = duration_cast<nanoseconds>(stop - start);
//    return duration.count();
//}
//
//long selectionSort(int arr[], int n)
//{
//    auto start = high_resolution_clock::now();
//    int i, j, min_idx;
//
//    // One by one move boundary of unsorted subarray
//    for (i = 0; i < n-1; i++)
//    {
//        // Find the minimum element in unsorted array
//        min_idx = i;
//        for (j = i+1; j < n; j++)
//        if (arr[j] < arr[min_idx])
//            min_idx = j;
//
//        // Swap the found minimum element with the first element
//        swap(&arr[min_idx], &arr[i]);
//    }
//    auto stop = high_resolution_clock::now();
//    auto duration = duration_cast<nanoseconds>(stop - start);
//    return duration.count();
//}
//
//long insertionSort(int arr[], int n)
//{
//    auto start = high_resolution_clock::now();
//    int i, key, j;
//    for (i = 1; i < n; i++)
//    {
//        key = arr[i];
//        j = i - 1;
//
//        /* Move elements of arr[0..i-1], that are
//        greater than key, to one position ahead
//        of their current position */
//        while (j >= 0 && arr[j] > key)
//        {
//            arr[j + 1] = arr[j];
//            j = j - 1;
//        }
//        arr[j + 1] = key;
//    }
//    auto stop = high_resolution_clock::now();
//    auto duration = duration_cast<nanoseconds>(stop - start);
//    return duration.count();
//}
//
///* Function to print an array */
//void displayArray(int arr[], int size)
//{
//    for (int i = 0; i < size; i++)
//    {
//        cout << arr[i] << endl;
//    }
//}
//
//void inputRandValues(int arr[], int size)
//{
//    for (int i = 0; i < size; i++)
//    {
//        arr[i] = rand();
//    }
//}
//
//void PrintMatrix(int **matrix, int n) {
//   int i, j;
//      cout<<"\n\n"<<setw(4)<<"";
//   for(i = 0; i < n; i++)
//      cout<<setw(3)<<"("<<i+1<<")";
//      cout<<"\n\n";
//   for(i = 0; i < n; i++) {
//      cout<<setw(3)<<"("<<i+1<<")";
//      for(j = 0; j < n; j++) {
//         cout<<setw(4)<<matrix[i][j];
//      }
//      cout<<"\n\n";
//   }
//}
//
//// Driver code
//int main()
//{
//
//// create empty array to store random values
//    int arr_10[10];
//    int arr_100[100];
//    int arr_500[500];
//    int arr_1000[1000];
//    int arr_5000[5000];
//    int arr_10000[10000];
//
//// create empty array for each sorting method
//    long bubble[6];
//    long insertion[6];
//    long selection[6];
////    long merge[6];
//
//
//// array 10 sorting
//    // bubble sort arr_10
//    inputRandValues(arr_10, 10);
//    bubble[0] = bubbleSort(arr_10, 10);;
//    // selection sort arr_10
//    inputRandValues(arr_10, 10);
//    selection[0] = selectionSort(arr_10, 10);
//    // insertion sort arr_10
//    inputRandValues(arr_10, 10);
//    insertion[0] = insertionSort(arr_10, 10);
//
//
//// array 100 sorting
//    // bubble sort arr_100
//    inputRandValues(arr_100, 100);
//    bubble[1] = bubbleSort(arr_100, 100);
//    // selection sort arr_100
//    inputRandValues(arr_100, 100);
//    selection[1] = selectionSort(arr_100, 100);
//    // insertion sort arr_100
//    inputRandValues(arr_100, 100);
//    insertion[1] = insertionSort(arr_100, 100);
//
//
//// array 500 sorting
//    // bubble sort arr_500
//    inputRandValues(arr_500, 500);
//    bubble[2] = bubbleSort(arr_500, 500);
//    // selection sort arr_500
//    inputRandValues(arr_500, 500);
//    selection[2] = selectionSort(arr_500, 500);
//    // insertion sort arr_500
//    inputRandValues(arr_500, 500);
//    insertion[2] = insertionSort(arr_500, 500);
//
//
//// array 1000 sorting
//    // bubble sort arr_1000
//    inputRandValues(arr_1000, 1000);
//    bubble[3] = bubbleSort(arr_1000, 1000);
//    // selection sort arr_1000
//    inputRandValues(arr_1000, 1000);
//    selection[3] = selectionSort(arr_1000, 1000);
//    // insertion sort arr_1000
//    inputRandValues(arr_1000, 1000);
//    insertion[3] = insertionSort(arr_1000, 1000);
//
//
//// array 5000 sorting
//    // bubble sort arr_5000
//    inputRandValues(arr_5000, 500);
//    bubble[4] = bubbleSort(arr_5000, 5000);
//    // selection sort arr_5000
//    inputRandValues(arr_5000, 5000);
//    selection[4] = selectionSort(arr_5000, 5000);
//    // insertion sort arr_5000
//    inputRandValues(arr_5000, 5000);
//    insertion[4] = insertionSort(arr_5000, 5000);
//
//
//// array 10000 sorting
//    // bubble sort arr_10000
//    inputRandValues(arr_10000, 10000);
//    bubble[5] = bubbleSort(arr_10000, 10000);
//    // selection sort arr_10000
//    inputRandValues(arr_10000, 10000);
//    selection[5] = selectionSort(arr_10000, 10000);
//    // insertion sort arr_10000
//    inputRandValues(arr_10000, 10000);
//    insertion[5] = insertionSort(arr_10000, 10000);
//
//
////put all the values in a double array
//    long all[3][6] = {
//        {bubble[0], bubble[1], bubble[2], bubble[3], bubble[4], bubble[5]},
//        {selection[0], selection[1], selection[2], selection[3], selection[4], selection[5]},
//        {insertion[0], insertion[1], insertion[2], insertion[3], insertion[4], insertion[5]}
//    };
//
//    for(int i=0; i<3; i++)
//    {
//        for(int j=0; j<6; j++)
//        {
//            cout << all[i][j] << endl;
//        }
//    }
//
//
//}
