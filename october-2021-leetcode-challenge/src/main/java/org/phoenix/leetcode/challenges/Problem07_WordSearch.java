package org.phoenix.leetcode.challenges;

/**
 * Given an m x n grid of characters board and a string word, return true if word exists in the grid.
 * <p>
 * The word can be constructed from letters of sequentially adjacent cells, where adjacent cells are horizontally or vertically neighboring. The same letter cell may not be used more than once.
 * Constraints:
 * <p>
 * m == board.length
 * n = board[i].length
 * 1 <= m, n <= 6
 * 1 <= word.length <= 15
 * board and word consists of only lowercase and uppercase English letters.
 */

public class Problem07_WordSearch {
    private boolean[][] visited;

    public boolean exist(char[][] board, String word) {
        // Lengths of rows and columns
        int rows = board.length;
        int columns = board[0].length;
        // Initialize the visited array
        visited = new boolean[rows][columns];
        // Loop for the board
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (word.charAt(0) == board[i][j] && searchWord(i, j, 0, word, board)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean searchWord(int i, int j, int index, String word, char[][] board) {
        if (index == word.length()) {
            return true;
        }
        if (i < 0 || i >= board.length
                || j < 0 || j >= board[0].length
                || word.charAt(index) != board[i][j]
                || visited[i][j]) {
            return false;
        }
        visited[i][j] = true;
        if (searchWord(i + 1, j, index + 1, word, board) ||
                searchWord(i - 1, j, index + 1, word, board) ||
                searchWord(i, j + 1, index + 1, word, board) ||
                searchWord(i, j - 1, index + 1, word, board)) {
            return true;
        }
        visited[i][j] = false;
        return false;
    }
}
