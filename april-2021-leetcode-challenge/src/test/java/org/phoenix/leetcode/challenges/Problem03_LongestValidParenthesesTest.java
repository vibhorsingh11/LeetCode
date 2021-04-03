package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem03_LongestValidParenthesesTest {

    private final Problem03_LongestValidParentheses test = new Problem03_LongestValidParentheses();

    @Test
    void longestValidParentheses() {
        assertEquals(2, test.longestValidParentheses("(()"));
    }
}