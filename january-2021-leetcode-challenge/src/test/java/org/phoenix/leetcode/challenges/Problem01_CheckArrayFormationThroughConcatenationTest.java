package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class Problem01_CheckArrayFormationThroughConcatenationTest {

    private final Problem01_CheckArrayFormationThroughConcatenation test = new Problem01_CheckArrayFormationThroughConcatenation();

    @Test
    void canFormArray() {
        int[] arr = new int[]{15, 88};
        int[][] pieces = new int[][]{{88}, {15}};
        assertTrue(test.canFormArray(arr, pieces));
    }
}