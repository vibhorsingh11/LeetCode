package org.phoenix.leetcode.challenges;

import java.util.Arrays;

/**
 * Given an integer array nums of size n, return the minimum number of moves required to make all array elements equal.
 * <p>
 * In one move, you can increment or decrement an element of the array by 1.
 * Constraints:
 * <p>
 * n == nums.length
 * 1 <= nums.length <= 105
 * -109 <= nums[i] <= 109
 */

public class Problem19_MinimumMovesToEqualArrayElementsI {
    public int minMoves2(int[] nums) {
        // Sorting the array
        Arrays.sort(nums);
        // Variable to store start and end
        int i = 0;
        int j = nums.length - 1;
        // Total moves needed
        int moves = 0;
        // Loop until median is reached
        while (i < j) {
            // counting moves
            moves += nums[j] - nums[i];
            j--;
            i++;
        }
        return moves;
    }
}
