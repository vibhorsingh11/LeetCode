package org.phoenix.leetcode.challenges;

/**
 * The complement of an integer is the integer you get when you flip all the 0's to 1's and all the 1's to 0's in its binary representation.
 * <p>
 * For example, The integer 5 is "101" in binary and its complement is "010" which is the integer 2.
 * Given an integer n, return its complement.
 */

public class Problem04_ComplementOfBase10Integer {
    public int bitwiseComplement(int n) {
        if (n == 0) return 1;
        if (n == 1) return 0;
        int x = 1;
        while (x <= n) {
            x = x << 1;
        }
        return n ^ (x - 1);
    }
}
