/**
 * Given a string s consisting only of letters 'a' and 'b'. In a single step you can remove one palindromic subsequence from s.
 * <p>
 * Return the minimum number of steps to make the given string empty.
 * <p>
 * A string is a subsequence of a given string, if it is generated by deleting some characters of a given string without changing its order.
 * <p>
 * A string is called palindrome if is one that reads the same backward as well as forward.
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: s = "ababa"
 * Output: 1
 * Explanation: String is already palindrome
 * Constraints:
 * <p>
 * 0 <= s.length <= 1000
 * s only consists of letters 'a' and 'b'
 */
package org.phoenix.leetcode.challenges;

public class Problem08_RemovePalindromicSubsequences {
    public int removePalindromeSub(String s) {
        // Return 0 if string in empty
        // If it is palindrome then only 1 step is required
        if (s.length() == 0) {
            return 0;
        } else if (checkPalindrome(s)) {
            return 1;
        } else {
            return 2;
        }
    }

    // Check if string in palindrome
    public boolean checkPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        while (start < end) {
            if (s.charAt(start) == s.charAt(end)) {
                start++;
                end--;
            } else {
                return false;
            }
        }
        return true;
    }
}
