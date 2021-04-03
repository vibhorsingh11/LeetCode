/**
 * Given a string containing just the characters '(' and ')', find the length of the longest valid (well-formed) parentheses substring.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: s = "(()"
 * Output: 2
 * Explanation: The longest valid parentheses substring is "()".
 * Example 2:
 * <p>
 * Input: s = ")()())"
 * Output: 4
 * Explanation: The longest valid parentheses substring is "()()".
 * Example 3:
 * <p>
 * Input: s = ""
 * Output: 0
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 0 <= s.length <= 3 * 104
 * s[i] is '(', or ')'.
 */
package org.phoenix.leetcode.challenges;

import java.util.Stack;

public class Problem03_LongestValidParentheses {
    public int longestValidParentheses(String s) {
        if (s == null || s.length() < 2) {
            return 0;
        }
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                st.push(i);
            } else {
                // current closing bracket
                if (!st.empty() && s.charAt(st.peek()) == '(') {
                    // balanced case
                    st.pop();
                } else {
                    // unbalanced case
                    st.push(i);
                }
            }
        }
        int maxLen = 0;
        int endTerminal = s.length();

        while (!st.empty()) {
            int startTerminal = st.pop();
            maxLen = Math.max(maxLen, endTerminal - startTerminal - 1);
            endTerminal = startTerminal;
        }

        return Math.max(endTerminal, maxLen);
    }
}
