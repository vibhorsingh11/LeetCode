package org.phoenix.leetcode.challenges;

/**
 * <p>
 * You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed,
 * the only constraint stopping you from robbing each of them is that adjacent houses have security systems connected,
 * and it will automatically contact the police if two adjacent houses were broken into on the same night.
 * <p>
 * Given an integer array nums representing the amount of money of each house, return the maximum amount of money you
 * can rob tonight without alerting the police.
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 100
 * 0 <= nums[i] <= 400
 */

public class Problem01_HouseRobber {
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }
        int n = nums.length;
        int[] lookup = new int[n];
        lookup[0] = nums[0];
        lookup[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < n; i++) {
            lookup[i] = Math.max(lookup[i - 1], lookup[i - 2] + nums[i]);
        }
        return lookup[n - 1];
    }
}
