package org.phoenix.leetcode.challenges;

/**
 * Given an integer array nums, handle multiple queries of the following type:
 * <p>
 * Calculate the sum of the elements of nums between indices left and right inclusive where left <= right.
 * Implement the NumArray class:
 * <p>
 * NumArray(int[] nums) Initializes the object with the integer array nums.
 * int sumRange(int left, int right) Returns the sum of the elements of nums between indices left and right inclusive (i.e. nums[left] + nums[left + 1] + ... + nums[right]).
 * Constraints:
 * <p>
 * 1 <= nums.length <= 104
 * -105 <= nums[i] <= 105
 * 0 <= left <= right < nums.length
 * At most 104 calls will be made to sumRange.
 */

public class Problem16_RangeSumQueryImmutable {
    int[] nums;

    public Problem16_RangeSumQueryImmutable(int[] nums) {
        for (int i = 1; i < nums.length; i++)
            nums[i] += nums[i - 1];

        this.nums = nums;
    }

    public int sumRange(int left, int right) {
        if (left == 0)
            return nums[right];

        return nums[right] - nums[left - 1];
    }
}
