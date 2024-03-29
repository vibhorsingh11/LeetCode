package org.phoenix.leetcode.challenges;

/**
 * Given an integer n, return the number of structurally unique BST's (binary search trees) which has exactly n nodes of unique values from 1 to n.
 * Constraints:
 * <p>
 * 1 <= n <= 19
 */

public class Problem08_UniqueBinarySearchTrees {
    public int numTrees(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                dp[i] = dp[i] + (dp[i - j] * dp[j - 1]);
            }
        }
        return dp[n];
    }
}
