package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Problem25_RedundantConnectionTest {

    private final Problem25_RedundantConnection test = new Problem25_RedundantConnection();

    @Test
    void findRedundantConnection() {
        int[][] edges = new int[][]{
                {1, 2},
                {1, 3},
                {2, 3}
        };
        int[] expected = new int[]{2, 3};
        assertArrayEquals(expected, test.findRedundantConnection(edges));
    }
}