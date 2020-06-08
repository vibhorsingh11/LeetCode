package org.phoenix.leetcode.challenges;

/*
 * Given an integer, write a function to determine if it is a power of two.
 *
 * Example 1:
 * Input: 1
 * Output: true
 * Explanation: 20 = 1
 *
 * Example 2:
 * Input: 16
 * Output: true
 * Explanation: 24 = 16
 */

public class Problem08_PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        if (n == 0 || n < 0) return false;
        while (n > 0) {
            if (n == 1) return true;
            if (n % 2 != 0) {
                return false;
            }
            n = Math.abs(n / 2);
        }
        return true;
    }
}
