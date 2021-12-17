package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem17_MaximalSquareTest {

    private final Problem17_MaximalSquare test = new Problem17_MaximalSquare();

    @Test
    void maximalSquare() {
        char[][] matrix = new char[][]{{'1', '0', '1', '0', '0'}, {'1', '0', '1', '1', '1'}, {'1', '1', '1', '1', '1'}, {'1', '0', '0', '1', '0'}};
        assertEquals(4, test.maximalSquare(matrix));
    }
}