package org.phoenix.leetcode.challenges;

/**
 * A peak element is an element that is strictly greater than its neighbors.
 * <p>
 * Given an integer array nums, find a peak element, and return its index. If the array contains multiple peaks, return the index to any of the peaks.
 * <p>
 * You may imagine that nums[-1] = nums[n] = -∞.
 * <p>
 * You must write an algorithm that runs in O(log n) time.
 * Constraints:
 * <p>
 * 1 <= nums.length <= 1000
 * -231 <= nums[i] <= 231 - 1
 * nums[i] != nums[i + 1] for all valid i.
 */

public class Problem13_FindPeakElement {
    public int findPeakElement(int[] nums) {
        // Base case
        if (nums.length == 0) {
            return 0;
        }
        // Variables
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            // Finding mid element
            int mid = left + (right - left) / 2;
            if (nums[mid] < nums[mid + 1]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}
