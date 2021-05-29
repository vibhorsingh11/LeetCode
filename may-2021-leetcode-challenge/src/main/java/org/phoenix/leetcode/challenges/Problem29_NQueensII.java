package org.phoenix.leetcode.challenges;

import java.util.HashSet;
import java.util.Set;

/**
 * The n-queens puzzle is the problem of placing n queens on an n x n chessboard such that no two queens attack each other.
 * <p>
 * Given an integer n, return the number of distinct solutions to the n-queens puzzle.
 * Constraints:
 * <p>
 * 1 <= n <= 9
 */

public class Problem29_NQueensII {
    private final Set<Integer> occupiedCols = new HashSet<>();
    private final Set<Integer> occupiedDiag1s = new HashSet<>();
    private final Set<Integer> occupiedDiag2s = new HashSet<>();

    public int totalNQueens(int n) {
        return totalNQueensHelper(0, 0, n);
    }

    private int totalNQueensHelper(int row, int count, int n) {
        for (int col = 0; col < n; col++) {
            if (occupiedCols.contains(col))
                continue;
            int diag1 = row - col;
            if (occupiedDiag1s.contains(diag1))
                continue;
            int diag2 = row + col;
            if (occupiedDiag2s.contains(diag2))
                continue;
            if (row == n - 1)
                count++;
            else {
                occupiedCols.add(col);
                occupiedDiag1s.add(diag1);
                occupiedDiag2s.add(diag2);
                count = totalNQueensHelper(row + 1, count, n);
                //firstrow , second row //recover
                occupiedCols.remove(col);
                occupiedDiag1s.remove(diag1);
                occupiedDiag2s.remove(diag2);
            }
        }

        return count;

    }
}
