package org.phoenix.leetcode.challenges;

import java.util.Arrays;

/**
 * <p>
 * Given an integer array nums and an integer k, return true if it is possible to divide this array into k
 * non-empty subsets whose sums are all equal.
 * <p>
 * Constraints:
 * <p>
 * 1 <= k <= nums.length <= 16
 * 1 <= nums[i] <= 10^4
 * The frequency of each element is in the range [1, 4].
 */

public class Problem30_PartitionToKEqualSumSubsets {
    public boolean canPartitionKSubsets(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return false;
        }
        int n = nums.length;
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        if (sum % k != 0) {
            return false;
        }
        int target = sum / k;
        Arrays.sort(nums);
        if (nums[n - 1] > target) {
            return false;
        }
        int i = n - 1;
        while (i >= 0 && nums[i] == target) {
            i--;
            k--;
        }
        int[] buckets = new int[k];
        return helper(nums, i, target, buckets);
    }

    private boolean helper(int[] nums, int index, int target, int[] buckets) {
        if (index < 0) {
            return true;
        }
        for (int i = 0; i < buckets.length; i++) {
            if (buckets[i] + nums[index] <= target) {
                buckets[i] += nums[index];
                if (helper(nums, index - 1, target, buckets)) {
                    return true;
                }
                buckets[i] -= nums[index];
            }
            if (buckets[i] == 0) {
                break;
            }
        }
        return false;
    }
}
