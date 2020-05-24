package org.phoenix.leetcode.learn.queue_stack;

/*
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']',
 * determine if the input string is valid.
 *
 * An input string is valid if:
 *
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Note that an empty string is also considered valid.
 *
 * Example 1:
 * Input: "()"
 * Output: true

 * Example 2:
 * Input: "()[]{}"
 * Output: true
 */

import java.util.Stack;

public class Problem06_ValidParentheses {
    public boolean isValid(String s) { // ()[]{}
        Stack<Character> stack = new Stack<>();
        // looping over the string
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            // checking if current char contains any of the open Parentheses, then push it to stack
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                // is stack is empty then return false
                if (stack.isEmpty()) return false;
                else {
                    // take the top char from the stack and compare it with string char
                    char top = stack.pop();
                    if (c == ')' && top != '(') return false;
                    else if (c == '}' && top != '{') return false;
                    else if (c == ']' && top != '[') return false;
                }
            }
        }
        // if stack is empty then the string is valid else invalid
        return stack.isEmpty();
    }
}
