package org.phoenix.leetcode.challenges;

public class Problem10_LongestIncreasingPathInAMatrix {
    private final int[] abscissae = {0, 0, -1, 1};
    private final int[] ordinates = {1, -1, 0, 0};

    public int longestIncreasingPath(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return 0;
        }
        int pathLength = 0;
        int rows = matrix.length;
        int columns = matrix[0].length;
        int[][] dp = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                pathLength = Math.max(pathLength, dfs(matrix, rows, columns, i, j, dp));
            }
        }
        return pathLength;
    }

    private int dfs(int[][] matrix, int rows, int columns, int i, int j, int[][] dp) {
        if (dp[i][j] > 0) {
            return dp[i][j];
        }
        int currentMaximum = 0;
        for (int k = 0; k < 4; k++) {
            int x = abscissae[k] + i;
            int y = ordinates[k] + j;
            if (x >= 0 && x < rows && y >= 0 && y < columns && matrix[x][y] > matrix[i][j]) {
                currentMaximum = Math.max(currentMaximum, dfs(matrix, rows, columns, x, y, dp));
            }
        }
        return dp[i][j] = currentMaximum + 1;
    }
}
