package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem01_DistributeCandiesTest {

    private final Problem01_DistributeCandies test = new Problem01_DistributeCandies();

    @Test
    void distributeCandies() {
        int[] candyType = new int[]{1, 1, 2, 2, 3, 3};
        assertEquals(3, test.distributeCandies(candyType));

        candyType = new int[]{1, 1, 2, 3};
        assertEquals(2, test.distributeCandies(candyType));
    }
}