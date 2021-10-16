package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem16_BestTimeToBuyAndSellStockIIITest {

    private final Problem16_BestTimeToBuyAndSellStockIII test = new Problem16_BestTimeToBuyAndSellStockIII();

    @Test
    void maxProfit() {
        int[] prices = new int[]{3, 3, 5, 0, 0, 3, 1, 4};
        assertEquals(6, test.maxProfit(prices));
    }
}