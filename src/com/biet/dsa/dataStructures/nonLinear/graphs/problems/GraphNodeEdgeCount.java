package com.biet.dsa.dataStructures.nonLinear.graphs.problems;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class GraphNodeEdgeCount {
    public static int countNodes(List<List<Integer>> adjList){
        return adjList.size();
    }
    public static int countEdges(List<List<Integer>> adjList){
        int edges = 0;
        for (List<Integer> neighbours : adjList){
            edges += neighbours.size();
        }
        // It is an undirected graph, so all edges will be counted twice
        return edges / 2;
    }
    public static void main(String[] args) {
        List<List<Integer>> adjList = new ArrayList<>();
        adjList.add(Arrays.asList(1,2));
        adjList.add(Arrays.asList(0,2,3));
        adjList.add(Arrays.asList(0,1,4));
        adjList.add(Arrays.asList(1,4));
        adjList.add(Arrays.asList(2,3));
        int nodes = countNodes(adjList);
        int edges = countEdges(adjList);
        System.out.println("Nodes: " + nodes);
        System.out.println("Edges: " + edges);
    }
}
