package org.phoenix.leetcode.challenges;

/**
 * Tic-tac-toe is played by two players A and B on a 3 x 3 grid.
 * <p>
 * Here are the rules of Tic-Tac-Toe:
 * <p>
 * Players take turns placing characters into empty squares (" ").
 * The first player A always places "X" characters, while the second player B always places "O" characters.
 * "X" and "O" characters are always placed into empty squares, never on filled ones.
 * The game ends when there are 3 of the same (non-empty) character filling any row, column, or diagonal.
 * The game also ends if all squares are non-empty.
 * No more moves can be played if the game is over.
 * Given an array moves where each element is another array of size 2 corresponding to the row and column of the grid where they mark their respective character in the order in which A and B play.
 * <p>
 * Return the winner of the game if it exists (A or B), in case the game ends in a draw return "Draw", if there are still movements to play return "Pending".
 * <p>
 * You can assume that moves is valid (It follows the rules of Tic-Tac-Toe), the grid is initially empty and A will play first.
 * Constraints:
 * <p>
 * 1 <= moves.length <= 9
 * moves[i].length == 2
 * 0 <= moves[i][j] <= 2
 * There are no repeated elements on moves.
 * moves follow the rules of tic tac toe.
 */

public class Problem20_FindWinnerOnATicTacToeGame {
    public String tictactoe(int[][] moves) {
        int n = moves.length;
        if (n < 5) {
            return "Pending";
        } else if (n < 9) {
            if (wonByLastMove(moves)) {
                return n % 2 == 1 ? "A" : "B";
            } else {
                return "Pending";
            }
        }
        return wonByLastMove(moves) ? "A" : "Draw";
    }

    private boolean wonByLastMove(int[][] moves) {
        int[] lastMove = moves[moves.length-1];
        int row = 1, col = 1, diag = 1, revDiag = 1;

        for (int i = moves.length-3; i >= 0; i -= 2) {
            int[] curr = moves[i];
            if (curr[0] == lastMove[0]) row++;
            if (curr[1] == lastMove[1]) col++;
            if (curr[0] == curr[1] && lastMove[0] == lastMove[1]) diag++;
            if (curr[0] + curr[1] == 2 && lastMove[0] + lastMove[1] == 2) revDiag++;
        }
        return row == 3 || col == 3 || diag == 3 || revDiag == 3;
    }
}
