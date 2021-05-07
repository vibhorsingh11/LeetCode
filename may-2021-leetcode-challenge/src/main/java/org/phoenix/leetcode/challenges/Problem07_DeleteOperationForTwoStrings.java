package org.phoenix.leetcode.challenges;

/**
 * Given two strings word1 and word2, return the minimum number of steps required to make word1 and word2 the same.
 * <p>
 * In one step, you can delete exactly one character in either string.
 * <p>
 * Example 1:
 * Input: word1 = "sea", word2 = "eat"
 * Output: 2
 * Explanation: You need one step to make "sea" to "ea" and another step to make "eat" to "ea".
 * Example 2:
 * Input: word1 = "leetcode", word2 = "etco"
 * Output: 4
 * <p>
 * <p>
 * Constraints:
 * 1 <= word1.length, word2.length <= 500
 * word1 and word2 consist of only lowercase English letters.
 */

public class Problem07_DeleteOperationForTwoStrings {
    public int minDistance(String word1, String word2) {
        // Find the longest common subsequence
        int lenLCS = getLenLCS(word1, word2);
        return word1.length() + word2.length() - 2 * lenLCS;
    }

    private int getLenLCS(String s1, String s2) {
        // array to store
        int[][] dp = new int[s1.length() + 1][s2.length() + 1];
        // looping over the arrays
        for (int i = 1; i <= s1.length(); i++) {
            for (int j = 1; j <= s2.length(); j++) {
                // If array index value is same then
                // increment the index value
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[s1.length()][s2.length()];
    }
}
