package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem17_ContainerWithMostWaterTest {

    private final Problem17_ContainerWithMostWater test = new Problem17_ContainerWithMostWater();

    @Test
    void maxArea() {
        int[] heights = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};
        assertEquals(49, test.maxArea(heights));
    }
}