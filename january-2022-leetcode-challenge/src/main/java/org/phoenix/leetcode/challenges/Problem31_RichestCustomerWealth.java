package org.phoenix.leetcode.challenges;

/**
 * You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank. Return the wealth that the richest customer has.
 * <p>
 * A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.
 */

public class Problem31_RichestCustomerWealth {
    public int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        for (int[] account : accounts) {
            int sum = 0;
            for (int j = 0; j < accounts[0].length; j++) {
                sum += account[j];
            }
            max = Math.max(sum, max);
        }
        return max;
    }
}
