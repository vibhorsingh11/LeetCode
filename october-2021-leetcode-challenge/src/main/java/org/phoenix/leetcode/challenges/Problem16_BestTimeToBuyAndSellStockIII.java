package org.phoenix.leetcode.challenges;

/**
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
 * <p>
 * Find the maximum profit you can achieve. You may complete at most two transactions.
 * <p>
 * Note: You may not engage in multiple transactions simultaneously (i.e., you must sell the stock before you buy again).
 * Constraints:
 * <p>
 * 1 <= prices.length <= 105
 * 0 <= prices[i] <= 105
 */

public class Problem16_BestTimeToBuyAndSellStockIII {
    public int maxProfit(int[] p) {
        return helper(p, 0, 0, 0, new Integer[p.length + 1][3][3]);
    }

    private int helper(int[] p, int i, int t, int s, Integer[][][] cache) {
        int ans = 0;
        if (cache[i][t][s] != null) {
            ans = cache[i][t][s];
        } else {
            if (i != p.length && t != 2) {
                if (s == 0) {
                    ans = Math.max(helper(p, i + 1, t, 1, cache) - p[i], helper(p, i + 1, t, 0, cache));
                } else if (s == 1) {
                    ans = Math.max(helper(p, i + 1, t, 1, cache), helper(p, i + 1, t + 1, 2, cache) + p[i]);
                } else if (s == 2) {
                    ans = Math.max(helper(p, i + 1, t, 2, cache), helper(p, i + 1, t, 1, cache) - p[i]);
                }
            }
        }
        cache[i][t][s] = ans;
        return ans;
    }
}
