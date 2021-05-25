package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem25_EvaluateReversePolishNotationTest {

    private final Problem25_EvaluateReversePolishNotation test = new Problem25_EvaluateReversePolishNotation();

    @Test
    void evalRPN() {
        String[] tokens = new String[]{"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
        assertEquals(22, test.evalRPN(tokens));
    }
}