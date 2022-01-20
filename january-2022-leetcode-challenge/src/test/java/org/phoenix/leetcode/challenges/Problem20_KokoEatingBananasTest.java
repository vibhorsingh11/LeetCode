package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem20_KokoEatingBananasTest {

    private final Problem20_KokoEatingBananas test = new Problem20_KokoEatingBananas();

    @Test
    void minEatingSpeed() {
        int[] piles = new int[]{3, 6, 7, 11};
        assertEquals(4, test.minEatingSpeed(piles, 8));
    }
}