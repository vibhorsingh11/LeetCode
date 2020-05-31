package org.phoenix.leetcode.challenges;

/*
 * Given a non-negative integer num represented as a string,
 * remove k digits from the number so that the new number is the smallest possible.
 * Note:
 * The length of num is less than 10002 and will be ≥ k.
 * The given num does not contain any leading zero.
 *
 * Example 1:
 * Input: num = "1432219", k = 3
 * Output: "1219"
 * Explanation: Remove the three digits 4, 3, and 2 to form the new number 1219 which is the smallest.
 */

import java.util.Stack;

public class Problem13_RemoveKDigits {
    public String removeKdigits(String num, int k) {
        int len = num.length();
        if (k == 0) return num;
        if (k == len) return "0";

        Stack<Character> stack = new Stack<>();
        int index = 0;

        while (index < len) {
            while (k > 0 && !stack.isEmpty() && stack.peek() > num.charAt(index)) {
                stack.pop();
                k--;
            }
            stack.push(num.charAt(index++));
        }
        while (k-- > 0) stack.pop();

        String smallest = "";
        while (!stack.isEmpty()) smallest = (stack.pop() + smallest);

        // delete leading zeros
        while (smallest.length() > 1 && smallest.charAt(0) == '0')
            smallest = smallest.substring(1);

        return smallest;
    }
}
