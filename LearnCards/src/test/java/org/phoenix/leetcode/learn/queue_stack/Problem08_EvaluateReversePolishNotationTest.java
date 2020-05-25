package org.phoenix.leetcode.learn.queue_stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem08_EvaluateReversePolishNotationTest {

    private final Problem08_EvaluateReversePolishNotation test = new Problem08_EvaluateReversePolishNotation();

    @Test
    void evalRPN() {
        String[] arr = new String[]{"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};

        assertEquals(22, test.evalRPN(arr));
    }
}