package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class Problem26_ValidateStackSequencesTest {

    private final Problem26_ValidateStackSequences test = new Problem26_ValidateStackSequences();

    @Test
    void validateStackSequences() {
        int[] pushed = new int[]{1, 2, 3, 4, 5};
        int[] popped = new int[]{4, 5, 3, 2, 1};

        assertTrue(test.validateStackSequences(pushed, popped));
    }
}