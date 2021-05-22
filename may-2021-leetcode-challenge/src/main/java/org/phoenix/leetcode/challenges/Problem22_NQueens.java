package org.phoenix.leetcode.challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * The n-queens puzzle is the problem of placing n queens on an n x n chessboard such that no two queens attack each other.
 * <p>
 * Given an integer n, return all distinct solutions to the n-queens puzzle.
 * <p>
 * Each solution contains a distinct board configuration of the n-queens' placement, where 'Q' and '.' both indicate a queen and an empty space, respectively.
 * Constraints:
 * <p>
 * 1 <= n <= 9
 */

public class Problem22_NQueens {
    public List<List<String>> solveNQueens(int n) {
        // Result list
        List<List<String>> resultList = new ArrayList<>();
        // Base case
        if (n < 1) {
            return resultList;
        }
        // Chess board for the queen position
        char[][] board = new char[n][n];
        Arrays.stream(board).forEach(a -> Arrays.fill(a, '.'));
        //Dfs for each cell position
        dfs(board, 0, resultList);
        return resultList;
    }

    private void dfs(char[][] board, int columnIndex, List<List<String>> resultList) {
        if (columnIndex == board.length) {
            resultList.add(construct(board));
            return;
        }
        // Check for every row
        for (int i = 0; i < board.length; i++) {
            // Check if we can place the queen
            if (validate(board, i, columnIndex)) {
                board[i][columnIndex] = 'Q';
                dfs(board, columnIndex + 1, resultList);
                board[i][columnIndex] = '.';
            }
        }
    }

    private boolean validate(char[][] board, int row, int column) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < column; j++) {
                if (board[i][j] == 'Q' && (row + j == column + i || row + column == i + j || row == i)) {
                    return false;
                }
            }
        }
        return true;
    }

    private List<String> construct(char[][] board) {
        List<String> currentRow = new ArrayList<>();
        for (char[] chars : board) {
            currentRow.add(new String(chars));
        }
        return currentRow;
    }
}
