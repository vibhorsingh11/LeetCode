package org.phoenix.leetcode.challenges;

/**
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
 * <p>
 * Find the maximum profit you can achieve. You may complete as many transactions as you like (i.e., buy one and sell one share of the stock multiple times) with the following restrictions:
 * <p>
 * After you sell your stock, you cannot buy stock on the next day (i.e., cooldown one day).
 * Note: You may not engage in multiple transactions simultaneously (i.e., you must sell the stock before you buy again).
 * Constraints:
 * <p>
 * 1 <= prices.length <= 5000
 * 0 <= prices[i] <= 1000
 */

public class Problem15_BestTimeToBuyAndSellStockWithCooldown {
    public int maxProfit(int[] prices) {
        int profit1 = 0, profit2 = 0;
        for (int i = 1; i < prices.length; i++) {
            int copy = profit1;
            profit1 = Math.max(profit1 + prices[i] - prices[i - 1], profit2);
            profit2 = Math.max(copy, profit2);
        }
        return Math.max(profit1, profit2);
    }
}
