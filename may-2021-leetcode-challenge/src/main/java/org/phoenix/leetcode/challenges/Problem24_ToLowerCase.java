package org.phoenix.leetcode.challenges;

/**
 * Given a string s, return the string after replacing every uppercase letter with the same lowercase letter.
 * <p>
 * Constraints:
 * <p>
 * 1 <= s.length <= 100
 * s consists of printable ASCII characters.
 */

public class Problem24_ToLowerCase {
    public String toLowerCase(String s) {
        // Base case
        if (s == null || s.isEmpty()) {
            return s;
        }
        // Converting string to array
        char[] charArr = s.toCharArray();
        // looping over the array and checking
        // ASCII values of each and then converting
        // them to lowercase ASCII values
        for (int i = 0; i < charArr.length; i++) {
            if (charArr[i] >= 65 && charArr[i] <= 90) {
                charArr[i] += 32;
            }
        }
        return new String(charArr);
    }
}
