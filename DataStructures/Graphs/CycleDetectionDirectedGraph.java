package DataStructures.Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/* https://takeuforward.org/plus/dsa/graph/cycles/detect-a-cycle-in-a-directed-graph?tab=editorial
 * Detect a cycle in Directed Graph
 * Same algorithm which we used for undirected graph(keep track of parent) won't work here. (check notes to know why)
 */
public class CycleDetectionDirectedGraph {
    public boolean isCyclic(int n, List<List<Integer>> adj) {

        /*
         * DFS Solution
         */
        boolean[] visited = new boolean[n];
        boolean[] pathVisited = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                if (dfs(i, visited, pathVisited, adj))
                    return true;
            }
        }
        return false;
    }

    /*
     * DFS Solution, maintain visited and pathVisited arrays
     */
    public boolean dfs(int node, boolean[] visited, boolean[] pathVisited, List<List<Integer>> adj) {
        visited[node] = true;
        pathVisited[node] = true;
        for (var neigh : adj.get(node)) {
            if (pathVisited[neigh])
                return true;

            if (!visited[neigh]) {
                if (dfs(neigh, visited, pathVisited, adj))
                    return true;
            }
        }
        pathVisited[node] = false;
        return false;
    }

    /*
     * BFS Solution - Khan's Algorithm
     */
    public boolean bfs(int n, List<List<Integer>> adj) {
        int[] indegree = new int[n];
        for (var neighbours : adj) {
            for (var neigh : neighbours) {
                indegree[neigh]++;
            }
        }
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (indegree[i] == 0) {
                q.add(i);
            }
        }

        List<Integer> order = new ArrayList<>();
        while (!q.isEmpty()) {
            int node = q.poll();
            order.add(node);
            for (var neigh : adj.get(node)) {
                indegree[neigh]--;
                if (indegree[neigh] == 0) {
                    q.add(neigh);
                }
            }
        }
        return order.size() != n;
    }
}
