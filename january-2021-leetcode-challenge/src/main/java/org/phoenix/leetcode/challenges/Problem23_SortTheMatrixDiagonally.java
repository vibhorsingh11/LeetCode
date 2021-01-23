/*
 * A matrix diagonal is a diagonal line of cells starting from some cell in either the topmost row or leftmost column
 * and going in the bottom-right direction until reaching the matrix's end. For example, the matrix diagonal starting from mat[2][0], where mat is a 6 x 3 matrix, includes cells mat[2][0], mat[3][1], and mat[4][2].
 * Given an m x n matrix mat of integers, sort each matrix diagonal in ascending order and return the resulting matrix.
 * Example 1:
 * Input: mat = [[3,3,1,1],[2,2,1,2],[1,1,1,2]]
 * Output: [[1,1,1,1],[1,2,2,2],[1,2,3,3]]
 */
package org.phoenix.leetcode.challenges;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem23_SortTheMatrixDiagonally {
    int[][] mat;
    int n, m;

    public void sortDiagonal(int i, int j) {
        List<Integer> diagonal = new ArrayList<>();

        while (i < n && j < m) {
            diagonal.add(mat[i][j]);
            ++i;
            ++j;
        }

        Collections.sort(diagonal);

        while (i > 0 && j > 0) {
            --i;
            --j;
            mat[i][j] = diagonal.remove(diagonal.size() - 1);
        }
    }

    public int[][] diagonalSort(int[][] mat) {
        this.mat = mat;
        n = mat.length;
        m = mat[0].length;

        for (int i = 0; i < n; ++i) {
            sortDiagonal(i, 0);
        }
        for (int j = 0; j < m; ++j) {
            sortDiagonal(0, j);
        }
        return mat;
    }
}
