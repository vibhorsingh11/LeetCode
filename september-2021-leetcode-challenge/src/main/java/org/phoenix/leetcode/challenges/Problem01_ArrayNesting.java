package org.phoenix.leetcode.challenges;

/**
 * You are given an integer array nums of length n where nums is a permutation of the numbers in the range [0, n - 1].
 * <p>
 * You should build a set s[k] = {nums[k], nums[nums[k]], nums[nums[nums[k]]], ... } subjected to the following rule:
 * <p>
 * The first element in s[k] starts with the selection of the element nums[k] of index = k.
 * The next element in s[k] should be nums[nums[k]], and then nums[nums[nums[k]]], and so on.
 * We stop adding right before a duplicate element occurs in s[k].
 * Return the longest length of a set s[k].
 * Constraints:
 * <p>
 * 1 <= nums.length <= 105
 * 0 <= nums[i] < nums.length
 * All the values of nums are unique.
 */

public class Problem01_ArrayNesting {
    public int arrayNesting(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int longestLength = 0;
        for (int i = 0; i < nums.length; i++) {
            int currentValue = nums[i];
            if (currentValue != Integer.MAX_VALUE) {
                int currentLength = 0;
                while (nums[currentValue] != Integer.MAX_VALUE) {
                    int temp = currentValue;
                    currentValue = nums[currentValue];
                    nums[temp] = Integer.MAX_VALUE;
                    currentLength++;
                }
                longestLength = Math.max(longestLength, currentLength);
            }
        }
        return longestLength;
    }
}
