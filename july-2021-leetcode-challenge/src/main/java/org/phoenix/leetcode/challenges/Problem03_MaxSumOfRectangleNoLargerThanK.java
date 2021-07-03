package org.phoenix.leetcode.challenges;

import java.util.TreeSet;

/**
 * Given an m x n matrix matrix and an integer k, return the max sum of a rectangle in the matrix such that its sum is no larger than k.
 * <p>
 * It is guaranteed that there will be a rectangle with a sum no larger than k.
 * Constraints:
 * <p>
 * m == matrix.length
 * n == matrix[i].length
 * 1 <= m, n <= 100
 * -100 <= matrix[i][j] <= 100
 * -105 <= k <= 105
 * <p>
 * <p>
 * Follow up: What if the number of rows is much larger than the number of columns?
 */

public class Problem03_MaxSumOfRectangleNoLargerThanK {
    public int maxSumSubmatrix(int[][] matrix, int k) {
        if (matrix == null || matrix.length == 0) {
            return 0;
        }
        int rows = matrix.length;
        int columns = matrix[0].length;
        int m = Math.max(rows, columns);
        int n = Math.min(rows, columns);
        boolean isRowLarger = rows > columns;
        int sum = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int[] columnSum = new int[m];
            for (int j = i; j >= 0; j--) {
                for (int l = 0; l < m; l++) {
                    columnSum[l] += isRowLarger ? matrix[l][j] : matrix[j][l];
                }
                sum = Math.max(sum, getLargestSumClosestToK(columnSum, k));
            }
        }
        return sum;
    }

    private int getLargestSumClosestToK(int[] nums, int k) {
        int sum = 0;
        TreeSet<Integer> set = new TreeSet<>();
        int result = Integer.MIN_VALUE;
        set.add(0);
        for (int num : nums) {
            sum += num;
            Integer ceiling = set.ceiling(sum - k);
            if (ceiling != null) {
                result = Math.max(result, sum - ceiling);
            }
            set.add(sum);
        }
        return result;
    }
}
