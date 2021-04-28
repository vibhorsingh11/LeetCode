package org.phoenix.leetcode.challenges;

/**
 * A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).
 * <p>
 * The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).
 * <p>
 * Now consider if some obstacles are added to the grids. How many unique paths would there be?
 * <p>
 * An obstacle and space is marked as 1 and 0 respectively in the grid.
 * <p>
 * Example 1:
 * Input: obstacleGrid = [[0,0,0],[0,1,0],[0,0,0]]
 * Output: 2
 * Explanation: There is one obstacle in the middle of the 3x3 grid above.
 * There are two ways to reach the bottom-right corner:
 * 1. Right -> Right -> Down -> Down
 * 2. Down -> Down -> Right -> Right
 * Example 2:
 * Input: obstacleGrid = [[0,1],[0,0]]
 * Output: 1
 * <p>
 * Constraints:
 * m == obstacleGrid.length
 * n == obstacleGrid[i].length
 * 1 <= m, n <= 100
 * obstacleGrid[i][j] is 0 or 1.
 */

public class Problem28_UniquePathsII {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if (obstacleGrid == null || obstacleGrid.length == 0) {
            return 0;
        }
        int rows = obstacleGrid.length;
        int columns = obstacleGrid[0].length;
        int[][] paths = new int[rows][columns];
        if (obstacleGrid[0][0] == 0) {
            paths[0][0] = 1;
        }
        for (int i = 1; i < rows; i++) {
            if (obstacleGrid[i][0] == 0) {
                paths[i][0] = paths[i - 1][0];
            }
        }
        for (int j = 1; j < columns; j++) {
            if (obstacleGrid[0][j] == 0) {
                paths[0][j] = paths[0][j - 1];
            }
        }
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < columns; j++) {
                if (obstacleGrid[i][j] == 0) {
                    paths[i][j] = paths[i][j - 1] + paths[i - 1][j];
                }
            }
        }
        return paths[rows - 1][columns - 1];
    }
}
