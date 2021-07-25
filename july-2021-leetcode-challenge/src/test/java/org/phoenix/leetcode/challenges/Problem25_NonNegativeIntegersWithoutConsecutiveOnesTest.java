package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem25_NonNegativeIntegersWithoutConsecutiveOnesTest {

    private final Problem25_NonNegativeIntegersWithoutConsecutiveOnes test = new Problem25_NonNegativeIntegersWithoutConsecutiveOnes();

    @Test
    void findIntegers() {
        assertEquals(5, test.findIntegers(5));
    }
}