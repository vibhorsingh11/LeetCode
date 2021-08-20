package org.phoenix.leetcode.challenges;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:
 * <p>
 * Each row must contain the digits 1-9 without repetition.
 * Each column must contain the digits 1-9 without repetition.
 * Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.
 * Note:
 * <p>
 * A Sudoku board (partially filled) could be valid but is not necessarily solvable.
 * Only the filled cells need to be validated according to the mentioned rules.
 * Constraints:
 * <p>
 * board.length == 9
 * board[i].length == 9
 * board[i][j] is a digit or '.'.
 */

public class Problem20_ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        if (board == null || board.length < 9) {
            return false;
        }
        Set<String> seen = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char c = board[i][j];
                if (c != '.') {
                    if (!seen.add(c + " present in row " + i)
                            || !seen.add(c + " present in column " + j)
                            || !seen.add(c + " present in sub-box " + (i / 3) + " - " + (j / 3))) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
