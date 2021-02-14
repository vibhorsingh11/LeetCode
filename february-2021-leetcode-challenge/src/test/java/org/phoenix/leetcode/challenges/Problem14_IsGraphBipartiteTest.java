package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

class Problem14_IsGraphBipartiteTest {

    private final Problem14_IsGraphBipartite test = new Problem14_IsGraphBipartite();

    @Test
    void isBipartite() {
        int[][] graph = new int[][]{{1, 3}, {0, 2}, {1, 3}, {0, 2}};
        assertTrue(test.isBipartite(graph));

        graph = new int[][]{{1, 2, 3}, {0, 2}, {0, 1, 3}, {0, 2}};
        assertFalse(test.isBipartite(graph));
    }
}