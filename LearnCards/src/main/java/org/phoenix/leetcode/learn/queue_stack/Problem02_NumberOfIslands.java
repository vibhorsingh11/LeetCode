package org.phoenix.leetcode.learn.queue_stack;

/*
* Given a 2d grid map of '1's (land) and '0's (water), count the number of islands.
* An island is surrounded by water and is formed by connecting adjacent lands
* horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.
*
* Example 1:
* Input:
11110
11010
11000
00000
*
* Output: 1
*
* Example 2:
* Input:
11000
11000
00100
00011
*
* Output: 3
* */

public class Problem02_NumberOfIslands {
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }
        // Number of islands counter
        int count = 0;
        // Loop through the entire grid
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                // If we encounter '1', it means we have an island
                if (grid[i][j] == '1') {
                    count += dfs(grid, i, j);
                }
            }
        }
        return count;
    }

    public int dfs(char[][] grid, int i, int j) {
        // Base condition
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || grid[i][j] == '0') {
            return 0;
        }
        // Lets sink this island
        grid[i][j] = '0';
        // Recursive calls to the neighbors horizontally and vertically
        dfs(grid, i + 1, j);
        dfs(grid, i - 1, j);
        dfs(grid, i, j + 1);
        dfs(grid, i, j - 1);
        return 1;
    }
}
