package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class Problem27_PossibleBipartitionTest {

    private final Problem27_PossibleBipartition test = new Problem27_PossibleBipartition();

    @Test
    void linkedList() {
        int[][] arr = new int[][]{{1, 2}, {1, 3}, {2, 4}};

        assertTrue(test.possibleBipartition(4, arr));
    }
}