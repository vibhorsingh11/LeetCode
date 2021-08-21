package org.phoenix.leetcode.challenges;

/**
 * <p>
 * Write a program to solve a Sudoku puzzle by filling the empty cells.
 * <p>
 * A sudoku solution must satisfy all-of-the following rules:
 * <p>
 * Each of the digits 1-9 must occur exactly once in each row.
 * Each of the digits 1-9 must occur exactly once in each column.
 * Each of the digits 1-9 must occur exactly once in each of the 9 3x3 sub-boxes of the grid.
 * The '.' character indicates empty cells.
 * <p>
 * Constraints:
 * <p>
 * board.length == 9
 * board[i].length == 9
 * board[i][j] is a digit or '.'.
 * It is guaranteed that the input board has only one solution.
 */

public class Problem21_SudokuSolver {
    public char[][] solveSudoku(char[][] board) {
        solveSudokuHelper(board, 0, 0);
        return board;
    }

    private boolean solveSudokuHelper(char[][] board, int row, int column) {
        if (row == 9) {
            return true;
        }
        int nextRow;
        int nextColumn;
        if (column == 8) {
            nextRow = row + 1;
            nextColumn = 0;
        } else {
            nextRow = row;
            nextColumn = column + 1;
        }
        if (board[row][column] != '.') {
            return solveSudokuHelper(board, nextRow, nextColumn);
        } else {
            for (char value = '1'; value <= '9'; value++) {
                if (isValidEntry(board, row, column, value)) {
                    board[row][column] = value;
                    if (solveSudokuHelper(board, nextRow, nextColumn)) {
                        return true;
                    }
                    board[row][column] = '.';
                }
            }
        }
        return false;
    }

    private boolean isValidEntry(char[][] board, int row, int column, char value) {
        for (int j = 0; j < 9; j++) {
            if (board[row][j] == value) {
                return false;
            }
        }
        for (int i = 0; i < 9; i++) {
            if (board[i][column] == value) {
                return false;
            }
        }
        int x = row / 3 * 3;
        int y = column / 3 * 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i + x][j + y] == value) {
                    return false;
                }
            }
        }
        return true;
    }
}
