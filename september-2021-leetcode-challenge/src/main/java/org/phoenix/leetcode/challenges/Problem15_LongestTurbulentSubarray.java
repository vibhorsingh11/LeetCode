package org.phoenix.leetcode.challenges;

/**
 * Given an integer array arr, return the length of a maximum size turbulent subarray of arr.
 * <p>
 * A subarray is turbulent if the comparison sign flips between each adjacent pair of elements in the subarray.
 * <p>
 * More formally, a subarray [arr[i], arr[i + 1], ..., arr[j]] of arr is said to be turbulent if and only if:
 * <p>
 * For i <= k < j:
 * arr[k] > arr[k + 1] when k is odd, and
 * arr[k] < arr[k + 1] when k is even.
 * Or, for i <= k < j:
 * arr[k] > arr[k + 1] when k is even, and
 * arr[k] < arr[k + 1] when k is odd.
 * Constraints:
 * <p>
 * 1 <= arr.length <= 4 * 104
 * 0 <= arr[i] <= 109
 */

public class Problem15_LongestTurbulentSubarray {
    public int maxTurbulenceSize(int[] arr) {
        int inc = 1, dec = 1, result = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                dec = inc + 1;
                inc = 1;
            } else if (arr[i] > arr[i - 1]) {
                inc = dec + 1;
                dec = 1;
            } else {
                inc = 1;
                dec = 1;
            }
            result = Math.max(result, Math.max(dec, inc));
        }
        return result;
    }
}
