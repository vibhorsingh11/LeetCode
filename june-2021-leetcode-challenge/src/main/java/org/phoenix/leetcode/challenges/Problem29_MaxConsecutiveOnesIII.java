package org.phoenix.leetcode.challenges;

/**
 * Given a binary array nums and an integer k, return the maximum number of consecutive 1's in the array if you can flip at most k 0's.
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 105
 * nums[i] is either 0 or 1.
 * 0 <= k <= nums.length
 */

public class Problem29_MaxConsecutiveOnesIII {
    public int longestOnes(int[] nums, int k) {
        if (nums.length == 0) {
            return 0;
        }
        int i = 0, j = 0;
        // length of nums array
        int n = nums.length;
        // Traverse the array
        while (i < n) {
            // If found 0 then decrement k
            if (nums[i] == 0) {
                k--;
            }
            // k's value is negative then,
            // Check value with j pointer
            if (k < 0) {
                if (nums[j] == 0) {
                    k++;
                }
                j++;
            }
            i++;
        }
        // return the length of window
        return i - j;
    }
}
