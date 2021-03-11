package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem11_CoinChangeTest {

    private final Problem11_CoinChange test = new Problem11_CoinChange();

    @Test
    void coinChange() {
        int[] coins = new int[]{1, 2, 5};
        int amount = 11;

        assertEquals(3, test.coinChange(coins, amount));
    }
}