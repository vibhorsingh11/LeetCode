package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Problem25_RotateImageTest {

    private final Problem25_RotateImage test = new Problem25_RotateImage();

    @Test
    void rotate() {
        int[][] matrix = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] resMatrix = new int[][]{{7, 4, 1}, {8, 5, 2}, {9, 6, 3}};
        assertArrayEquals(resMatrix, test.rotate(matrix));
    }
}