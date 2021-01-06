/*
 * Given an array arr of positive integers sorted in a strictly increasing order, and an integer k.
 * Find the kth positive integer that is missing from this array.
 *
 * Example 1:
 * Input: arr = [2,3,4,7,11], k = 5
 * Output: 9
 * Explanation: The missing positive integers are [1,5,6,8,9,10,12,13,...]. The 5th missing positive integer is 9.*/
package org.phoenix.leetcode.challenges;

public class Problem06_KthMissingPositiveNumber {
    public int findKthPositive(int[] arr, int k) {
        int pointer = 0, counter = 0;
        for (int i = 1; i <= arr[arr.length - 1]; i++) {
            if (arr[pointer] != i) counter++;
            else {
                pointer++;
            }
            if (counter == k) return i;
        }
        return arr[arr.length - 1] + (k - counter);
    }
}
