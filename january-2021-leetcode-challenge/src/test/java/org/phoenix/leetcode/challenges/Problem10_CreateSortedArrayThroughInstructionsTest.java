package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem10_CreateSortedArrayThroughInstructionsTest {

    private final Problem10_CreateSortedArrayThroughInstructions test = new Problem10_CreateSortedArrayThroughInstructions();

    @Test
    void createSortedArray() {
        int[] instructions = new int[]{1, 5, 6, 2};
        assertEquals(1, test.createSortedArray(instructions));
    }
}