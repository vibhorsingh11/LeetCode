package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem18_ExpressionAddOperatorsTest {

    private final Problem18_ExpressionAddOperators test = new Problem18_ExpressionAddOperators();

    @Test
    void addOperators() {
        String num = "123";
        int target = 6;
        List<String> expected = Arrays.asList("1*2*3", "1+2+3");
        assertEquals(expected, test.addOperators(num, target));
    }
}