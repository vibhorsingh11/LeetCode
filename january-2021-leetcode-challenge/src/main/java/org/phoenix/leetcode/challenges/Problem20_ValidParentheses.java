/*
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * An input string is valid if:
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 *
 * Example 1:
 * Input: s = "()"
 * Output: true
 *
 * Constraints:
 * 1 <= s.length <= 104
 * s consists of parentheses only '()[]{}'.
 */
package org.phoenix.leetcode.challenges;

import java.util.Stack;

public class Problem20_ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()) {
            if (st.empty()) {
                st.push(c);
            } else {
                char topChar = st.peek();
                if (topChar == '(' && c == ')') {
                    st.pop();
                } else if (topChar == '{' && c == '}') {
                    st.pop();
                } else if (topChar == '[' && c == ']') {
                    st.pop();
                } else {
                    st.push(c);
                }
            }
        }
        return st.empty();
    }
}
