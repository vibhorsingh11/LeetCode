package org.phoenix.leetcode.challenges;

/**
 * You have n coins and you want to build a staircase with these coins. The staircase consists of k rows where the ith row has exactly i coins. The last row of the staircase may be incomplete.
 * <p>
 * Given the integer n, return the number of complete rows of the staircase you will build.
 * Constraints:
 * <p>
 * 1 <= n <= 231 - 1
 */

public class Problem05_ArrangingCoins {
    public int arrangeCoins(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Only positive numbers are allowed");
        }
        return (int) (Math.sqrt(2 * (long) n + 0.25) - 0.5);
    }
}
