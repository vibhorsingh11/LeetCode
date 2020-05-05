package org.phoenix.leetcode.learn.arrays;

/*
 * Given an array nums, write a function to move all 0's to the end of it while maintaining
 * the relative order of the non-zero elements.
 *
 * Example:
 *
 * Input: [0,1,0,3,12]
 * Output: [1,3,12,0,0]
 *
 * Note:
 * You must do this in-place without making a copy of the array. Minimize the total number of operations.
 */

public class Problem11_MoveZeroes {

    public int[] moveZeroes(int[] nums) {
        // Initialized a pointer which keep track of zero in array
        int pointer = 0;
        // Looping over the array and replacing with non-zero element
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[pointer];
                nums[pointer] = nums[i];
                nums[i] = temp;
                pointer++;
            }
        }
        return nums;
    }
}
