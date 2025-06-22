package DataStructures.Graphs;

import java.util.*;

public class Graph_DFS_02 {
    // Depth First Search Traversal of Graph - when adjacency list is given
    public static void dfs(int node, List<List<Integer>> adjList, boolean[] visited) {
        System.out.println("New Node: " + node);
        visited[node] = true;

        for (var neighbour : adjList.get(node)) {
            if (!visited[neighbour]) {
                dfs(neighbour, adjList, visited);
            }
        }

    }

    public static void main(String[] args) {
        int[][] edges = new int[][] { { 0, 1 }, { 0, 2 }, { 0, 3 }, { 1, 2 }, { 1, 3 }, { 2, 3 } };
        int n = 4;

        List<List<Integer>> graph = buildGraph(n, edges);

        System.out.println("DFS traversal from node 0");
        boolean[] visited = new boolean[n];
        dfs(0, graph, visited);
    }

    public static List<List<Integer>> buildGraph(int n, int[][] edges) {
        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }
        for (var edge : edges) {
            int u = edge[0], v = edge[1];
            adjList.get(u).add(v);
            adjList.get(v).add(u); // undirected graph
        }

        return adjList;
    }
}
