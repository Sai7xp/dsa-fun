package DataStructures.Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CountComponents {

    // creates an adjancency list from given edges
    public List<List<Integer>> buildGraph(int n, List<List<Integer>> edges) {
        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }
        for (var edge : edges) {
            int u = edge.get(0), v = edge.get(1);
            adjList.get(u).add(v);
            adjList.get(v).add(u);
        }
        return adjList;
    }

    /*
     * 1. First build a graph
     * 2.
     */
    public int findNumberOfComponent(int V, List<List<Integer>> edges) {
        var graph = buildGraph(V, edges);
        // System.out.println(graph);
        boolean[] visited = new boolean[V];
        int totalComponents = 0;

        // 🌻 this loop is very important, since the given graph can have disconnected
        // components, we have to start from every single node
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                totalComponents++;
                // dfs(i,graph,visited);
                bfs(i, graph, visited);
            }
        }
        return totalComponents;
    }

    /*
     * DFS traversal of graph
     */
    public void dfs(int node, List<List<Integer>> graph, boolean[] visited) {
        visited[node] = true;

        for (var neighbour : graph.get(node)) {
            if (!visited[neighbour]) {
                dfs(neighbour, graph, visited);
            }
        }
    }

    /*
     * BFS traversal of graph
     */
    public void bfs(int node, List<List<Integer>> graph, boolean[] visited) {
        Queue<Integer> q = new LinkedList<>();
        q.add(node);
        visited[node] = true;

        while (!q.isEmpty()) {
            int curr = q.poll();
            // add all neighbours of current node
            for (var neighbour : graph.get(curr)) {
                if (!visited[neighbour]) {
                    q.add(neighbour);
                    visited[neighbour] = true;
                }
            }
        }
    }

}
