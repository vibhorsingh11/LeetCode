package org.phoenix.leetcode.learn.arrays;

/*
 * Given an array A of integers, return true if and only if it is a valid mountain array.
 * Recall that A is a mountain array if and only if:
 *
 * A.length >= 3
 * There exists some i with 0 < i < A.length - 1 such that:
 * A[0] < A[1] < ... A[i-1] < A[i]
 * A[i] > A[i+1] > ... > A[A.length - 1]
 *
 * Example 1:
 *
 * Input: [2,1]
 * Output: false
 */

public class Problem09_ValidMountainArray {

    public boolean validMountainArray(int[] A) {
        // If array length is less than 3 return false
        if (A.length < 3) return false;
        // Initialized two bool variables
        boolean increasing = false;
        boolean decreasing = false;
        // Looping over the array
        for (int i = 0; i < A.length - 1; i++) {
            // Setting increasing true if next index element is greater
            if (A[i + 1] > A[i] && !decreasing) {
                increasing = true;
            // Setting increasing true if next index element is greater
            } else if (A[i + 1] < A[i] && increasing) {
                decreasing = true;
            } else if (A[i] == A[i + 1]) {
                return false;
            } else
                return false;
        }
        return decreasing;
    }
}
