package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem10_BestTimeToBuyAndSellStockIITest {

    private final Problem10_BestTimeToBuyAndSellStockII test = new Problem10_BestTimeToBuyAndSellStockII();

    @Test
    void maxProfit() {
        int[] prices = new int[]{7, 1, 5, 3, 6, 4};
        assertEquals(7, test.maxProfit(prices));
    }
}