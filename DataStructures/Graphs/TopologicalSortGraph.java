package DataStructures.Graphs;

import java.util.*;

public class TopologicalSortGraph {
    /*
     * Topological Sort using DFS
     * Stack will be used to store the order
     */
    public int[] topoSortUsingDFS(int n, List<List<Integer>> adj) {
        boolean[] visited = new boolean[n];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            if (!visited[i])
                sortDfs(i, visited, adj, st);
        }
        int[] order = new int[n];
        for (int i = 0; i < n; i++) {
            order[i] = st.pop();
        }
        return order;
    }

    public void sortDfs(int node, boolean[] visited, List<List<Integer>> adj, Stack<Integer> stack) {
        visited[node] = true;
        for (var neigh : adj.get(node)) {
            if (!visited[neigh]) {
                sortDfs(neigh, visited, adj, stack);
            }
        }
        stack.add(node);
    }

    /*
     * Topological Sort using BFS
     * Queue will be used to store the order
     */
    public int[] topoSortUsingBFS(int n, List<List<Integer>> adj) {
        int[] res = new int[n];
        sortBfs(res, adj, n);
        return res;
    }

    /*
     * 1. First calculate the indegree count of each node and store in array
     * 2. Put all the nodes with indegree == 0 in a queue,
     * because they will come in the beginning of the topo order
     * 
     * 3. Now start processing the queue until it is not empty
     * - pop the element from queue and decrease indegree by 1 for all neighbours
     * - if any neighbour indegree count becomes 0 then add it to the queue
     */
    public void sortBfs(int[] res, List<List<Integer>> adj, int n) {
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

        int i = 0;
        while (!q.isEmpty()) {
            int node = q.poll();
            res[i++] = node;
            for (var neigh : adj.get(node)) {
                indegree[neigh]--;
                if (indegree[neigh] == 0)
                    q.add(neigh);
            }
        }
    }
}
