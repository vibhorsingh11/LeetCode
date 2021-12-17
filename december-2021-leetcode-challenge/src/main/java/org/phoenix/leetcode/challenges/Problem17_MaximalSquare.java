package org.phoenix.leetcode.challenges;

/**
 * Given an m x n binary matrix filled with 0's and 1's, find the largest square containing only 1's and return its area.
 * Constraints:
 * <p>
 * m == matrix.length
 * n == matrix[i].length
 * 1 <= m, n <= 300
 * matrix[i][j] is '0' or '1'.
 */

public class Problem17_MaximalSquare {
    public int maximalSquare(char[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0] == null || matrix[0].length == 0) {
            return 0;
        }
        // Rows and columns
        int rows = matrix.length;
        int columns = matrix[0].length;
        // DP matrix
        int[][] dp = new int[rows + 1][columns + 1];
        // Max length of side of square
        int maximumLength = 0;
        // Loop through the matrix
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                // If the element is '1'
                if (matrix[i - 1][j - 1] == '1') {
                    dp[i][j] = Math.min(dp[i - 1][j - 1], Math.min(dp[i][j - 1], dp[i - 1][j])) + 1;
                    maximumLength = Math.max(dp[i][j], maximumLength);
                } else {
                    dp[i][j] = 0;
                }
            }
        }
        return maximumLength * maximumLength;
    }
}
