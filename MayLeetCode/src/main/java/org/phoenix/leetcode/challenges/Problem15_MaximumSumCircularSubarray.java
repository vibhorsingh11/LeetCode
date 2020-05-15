package org.phoenix.leetcode.challenges;

/*
 * Given a circular array C of integers represented by A, find the maximum possible sum of a non-empty subarray of C.
 * Here, a circular array means the end of the array connects to the beginning of the array.
 * (Formally, C[i] = A[i] when 0 <= i < A.length, and C[i+A.length] = C[i] when i >= 0.)
 * Also, a subarray may only include each element of the fixed buffer A at most once.
 * (Formally, for a subarray C[i], C[i+1], ..., C[j],
 * there does not exist i <= k1, k2 <= j with k1 % A.length = k2 % A.length.)
 *
 * Example 1:
 * Input: [1,-2,3,-2]
 * Output: 3
 * Explanation: Subarray [3] has maximum sum 3
 */

public class Problem15_MaximumSumCircularSubarray {

    public int maxSubarraySumCircular(int[] A) {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, sum1 = 0, sum2 = 0, total = 0;
        for (int value : A) {
            sum1 += value;
            max = Math.max(max, sum1);
            sum1 = Math.max(sum1, 0);

            sum2 += value;
            min = Math.min(min, sum2);
            sum2 = Math.min(sum2, 0);

            total += value;
        }

        return max < 0 ? max : Math.max(max, total - min);
    }
}
