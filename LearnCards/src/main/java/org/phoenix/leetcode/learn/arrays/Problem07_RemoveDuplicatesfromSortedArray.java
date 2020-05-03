package org.phoenix.leetcode.learn.arrays;

/*
* Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.
*
* Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1)
* extra memory.
*
* Example 1:
*Given nums = [1,1,2],
*
*Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.
*It doesn't matter what you leave beyond the returned length.
*/

public class Problem07_RemoveDuplicatesfromSortedArray {

    public int removeDuplicates(int[] nums) {
        // Initialize the counter;
        int count = 1;
        // Looping over the array
        for(int i = 1;i< nums.length;i++) {
            // Checking if nums[i] not equal to val
            // updating array in place
            if(nums[i] != nums[i-1]) {
                nums[count] = nums[i];
                count++;
            }
        }
        // Return count
        return count;
    }
}
