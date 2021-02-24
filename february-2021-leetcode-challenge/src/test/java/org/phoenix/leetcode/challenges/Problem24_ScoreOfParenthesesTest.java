package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem24_ScoreOfParenthesesTest {

    private final Problem24_ScoreOfParentheses test = new Problem24_ScoreOfParentheses();

    @Test
    void scoreOfParentheses() {
        assertEquals(1, test.scoreOfParentheses("()"));
    }
}