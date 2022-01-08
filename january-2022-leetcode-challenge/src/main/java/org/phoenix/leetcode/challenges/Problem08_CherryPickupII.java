package org.phoenix.leetcode.challenges;

/**
 * You are given a rows x cols matrix grid representing a field of cherries where grid[i][j] represents the number of
 * cherries that you can collect from the (i, j) cell.
 * <p>
 * You have two robots that can collect cherries for you:
 * <p>
 * Robot #1 is located at the top-left corner (0, 0), and
 * Robot #2 is located at the top-right corner (0, cols - 1).
 * Return the maximum number of cherries collection using both robots by following the rules below:
 * <p>
 * From a cell (i, j), robots can move to cell (i + 1, j - 1), (i + 1, j), or (i + 1, j + 1).
 * When any robot passes through a cell, It picks up all cherries, and the cell becomes an empty cell.
 * When both robots stay in the same cell, only one takes the cherries.
 * Both robots cannot move outside of the grid at any moment.
 * Both robots should reach the bottom row in grid.
 */

public class Problem08_CherryPickupII {
    public int cherryPickup(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        Integer[][][] dp = new Integer[n][m][m];
        return dfs(grid, n, m, 0, 0, m - 1, dp);
    }

    int dfs(int[][] grid, int n, int m, int r, int c1, int c2, Integer[][][] dp) {
        if (r == n)
            return 0;
        if (dp[r][c1][c2] != null)
            return dp[r][c1][c2];
        int cheries = grid[r][c1] + ((c1 == c2) ? 0 : grid[r][c2]);
        int resultFromNextRow = 0;
        for (int i = -1; i < 2; i++) {
            for (int j = -1; j < 2; j++) {
                int nc1 = c1 + i;
                int nc2 = c2 + j;
                if (nc1 >= 0 && nc1 < m && nc2 >= 0 && nc2 < m) {
                    resultFromNextRow = Math.max(resultFromNextRow, dfs(grid, n, m, r + 1, nc1, nc2, dp));

                }
            }
        }
        int ans = cheries + resultFromNextRow;
        dp[r][c1][c2] = ans;
        return ans;
    }
}
