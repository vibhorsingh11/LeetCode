/**
 * Given two integers dividend and divisor, divide two integers without using multiplication, division, and mod operator.
 * <p>
 * Return the quotient after dividing dividend by divisor.
 * <p>
 * The integer division should truncate toward zero, which means losing its fractional part. For example, truncate(8.345) = 8 and truncate(-2.7335) = -2.
 * <p>
 * Note:
 * <p>
 * Assume we are dealing with an environment that could only store integers within the 32-bit signed integer range: [−231,  231 − 1]. For this problem, assume that your function returns 231 − 1 when the division result overflows.
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: dividend = 10, divisor = 3
 * Output: 3
 * Explanation: 10/3 = truncate(3.33333..) = 3.
 * Constraints:
 * <p>
 * -231 <= dividend, divisor <= 231 - 1
 * divisor != 0
 */
package org.phoenix.leetcode.challenges;

public class Problem27_DivideTwoIntegers {
    public int divide(int dividend, int divisor) {
        // Overflow
        if (divisor == 0 || (dividend == Integer.MIN_VALUE && divisor == -1)) {
            return Integer.MAX_VALUE;
        }
        // Sign of quotient
        boolean sign = (dividend < 0 && divisor < 0) || (dividend > 0 && divisor > 0);
        // Result quotient
        int quotient = 0;
        // Changing to abs value
        long absDividend = Math.abs((long) dividend);
        long absDivisor = Math.abs((long) divisor);
        // Loop until the  dividend is greater than or
        // equal to the divisor
        while (absDividend >= absDivisor) {
            int shifts = 0;
            while (absDividend >= (absDivisor << shifts)) {
                shifts++;
            }
            // Number of shifts
            quotient += (1 << (shifts - 1));
            absDividend -= absDivisor << (shifts - 1);
        }
        return sign ? quotient : -quotient;
    }
}
