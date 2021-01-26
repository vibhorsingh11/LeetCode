/*
 * You are a hiker preparing for an upcoming hike. You are given heights, a 2D array of size rows x columns,
 * where heights[row][col] represents the height of cell (row, col). You are situated in the top-left cell, (0, 0), and you hope to travel to the bottom-right cell, (rows-1, columns-1) (i.e., 0-indexed). You can move up, down, left, or right, and you wish to find a route that requires the minimum effort.
 * A route's effort is the maximum absolute difference in heights between two consecutive cells of the route.
 * Return the minimum effort required to travel from the top-left cell to the bottom-right cell.
 *
 * Example 1:
 * Input: heights = [[1,2,2],[3,8,2],[5,3,5]]
 * Output: 2
 * Explanation: The route of [1,3,5,3,5] has a maximum absolute difference of 2 in consecutive cells.
 * This is better than the route of [1,2,2,2,5], where the maximum absolute difference is 3.
 */
package org.phoenix.leetcode.challenges;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Problem26_PathWithMinimumEffort {
    public int minimumEffortPath(int[][] heights) {
        int m = heights.length;
        int n = heights[0].length;
        int[][] dir = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int[][] diffMatrix = new int[m][n];
        boolean[][] visited = new boolean[m][n];

        for (int[] dfm : diffMatrix)
            Arrays.fill(dfm, Integer.MAX_VALUE);

        diffMatrix[0][0] = 0;
        int[] startNode = {0, 0, 0};

        Queue<int[]> queue = new PriorityQueue<>(Comparator.comparingInt(a -> a[2]));
        queue.add(startNode);

        while (!queue.isEmpty()) {

            int[] currNode = queue.poll();
            int currX = currNode[0];
            int currY = currNode[1];
            visited[currX][currY] = true;
            if (currX == m - 1 && currY == n - 1) return currNode[2];

            for (int[] d : dir) {

                int nextX = currNode[0] + d[0];
                int nextY = currNode[1] + d[1];

                if (nextX >= 0 && nextX < m && nextY >= 0 && nextY < n && !visited[nextX][nextY]) {

                    int currDiff = Math.abs(heights[currX][currY] - heights[nextX][nextY]);
                    int maxDiffInCurrPath = Math.max(currDiff, diffMatrix[currX][currY]);

                    if (maxDiffInCurrPath < diffMatrix[nextX][nextY]) {
                        diffMatrix[nextX][nextY] = maxDiffInCurrPath;
                        queue.add(new int[]{nextX, nextY, maxDiffInCurrPath});
                    }
                }
            }
        }
        return -1;

    }
}
