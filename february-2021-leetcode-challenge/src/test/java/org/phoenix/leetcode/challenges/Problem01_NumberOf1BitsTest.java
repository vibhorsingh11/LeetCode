package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem01_NumberOf1BitsTest {

    private final Problem01_NumberOf1Bits test = new Problem01_NumberOf1Bits();

    @Test
    void hammingWeight() {
        assertEquals(3, test.hammingWeight(521));
    }
}