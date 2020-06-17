package org.phoenix.leetcode.challenges;

/*
* Given a 2D board containing 'X' and 'O' (the letter O), capture all regions surrounded by 'X'.
*
* A region is captured by flipping all 'O's into 'X's in that surrounded region.
* Example:

X X X X
X O O X
X X O X
X O X X

* After running your function, the board should be:

X X X X
X X X X
X X X X
X O X X

* Explanation:
* Surrounded regions shouldn’t be on the border, which means that any 'O' on the border of the board are
* not flipped to 'X'. Any 'O' that is not on the border and it is not connected to an 'O' on the border
*  will be flipped to 'X'.Two cells are connected if they are adjacent cells connected horizontally
* or vertically.
*/

public class Problem17_SurroundedRegions {
    public char[][] solve(char[][] board) {
        if (board.length == 0 || board[0].length == 0)
            return board;

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
