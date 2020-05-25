package org.phoenix.leetcode.learn.queue_stack;

/*
 * Evaluate the value of an arithmetic expression in Reverse Polish Notation.
 * Valid operators are +, -, *, /. Each operand may be an integer or another expression.
 *
 * Note:
 * Division between two integers should truncate toward zero.
 * The given RPN expression is always valid. That means the expression would always evaluate to a result and there won't be any divide by zero operation.
 * Example 1:
 * Input: ["2", "1", "+", "3", "*"]
 * Output: 9
 * Explanation: ((2 + 1) * 3) = 9
 */

import java.util.Stack;

public class Problem08_EvaluateReversePolishNotation {

    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String token : tokens) {
            // checking if token value match any one of notation
            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                // getting values for operations
                int sec = stack.pop();
                int first = stack.pop();
                // performing operation on the basis of notation
                if (token.equals("+")) stack.push(first + sec);
                if (token.equals("-")) stack.push(first - sec);
                if (token.equals("*")) stack.push(first * sec);
                if (token.equals("/")) stack.push(first / sec);
            } else {
                // if token value does not match operator then push it to stack
                int temp = Integer.parseInt(token);
                stack.push(temp);
            }
        }
        return stack.pop();
    }
}
