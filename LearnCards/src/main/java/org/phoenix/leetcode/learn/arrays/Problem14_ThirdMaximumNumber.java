package org.phoenix.leetcode.learn.arrays;

/*
 * Given a non-empty array of integers, return the third maximum number in this array.
 * If it does not exist, return the maximum number. The time complexity must be in O(n).
 *
 * Example 1:
 * Input: [3, 2, 1]
 * Output: 1
 *
 * Explanation: The third maximum is 1.
 * */

public class Problem14_ThirdMaximumNumber {

    public int thirdMax(int[] nums) {
        // Initialized 3 variable with long minimum value
        long one = Long.MIN_VALUE;
        long two = Long.MIN_VALUE;
        long three = Long.MIN_VALUE;
        // Looping over the array and assigning different values to these variables
        for (int n : nums) {
            if (n > one) {
                three = two;
                two = one;
                one = n;
            } else if (n > two && n != one) {
                three = two;
                two = n;
            } else if (n > three && n != two && n != one) {
                three = n;
            }
        }
        if (three == Long.MIN_VALUE) {
            return (int) one;
        }
        return (int) three;
    }
}
