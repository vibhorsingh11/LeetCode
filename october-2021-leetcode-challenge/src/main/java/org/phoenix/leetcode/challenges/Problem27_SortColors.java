package org.phoenix.leetcode.challenges;

/**
 * Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
 * <p>
 * We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
 * <p>
 * You must solve this problem without using the library's sort function.
 * Constraints:
 * <p>
 * n == nums.length
 * 1 <= n <= 300
 * nums[i] is 0, 1, or 2.
 */

public class Problem27_SortColors {
    public int[] sortColors(int[] nums) {
        int length = nums.length;

        for (int j = 0; j < length - 1; j++) {
            if (nums[j] > nums[j + 1]) {
                int temp = nums[j];
                nums[j] = nums[j + 1];
                nums[j + 1] = temp;
                j = -1;
            }
        }
        return nums;
    }
}
