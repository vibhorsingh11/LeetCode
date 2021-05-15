package org.phoenix.leetcode.challenges;

/**
 * A valid number can be split up into these components (in order):
 * <p>
 * A decimal number or an integer.
 * (Optional) An 'e' or 'E', followed by an integer.
 * A decimal number can be split up into these components (in order):
 * <p>
 * (Optional) A sign character (either '+' or '-').
 * One of the following formats:
 * At least one digit, followed by a dot '.'.
 * At least one digit, followed by a dot '.', followed by at least one digit.
 * A dot '.', followed by at least one digit.
 * An integer can be split up into these components (in order):
 * <p>
 * (Optional) A sign character (either '+' or '-').
 * At least one digit.
 * For example, all the following are valid numbers: ["2", "0089", "-0.1", "+3.14", "4.", "-.9", "2e10", "-90E3", "3e+7",
 * "+6e-1", "53.5e93", "-123.456e789"], while the following are not valid numbers: ["abc", "1a", "1e", "e3", "99e2.5",
 * "--6", "-+3", "95a54e53"].
 * <p>
 * Given a string s, return true if s is a valid number.
 * Constraints:
 * <p>
 * 1 <= s.length <= 20
 * s consists of only English letters (both uppercase and lowercase), digits (0-9), plus '+', minus '-', or dot '.'.
 */

public class Problem15_ValidNumber {
    public boolean isNumber(String s) {
        // Remove space from string
        s = s.trim();
        // variables to keep track of conditions
        boolean pointPresent = false;
        boolean ePresent = false;
        boolean numberPresent = false;
        boolean numberAfterE = true;
        // looping over the array and
        // marking the variable with conditions occured
        for (int i = 0; i < s.length(); i++) {
            if ('0' <= s.charAt(i) && s.charAt(i) <= '9') {
                numberPresent = true;
                numberAfterE = true;
            } else if (s.charAt(i) == '.') {
                if (ePresent || pointPresent) {
                    return false;
                }
                pointPresent = true;
            } else if (s.charAt(i) == 'e' || s.charAt(i) == 'E') {
                if (ePresent || !numberPresent) {
                    return false;
                }
                numberAfterE = false;
                ePresent = true;
            } else if (s.charAt(i) == '-' || s.charAt(i) == '+') {
                if (i != 0 && s.charAt(i - 1) != 'e') {
                    return false;
                }
            } else {
                return false;
            }
        }

        return numberPresent && numberAfterE;
    }
}
