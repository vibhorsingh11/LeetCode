package org.phoenix.leetcode.challenges;

import java.util.LinkedList;
import java.util.Queue;

/**
 * <p>
 * You are given an m x n integer matrix grid where each cell is either 0 (empty) or 1 (obstacle).
 * You can move up, down, left, or right from and to an empty cell in one step.
 * <p>
 * Return the minimum number of steps to walk from the upper left corner (0, 0) to the lower right corner
 * (m - 1, n - 1) given that you can eliminate at most k obstacles.
 * <p>
 * If it is not possible to find such walk return -1.
 * <p>
 * Constraints:
 * <p>
 * m == grid.length
 * n == grid[i].length
 * 1 <= m, n <= 40
 * 1 <= k <= m * n
 * grid[i][j] == 0 or 1
 * grid[0][0] == grid[m - 1][n - 1] == 0
 */

public class Problem25_ShortestPathInAGridWithObstaclesElimination {
    public int shortestPath(int[][] grid, int k) {
        if (grid == null || grid.length == 0) {
            return 0;
        }
        int m = grid.length;
        int n = grid[0].length;
        int[][] directions = {
                {0, 1},
                {0, -1},
                {1, 0},
                {-1, 0}
        };
        int[][] minimumObstacles = new int[m][n];
        boolean[][] visited = new boolean[m][n];
        Queue<int[]> cells = new LinkedList<>();
        cells.add(new int[]{0, 0, grid[0][0]});
        minimumObstacles[0][0] = grid[0][0];
        int level = 1;
        while (!cells.isEmpty()) {
            int size = cells.size();
            for (int i = 0; i < size; i++) {
                int[] head = cells.poll();
                if (head != null) {

                    if (head[0] == m - 1 && head[1] == n - 1) {
                        return level - 1;
                    }
                    int currentObstacleCount = head[2];
                    for (int[] direction : directions) {
                        int x = head[0] + direction[0];
                        int y = head[1] + direction[1];
                        if (x < 0 || x >= m || y < 0 || y >= n) {
                            continue;
                        }
                        int oldObstacleCount = minimumObstacles[x][y];
                        int newObstacleCount = currentObstacleCount + grid[x][y];
                        if (!visited[x][y] && newObstacleCount <= k) {
                            cells.add(new int[]{x, y, newObstacleCount});
                            minimumObstacles[x][y] = newObstacleCount;
                            visited[x][y] = true;
                        }
                        if (oldObstacleCount > newObstacleCount && newObstacleCount <= k) {
                            cells.add(new int[]{x, y, newObstacleCount});
                            minimumObstacles[x][y] = newObstacleCount;
                            visited[x][y] = true;
                        }
                    }
                }
            }
            level++;
        }
        return -1;
    }
}
