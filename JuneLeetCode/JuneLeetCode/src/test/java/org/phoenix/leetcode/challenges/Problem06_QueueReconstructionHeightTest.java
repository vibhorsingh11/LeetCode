package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem06_QueueReconstructionHeightTest {

    private final Problem06_QueueReconstructionHeight test = new Problem06_QueueReconstructionHeight();

    @Test
    void reconstructQueue() {
        int[][] arr = new int[][]{{7, 0}, {4, 4}, {7, 1}, {5, 0}, {6, 1}, {5, 2}};
        int[][] expected = new int[][]{{5, 0}, {7, 0}, {5, 2}, {6, 1}, {4, 4}, {7, 1}};

        assertArrayEquals(expected, test.reconstructQueue(arr));
    }
}