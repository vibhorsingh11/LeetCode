package org.phoenix.leetcode.challenges;

import java.util.Arrays;

/**
 * <p>
 * Given an array nums of n integers and an integer target, find three integers in nums such that the sum is
 * closest to target. Return the sum of the three integers.
 * <p>
 * You may assume that each input would have exactly one solution.
 * <p>
 * Constraints:
 * <p>
 * 3 <= nums.length <= 10^3
 * -10^3 <= nums[i] <= 10^3
 * -10^4 <= target <= 10^4
 */

public class Problem27_3SumClosest {
    public int threeSumClosest(int[] nums, int target) {
        // Sorting the array
        Arrays.sort(nums);
        // Resultant variable
        int result = nums[0] + nums[1] + nums[2];
        // Looping over the array
        for (int i = 0; i < nums.length - 2; i++) {
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == target) {
                    return target;
                }
                if (Math.abs(target - sum) < Math.abs(target - result)) {
                    result = sum;
                }
                if (sum < target) j++;
                else k--;
            }
        }
        return result;
    }
}
