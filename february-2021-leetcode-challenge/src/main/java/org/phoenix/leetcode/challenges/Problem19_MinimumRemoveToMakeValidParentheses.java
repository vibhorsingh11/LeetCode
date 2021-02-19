/*
 * Given a string s of '(' , ')' and lowercase English characters.
 * Your task is to remove the minimum number of parentheses ( '(' or ')', in any positions ) so that the resulting
 * parentheses string is valid and return any valid string.
 * Formally, a parentheses string is valid if and only if:
 * It is the empty string, contains only lowercase characters, or
 * It can be written as AB (A concatenated with B), where A and B are valid strings, or
 * It can be written as (A), where A is a valid string.
 *
 * Example 1:
 * Input: s = "lee(t(c)o)de)"
 * Output: "lee(t(c)o)de"
 * Explanation: "lee(t(co)de)" , "lee(t(c)ode)" would also be accepted.
 *
 * Constraints:
 * 1 <= s.length <= 10^5
 * s[i] is one of  '(' , ')' and lowercase English letters.
 */
package org.phoenix.leetcode.challenges;

public class Problem19_MinimumRemoveToMakeValidParentheses {
    public String minRemoveToMakeValid(String s) {
        StringBuilder forward = new StringBuilder();
        // Count of open parenthesis
        int open = 0;
        // Loop through the string forward
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                open++;
            } else if (s.charAt(i) == ')') {
                if (open == 0) {
                    continue;
                }
                open--;
            }
            forward.append(s.charAt(i));
        }
        // String Builder going backward
        StringBuilder backward = new StringBuilder();
        // Count of closed parenthesis
        int close = 0;
        // Loop through the string backward
        for (int i = forward.length() - 1; i >= 0; i--) {
            if (forward.charAt(i) == ')') {
                close++;
            } else if (forward.charAt(i) == '(') {
                if (close == 0) {
                    continue;
                }
                close--;
            }
            backward.append(forward.charAt(i));
        }
        return backward.reverse().toString();
    }
}
