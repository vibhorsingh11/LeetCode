package org.phoenix.leetcode.challenges;

/**
 * You are given an m x n matrix M initialized with all 0's and an array of operations ops, where ops[i] = [ai, bi] means M[x][y] should be incremented by one for all 0 <= x < ai and 0 <= y < bi.
 * <p>
 * Count and return the number of maximum integers in the matrix after performing all the operations.
 * Constraints:
 * <p>
 * 1 <= m, n <= 4 * 104
 * 1 <= ops.length <= 104
 * ops[i].length == 2
 * 1 <= ai <= m
 * 1 <= bi <= n
 */

public class Problem30_RangeAdditionII {
    public int maxCount(int m, int n, int[][] ops) {
        int rowMin = m;
        int colMin = n;
        for (int[] pair : ops) {
            rowMin = Math.min(rowMin, pair[0]);
            colMin = Math.min(colMin, pair[1]);
        }
        return rowMin * colMin;
    }
}
