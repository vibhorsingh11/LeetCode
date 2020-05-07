package org.phoenix.leetcode.challenges;

/*
 * Given an array of size n, find the majority element.
 * The majority element is the element that appears more than ⌊ n/2 ⌋ times.
 * You may assume that the array is non-empty and the majority element always exist in the array.
 *
 * Example 1:
 * Input: [3,2,3]
 * Output: 3
 *
 * Example 2:
 * Input: [2,2,1,1,1,2,2]
 * Output: 2
 */

public class Problem06_MajorityElement {

    public int majorityElement(int[] nums) {
        // variable for counting majority element
        int count = 0;
        // storing the majority element
        int candidate = -1;
        // looping over the array
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            // if num is equal to majority element then increment the count else decrement it
            count += (num == candidate) ? 1 : -1;
        }
        return candidate;
    }
}
