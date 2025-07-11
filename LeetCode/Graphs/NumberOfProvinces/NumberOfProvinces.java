package LeetCode.Graphs.NumberOfProvinces;

import java.util.*;

// build adj list and then perform traversal to count the provinces, extra space
class NumberOfProvincesSolutionExtraSpace {
    public int findCircleNum(int[][] isConnected) {
        List<List<Integer>> adjList = new ArrayList<>();
        int n = isConnected.length;

        // build adjacency list for dfs traversal
        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (isConnected[i][j] == 1 && i != j) {
                    adjList.get(i).add(j);
                }
            }
        }

        int provinces = 0;
        boolean[] visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                provinces++;
                dfs(i, visited, adjList);
            }
        }
        return provinces;
    }

    public void dfs(int node, boolean[] visited, List<List<Integer>> graph) {
        visited[node] = true;

        for (var neighbour : graph.get(node)) {
            if (!visited[neighbour]) {
                dfs(neighbour, visited, graph);
            }
        }
    }
}

/*
 * 😎 No need to build adj list, space efficient solution
 */
public class NumberOfProvinces {
    public static void main(String[] args) {
        var isConnected = new int[][] { { 1, 0, 0, 1 }, { 0, 1, 1, 0 }, { 0, 1, 1, 1 }, { 1, 0, 1, 1 } };
        int provinces = findCircleNum(isConnected);
        System.out.println("Total provinces: " + provinces);
    }

    public static int findCircleNum(int[][] isConnected) {
        int provinces = 0, n = isConnected.length;
        boolean[] visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                System.out.println("new province");
                provinces++;
                bfs(i, isConnected, visited);
            }
        }
        return provinces;
    }

    /*
     * DFS Solution
     */
    public static void dfs(int node, int[][] graph, boolean[] visited) {
        visited[node] = true;
        System.out.println(node);

        for (int j = 0; j < graph.length; j++) {
            if (graph[node][j] == 1 && visited[j] == false) {
                dfs(j, graph, visited);
            }
        }
    }

    /*
     * BFS Solution
     */
    public static void bfs(int node, int[][] graph, boolean[] visited) {
        Queue<Integer> q = new LinkedList<>();
        q.add(node);
        visited[node] = true;

        while (!q.isEmpty()) {
            int current = q.poll();
            System.out.println(current);
            // add all neighbours of current into queue
            for (int j = 0; j < graph.length; j++) {
                if (graph[current][j] == 1 && !visited[j]) {
                    q.add(j);
                    visited[j] = true;
                }
            }
        }
    }
}