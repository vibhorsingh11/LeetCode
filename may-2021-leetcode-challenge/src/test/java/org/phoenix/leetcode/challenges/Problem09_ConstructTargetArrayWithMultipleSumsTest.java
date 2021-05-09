package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

class Problem09_ConstructTargetArrayWithMultipleSumsTest {

    private final Problem09_ConstructTargetArrayWithMultipleSums test = new Problem09_ConstructTargetArrayWithMultipleSums();

    @Test
    void isPossible() {
        int[] target = new int[]{9, 3, 5};
        assertTrue(test.isPossible(target));

        int[] target1 = new int[]{1, 1, 1, 2};
        assertFalse(test.isPossible(target1));
    }
}