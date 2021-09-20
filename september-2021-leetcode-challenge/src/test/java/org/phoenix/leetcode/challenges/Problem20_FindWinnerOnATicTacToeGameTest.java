package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem20_FindWinnerOnATicTacToeGameTest {

    private final Problem20_FindWinnerOnATicTacToeGame test = new Problem20_FindWinnerOnATicTacToeGame();

    @Test
    void tictactoe() {
        int[][] moves = new int[][]{{0, 0}, {2, 0}, {1, 1}, {2, 1}, {2, 2}};
        assertEquals("A", test.tictactoe(moves));
    }
}