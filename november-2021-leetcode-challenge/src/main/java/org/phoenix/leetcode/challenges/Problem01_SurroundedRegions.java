package org.phoenix.leetcode.challenges;

/**
 * Given an m x n matrix board containing 'X' and 'O', capture all regions that are 4-directionally surrounded by 'X'.
 * <p>
 * A region is captured by flipping all 'O's into 'X's in that surrounded region.
 * Constraints:
 * <p>
 * m == board.length
 * n == board[i].length
 * 1 <= m, n <= 200
 * board[i][j] is 'X' or 'O'.
 */

public class Problem01_SurroundedRegions {
    public char[][] solve(char[][] board) {
        if (board.length == 0 || board[0].length == 0)
            return new char[0][0];

        int rows = board.length;
        int columns = board[0].length;
        for (int i = 0; i < rows; i++) {
            if (board[i][0] == 'O') {
                boardDFS(board, i, 0);
            }
            if (board[i][columns - 1] == 'O') {
                boardDFS(board, i, columns - 1);
            }
        }

        for (int j = 0; j < columns; j++) {
            if (board[0][j] == 'O') boardDFS(board, 0, j);
            if (board[rows - 1][j] == 'O') boardDFS(board, rows - 1, j);
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (board[i][j] == 'O') {
                    board[i][j] = 'X';
                } else if (board[i][j] == '*') {
                    board[i][j] = 'O';
                }
            }
        }
        return board;
    }


    public void boardDFS(char[][] board, int i, int j) {
        if (i > board.length - 1 || i < 0 || j > board[0].length || j < 0) return;

        if (board[i][j] == 'O') board[i][j] = '*';
        if (i > 0 && board[i - 1][j] == 'O') {
            boardDFS(board, i - 1, j);
        }
        if (i < board.length - 1 && board[i + 1][j] == 'O') {
            boardDFS(board, i + 1, j);
        }

        if (j > 0 && board[i][j - 1] == 'O') {
            boardDFS(board, i, j - 1);
        }
        if (j < board[0].length - 1 && board[i][j + 1] == 'O') {
            boardDFS(board, i, j + 1);
        }
    }
}
