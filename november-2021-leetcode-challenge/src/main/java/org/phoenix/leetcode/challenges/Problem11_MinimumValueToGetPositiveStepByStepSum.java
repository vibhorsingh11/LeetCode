package org.phoenix.leetcode.challenges;

/**
 * Given an array of integers nums, you start with an initial positive value startValue.
 * <p>
 * In each iteration, you calculate the step by step sum of startValue plus elements in nums (from left to right).
 * <p>
 * Return the minimum positive value of startValue such that the step by step sum is never less than 1.
 * Constraints:
 * <p>
 * 1 <= nums.length <= 100
 * -100 <= nums[i] <= 100
 */

public class Problem11_MinimumValueToGetPositiveStepByStepSum {
    public int minStartValue(int[] nums) {
        int sum = 0, min_sum = 0;
        for (var n : nums) {
            sum += n;
            min_sum = Math.min(min_sum, sum);
        }
        return 1 - min_sum;
    }
}
