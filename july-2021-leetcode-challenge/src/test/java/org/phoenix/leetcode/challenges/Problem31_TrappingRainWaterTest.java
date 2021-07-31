package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem31_TrappingRainWaterTest {

    private final Problem31_TrappingRainWater test = new Problem31_TrappingRainWater();

    @Test
    void trap() {
        int[] height = new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        assertEquals(6, test.trap(height));
    }
}