package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class Problem18_CanPlaceFlowersTest {

    private final Problem18_CanPlaceFlowers test = new Problem18_CanPlaceFlowers();

    @Test
    void canPlaceFlowers() {
        int[] flowers = new int[]{1, 0, 0, 0, 1};
        assertTrue(test.canPlaceFlowers(flowers, 1));
    }
}