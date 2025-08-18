package DataStructures.Graphs;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// Practice Link - https://takeuforward.org/plus/dsa/graph/cycles/detect-a-cycle-in-an-undirected-graph
public class DetectCycleUndirectedGraph {
    public boolean isCycle(int n, List<Integer>[] adj) {
        boolean[] visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                if (dfs(i, -1, adj, visited))
                    return true;
            }
        }
        return false;
    }

    /*
     * BFS Solution
     */
    public boolean bfs(int start, List<Integer>[] adj, boolean[] visited) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[] { start, -1 });
        visited[start] = true;

        while (!q.isEmpty()) {
            int node = q.peek()[0];
            int parent = q.poll()[1];

            for (var neighbour : adj[node]) {
                if (!visited[neighbour]) {
                    visited[neighbour] = true;
                    q.add(new int[] { neighbour, node });
                } else if (neighbour != parent)
                    return true;
            }
        }
        return false;
    }

    /*
     * DFS Solution
     */
    public boolean dfs(int current, int parent, List<Integer>[] adj, boolean[] visited) {
        visited[current] = true;

        for (int neigh : adj[current]) {
            if (!visited[neigh]) {
                if (dfs(neigh, current, adj, visited))
                    return true;
            } else if (neigh != parent) {
                return true;
            }
        }
        return false;
    }
}
