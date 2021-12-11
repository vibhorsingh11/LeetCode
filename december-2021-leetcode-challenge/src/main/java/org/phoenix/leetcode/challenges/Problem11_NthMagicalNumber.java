package org.phoenix.leetcode.challenges;

/**
 * A positive integer is magical if it is divisible by either a or b.
 * <p>
 * Given the three integers n, a, and b, return the nth magical number. Since the answer may be very large, return it modulo 109 + 7.
 * Constraints:
 * <p>
 * 1 <= n <= 109
 * 2 <= a, b <= 4 * 104
 */

public class Problem11_NthMagicalNumber {
    public int nthMagicalNumber(int n, int a, int b) {
        long A = a, B = b;
        long mod = (long) (Math.pow(10, 9) + 7);


        long left = Math.min(a, b), right = (long) n * Math.min(a, b);

        // Finding GCD
        while (B > 0) {
            long tmp = A;
            A = B;
            B = tmp % B;
        }

        long lcm = ((long) a * b) / A;

        while (left < right) {
            long m = left + (right - left) / 2;

            if ((m / a) + (m / b) - (m / lcm) < n) left = m + 1;

            else right = m;
        }
        return (int) (left % mod);
    }
}
