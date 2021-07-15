package org.phoenix.leetcode.challenges;

import java.util.Arrays;

/**
 * Given an integer array nums, return the number of triplets chosen from the array that can make triangles if we take them as side lengths of a triangle.
 * Constraints:
 * <p>
 * 1 <= nums.length <= 1000
 * 0 <= nums[i] <= 1000
 */

public class Problem15_ValidTriangleNumber {
    public int triangleNumber(int[] nums) {
        // Base case
        if (nums == null || nums.length < 3) {
            return 0;
        }
        // Length of array
        int n = nums.length;
        // Count of valid triangles
        int count = 0;
        // Sorting array
        Arrays.sort(nums);
        // Traversing the array
        for (int i = 2; i < n; i++) {
            int j = 0;
            int k = i - 1;
            while (j < k) {
                if (nums[j] + nums[k] > nums[i]) {
                    count += k - j;
                    k--;
                } else {
                    j++;
                }
            }
        }
        return count;
    }
}
