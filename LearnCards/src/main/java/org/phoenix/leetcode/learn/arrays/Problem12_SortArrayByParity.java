package org.phoenix.leetcode.learn.arrays;

/*
 * Given an array A of non-negative integers, return an array consisting of all the even elements of A,
 * followed by all the odd elements of A.
 *
 * You may return any answer array that satisfies this condition.
 *
 * Example 1:
 * Input: [3,1,2,4]
 * Output: [2,4,3,1]
 * The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
 *
 * Note:
 * 1 <= A.length <= 5000
 * 0 <= A[i] <= 5000
 * */

public class Problem12_SortArrayByParity {

    public int[] sortArrayByParity(int[] A) {
        // Initialized a variable
        int pointer = 0;
        // Looping over the array and checking if the element is even, then replace it with other index element
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                int temp = A[pointer];
                A[pointer] = A[i];
                A[i] = temp;
                pointer++;
            }
        }
        return A;
    }
}
