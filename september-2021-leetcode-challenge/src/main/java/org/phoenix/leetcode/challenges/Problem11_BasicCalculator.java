package org.phoenix.leetcode.challenges;

import java.util.Stack;

/**
 * Given a string s representing a valid expression, implement a basic calculator to evaluate it, and return the result of the evaluation.
 * <p>
 * Note: You are not allowed to use any built-in function which evaluates strings as mathematical expressions, such as eval().
 * Constraints:
 * <p>
 * 1 <= s.length <= 3 * 105
 * s consists of digits, '+', '-', '(', ')', and ' '.
 * s represents a valid expression.
 * '+' is not used as a unary operation.
 * '-' could be used as a unary operation but it has to be inside parentheses.
 * There will be no two consecutive operators in the input.
 * Every number and running calculation will fit in a signed 32-bit integer.
 */

public class Problem11_BasicCalculator {
    public int calculate(String s) {
        int len = s.length();
        int sign = 1;
        int ans = 0;
        int currNo;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < len; i++) {
            if (Character.isDigit(s.charAt(i))) {
                currNo = s.charAt(i) - '0';

                while (i + 1 < len && Character.isDigit(s.charAt(i + 1))) {
                    currNo = currNo * 10 + s.charAt(i + 1) - '0';
                    i++;
                }
                currNo = currNo * sign;
                ans = ans + currNo;
            } else if (s.charAt(i) == '+') {
                sign = 1;
            } else if (s.charAt(i) == '-') {
                sign = -1;
            } else if (s.charAt(i) == '(') {
                stack.push(ans);
                stack.push(sign);
                ans = 0;
                sign = 1;
            } else if (s.charAt(i) == ')') {
                int prevSign = stack.pop();
                ans = ans * prevSign;
                int prevAns = stack.pop();
                ans = ans + prevAns;
            }
        }
        return ans;
    }
}
