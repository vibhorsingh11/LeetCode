package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem26_TransformToChessboardTest {

    private final Problem26_TransformToChessboard test = new Problem26_TransformToChessboard();

    @Test
    void movesToChessboard() {
        int[][] board = new int[][]{{0, 1, 1, 0}, {0, 1, 1, 0}, {1, 0, 0, 1}, {1, 0, 0, 1}};
        assertEquals(2, test.movesToChessboard(board));
    }
}