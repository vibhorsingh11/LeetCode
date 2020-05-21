package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem21_CountSquareSubmatricesTest {

    private final Problem21_CountSquareSubmatrices test = new Problem21_CountSquareSubmatrices();

    @Test
    void countSquares() {
        int[][] matrix = new int[][]{{0, 1, 1, 1}, {1, 1, 1, 1}, {0, 1, 1, 1}};

        assertEquals(15, test.countSquares(matrix));
    }
}