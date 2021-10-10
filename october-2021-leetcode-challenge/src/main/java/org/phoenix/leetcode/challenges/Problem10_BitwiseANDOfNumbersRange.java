package org.phoenix.leetcode.challenges;

/**
 * Given two integers left and right that represent the range [left, right], return the bitwise AND of all numbers in this range, inclusive.
 * Constraints:
 * <p>
 * 0 <= left <= right <= 231 - 1
 */

public class Problem10_BitwiseANDOfNumbersRange {
    public int rangeBitwiseAnd(int m, int n) {
        int shift = 0;
        while (m != n) {
            shift++;
            m = m >> 1;
            n = n >> 1;
        }
        return m << shift;
    }
}
