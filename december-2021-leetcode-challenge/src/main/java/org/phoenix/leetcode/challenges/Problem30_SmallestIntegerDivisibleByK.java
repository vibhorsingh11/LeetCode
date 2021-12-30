package org.phoenix.leetcode.challenges;

/**
 * Given a positive integer k, you need to find the length of the smallest positive integer n such that n is divisible
 * by k, and n only contains the digit 1.
 * <p>
 * Return the length of n. If there is no such n, return -1.
 * <p>
 * Note: n may not fit in a 64-bit signed integer.
 * Constraints:
 * <p>
 * 1 <= k <= 105
 */

public class Problem30_SmallestIntegerDivisibleByK {
    public int smallestRepunitDivByK(int k) {
        int rem = 0;
        for (int i = 1; i <= k; i++) {
            rem = (rem * 10 + 1) % k;
            if (rem == 0) {
                return i;
            }
        }
        return -1;
    }
}
