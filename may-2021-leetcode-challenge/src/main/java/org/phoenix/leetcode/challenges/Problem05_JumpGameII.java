package org.phoenix.leetcode.challenges;

/**
 * Given an array of non-negative integers nums, you are initially positioned at the first index of the array.
 * <p>
 * Each element in the array represents your maximum jump length at that position.
 * <p>
 * Your goal is to reach the last index in the minimum number of jumps.
 * <p>
 * You can assume that you can always reach the last index.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [2,3,1,1,4]
 * Output: 2
 * Explanation: The minimum number of jumps to reach the last index is 2. Jump 1 step from index 0 to 1, then 3 steps
 * to the last index.
 * Example 2:
 * <p>
 * Input: nums = [2,3,0,1,4]
 * Output: 2
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 1000
 * 0 <= nums[i] <= 105
 */

public class Problem05_JumpGameII {
    public int jump(int[] nums) {
        // Store jumps, current position and farthest jump
        int jumps = 0;
        int index = 0;
        int maxIndex = 0;
        // Looping over the jump array
        for (int i = 0; i < nums.length - 1; i++) {
            // Getting the max distance jump
            maxIndex = Math.max(maxIndex, i + nums[i]);
            // If the current position and current index is same
            // then increment the jumps count and assign
            if (i == index) {
                jumps++;
                index = maxIndex;
            }
        }
        return jumps;
    }
}
