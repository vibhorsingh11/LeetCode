package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem16_BestTimeToBuyAndSellStockWithTransactionFeeTest {

    private final Problem16_BestTimeToBuyAndSellStockWithTransactionFee test = new
            Problem16_BestTimeToBuyAndSellStockWithTransactionFee();

    @Test
    void maxProfit() {
        int[] prices = new int[]{1, 3, 2, 8, 4, 9};
        assertEquals(8, test.maxProfit(prices, 2));
    }
}