/**
 * Given two sequences pushed and popped with distinct values, return true if and only if this could have been the result of a sequence of push and pop operations on an initially empty stack.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: pushed = [1,2,3,4,5], popped = [4,5,3,2,1]
 * Output: true
 * Explanation: We might do the following sequence:
 * push(1), push(2), push(3), push(4), pop() -> 4,
 * push(5), pop() -> 5, pop() -> 3, pop() -> 2, pop() -> 1
 * Constraints:
 * <p>
 * 0 <= pushed.length == popped.length <= 1000
 * 0 <= pushed[i], popped[i] < 1000
 * pushed is a permutation of popped.
 * pushed and popped have distinct values.
 */
package org.phoenix.leetcode.challenges;

import java.util.Stack;

public class Problem26_ValidateStackSequences {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        // Stack to store pushed elements
        Stack<Integer> stack = new Stack<>();
        int i = 0;
        // Looping over the pushed array
        for (int ele : pushed) {
            stack.push(ele);
            // Looping until stack is empty and
            // if not then check top element is same as popped element
            while (!stack.isEmpty() && stack.peek() == popped[i]) {
                stack.pop();
                i++;
            }
        }
        return stack.empty();
    }
}
