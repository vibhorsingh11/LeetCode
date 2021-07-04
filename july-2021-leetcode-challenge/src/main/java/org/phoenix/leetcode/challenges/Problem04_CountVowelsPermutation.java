package org.phoenix.leetcode.challenges;

/**
 * Given an integer n, your task is to count how many strings of length n can be formed under the following rules:
 * <p>
 * Each character is a lower case vowel ('a', 'e', 'i', 'o', 'u')
 * Each vowel 'a' may only be followed by an 'e'.
 * Each vowel 'e' may only be followed by an 'a' or an 'i'.
 * Each vowel 'i' may not be followed by another 'i'.
 * Each vowel 'o' may only be followed by an 'i' or a 'u'.
 * Each vowel 'u' may only be followed by an 'a'.
 * Since the answer may be too large, return it modulo 10^9 + 7.
 * Constraints:
 * <p>
 * 1 <= n <= 2 * 10^4
 */

public class Problem04_CountVowelsPermutation {
    public int countVowelPermutation(int n) {
        long[] acount = new long[n];
        long[] ecount = new long[n];
        long[] icount = new long[n];
        long[] ocount = new long[n];
        long[] ucount = new long[n];

        acount[0] = 1L;
        ecount[0] = 1L;
        icount[0] = 1L;
        ocount[0] = 1L;
        ucount[0] = 1L;

        int MOD = 1000000007;


        for (int i = 1; i < n; i++) {
            acount[i] = (ecount[i - 1] + icount[i - 1] + ucount[i - 1]) % MOD;
            ecount[i] = (acount[i - 1] + icount[i - 1]) % MOD;
            icount[i] = (ecount[i - 1] + ocount[i - 1]) % MOD;
            ocount[i] = icount[i - 1] % MOD;
            ucount[i] = (icount[i - 1] + ocount[i - 1]) % MOD;
        }

        long result = 0L;

        result = (acount[n - 1] + ecount[n - 1] + icount[n - 1] + ocount[n - 1] + ucount[n - 1]) % MOD;


        return (int) result;
    }
}
