package org.phoenix.leetcode.challenges;

import java.util.Stack;

/**
 * Evaluate the value of an arithmetic expression in Reverse Polish Notation.
 * <p>
 * Valid operators are +, -, *, and /. Each operand may be an integer or another expression.
 * <p>
 * Note that division between two integers should truncate toward zero.
 * <p>
 * It is guaranteed that the given RPN expression is always valid. That means the expression would always evaluate to a result, and there will not be any division by zero operation.
 * Constraints:
 * <p>
 * 1 <= tokens.length <= 104
 * tokens[i] is either an operator: "+", "-", "*", or "/", or an integer in the range [-200, 200].
 */

public class Problem25_EvaluateReversePolishNotation {
    public int evalRPN(String[] tokens) {
        // Stack to store tokens value
        Stack<Integer> stack = new Stack<>();
        // Looping over the tokens array
        for (String token : tokens) {
            // If arithmetic operator is found
            // than perform the operation
            // else push the value after parsing to stack
            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                // Extract last two values from stack
                int sec = stack.pop();
                int first = stack.pop();
                // Perform the specified execution
                if (token.equals("+")) stack.push(first + sec);
                if (token.equals("-")) stack.push(first - sec);
                if (token.equals("*")) stack.push(first * sec);
                if (token.equals("/")) stack.push(first / sec);
            } else {
                int temp = Integer.parseInt(token);
                stack.push(temp);
            }
        }
        return stack.pop();
    }
}
