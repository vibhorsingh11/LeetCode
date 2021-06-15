package org.phoenix.leetcode.challenges;

/**
 * You are given an integer array matchsticks where matchsticks[i] is the length of the ith matchstick. You want to use all the matchsticks to make one square. You should not break any stick, but you can link them up, and each matchstick must be used exactly one time.
 * <p>
 * Return true if you can make this square and false otherwise.
 * Constraints:
 * <p>
 * 1 <= matchsticks.length <= 15
 * 0 <= matchsticks[i] <= 109
 */

public class Problem15_MatchsticksToSquare {
    public boolean makesquare(int[] matchsticks) {
        // Base case
        if (matchsticks == null || matchsticks.length < 4) {
            return false;
        }
        // Sum of all matchsticks should be divisible by 4
        int sum = 0;
        for (int matchstick : matchsticks) {
            sum += matchstick;
        }
        if (sum % 4 != 0) {
            return false;
        }
        // DFS for all options
        return dfs(matchsticks, new int[4], 0, sum / 4);
    }

    private boolean dfs(int[] matchsticks, int[] sums, int index, int target) {
        // Base case
        if (index == matchsticks.length) {
            return sums[1] == target && sums[2] == target && sums[3] == target;
        }
        for (int i = 0; i < 4; i++) {
            if (sums[i] + matchsticks[index] > target) {
                continue;
            }
            sums[i] += matchsticks[index];
            if (dfs(matchsticks, sums, index + 1, target)) {
                return true;
            }
            sums[i] -= matchsticks[index];
        }
        return false;
    }
}
