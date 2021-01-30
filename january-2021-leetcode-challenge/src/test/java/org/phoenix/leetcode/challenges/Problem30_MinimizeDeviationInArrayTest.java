package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem30_MinimizeDeviationInArrayTest {

    private final Problem30_MinimizeDeviationInArray test = new Problem30_MinimizeDeviationInArray();

    @Test
    void minimumDeviation() {
        int[] arr = new int[]{1, 2, 3, 4};

        assertEquals(1, test.minimumDeviation(arr));
    }
}