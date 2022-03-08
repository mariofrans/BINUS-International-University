//
////  GraphsAlgorithm_Week9_Seatwork.cpp
////  ProjectSem2
////
////  Created by Christensen Mario Frans on 30/04/20.
////  Copyright © 2020 Christensen Mario Frans. All rights reserved.
//
//
//#include <stdio.h>
//#include <fstream>
//#include <string>
//#include <iostream>
//#include <stdlib.h>
//using namespace std;
//  
//// Number of vertices in the graph
//#define V 100
//  
//// A utility function to find the vertex with
//// minimum key value, from the set of vertices
//// not yet included in MST
//int minKey(int key[], bool mstSet[])
//{
//    // Initialize min value
//    int min = INT_MAX, min_index;
//  
//    for (int v = 0; v < V; v++)
//        if (mstSet[v] == false && key[v] < min)
//            min = key[v], min_index = v;
//  
//    return min_index;
//}
//  
//// A utility function to print the
//// constructed MST stored in parent[]
//void printMST(int parent[], int graph[V][V])
//{
//    cout<<"Following are the edges in the constructed by MST using Prim's algorithm\n";
//    for (int i = 1; i < V; i++)
//        cout<<parent[i]<<" -- "<<i<<" = \t"<<graph[i][parent[i]]<<"\n";
//}
//  
//// Function to construct and print MST for
//// a graph represented using adjacency
//// matrix representation
//void primMST(int graph[V][V])
//{
//    // Array to store constructed MST
//    int parent[V];
//      
//    // Key values used to pick minimum weight edge in cut
//    int key[V];
//      
//    // To represent set of vertices not yet included in MST
//    bool mstSet[V];
//  
//    // Initialize all keys as INFINITE
//    for (int i = 0; i < V; i++)
//        key[i] = INT_MAX, mstSet[i] = false;
//  
//    // Always include first 1st vertex in MST.
//    // Make key 0 so that this vertex is picked as first vertex.
//    key[0] = 0;
//    parent[0] = -1; // First node is always root of MST
//  
//    // The MST will have V vertices
//    for (int count = 0; count < V - 1; count++)
//    {
//        // Pick the minimum key vertex from the
//        // set of vertices not yet included in MST
//        int u = minKey(key, mstSet);
//  
//        // Add the picked vertex to the MST Set
//        mstSet[u] = true;
//  
//        // Update key value and parent index of
//        // the adjacent vertices of the picked vertex.
//        // Consider only those vertices which are not
//        // yet included in MST
//        for (int v = 0; v < V; v++)
//  
//            // graph[u][v] is non zero only for adjacent vertices of m
//            // mstSet[v] is false for vertices not yet included in MST
//            // Update the key only if graph[u][v] is smaller than key[v]
//            if (graph[u][v] && mstSet[v] == false && graph[u][v] < key[v])
//                parent[v] = u, key[v] = graph[u][v];
//    }
//  
//    // print the constructed MST
//    printMST(parent, graph);
//}
//
//int main()
//{
////    ifstream file;
////    file.open("test_random.txt");
////    file.open("test_cyclic.txt");
////    file.open("test_cities.txt");
////    file.open("test_standard.txt");
////    file.open("USA-road-d.NY_.txt");
////    string lines[10000];
////    int index = 0;
////
////    if (file.is_open())
////    {
////        while (!file.eof())
////        {
////            getline(file, lines[index]);
////            index = index+1;
////        }
////    }
////    else
////    {
////        cout << "Unable to open file";
////    }
////    cout << index << endl;
//
////    for(int i=0; i<index; i++)
////    {
////        cout << lines[i] << endl;
////    }
//    
////    int graph[1000][1000];
////    for(int i=0; i<index; i++)
////    {
////        graph[i][i] = lines[i];
////    }
//    
//    
//    // remove comment on this list for "test_random.txt"
//    int graph[V][V] = {
//    { 0, 1, 30 },
//    { 0, 2, 43 },
//    { 0, 3, 50 },
//    { 0, 5, 27 },
//    { 0, 7, 62 },
//    { 1, 3, 12 },
//    { 1, 6, 20 },
//    { 1, 7, 27},
//    { 2, 3, 1 },
//    { 2, 7, 80 },
//    { 3, 4, 30 },
//    { 5, 6, 71 },
//    { 6, 7, 58 } };
//    
//    
//    // remove comment on this list for "test_cyclic.txt"
////    int graph[V][V] = { { 3, 1, 5 },
////    { 1, 2, 10 },
////    { 4, 3, 5 },
////    { 2, 4, 7 },
////    { 4, 5, 15 },
////    { 0, 1, 10 }};
//
//    
//    // code:cities
////    0: London
////    1: Berlin
////    2: Madrid
////    3: Kiev
////    4: Rome
////    5: Paris
////    6: Minks
////    7: Stockholm
////    8: Dublin
////    9: Vienna
//    
//    // remove comment on this list for "test_cities.txt"
////    int graph[V][V] = { { 0, 5, 343 },
////    { 1, 6, 954 },
////    { 1, 5, 879 },
////    { 2, 5, 1054 },
////    { 2, 4, 1364 },
////    { 3, 6, 433 },
////    { 4, 5, 1106 },
////    { 8, 0, 464 },
////    { 0, 7, 1435 },
////    { 1, 7, 811 },
////    { 6, 7, 837 },
////    { 4, 9, 766 },
////    { 3, 9, 1053 },
////    { 1, 9, 524 } };
//    
//    // remove comment on this list for "test_standard.txt"
////    int graph[V][V] = { { 2, 4, 33 },
////    { 3, 5, 2 },
////    { 3, 4, 20 },
////    { 4, 5, 1 },
////    { 2, 3, 20 },
////    { 1, 4, 10 },
////    { 1, 3, 50 },
////    { 0, 2, 20 },
////    { 0, 1, 10 } };
// 
//    // Print the solution
//    primMST(graph);
//    
////    file.close();
//    return 0;
//}
