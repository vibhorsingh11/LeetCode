package org.phoenix.leetcode.challenges;

/**
 * The complement of an integer is the integer you get when you flip all the 0's to 1's and all the 1's to 0's in its
 * binary representation.
 * <p>
 * For example, The integer 5 is "101" in binary and its complement is "010" which is the integer 2.
 * Given an integer num, return its complement.
 * Constraints:
 * <p>
 * 1 <= num < 231
 */

public class Problem27_NumberComplement {
    public int findComplement(int num) {
        int number_of_bits =
                (int) (Math.floor(Math.log(num) /
                        Math.log(2))) + 1;

        return ((1 << number_of_bits) - 1) ^ num;
    }
}
