package org.phoenix.leetcode.challenges;

/**
 * We have n chips, where the position of the ith chip is position[i].
 * <p>
 * We need to move all the chips to the same position. In one step, we can change the position of the ith chip from position[i] to:
 * <p>
 * position[i] + 2 or position[i] - 2 with cost = 0.
 * position[i] + 1 or position[i] - 1 with cost = 1.
 * Return the minimum cost needed to move all the chips to the same position.
 * Constraints:
 * <p>
 * 1 <= position.length <= 100
 * 1 <= position[i] <= 10^9
 */

public class Problem06_MinimumCostToMoveChipsToTheSamePosition {
    public int minCostToMoveChips(int[] position) {
        int even = 0;
        for (int i : position)
            if (i % 2 == 0)
                even++;
        return Math.min(even, position.length - even);
    }
}
