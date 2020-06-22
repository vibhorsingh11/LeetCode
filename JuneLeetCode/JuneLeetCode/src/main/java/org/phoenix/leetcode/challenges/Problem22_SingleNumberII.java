package org.phoenix.leetcode.challenges;

/*
 * Given a non-empty array of integers, every element appears three times except for one,
 * which appears exactly once. Find that single one.
 *
 * Note:
 * Your algorithm should have a linear runtime complexity. Could you implement it without using
 * extra memory?
 *
 * Example 1:
 * Input: [2,2,3,2]
 * Output: 3
 *
 * Example 2:
 * Input: [0,1,0,1,0,1,99]
 * Output: 99
 */

public class Problem22_SingleNumberII {
    public int singleNumber(int[] nums) {
        int ones = 0, twos = 0, three;
        for (int num : nums) {
            twos = twos | (num & ones);
            ones = ones ^ num;
            three = ones & twos;
            ones = ones & (~three);
            twos = twos & (~three);
        }
        return ones;
    }
}
