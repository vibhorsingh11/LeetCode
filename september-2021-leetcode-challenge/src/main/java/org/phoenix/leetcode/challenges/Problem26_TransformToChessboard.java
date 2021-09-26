package org.phoenix.leetcode.challenges;

/**
 * You are given an n x n binary grid board. In each move, you can swap any two rows with each other, or any two columns with each other.
 * <p>
 * Return the minimum number of moves to transform the board into a chessboard board. If the task is impossible, return -1.
 * <p>
 * A chessboard board is a board where no 0's and no 1's are 4-directionally adjacent.
 * Constraints:
 * <p>
 * n == board.length
 * n == board[i].length
 * 2 <= n <= 30
 * board[i][j] is either 0 or 1.
 */

public class Problem26_TransformToChessboard {
    public int movesToChessboard(int[][] board) {
        int N = board.length, rowSum = 0, colSum = 0, rowSwap = 0, colSwap = 0;
        for (int[] ints : board)
            for (int j = 0; j < N; ++j)
                if ((board[0][0] ^ ints[0] ^ board[0][j] ^ ints[j]) == 1) return -1;
        for (int i = 0; i < N; ++i) {
            rowSum += board[0][i];
            colSum += board[i][0];
            if (board[i][0] == i % 2) rowSwap++;
            if (board[0][i] == i % 2) colSwap++;
        }
        if (rowSum != N / 2 && rowSum != (N + 1) / 2) return -1;
        if (colSum != N / 2 && colSum != (N + 1) / 2) return -1;
        if (N % 2 == 1) {
            if (colSwap % 2 == 1) colSwap = N - colSwap;
            if (rowSwap % 2 == 1) rowSwap = N - rowSwap;
        } else {
            colSwap = Math.min(N - colSwap, colSwap);
            rowSwap = Math.min(N - rowSwap, rowSwap);
        }
        return (colSwap + rowSwap) / 2;
    }
}
