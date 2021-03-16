/**
 * You are given an array prices where prices[i] is the price of a given stock on the ith day, and an integer fee
 * representing a transaction fee.
 * <p>
 * Find the maximum profit you can achieve. You may complete as many transactions as you like, but you need to pay
 * the transaction fee for each transaction.
 * <p>
 * Note: You may not engage in multiple transactions simultaneously (i.e., you must sell the stock before you buy
 * again).
 * <p>
 * Example 1:
 * <p>
 * Input: prices = [1,3,2,8,4,9], fee = 2
 * Output: 8
 * Explanation: The maximum profit can be achieved by:
 * - Buying at prices[0] = 1
 * - Selling at prices[3] = 8
 * - Buying at prices[4] = 4
 * - Selling at prices[5] = 9
 * The total profit is ((8 - 1) - 2) + ((9 - 4) - 2) = 8.
 * Constraints:
 * <p>
 * 1 < prices.length <= 5 * 104
 * 0 < prices[i], fee < 5 * 104
 */
package org.phoenix.leetcode.challenges;

public class Problem16_BestTimeToBuyAndSellStockWithTransactionFee {
    public int maxProfit(int[] prices, int fee) {
        int n = prices.length;
        // If there is only one stock then 0 profit
        if (n < 2) {
            return 0;
        }
        int buyPrice = -prices[0] - fee;
        // Selling price
        int sellPrice = 0;
        // Looping through the stock prices
        for (int i = 1; i < n; i++) {
            int lastBuy = buyPrice;
            buyPrice = Math.max(buyPrice, sellPrice - prices[i] - fee);
            sellPrice = Math.max(sellPrice, lastBuy + prices[i]);
        }
        return sellPrice;
    }
}
