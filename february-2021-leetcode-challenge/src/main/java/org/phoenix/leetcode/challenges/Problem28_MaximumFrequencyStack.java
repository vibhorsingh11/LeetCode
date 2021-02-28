/**
 * Implement FreqStack, a class which simulates the operation of a stack-like data structure.
 * <p>
 * FreqStack has two functions:
 * <p>
 * push(int x), which pushes an integer x onto the stack.
 * pop(), which removes and returns the most frequent element in the stack.
 * If there is a tie for most frequent element, the element closest to the top of the stack is removed and returned.
 * Example 1:
 * <p>
 * Input:
 * ["FreqStack","push","push","push","push","push","push","pop","pop","pop","pop"],
 * [[],[5],[7],[5],[7],[4],[5],[],[],[],[]]
 * Output: [null,null,null,null,null,null,null,5,7,5,4]
 * Explanation:
 * After making six .push operations, the stack is [5,7,5,7,4,5] from bottom to top.  Then:
 * <p>
 * pop() -> returns 5, as 5 is the most frequent.
 * The stack becomes [5,7,5,7,4].
 * <p>
 * pop() -> returns 7, as 5 and 7 is the most frequent, but 7 is closest to the top.
 * The stack becomes [5,7,5,4].
 * <p>
 * pop() -> returns 5.
 * The stack becomes [5,7,4].
 * <p>
 * pop() -> returns 4.
 * The stack becomes [5,7].
 * <p>
 * Note:
 * <p>
 * Calls to FreqStack.push(int x) will be such that 0 <= x <= 10^9.
 * It is guaranteed that FreqStack.pop() won't be called if the stack has zero elements.
 * The total number of FreqStack.push calls will not exceed 10000 in a single test case.
 * The total number of FreqStack.pop calls will not exceed 10000 in a single test case.
 * The total number of FreqStack.push and FreqStack.pop calls will not exceed 150000 across all test cases.
 */
package org.phoenix.leetcode.challenges;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Problem28_MaximumFrequencyStack {
    static class FreqStack {

        private final Map<Integer, Integer> count;
        private final Map<Integer, Stack<Integer>> countToStack;
        private int maxFrequency;

        public FreqStack() {
            maxFrequency = 0;
            count = new HashMap<>();
            countToStack = new HashMap<>();
        }

        public void push(int x) {
            count.put(x, count.getOrDefault(x, 0) + 1);
            maxFrequency = Math.max(maxFrequency, count.get(x));
            if (!countToStack.containsKey(count.get(x))) {
                countToStack.put(count.get(x), new Stack<>());
            }
            countToStack.get(count.get(x)).add(x);
        }

        public int pop() {
            int value = countToStack.get(maxFrequency).pop();
            count.put(value, count.get(value) - 1);
            if (countToStack.get(maxFrequency).isEmpty()) {
                --maxFrequency;
            }
            return value;
        }
    }
}
