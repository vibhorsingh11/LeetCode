/*
 * Given an integer n, return the decimal value of the binary string formed by concatenating the binary
 * representations of 1 to n in order, modulo 109 + 7.
 *
 * Example 1:
 * Input: n = 1
 * Output: 1
 * Explanation: "1" in binary corresponds to the decimal value 1.
 *
 * Constraints:
 * 1 <= n <= 105
 */
package org.phoenix.leetcode.challenges;

public class Problem27_ConcatenationOfConsecutiveNumbers {
    public int concatenatedBinary(int n) {
        int bits = 0;
        long result = 0;
        for (int i = 1; i <= n; i++) {
            if ((i & (i - 1)) == 0) {
                bits += 1;
            }
            result = ((result << bits) | i) % 1000000007;
        }
        return (int) result;
    }
}
