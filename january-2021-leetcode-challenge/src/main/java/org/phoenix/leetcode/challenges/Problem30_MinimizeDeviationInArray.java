/*
 * You are given an array nums of n positive integers.
 * You can perform two types of operations on any element of the array any number of times:
 * If the element is even, divide it by 2.
 * For example, if the array is [1,2,3,4], then you can do this operation on the last element, and the array will be [1,2,3,2].
 * If the element is odd, multiply it by 2.
 * For example, if the array is [1,2,3,4], then you can do this operation on the first element, and the array will be [2,2,3,4].
 * The deviation of the array is the maximum difference between any two elements in the array.
 * Return the minimum deviation the array can have after performing some number of operations.
 *
 * Example 1:
 * Input: nums = [1,2,3,4]
 * Output: 1
 * Explanation: You can transform the array to [1,2,3,2], then to [2,2,3,2], then the deviation will be 3 - 2 = 1.
 * Constraints:
 * n == nums.length
 * 2 <= n <= 105
 * 1 <= nums[i] <= 109
 */
package org.phoenix.leetcode.challenges;

import java.util.TreeSet;

public class Problem30_MinimizeDeviationInArray {
    public int minimumDeviation(int[] nums) {
        TreeSet<Integer> elements = new TreeSet<>();
        for (int n : nums) {
            if (n % 2 == 1) {
                elements.add(2 * n);
            } else {
                elements.add(n);
            }
        }
        int minimumDeviation = Integer.MAX_VALUE;

        while (true) {
            int minValue = elements.first();
            int maxValue = elements.last();
            int currentDifference = maxValue - minValue;
            minimumDeviation = Math.min(currentDifference, minimumDeviation);
            if (maxValue % 2 == 0) {
                elements.remove(maxValue);
                elements.add(maxValue / 2);
            } else {
                return minimumDeviation;
            }
        }
    }
}
