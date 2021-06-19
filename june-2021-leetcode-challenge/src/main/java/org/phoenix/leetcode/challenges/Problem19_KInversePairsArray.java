package org.phoenix.leetcode.challenges;

/**
 * For an integer array nums, an inverse pair is a pair of integers [i, j] where 0 <= i < j < nums.length and nums[i] > nums[j].
 * <p>
 * Given two integers n and k, return the number of different arrays consist of numbers from 1 to n such that there are exactly k inverse pairs. Since the answer can be huge, return it modulo 109 + 7.
 * Constraints:
 * <p>
 * 1 <= n <= 1000
 * 0 <= k <= 1000
 */

public class Problem19_KInversePairsArray {
    public int kInversePairs(int n, int k) {

        long MODULUS = 1000000007L;
        long[] dp = new long[k + 1];
        dp[0] = 1;
        for (int i = 2; i <= n; i++) {
            long[] currDp = new long[k + 1];
            for (int j = 0; j < currDp.length; j++) {
                currDp[j] = (dp[j] + (j > 0 ? currDp[j - 1] : 0) - ((j - i) >= 0 ? dp[j - i] : 0) + MODULUS) % MODULUS;
            }
            dp = currDp;
        }
        return (int) dp[k];
    }
}
