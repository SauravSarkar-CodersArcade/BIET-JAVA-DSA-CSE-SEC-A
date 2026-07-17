package com.biet.dsa.dataStructures.nonLinear.graphs.representations;
import java.util.Scanner;

public class GraphMatrixDirected {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // n -> number of nodes
        // m -> number of edges
        // We cover all the n nodes, so Time Complexity O(n)
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] adjMatrix = new int[n+1][n+1]; // 0-based index
        // Take the edges as input
        for (int i=0; i<m; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            // Undirected Graph u <--> v
            adjMatrix[u][v] = 1;
            // adjMatrix[v][u] = 1; // Skip this for directed
        }
        // Print the Adjacency Matrix
        for (int i=1; i<=n; i++){
            for (int j=1; j<=n; j++){
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
