package org.phoenix.leetcode.challenges;

/**
 * You are given a string s consisting of lowercase English letters. A duplicate removal consists of choosing two adjacent and equal letters and removing them.
 * <p>
 * We repeatedly make duplicate removals on s until we no longer can.
 * <p>
 * Return the final string after all such duplicate removals have been made. It can be proven that the answer is unique.
 * Constraints:
 * <p>
 * 1 <= s.length <= 105
 * s consists of lowercase English letters.
 */

public class Problem28_RemoveAllAdjacentDuplicatesInString {
    public String removeDuplicates(String S) {
        // Store the result
        StringBuilder sb = new StringBuilder();
        // Traverse the string
        for (char c : S.toCharArray()) {
            int size = sb.length();
            if (size > 0 && sb.charAt(size - 1) == c) {
                sb.deleteCharAt(size - 1);
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
