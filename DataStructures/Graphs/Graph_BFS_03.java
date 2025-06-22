package DataStructures.Graphs;

import java.util.*;

public class Graph_BFS_03 {

    public static void bfs(int start, List<List<Integer>> graph, boolean[] visited) {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        visited[start] = true;

        while (!q.isEmpty()) {
            int current = q.poll();
            System.out.println("New Node: " + current);
            for (var neighbour : graph.get(current)) {
                if (!visited[neighbour]) {
                    visited[neighbour] = true;
                    q.add(neighbour);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] edges = new int[][] { { 1, 4 }, { 4, 5 }, { 1, 2 }, { 2, 5 }, { 5, 3 }, { 3, 2 } };
        int n = 5;

        List<List<Integer>> graph = buildGraph(n, edges);
        System.out.println(graph);
        int startNode = 1;

        System.out.println("BFS traversal from node " + startNode);
        boolean[] visited = new boolean[n + 1]; // graph starts from 1 so n+1
        bfs(startNode, graph, visited);
    }

    public static List<List<Integer>> buildGraph(int n, int[][] edges) {
        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < n + 1; i++) { // graph starts from 1, so n+1
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
