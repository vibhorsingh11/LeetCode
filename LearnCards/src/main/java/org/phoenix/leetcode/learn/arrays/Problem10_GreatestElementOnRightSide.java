package org.phoenix.leetcode.learn.arrays;

/*
 * Given an array arr, replace every element in that array with the greatest element among the elements to its right,
 * and replace the last element with -1.
 * After doing so, return the array.
 *
 * Example 1:
 * Input: arr = [17,18,5,4,6,1]
 * Output: [18,6,6,6,1,-1]
 */

public class Problem10_GreatestElementOnRightSide {

    public int[] replaceElements(int[] arr) {
        // Taking last element of array as max
        int max = arr[arr.length - 1];
        // Assigning last element in array as -1, it is suggested in the question
        arr[arr.length - 1] = -1;
        // Looping over the array from end and replacing each element with max element,
        // then calculating max element after replacement
        for (int i = arr.length - 2; i >= 0; i--) {
            int temp = arr[i];
            arr[i] = max;
            max = Math.max(max, temp);
        }
        return arr;
    }
}
