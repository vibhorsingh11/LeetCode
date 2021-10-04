package org.phoenix.leetcode.challenges;

/**
 * You are given row x col grid representing a map where grid[i][j] = 1 represents land and grid[i][j] = 0 represents water.
 * <p>
 * Grid cells are connected horizontally/vertically (not diagonally). The grid is completely surrounded by water, and there is exactly one island (i.e., one or more connected land cells).
 * <p>
 * The island doesn't have "lakes", meaning the water inside isn't connected to the water around the island. One cell is a square with side length 1. The grid is rectangular, width and height don't exceed 100. Determine the perimeter of the island.
 * Constraints:
 * <p>
 * row == grid.length
 * col == grid[i].length
 * 1 <= row, col <= 100
 * grid[i][j] is 0 or 1.
 * There is exactly one island in grid.
 */

public class Problem04_IslandPerimeter {
    public int islandPerimeter(int[][] grid) {
        int result = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    result += 4;
                    if (i < grid.length - 1 && grid[i + 1][j] == 1) result -= 2;
                    if (j < grid[i].length - 1 && grid[i][j + 1] == 1) result -= 2;
                }
            }
        }
        return result;
    }
}
