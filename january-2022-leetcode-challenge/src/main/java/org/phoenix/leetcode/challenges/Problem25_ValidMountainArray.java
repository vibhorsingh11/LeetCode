package org.phoenix.leetcode.challenges;

/**
 * Given an array of integers arr, return true if and only if it is a valid mountain array.
 * <p>
 * Recall that arr is a mountain array if and only if:
 * <p>
 * arr.length >= 3
 * There exists some i with 0 < i < arr.length - 1 such that:
 * arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
 * arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
 */

public class Problem25_ValidMountainArray {
    public boolean validMountainArray(int[] arr) {
        if (arr.length < 3) return false;
        boolean increasing = false;
        boolean decreasing = false;
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] > arr[i]) {
                increasing = true;
                if (decreasing) {
                    decreasing = false;
                    count = 1;
                }
            } else if (arr[i + 1] < arr[i]) {
                decreasing = true;
                if (count == 1) return false;
            } else if (arr[i] == arr[i + 1]) {
                return false;
            }
        }
        return increasing && decreasing;
    }
}
