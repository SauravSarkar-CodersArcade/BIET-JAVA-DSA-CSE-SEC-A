package com.biet.dsa.dataStructures.nonLinear.graphs.topoSort.dfs;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
public class TopologicalSortDFS {
    // DFS
    private void dfs(int node, int[] vis, Stack<Integer> st,
                     ArrayList<ArrayList<Integer>> adj){
    // Mark the start node as visited
    vis[node] = 1;
    // Traverse all it neighbours & if the node is not visited,
    // do a dfs call from that node
     for (int neighbour : adj.get(node)){
        if (vis[neighbour] == 0){
            dfs(neighbour, vis, st, adj);
        }
     }
     // The moment the dfs call finishes, push the node onto the stack
     st.push(node);
    }
    public List<Integer> topoSort(int V, ArrayList<ArrayList<Integer>> adj){
        int[] vis = new int[V];
        Stack<Integer> st = new Stack<>();
        // Component wise traversal
        for (int i=0; i<V; i++){
            if (vis[i] == 0){
                dfs(i, vis, st, adj);
            }
        }
        // Remove all the nodes from the stack & store in the list
        List<Integer> result = new ArrayList<>();
        while (!st.isEmpty()){
            result.add(st.pop());
        }
        return result;
    }
    public static void main(String[] args) {
        int V = 6;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i=0; i<V; i++){
            adj.add(new ArrayList<>()); // Allocates memory
        }
        adj.get(2).add(3);
        adj.get(3).add(1);
        adj.get(4).add(0);
        adj.get(4).add(1);
        adj.get(5).add(0);
        adj.get(5).add(2);
        TopologicalSortDFS obj = new TopologicalSortDFS();
        List<Integer> res = obj.topoSort(V, adj);
        for (int x : res){
            System.out.print(x + " ");
        }
    }
}
