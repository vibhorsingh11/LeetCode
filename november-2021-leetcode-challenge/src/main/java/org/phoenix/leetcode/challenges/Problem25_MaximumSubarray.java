package org.phoenix.leetcode.challenges;

/**
 * Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum
 * and return its sum.
 * <p>
 * A subarray is a contiguous part of an array.
 * Constraints:
 * <p>
 * 1 <= nums.length <= 105
 * -104 <= nums[i] <= 104
 */

public class Problem25_MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int partialSum = 0;

        for (int num : nums) {
            partialSum += num;
            maxSum = Math.max(maxSum, partialSum);
            if (partialSum < 0) partialSum = 0;
        }
        return maxSum;
    }
}
