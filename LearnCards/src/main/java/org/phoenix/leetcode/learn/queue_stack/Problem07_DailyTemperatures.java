package org.phoenix.leetcode.learn.queue_stack;

/*
 * Given a list of daily temperatures T, return a list such that, for each day in the input,
 * tells you how many days you would have to wait until a warmer temperature.
 * If there is no future day for which this is possible, put 0 instead.
 * For example, given the list of temperatures T = [73, 74, 75, 71, 69, 72, 76, 73],
 * your output should be [1, 1, 4, 2, 1, 1, 0, 0].
 * Note: The length of temperatures will be in the range [1, 30000].
 * Each temperature will be an integer in the range [30, 100].
 */

import java.util.Stack;

public class Problem07_DailyTemperatures {

    public int[] dailyTemperatures(int[] T) {
        // result array
        int[] ans = new int[T.length];
        Stack<Integer> stack = new Stack();
        // looping over the array from the end
        for (int i = T.length - 1; i >= 0; --i) {
            // looping over stack till its empty & current value in T is greater than top value from stack
            while (!stack.isEmpty() && T[i] >= T[stack.peek()]) {
                stack.pop();
            }
            // add 0 in the end of array
            ans[i] = stack.isEmpty() ? 0 : stack.peek() - i;
            stack.push(i);
        }
        return ans;
    }
}
