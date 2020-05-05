package org.phoenix.leetcode.challenges;

/*
 * Given a positive integer, output its complement number.
 * The complement strategy is to flip the bits of its binary representation.
 *
 * Example 1:
 * Input: 5
 * Output: 2
 *
 * Explanation: The binary representation of 5 is 101 (no leading zero bits),
 * and its complement is 010. So you need to output 2.*/

public class Problem04_NumberComplement {

    public int findComplement(int num) {
        // Number of bits
        int numberOfBits = (int) (Math.log(num) / Math.log(2) + 1);
        // Loop through all the bits
        for (int i = 0; i < numberOfBits; i++) {
            // shifts 1 by i bits
            num = num ^ (1 << i);
        }
        return num;
    }
}
