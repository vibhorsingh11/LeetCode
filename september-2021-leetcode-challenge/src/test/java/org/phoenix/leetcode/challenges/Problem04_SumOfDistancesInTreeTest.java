package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Problem04_SumOfDistancesInTreeTest {

    private final Problem04_SumOfDistancesInTree test = new Problem04_SumOfDistancesInTree();

    @Test
    void sumOfDistancesInTree() {
        int n = 6;
        int[][] edges = new int[][]{
                {0, 1},
                {0, 2},
                {2, 3},
                {2, 4},
                {2, 5}
        };
        int[] expected = new int[]{8, 12, 6, 10, 10, 10};
        assertArrayEquals(expected, test.sumOfDistancesInTree(n, edges));
    }
}