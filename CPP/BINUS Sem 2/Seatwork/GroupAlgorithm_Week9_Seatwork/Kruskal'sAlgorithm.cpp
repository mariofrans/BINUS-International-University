//
//  Kruskal'sAlgorithm.cpp
//  ProjectSem2
//
//  Created by Christensen Mario Frans on 30/04/20.
//  Copyright © 2020 Christensen Mario Frans. All rights reserved.
//
//
//#include <iostream>
//#include <stdlib.h>
//using namespace std;
//  
//// a structure to represent a weighted edge in graph
//class Edge
//{
//    public:
//    int src, dest, weight;
//};
//  
//// a structure to represent a connected, undirected
//// and weighted graph
//class Graph
//{
//    public:
//    // V-> Number of vertices, E-> Number of edges
//    int V, E;
//  
//    // graph is represented as an array of edges.
//    // Since the graph is undirected, the edge
//    // from src to dest is also edge from dest
//    // to src. Both are counted as 1 edge here.
//    Edge* edge;
//};
//  
//// Creates a graph with V vertices and E edges
//Graph* createGraph(int V, int E)
//{
//    Graph* graph = new Graph;
//    graph->V = V;
//    graph->E = E;
//  
//    graph->edge = new Edge[E];
//  
//    return graph;
//}
//  
//// A structure to represent a subset for union-find
//class subset
//{
//    public:
//    int parent;
//    int rank;
//};
//  
//// A utility function to find set of an element i
//// (uses path compression technique)
//int find(subset subsets[], int i)
//{
//    // find root and make root as parent of i
//    // (path compression)
//    if (subsets[i].parent != i)
//        subsets[i].parent = find(subsets, subsets[i].parent);
//  
//    return subsets[i].parent;
//}
//  
//// A function that does union of two sets of x and y
//// (uses union by rank)
//void Union(subset subsets[], int x, int y)
//{
//    int xroot = find(subsets, x);
//    int yroot = find(subsets, y);
//  
//    // Attach smaller rank tree under root of high
//    // rank tree (Union by Rank)
//    if (subsets[xroot].rank < subsets[yroot].rank)
//        subsets[xroot].parent = yroot;
//    else if (subsets[xroot].rank > subsets[yroot].rank)
//        subsets[yroot].parent = xroot;
//  
//    // If ranks are same, then make one as root and
//    // increment its rank by one
//    else
//    {
//        subsets[yroot].parent = xroot;
//        subsets[xroot].rank++;
//    }
//}
//  
//// Compare two edges according to their weights.
//// Used in qsort() for sorting an array of edges
//int myComp(const void* a, const void* b)
//{
//    Edge* a1 = (Edge*)a;
//    Edge* b1 = (Edge*)b;
//    return a1->weight > b1->weight;
//}
//  
//// The main function to construct MST using Kruskal's algorithm
//void KruskalMST(Graph* graph)
//{
//    int V = graph->V;
//    Edge result[V]; // Tnis will store the resultant MST
//    int e = 0; // An index variable, used for result[]
//    int i = 0; // An index variable, used for sorted edges
//  
//    // Step 1: Sort all the edges in non-decreasing
//    // order of their weight. If we are not allowed to
//    // change the given graph, we can create a copy of
//    // array of edges
//    qsort(graph->edge, graph->E, sizeof(graph->edge[0]), myComp);
//  
//    // Allocate memory for creating V ssubsets
//    subset *subsets = new subset[( V * sizeof(subset) )];
//  
//    // Create V subsets with single elements
//    for (int v = 0; v < V; ++v)
//    {
//        subsets[v].parent = v;
//        subsets[v].rank = 0;
//    }
//  
//    // Number of edges to be taken is equal to V-1
//    while (e < V - 1 && i < graph->E)
//    {
//        // Step 2: Pick the smallest edge. And increment
//        // the index for next iteration
//        Edge next_edge = graph->edge[i++];
//  
//        int x = find(subsets, next_edge.src);
//        int y = find(subsets, next_edge.dest);
//  
//        // If including this edge does't cause cycle,
//        // include it in result and increment the index
//        // of result for next edge
//        if (x != y)
//        {
//            result[e++] = next_edge;
//            Union(subsets, x, y);
//        }
//        // Else discard the next_edge
//    }
//  
//    // print the contents of result[] to display the
//    // built MST
//    cout<<"Following are the edges in the constructed by MST using Kruskal's algorithm\n";
//    for (i = 0; i < e; ++i)
//        cout<<result[i].src<<" -- "<<result[i].dest<<" == "<<result[i].weight<<endl;
//    return;
//}
//  
//// Driver code
//int main()
//{
//    int V = 100; // Number of vertices in graph
//    int E = 100; // Number of edges in graph
//    Graph* graph = createGraph(V, E);
//  
//    
////    // remove comment on this list for "test_random.txt"
////    graph->edge[0].src = 0;
////    graph->edge[0].dest = 1;
////    graph->edge[0].weight = 30;
////    graph->edge[1].src = 0;
////    graph->edge[1].dest = 2;
////    graph->edge[1].weight = 43;
////    graph->edge[2].src = 0;
////    graph->edge[2].dest = 3;
////    graph->edge[2].weight = 50;
////    graph->edge[3].src = 0;
////    graph->edge[3].dest = 5;
////    graph->edge[3].weight = 27;
////    graph->edge[4].src = 0;
////    graph->edge[4].dest = 7;
////    graph->edge[4].weight = 62;
////    graph->edge[5].src = 1;
////    graph->edge[5].dest = 3;
////    graph->edge[5].weight = 12;
////    graph->edge[6].src = 1;
////    graph->edge[6].dest = 6;
////    graph->edge[6].weight = 20;
////    graph->edge[7].src = 1;
////    graph->edge[7].dest = 7;
////    graph->edge[7].weight = 27;
////    graph->edge[8].src = 2;
////    graph->edge[8].dest = 3;
////    graph->edge[8].weight = 1;
////    graph->edge[9].src = 2;
////    graph->edge[9].dest = 7;
////    graph->edge[9].weight = 80;
////    graph->edge[10].src = 3;
////    graph->edge[10].dest = 4;
////    graph->edge[10].weight = 30;
////    graph->edge[11].src = 5;
////    graph->edge[11].dest = 6;
////    graph->edge[11].weight = 71;
////    graph->edge[12].src = 6;
////    graph->edge[12].dest = 7;
////    graph->edge[12].weight = 58;
//    
//
//    // remove comment on this list for "test_cyclic.txt"
////    graph->edge[0].src = 3;
////    graph->edge[0].dest = 1;
////    graph->edge[0].weight = 5;
////    graph->edge[1].src = 1;
////    graph->edge[1].dest = 2;
////    graph->edge[1].weight = 10;
////    graph->edge[2].src = 4;
////    graph->edge[2].dest = 3;
////    graph->edge[2].weight = 5;
////    graph->edge[3].src = 2;
////    graph->edge[3].dest = 4;
////    graph->edge[3].weight = 7;
////    graph->edge[4].src = 4;
////    graph->edge[4].dest = 5;
////    graph->edge[4].weight = 15;
////    graph->edge[5].src = 0;
////    graph->edge[5].dest = 1;
////    graph->edge[5].weight = 10;
// 
//    
//// code:cities
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
//    graph->edge[0].src = 0;
//    graph->edge[0].dest = 5;
//    graph->edge[0].weight = 343;
//    graph->edge[1].src = 1;
//    graph->edge[1].dest = 6;
//    graph->edge[1].weight = 954;
//    graph->edge[2].src = 1;
//    graph->edge[2].dest = 5;
//    graph->edge[2].weight = 879;
//    graph->edge[3].src = 2;
//    graph->edge[3].dest = 5;
//    graph->edge[3].weight = 1054;
//    graph->edge[4].src = 2;
//    graph->edge[4].dest = 4;
//    graph->edge[4].weight = 1364;
//    graph->edge[5].src = 3;
//    graph->edge[5].dest = 6;
//    graph->edge[5].weight = 433;
//    graph->edge[6].src = 4;
//    graph->edge[6].dest = 5;
//    graph->edge[6].weight = 1106;
//    graph->edge[7].src = 8;
//    graph->edge[7].dest = 0;
//    graph->edge[7].weight = 464;
//    graph->edge[8].src = 0;
//    graph->edge[8].dest = 7;
//    graph->edge[8].weight = 1435;
//    graph->edge[9].src = 1;
//    graph->edge[9].dest = 7;
//    graph->edge[9].weight = 811;
//    graph->edge[10].src = 6;
//    graph->edge[10].dest = 7;
//    graph->edge[10].weight = 837;
//    graph->edge[11].src = 4;
//    graph->edge[11].dest = 9;
//    graph->edge[11].weight = 766;
//    graph->edge[12].src = 3;
//    graph->edge[12].dest = 9;
//    graph->edge[12].weight = 1053;
//    graph->edge[13].src = 1;
//    graph->edge[13].dest = 9;
//    graph->edge[13].weight = 524;
//
//    
//    // remove comment on this list for "test_standard.txt"
////    graph->edge[0].src = 2;
////    graph->edge[0].dest = 4;
////    graph->edge[0].weight = 33;
////    graph->edge[1].src = 3;
////    graph->edge[1].dest = 5;
////    graph->edge[1].weight = 2;
////    graph->edge[2].src = 3;
////    graph->edge[2].dest = 4;
////    graph->edge[2].weight = 20;
////    graph->edge[3].src = 4;
////    graph->edge[3].dest = 5;
////    graph->edge[3].weight = 1;
////    graph->edge[4].src = 2;
////    graph->edge[4].dest = 3;
////    graph->edge[4].weight = 20;
////    graph->edge[5].src = 1;
////    graph->edge[5].dest = 4;
////    graph->edge[5].weight = 10;
////    graph->edge[6].src = 1;
////    graph->edge[6].dest = 3;
////    graph->edge[6].weight = 50;
////    graph->edge[7].src = 0;
////    graph->edge[7].dest = 2;
////    graph->edge[7].weight = 20;
////    graph->edge[8].src = 0;
////    graph->edge[8].dest = 1;
////    graph->edge[8].weight = 10;
//
//    KruskalMST(graph);
//  
//    return 0;
//}  
