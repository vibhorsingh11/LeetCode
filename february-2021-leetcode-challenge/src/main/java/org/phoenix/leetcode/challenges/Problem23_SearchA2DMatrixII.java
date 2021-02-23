/**
 * Write an efficient algorithm that searches for a target value in an m x n integer matrix. The matrix has the following properties:
 * <p>
 * Integers in each row are sorted in ascending from left to right.
 * Integers in each column are sorted in ascending from top to bottom.
 * Example 1:
 * Input: matrix = [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]], target = 5
 * Output: true
 * Constraints:
 * <p>
 * m == matrix.length
 * n == matrix[i].length
 * 1 <= n, m <= 300
 * -109 <= matix[i][j] <= 109
 * All the integers in each row are sorted in ascending order.
 * All the integers in each column are sorted in ascending order.
 * -109 <= target <= 109
 */
package org.phoenix.leetcode.challenges;

public class Problem23_SearchA2DMatrixII {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return false;

        int n = matrix.length, m = matrix[0].length;
        int i = 0, j = m - 1;

        while (i < n && j >= 0) {
            int num = matrix[i][j];

            if (num == target)
                return true;
            else if (num > target)
                j--;
            else
                i++;
        }

        return false;
    }
}
