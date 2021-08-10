package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem10_FlipStringToMonotoneIncreasingTest {

    private final Problem10_FlipStringToMonotoneIncreasing test = new Problem10_FlipStringToMonotoneIncreasing();

    @Test
    void minFlipsMonoIncr() {
        assertEquals(1, test.minFlipsMonoIncr("00110"));
    }
}