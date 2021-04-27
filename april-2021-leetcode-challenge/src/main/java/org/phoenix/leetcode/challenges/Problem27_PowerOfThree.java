package org.phoenix.leetcode.challenges;

/**
 * Given an integer n, return true if it is a power of three. Otherwise, return false.
 * <p>
 * An integer n is a power of three, if there exists an integer x such that n == 3x.
 * <p>
 * Example 1:
 * Input: n = 27
 * Output: true
 * Example 2:
 * Input: n = 0
 * Output: false
 * Example 3:
 * Input: n = 9
 * Output: true
 * Example 4:
 * Input: n = 45
 * Output: false
 * <p>
 * Constraints:
 * -231 <= n <= 231 - 1
 * <p>
 * Follow up: Could you solve it without loops/recursion?
 */

public class Problem27_PowerOfThree {
    public boolean isPowerOfThree(int n) {
        if (n <= 0) return false;
        return Math.pow(3, 19) % n == 0;
    }
}
