package org.phoenix.leetcode.challenges;

/**
 * Given an array of integers nums sorted in ascending order, find the starting and ending position of a given target value.
 * <p>
 * If target is not found in the array, return [-1, -1].
 * <p>
 * Follow up: Could you write an algorithm with O(log n) runtime complexity?
 * <p>
 * Example 1:
 * Input: nums = [5,7,7,8,8,10], target = 8
 * Output: [3,4]
 * Example 2:
 * Input: nums = [5,7,7,8,8,10], target = 6
 * Output: [-1,-1]
 * Example 3:
 * Input: nums = [], target = 0
 * Output: [-1,-1]
 * <p>
 * Constraints:
 * 0 <= nums.length <= 105
 * -109 <= nums[i] <= 109
 * nums is a non-decreasing array.
 * -109 <= target <= 109
 */
public class Problem29_FindFirstAndLastPositionOfElementInSortedArray {
    public int[] searchRange(int[] nums, int target) {
        // Result array
        int[] res = new int[]{0, 0};
        res[0] = nums.length;
        res[1] = -1;
        // Calling function
        firstLast(nums, target, 0, nums.length - 1, res);
        // If target is not found then
        if (res[0] == nums.length) res[0] = -1;
        return res;
    }

    public void firstLast(int[] nums, int target, int start, int end, int[] res) {
        // Edge case
        if (start > end) return;
        // Calculating the mid
        int mid = start + (end - start) / 2;
        // Target is found, then its start or end should
        // on either side of it. So, using recursion
        if (nums[mid] == target) {
            if (mid < res[0]) res[0] = mid;
            if (mid > res[1]) res[1] = mid;
            firstLast(nums, target, start, mid - 1, res);
            firstLast(nums, target, mid + 1, end, res);
        } else if (nums[mid] > target) {
            // finding the target on left side
            firstLast(nums, target, start, mid - 1, res);
        } else {
            // finding the target on right side
            firstLast(nums, target, mid + 1, end, res);
        }
    }
}
