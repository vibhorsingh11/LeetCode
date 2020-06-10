package org.phoenix.leetcode.challenges;

/*
 * Given a sorted array and a target value, return the index if the target is found.
 * If not, return the index where it would be if it were inserted in order.
 * You may assume no duplicates in the array.
 *
 * Example 1:
 * Input: [1,3,5,6], 5
 * Output: 2
 *
 * Example 2:
 * Input: [1,3,5,6], 2
 * Output: 1
 */

public class Problem10_SearchInsertPosition {
    // Using Binary search as it is a sorted array
    public int searchInsert(int[] nums, int target) {
        int l = 0, h = nums.length - 1;
        while (l <= h) {
            int mid = (l + h) / 2;
            if (nums[mid] == target) return mid;
            if (nums[mid] > target) {
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return nums.length;
    }
}
