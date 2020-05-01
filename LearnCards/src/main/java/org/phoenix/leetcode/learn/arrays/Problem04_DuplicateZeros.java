package org.phoenix.leetcode.learn.arrays;

/*
* Given a fixed length array arr of integers, duplicate each occurrence of zero,
* shifting the remaining elements to the right.
* Note that elements beyond the length of the original array are not written.*
* Do the above modifications to the input array in place, do not return anything from your function.
*
* Example 1:
*
* Input: [1,0,2,3,0,4,5,0]
* Output: null
* Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]*/

public class Problem04_DuplicateZeros {

    public int[] duplicateZeros(int[] arr) {
        int count = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++, count++) {
            if (arr[i] == 0) {
                count++;
            }
        }
        for (int i = n - 1; i >= 0; i--) {
            if (--count < n) {
                arr[count] = arr[i];
            }
            if (arr[i] == 0 && --count < n) {
                arr[count] = 0;
            }
        }
        return arr;
    }
}
