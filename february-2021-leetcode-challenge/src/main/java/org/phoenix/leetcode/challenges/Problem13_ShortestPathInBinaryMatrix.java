package org.phoenix.leetcode.challenges;

import java.util.LinkedList;
import java.util.Queue;

public class Problem13_ShortestPathInBinaryMatrix {
    public int shortestPathBinaryMatrix(int[][] grid) {
        // length of rows and columns
        int rows = grid.length;
        int columns = grid[0].length;
        // edge case
        if (grid[0][0] == 1 || grid[rows - 1][columns - 1] == 1) {
            return -1;
        }
        // 8 directions in which we have check
        int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}, {1, -1}, {-1, 1}, {-1, -1}, {1, 1}};
        // array to keep track of visited cells of matrix
        boolean[][] visited = new boolean[rows][columns];
        // starting point
        visited[0][0] = true;
        // Queue to store coordinates of the cells
        Queue<int[]> coordinates = new LinkedList<>();
        // Add the first cell to the queue
        coordinates.add(new int[]{0, 0});
        // shortest path
        int shortestPath = 0;
        // looping until queue is empty
        while (!coordinates.isEmpty()) {
            // size of queue
            int size = coordinates.size();
            // storing all cells in queue
            for (int i = 0; i < size; i++) {
                // current coordinate from queue
                int[] current = coordinates.remove();
                // checking if bottom right corner is reached
                if (current[0] == rows - 1 && current[1] == columns - 1) {
                    return shortestPath + 1;
                }
                // check in all directions
                for (int j = 0; j < 8; j++) {
                    int nextX = directions[j][0] + current[0];
                    int nextY = directions[j][1] + current[1];
                    if (nextX >= 0 && nextX < rows && nextY >= 0 && nextY < columns
                            && !visited[nextX][nextY] && grid[nextX][nextY] == 0) {
                        coordinates.add(new int[]{nextX, nextY});
                        visited[nextX][nextY] = true;
                    }
                }
            }
            shortestPath++;
        }
        return -1;
    }
}
