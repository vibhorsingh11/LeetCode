/*
 * Given a string s and a character c that occurs in s, return an array of integers answer where answer.length == s.length
 * and answer[i] is the shortest distance from s[i] to the character c in s.
 *
 * Example 1:
 * Input: s = "loveleetcode", c = "e"
 * Output: [3,2,1,0,1,0,0,1,2,2,1,0]
 *
 * Example 2:
 * Input: s = "aaab", c = "b"
 * Output: [3,2,1,0]
 *
 * Constraints:
 * 1 <= s.length <= 104
 * s[i] and c are lowercase English letters.
 * c occurs at least once in s.
 */
package org.phoenix.leetcode.challenges;

public class Problem07_ShortestDistanceToACharacter {
    public int[] shortestToChar(String s, char c) {
        int n = s.length();
        int[] resArray = new int[n];
        int charIndex = -n;

        for (int i = 0; i < n; ++i) {
            if (s.charAt(i) == c) charIndex = i;
            resArray[i] = i - charIndex;
        }
        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == c) charIndex = i;
            resArray[i] = Math.min(resArray[i], Math.abs(i - charIndex));
        }
        return resArray;
    }
}
