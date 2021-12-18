package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem18_NumbersAtMostNGivenDigitSetTest {

    private final Problem18_NumbersAtMostNGivenDigitSet test = new Problem18_NumbersAtMostNGivenDigitSet();

    @Test
    void atMostNGivenDigitSet() {
        String[] digits = new String[]{"1","3","5","7"};
        assertEquals(20, test.atMostNGivenDigitSet(digits,100));
    }
}