package org.phoenix.leetcode.challenges;

/**
 * You are given a sorted array consisting of only integers where every element appears exactly twice, except for one
 * element which appears exactly once.
 * <p>
 * Return the single element that appears only once.
 * <p>
 * Your solution must run in O(log n) time and O(1) space.
 * Constraints:
 * <p>
 * 1 <= nums.length <= 105
 * 0 <= nums[i] <= 105
 */

public class Problem20_SingleElementInSortedArray {
    public int singleNonDuplicate(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                return nums[i];
            }
            i++;
        }
        return nums[nums.length - 1];
    }
}
