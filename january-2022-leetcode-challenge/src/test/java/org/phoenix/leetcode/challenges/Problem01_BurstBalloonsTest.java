package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem01_BurstBalloonsTest {

    private final Problem01_BurstBalloons test = new Problem01_BurstBalloons();

    @Test
    void maxCoins() {
        int[] nums = new int[]{3, 1, 5, 8};
        assertEquals(167, test.maxCoins(nums));
    }
}