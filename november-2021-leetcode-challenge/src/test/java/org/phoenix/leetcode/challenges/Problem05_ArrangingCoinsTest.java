package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem05_ArrangingCoinsTest {

    private final Problem05_ArrangingCoins test = new Problem05_ArrangingCoins();

    @Test
    void arrangeCoins() {
        assertEquals(3, test.arrangeCoins(8));
    }
}