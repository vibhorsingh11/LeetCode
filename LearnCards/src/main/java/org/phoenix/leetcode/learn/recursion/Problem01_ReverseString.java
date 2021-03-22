package org.phoenix.leetcode.learn.recursion;

public class Problem01_ReverseString {
    public char[] reverseString(char[] s) {
        // Calling helper method
        helper(s, 0, s.length - 1);
        return s;
    }

    public void helper(char[] s, int start, int end) {
        // If start and end are same then return
        if (start >= end) return;
        // Swapping of start and end values
        char temp = s[start];
        s[start] = s[end];
        s[end] = temp;
        // Calling function recursively
        helper(s, start + 1, end - 1);
    }
}
