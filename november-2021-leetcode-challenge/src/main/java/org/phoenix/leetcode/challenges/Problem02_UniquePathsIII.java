package org.phoenix.leetcode.challenges;

/**
 * You are given an m x n integer array grid where grid[i][j] could be:
 * <p>
 * 1 representing the starting square. There is exactly one starting square.
 * 2 representing the ending square. There is exactly one ending square.
 * 0 representing empty squares we can walk over.
 * -1 representing obstacles that we cannot walk over.
 * Return the number of 4-directional walks from the starting square to the ending square, that walk over every non-obstacle square exactly once.
 * Constraints:
 * <p>
 * m == grid.length
 * n == grid[i].length
 * 1 <= m, n <= 20
 * 1 <= m * n <= 20
 * -1 <= grid[i][j] <= 2
 * There is exactly one starting cell and one ending cell.
 */

public class Problem02_UniquePathsIII {
    public int uniquePathsIII(int[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }
        int m = grid.length;
        int n = grid[0].length;
        int x = -1;
        int y = -1;
        int validCells = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 0) {
                    validCells++;
                } else if (grid[i][j] == 1) {
                    x = i;
                    y = j;
                }
            }
        }
        return dfs(grid, x, y, m, n, validCells);
    }

    private int dfs(int[][] grid, int x, int y, int m, int n, int validCells) {
        if (x < 0 || x >= m || y < 0 || y >= n || grid[x][y] == -1) {
            return 0;
        }
        if (grid[x][y] == 2) {
            return validCells == -1 ? 1 : 0;
        }
        grid[x][y] = -1;
        validCells--;
        int totalPaths = dfs(grid, x - 1, y, m, n, validCells)
                + dfs(grid, x + 1, y, m, n, validCells)
                + dfs(grid, x, y - 1, m, n, validCells)
                + dfs(grid, x, y + 1, m, n, validCells);
        grid[x][y] = 0;
        return totalPaths;
    }
}
