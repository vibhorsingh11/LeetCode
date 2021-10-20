package org.phoenix.leetcode.challenges;

/**
 * Given an input string s, reverse the order of the words.
 * <p>
 * A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.
 * <p>
 * Return a string of the words in reverse order concatenated by a single space.
 * <p>
 * Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.
 * Constraints:
 * <p>
 * 1 <= s.length <= 104
 * s contains English letters (upper-case and lower-case), digits, and spaces ' '.
 * There is at least one word in s.
 */

public class Problem20_ReverseWordsInAString {
    public String reverseWords(String s) {
        if (s == null) {
            return s;
        }
        StringBuilder ans = new StringBuilder();
        for (int i = s.length() - 1, j; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                j = i;
                i = s.lastIndexOf(' ', i);
                ans.append(s, i + 1, j + 1).append(" ");
            }
        }
        return ans.toString().trim();
    }
}
