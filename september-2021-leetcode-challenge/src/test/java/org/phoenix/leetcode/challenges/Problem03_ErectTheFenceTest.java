package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Problem03_ErectTheFenceTest {

    private final Problem03_ErectTheFence test = new Problem03_ErectTheFence();

    @Test
    void outerTrees() {
        int[][] points = new int[][]{
                {1, 2},
                {2, 2},
                {4, 2}
        };
        int[][] expected = new int[][]{
                {1, 2},
                {2, 2},
                {4, 2}
        };
        assertArrayEquals(expected, test.outerTrees(points));
    }
}