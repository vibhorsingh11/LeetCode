package org.phoenix.leetcode.challenges;

/**
 * Given an integer n, return true if it is a power of two. Otherwise, return false.
 * <p>
 * An integer n is a power of two, if there exists an integer x such that n == 2x.
 * Constraints:
 * <p>
 * -231 <= n <= 231 - 1
 */

public class Problem21_PowerOfTwo {
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
