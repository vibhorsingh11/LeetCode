/**
 * Starting with a positive integer N, we reorder the digits in any order (including the original order) such that
 * the leading digit is not zero.
 * <p>
 * Return true if and only if we can do this in a way such that the resulting number is a power of 2.
 * <p>
 * Example 1:
 * <p>
 * Input: 1
 * Output: true
 */
package org.phoenix.leetcode.challenges;

public class Problem21_ReorderedPowerOf2 {
    public boolean reorderedPowerOf2(int N) {
        int[] inputDigitFreq = freqCount(N);
        for (int i = 0; i < 31; i++) {
            int powerOf2 = (int) Math.pow(2, i);
            int[] powerOf2FreqCount = freqCount(powerOf2);
            if (compareArray(inputDigitFreq, powerOf2FreqCount)) {
                return true;
            }
        }
        return false;
    }

    private boolean compareArray(int[] freqCount1, int[] freqCount2) {
        for (int i = 0; i < 10; i++) {
            if (freqCount1[i] != freqCount2[i]) {
                return false;
            }
        }
        return true;
    }

    private int[] freqCount(int n) {
        int[] digitFreq = new int[10];
        while (n > 0) {
            digitFreq[n % 10]++;
            n = n / 10;
        }
        return digitFreq;
    }
}
