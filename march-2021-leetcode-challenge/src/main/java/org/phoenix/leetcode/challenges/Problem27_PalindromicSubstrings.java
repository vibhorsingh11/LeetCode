/**
 * Given a string, your task is to count how many palindromic substrings in this string.
 * <p>
 * The substrings with different start indexes or end indexes are counted as different substrings even they consist of same characters.
 * <p>
 * Example 1:
 * <p>
 * Input: "abc"
 * Output: 3
 * Explanation: Three palindromic strings: "a", "b", "c".
 * <p>
 * <p>
 * Example 2:
 * <p>
 * Input: "aaa"
 * Output: 6
 * Explanation: Six palindromic strings: "a", "a", "a", "aa", "aa", "aaa".
 * <p>
 * <p>
 * Note:
 * <p>
 * The input string length won't exceed 1000.
 */
package org.phoenix.leetcode.challenges;

public class Problem27_PalindromicSubstrings {
    public int countSubstrings(String s) {
        // Total count of palindrome
        int totalCount = 0;
        // Looping over the string
        for (int i = 0; i < s.length(); i++) {
            // getting count of ech substring
            totalCount += getCount(i, i, s);
            totalCount += getCount(i, i + 1, s);
        }
        return totalCount;
    }

    private int getCount(int start, int end, String s) {
        int tCount = 0;
        while (start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)) {
            start--;
            end++;
            tCount++;
        }
        return tCount;
    }
}
