package org.phoenix.leetcode.challenges;

/**
 * Given two binary strings a and b, return their sum as a binary string.
 * Constraints:
 * <p>
 * 1 <= a.length, b.length <= 104
 * a and b consist only of '0' or '1' characters.
 * Each string does not contain leading zeros except for the zero itself.
 */

public class Problem10_AddBinary {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int s = 0;
        int i = a.length() - 1, j = b.length() - 1;
        while (i >= 0 || j >= 0 || s == 1) {
            s += ((i >= 0) ? a.charAt(i) - '0' : 0);
            s += ((j >= 0) ? b.charAt(j) - '0' : 0);
            result.insert(0, (char) (s % 2 + '0'));
            s /= 2;
            i--;
            j--;
        }
        return result.toString();
    }
}
