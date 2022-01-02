package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem02_PairsOfSongsWithTotalDurationsTest {

    private final Problem02_PairsOfSongsWithTotalDurations test = new Problem02_PairsOfSongsWithTotalDurations();

    @Test
    void numPairsDivisibleBy60() {
        int[] time = new int[]{30, 20, 150, 100, 40};
        assertEquals(3, test.numPairsDivisibleBy60(time));
    }
}