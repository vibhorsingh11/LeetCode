package org.phoenix.leetcode.challenges;

/**
 * The demons had captured the princess and imprisoned her in the bottom-right corner of a dungeon. The dungeon consists of m x n rooms laid out in a 2D grid. Our valiant knight was initially positioned in the top-left room and must fight his way through dungeon to rescue the princess.
 * <p>
 * The knight has an initial health point represented by a positive integer. If at any point his health point drops to 0 or below, he dies immediately.
 * <p>
 * Some of the rooms are guarded by demons (represented by negative integers), so the knight loses health upon entering these rooms; other rooms are either empty (represented as 0) or contain magic orbs that increase the knight's health (represented by positive integers).
 * <p>
 * To reach the princess as quickly as possible, the knight decides to move only rightward or downward in each step.
 * <p>
 * Return the knight's minimum initial health so that he can rescue the princess.
 * <p>
 * Note that any room can contain threats or power-ups, even the first room the knight enters and the bottom-right room where the princess is imprisoned.
 * Constraints:
 * <p>
 * m == dungeon.length
 * n == dungeon[i].length
 * 1 <= m, n <= 200
 * -1000 <= dungeon[i][j] <= 1000
 */

public class Problem02_DungeonGame {
    public int calculateMinimumHP(int[][] dungeon) {
        // Rows and columns
        int rows = dungeon.length;
        int columns = dungeon[0].length;
        // DP matrix
        int[][] dp = new int[rows][columns];
        // For the bottom right value
        dp[rows - 1][columns - 1] = dungeon[rows - 1][columns - 1] > 0 ? 1 : 1 - dungeon[rows - 1][columns - 1];
        // Loop for the remaining bottom most and right most cells
        for (int i = rows - 2; i >= 0; i--) {
            dp[i][columns - 1] = Math.max(1, dp[i + 1][columns - 1] - dungeon[i][columns - 1]);
        }
        for (int j = columns - 2; j >= 0; j--) {
            dp[rows - 1][j] = Math.max(1, dp[rows - 1][j + 1] - dungeon[rows - 1][j]);
        }
        // Loop for remaining cells
        for (int i = rows - 2; i >= 0; i--) {
            for (int j = columns - 2; j >= 0; j--) {
                dp[i][j] = Math.max(1, Math.min(dp[i + 1][j], dp[i][j + 1]) - dungeon[i][j]);
            }
        }
        return dp[0][0];
    }
}
