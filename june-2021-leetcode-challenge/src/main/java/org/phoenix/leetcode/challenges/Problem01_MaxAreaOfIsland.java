package org.phoenix.leetcode.challenges;

/**
 * You are given an m x n binary matrix grid. An island is a group of 1's (representing land) connected 4-directionally
 * (horizontal or vertical.) You may assume all four edges of the grid are surrounded by water.
 * <p>
 * The area of an island is the number of cells with a value 1 in the island.
 * <p>
 * Return the maximum area of an island in grid. If there is no island, return 0.
 * Constraints:
 * <p>
 * m == grid.length
 * n == grid[i].length
 * 1 <= m, n <= 50
 * grid[i][j] is either 0 or 1.
 */

public class Problem01_MaxAreaOfIsland {
    public int maxAreaOfIsland(int[][] grid) {
        // Base case
        if (grid == null || grid.length == 0) {
            return 0;
        }
        // Max area of island
        int max = 0;
        // Looping over the grid and aplying
        // DFS on each neighbours
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    max = Math.max(max, dfs(grid, i, j));
                }
            }
        }
        return max;
    }

    private int dfs(int[][] grid, int i, int j) {
        // Base case
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || grid[i][j] == 0) {
            return 0;
        }
        // Make the current cell 0 as
        // we will not encounter it again
        grid[i][j] = 0;
        // Recursive call on each neighbours
        return 1 + dfs(grid, i - 1, j) + dfs(grid, i, j - 1) + dfs(grid, i, j + 1) + dfs(grid, i + 1, j);
    }
}
