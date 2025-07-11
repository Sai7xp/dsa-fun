package LeetCode.Graphs.RottingOranges;

import java.util.LinkedList;
import java.util.Queue;

public class RottingOranges {
    public int orangesRotting(int[][] grid) {
        int freshOnes = 0;
        int m = grid.length, n = grid[0].length;
        Queue<int[]> rotten = new LinkedList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    freshOnes++;
                } else if (grid[i][j] == 2) {
                    rotten.add(new int[] { i, j });
                }
            }
        }
        if (freshOnes == 0)
            return 0;
        int totalMinutes = -1;
        int[][] sides = { { 0, -1 }, { -1, 0 }, { 0, 1 }, { 1, 0 } };
        while (!rotten.isEmpty()) {
            totalMinutes++;
            int currentSize = rotten.size();
            while (currentSize > 0) {
                var r = rotten.poll();
                currentSize--;
                for (var side : sides) {
                    int si = side[0] + r[0], sj = side[1] + r[1];
                    if (isNeighbourFresh(si, sj, grid)) {
                        grid[si][sj] = 2;
                        freshOnes--;
                        rotten.add(new int[] { si, sj });
                    }
                }
            }
        }
        return freshOnes == 0 ? totalMinutes : -1;
    }

    public boolean isNeighbourFresh(int i, int j, int[][] grid) {
        if (i < 0 || i == grid.length || j < 0 || j == grid[0].length || grid[i][j] == 2 || grid[i][j] == 0)
            return false;
        return true;
    }
}
