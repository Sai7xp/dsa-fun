package LeetCode.Graphs.NumberOfIslands;

public class NumberOfIslands {
    public static void main(String[] args) {
        int islandsCount = numIslands(new char[][] { { '1', '0', '1', '1', '0', '1', '1' } });
        System.out.println(islandsCount);
    }

    public static int numIslands(char[][] grid) {
        int islands = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    // we found the land, let's merge all the attached surrounding land part
                    mergeLand(i, j, grid);
                    islands++;
                }
            }
        }
        return islands;
    }

    public static void mergeLand(int i, int j, char[][] grid) {
        if (i < 0 || i == grid.length || j < 0 || j == grid[0].length || grid[i][j] == '0' || grid[i][j] == 'M')
            return;

        grid[i][j] = 'M'; // land merged

        // check all sides if there's any land and merge it
        mergeLand(i, j - 1, grid);
        mergeLand(i - 1, j, grid);
        mergeLand(i, j + 1, grid);
        mergeLand(i + 1, j, grid);
    }
}
