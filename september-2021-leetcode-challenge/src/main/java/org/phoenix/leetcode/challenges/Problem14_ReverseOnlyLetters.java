package org.phoenix.leetcode.challenges;

/**
 * Given a string s, reverse the string according to the following rules:
 * <p>
 * All the characters that are not English letters remain in the same position.
 * All the English letters (lowercase or uppercase) should be reversed.
 * Return s after reversing it.
 * Constraints:
 * <p>
 * 1 <= s.length <= 100
 * s consists of characters with ASCII values in the range [33, 122].
 * s does not contain '\"' or '\\'.
 */

public class Problem14_ReverseOnlyLetters {
    public String reverseOnlyLetters(String s) {
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0, j = s.length() - 1; i < j; ) {
            if (!Character.isLetter(sb.charAt(i))) {
                ++i;
            } else if (!Character.isLetter(sb.charAt(j))) {
                --j;
            } else {
                sb.setCharAt(i, s.charAt(j));
                sb.setCharAt(j--, s.charAt(i++));
            }
        }
        return sb.toString();
    }
}
