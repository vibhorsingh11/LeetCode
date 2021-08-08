package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Problem08_RankTransformOfAMatrixTest {

    private final Problem08_RankTransformOfAMatrix test = new Problem08_RankTransformOfAMatrix();

    @Test
    void matrixRankTransform() {
        int[][] matrix = new int[][]{
                {1, 2},
                {3, 4}
        };
        int[][] expected = new int[][]{
                {1, 2},
                {2, 3}
        };
        assertArrayEquals(expected, test.matrixRankTransform(matrix));
    }
}