package org.phoenix.leetcode.challenges;

/**
 * Given a positive integer n, return the number of the integers in the range [0, n] whose binary representations do not contain consecutive ones.
 * Constraints:
 * 1 <= n <= 109
 */

public class Problem25_NonNegativeIntegersWithoutConsecutiveOnes {
    public int findIntegers(int num) {
        StringBuilder sb = new StringBuilder(Integer.toBinaryString(num)).reverse();

        int n = sb.length();

        int[] a = new int[n];
        int[] b = new int[n];

        a[0] = 1;
        b[0] = 1;

        for (int i = 1; i < n; i++) {
            a[i] = a[i - 1] + b[i - 1];
            b[i] = a[i - 1];
        }

        int res = a[n - 1] + b[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            if (sb.charAt(i) == '0' && sb.charAt(i + 1) == '0')
                res = res - b[i];
            if (sb.charAt(i) == '1' && sb.charAt(i + 1) == '1')
                break;
        }

        return res;
    }
}
