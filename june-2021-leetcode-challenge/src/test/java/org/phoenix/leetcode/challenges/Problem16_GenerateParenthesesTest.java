package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem16_GenerateParenthesesTest {

    private final Problem16_GenerateParentheses test = new Problem16_GenerateParentheses();

    @Test
    void generateParenthesis() {
        List<String> expected = Arrays.asList("((()))", "(()())", "(())()", "()(())", "()()()");
        assertEquals(expected, test.generateParenthesis(3));
    }
}