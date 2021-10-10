package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem10_BitwiseANDOfNumbersRangeTest {

    private final Problem10_BitwiseANDOfNumbersRange test = new Problem10_BitwiseANDOfNumbersRange();

    @Test
    void rangeBitwiseAnd() {
        assertEquals(4, test.rangeBitwiseAnd(5, 7));
    }
}