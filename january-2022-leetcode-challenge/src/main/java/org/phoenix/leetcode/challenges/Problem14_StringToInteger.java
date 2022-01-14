package org.phoenix.leetcode.challenges;

/**
 * Implement the myAtoi(string s) function, which converts a string to a 32-bit signed integer (similar to C/C++'s atoi function).
 * <p>
 * The algorithm for myAtoi(string s) is as follows:
 * <p>
 * Read in and ignore any leading whitespace.
 * Check if the next character (if not already at the end of the string) is '-' or '+'. Read this character in if it is either. This determines if the final result is negative or positive respectively. Assume the result is positive if neither is present.
 * Read in next the characters until the next non-digit character or the end of the input is reached. The rest of the string is ignored.
 * Convert these digits into an integer (i.e. "123" -> 123, "0032" -> 32). If no digits were read, then the integer is 0. Change the sign as necessary (from step 2).
 * If the integer is out of the 32-bit signed integer range [-231, 231 - 1], then clamp the integer so that it remains in the range. Specifically, integers less than -231 should be clamped to -231, and integers greater than 231 - 1 should be clamped to 231 - 1.
 * Return the integer as the final result.
 * Note:
 * <p>
 * Only the space character ' ' is considered a whitespace character.
 * Do not ignore any characters other than the leading whitespace or the rest of the string after the digits.
 */

public class Problem14_StringToInteger {
    public int MyAtoi(String s) {
        if (s.length() == 0) return 0;
        int i = 0, operator = 1, res = 0;
        while (i < s.length() && s.charAt(i) == ' ') i++;
        if (i < s.length() && (s.charAt(i) == '-' || s.charAt(i) == '+')) {
            operator = (s.charAt(i++) == '-') ? -1 : 1;
        }
        while (i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
            if (res > Integer.MAX_VALUE / 10 ||
                    (res == Integer.MAX_VALUE / 10 && s.charAt(i) - '0' > Integer.MAX_VALUE % 10)) {
                return (operator == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            res = res * 10 + (s.charAt(i++) - '0');
        }
        return res * operator;
    }
}
