package org.phoenix.leetcode.challenges;

/**
 * Given an array nums with n integers, your task is to check if it could become non-decreasing by modifying at most one element.
 * We define an array is non-decreasing if nums[i] <= nums[i + 1] holds for every i (0-based) such that (0 <= i <= n - 2).
 * Example 1:
 * Input: nums = [4,2,3]
 * Output: true
 * Explanation: You could modify the first 4 to 1 to get a non-decreasing array.
 * Example 2:
 * Input: nums = [4,2,1]
 * Output: false
 * Explanation: You can't get a non-decreasing array by modify at most one element.
 * <p>
 * Constraints:
 * n == nums.length
 * 1 <= n <= 104
 * -105 <= nums[i] <= 105
 */

public class Problem04_NondecreasingArray {
    public boolean checkPossibility(int[] nums) {
        // Edge case
        if (nums == null && nums.length == 0) {
            return false;
        }
        // store count
        int count = 0;
        // looping ove the array
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] > nums[i]) {
                count++;
                // more than 1 element needs to be changed
                if (count > 1) {
                    return false;
                }
                // modify the element
                if (i - 2 < 0 || nums[i - 2] <= nums[i]) {
                    nums[i - 1] = nums[i];
                } else {
                    nums[i] = nums[i - 1];
                }
            }
        }
        return true;
    }
}
