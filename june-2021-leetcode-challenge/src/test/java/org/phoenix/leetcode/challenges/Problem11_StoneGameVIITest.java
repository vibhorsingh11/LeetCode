package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem11_StoneGameVIITest {

    private final Problem11_StoneGameVII test = new Problem11_StoneGameVII();

    @Test
    void stoneGameVII() {
        int[] stones = new int[]{5, 3, 1, 4, 2};
        assertEquals(6, test.stoneGameVII(stones));
    }
}