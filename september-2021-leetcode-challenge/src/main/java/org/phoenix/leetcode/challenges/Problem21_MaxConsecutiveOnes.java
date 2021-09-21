package org.phoenix.leetcode.challenges;

/**
 * <p>
 * Given a binary array nums, return the maximum number of consecutive 1's in the array.
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 10^5
 * nums[i] is either 0 or 1.
 */

public class Problem21_MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int n = nums.length;
        int left = 0;
        int right = 0;
        int maxLength = 0;
        while (right < n) {
            while (right < n && nums[right] == 1) {
                right++;
            }
            maxLength = Math.max(maxLength, right - left);
            left = right;
            while (left < n && nums[left] == 0) {
                left++;
            }
            right++;
        }
        return maxLength;
    }
}
