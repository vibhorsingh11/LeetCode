package org.phoenix.leetcode.learn.arrays;

import java.util.Arrays;

/*
* Given an array of integers A sorted in non-decreasing order, return an array of the squares of each number,
* also in sorted non-decreasing order.
*
* Example 1:
*Input: [-4,-1,0,3,10]
*Output: [0,1,9,16,100]
* */

public class Problem03_SquaresSortedArray {

    public int[] sortedSquares(int[] A) {
        // Loop through the array
        for(int i= 0;i<A.length;i++) {
            // Multiplying each element with itself
            A[i] *= A[i];
        }
        // Sorting the altered array
        Arrays.sort(A);
        return A;
    }
}
