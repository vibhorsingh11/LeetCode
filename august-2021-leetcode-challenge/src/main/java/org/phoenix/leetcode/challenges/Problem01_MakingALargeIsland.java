package org.phoenix.leetcode.challenges;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * <p>
 * You are given an n x n binary matrix grid. You are allowed to change at most one 0 to be 1.
 * <p>
 * Return the size of the largest island in grid after applying this operation.
 * <p>
 * An island is a 4-directionally connected group of 1s.
 * <p>
 * Constraints:
 * <p>
 * n == grid.length
 * n == grid[i].length
 * 1 <= n <= 500
 * grid[i][j] is either 0 or 1.
 */

public class Problem01_MakingALargeIsland {
    public int largestIsland(int[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }
        int n = grid.length;
        Map<Integer, Integer> gridMap = new HashMap<>();
        gridMap.put(0, 0);
        int gridId = 2;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int area = getArea(grid, i, j, gridId);
                gridMap.put(gridId, area);
                gridId++;
            }
        }
        int finalArea = gridMap.getOrDefault(2, 0);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 0) {
                    Set<Integer> visited = new HashSet<>();
                    visited.add(i > 0 ? grid[i - 1][j] : 0);
                    visited.add(i < n - 1 ? grid[i + 1][j] : 0);
                    visited.add(j > 0 ? grid[i][j - 1] : 0);
                    visited.add(j < n - 1 ? grid[i][j + 1] : 0);
                    int area = 1;
                    for (Integer id : visited) {
                        area += gridMap.get(id);
                    }
                    finalArea = Math.max(finalArea, area);
                }
            }
        }
        return finalArea;
    }

    private int getArea(int[][] grid, int i, int j, int gridId) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid.length || grid[i][j] != 1) {
            return 0;
        }
        grid[i][j] = gridId;
        return 1 + getArea(grid, i + 1, j, gridId)
                + getArea(grid, i, j + 1, gridId)
                + getArea(grid, i - 1, j, gridId)
                + getArea(grid, i, j - 1, gridId);
    }
}
