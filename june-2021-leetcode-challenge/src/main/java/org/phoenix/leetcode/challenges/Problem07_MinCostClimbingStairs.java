package org.phoenix.leetcode.challenges;

/**
 * You are given an integer array cost where cost[i] is the cost of ith step on a staircase. Once you pay the cost,
 * you can either climb one or two steps.
 * <p>
 * You can either start from the step with index 0, or the step with index 1.
 * <p>
 * Return the minimum cost to reach the top of the floor.
 * Constraints:
 * <p>
 * 2 <= cost.length <= 1000
 * 0 <= cost[i] <= 999
 */

public class Problem07_MinCostClimbingStairs {
    public int minCostClimbingStairs(int[] cost) {
        // Length of array
        int n = cost.length;
        // Base case
        if (n == 1) {
            return cost[0];
        }
        // Lookup array
        int[] dp = new int[n + 1];
        // Initial values
        dp[0] = cost[0];
        dp[1] = cost[1];
        // Looping over the array
        for (int i = 2; i < n; i++) {
            // storing minimum value
            dp[i] = Math.min(dp[i - 1], dp[i - 2]) + cost[i];
        }
        return Math.min(dp[n - 1], dp[n - 2]);
    }
}
