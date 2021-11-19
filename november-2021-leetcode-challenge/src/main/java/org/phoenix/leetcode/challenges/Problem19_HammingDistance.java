package org.phoenix.leetcode.challenges;

/**
 * The Hamming distance between two integers is the number of positions at which the corresponding bits are different.
 * <p>
 * Given two integers x and y, return the Hamming distance between them.
 * Constraints:
 * <p>
 * 0 <= x, y <= 231 - 1
 */

public class Problem19_HammingDistance {
    public int hammingDistance(int x, int y) {
        int n1 = x ^ y;
        int setBits = 0;

        while (n1 > 0) {
            setBits += n1 & 1;
            n1 >>= 1;
        }
        return setBits;
    }
}
