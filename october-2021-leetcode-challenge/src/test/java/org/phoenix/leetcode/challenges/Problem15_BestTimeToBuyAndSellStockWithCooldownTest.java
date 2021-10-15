package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem15_BestTimeToBuyAndSellStockWithCooldownTest {

    private final Problem15_BestTimeToBuyAndSellStockWithCooldown test = new Problem15_BestTimeToBuyAndSellStockWithCooldown();

    @Test
    void maxProfit() {
        int[] prices = new int[]{1, 2, 3, 0, 2};
        assertEquals(3, test.maxProfit(prices));
    }
}