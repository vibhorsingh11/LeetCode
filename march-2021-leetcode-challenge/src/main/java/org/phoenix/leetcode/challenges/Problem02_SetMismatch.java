/**
 * You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set, which results in repetition of one number and loss of another number.
 * <p>
 * You are given an integer array nums representing the data status of this set after the error.
 * <p>
 * Find the number that occurs twice and the number that is missing and return them in the form of an array.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [1,2,2,4]
 * Output: [2,3]
 * Example 2:
 * <p>
 * Input: nums = [1,1]
 * Output: [1,2]
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 2 <= nums.length <= 104
 * 1 <= nums[i] <= 104
 */
package org.phoenix.leetcode.challenges;

public class Problem02_SetMismatch {
    public int[] findErrorNums(int[] nums) {
        // Result array
        int[] result = new int[2];
        // Array to store the count of the elements
        int[] count = new int[nums.length + 1];
        // Looping over the array and storing the count
        for (int num : nums) {
            count[num]++;
        }
        // Check for duplicate and missing elements
        for (int i = 1; i <= nums.length; i++) {
            if (count[i] == 2) result[0] = i;
            if (count[i] == 0) result[1] = i;
        }

        return result;
    }
}
