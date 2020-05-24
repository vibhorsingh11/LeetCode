package org.phoenix.leetcode.learn.queue_stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem06_ValidParenthesesTest {

    private final Problem06_ValidParentheses test = new Problem06_ValidParentheses();

    @Test
    void isValid() {
        assertTrue(test.isValid("()"));
        assertFalse(test.isValid("([)]"));
    }
}