package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem12_NumberOfStepsToReduceANumberToZeroTest {

    private final Problem12_NumberOfStepsToReduceANumberToZero test = new Problem12_NumberOfStepsToReduceANumberToZero();

    @Test
    void numberOfSteps() {
        assertEquals(6, test.numberOfSteps(14));
        assertEquals(12, test.numberOfSteps(123));
    }
}