package org.phoenix.leetcode.challenges;

/**
 * Given two strings text1 and text2, return the length of their longest common subsequence. If there is no common subsequence, return 0.
 * <p>
 * A subsequence of a string is a new string generated from the original string with some characters (can be none) deleted without changing the relative order of the remaining characters.
 * <p>
 * For example, "ace" is a subsequence of "abcde".
 * A common subsequence of two strings is a subsequence that is common to both strings.
 * Constraints:
 * <p>
 * 1 <= text1.length, text2.length <= 1000
 * text1 and text2 consist of only lowercase English characters.
 */

public class Problem01_LongestCommonSubsequence {
    public int longestCommonSubsequence(String text1, String text2) {
        // Lengths of the input strings
        int n = text1.length();
        int m = text2.length();
        // 2-D array to store problems
        int[][] dp = new int[n + 1][m + 1];
        // This will track the maximum length of the common subsequence
        int max = 0;
        // Loop for each character in both the strings
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                // If the character is same then we will add 1 to the dp for remaining string
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    // ... Else we will take max of the two common strings
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
                if (dp[i][j] > max) {
                    max = dp[i][j];
                }
            }
        }
        return max;
    }
}
