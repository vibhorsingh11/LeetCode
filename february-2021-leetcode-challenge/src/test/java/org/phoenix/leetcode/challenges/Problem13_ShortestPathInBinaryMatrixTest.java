package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem13_ShortestPathInBinaryMatrixTest {

    private final Problem13_ShortestPathInBinaryMatrix test = new Problem13_ShortestPathInBinaryMatrix();

    @Test
    void shortestPathBinaryMatrix() {
        int[][] arr = new int[][]{{0, 1}, {1, 0}};
        assertEquals(2, test.shortestPathBinaryMatrix(arr));

        int[][] newArray = new int[][]{{0, 0, 0}, {1, 1, 0}, {1, 1, 0}};
        assertEquals(4, test.shortestPathBinaryMatrix(newArray));
    }
}