package com.biet.dsa.dataStructures.nonLinear.graphs.representations;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class GraphList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // n -> number of nodes
        // m -> number of edges
        int n = sc.nextInt();
        int m = sc.nextInt();
        // Adjacency List
        List<List<Integer>> adjList = new ArrayList<>();
        // {  {    }  }; List<List<Integer>>
        // {  {}{    }, {}{    }, {}{    }, {}{    }, {}{    }  }; List<List<Integer>>
        for (int i=0; i<=n; i++){ // for 0 - based indexing
            adjList.add(new ArrayList<>());
        }
        // Read the input of the edges & update the list
        for (int i=0; i<m; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            // Undirected u <--> v
            adjList.get(u).add(v);
            adjList.get(v).add(u); // For directed skip this step
        }
        // Print the adjacency list
        for (int i=1; i<=n; i++){
            System.out.print("Node: -> " + i + " : Neighbours:-> ");
            for (int v : adjList.get(i)){
                System.out.print(v + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
