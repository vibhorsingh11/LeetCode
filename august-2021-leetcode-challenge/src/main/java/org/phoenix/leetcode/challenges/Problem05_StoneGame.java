package org.phoenix.leetcode.challenges;

import java.util.Arrays;

/**
 * Alex and Lee play a game with piles of stones.  There are an even number of piles arranged in a row, and each pile has a positive integer number of stones piles[i].
 * <p>
 * The objective of the game is to end with the most stones.  The total number of stones is odd, so there are no ties.
 * <p>
 * Alex and Lee take turns, with Alex starting first.  Each turn, a player takes the entire pile of stones from either the beginning or the end of the row.  This continues until there are no more piles left, at which point the person with the most stones wins.
 * <p>
 * Assuming Alex and Lee play optimally, return True if and only if Alex wins the game.
 * Constraints:
 * <p>
 * 2 <= piles.length <= 500
 * piles.length is even.
 * 1 <= piles[i] <= 500
 * sum(piles) is odd.
 */

public class Problem05_StoneGame {
    public boolean stoneGame(int[] piles) {
        int[] dp = Arrays.copyOf(piles, piles.length);
        for (int d = 1; d < piles.length; d++)
            for (int i = 0; i < piles.length - d; i++)
                dp[i] = Math.max(piles[i] - dp[i + 1], piles[i + d] - dp[i]);
        return dp[0] > 0;
    }
}
