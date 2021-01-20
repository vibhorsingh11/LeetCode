package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class Problem20_ValidParenthesesTest {

    private final Problem20_ValidParentheses test = new Problem20_ValidParentheses();

    @Test
    void isValid() {
        assertTrue(test.isValid("()[]{}"));
    }
}