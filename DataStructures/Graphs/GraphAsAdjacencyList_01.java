package DataStructures.Graphs;

import java.util.*;

public class GraphAsAdjacencyList_01 {

    // convert given edges into a Adjacency List representation
    public static List<List<Integer>> buildGraphAsAdjList(int n, int[][] edges) {
        List<List<Integer>> adjacencyList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adjacencyList.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            adjacencyList.get(u).add(v);
            adjacencyList.get(v).add(u); // we don't do this if the graph is directed
        }
        return adjacencyList;
    }

    public static void main(String[] args) {
        int nodes = 4;
        // edges of undirected graph
        int[][] edges = new int[][] { { 0, 1 }, { 0, 2 }, { 0, 3 }, { 1, 2 }, { 1, 3 }, { 2, 3 } };
        var graph = buildGraphAsAdjList(nodes, edges);

        for (int i = 0; i < graph.size(); i++) {
            System.out.println("Node " + i + ": " + graph.get(i));
        }
    }
}
