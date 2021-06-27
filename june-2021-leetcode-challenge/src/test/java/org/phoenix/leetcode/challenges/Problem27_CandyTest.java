package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem27_CandyTest {

    private final Problem27_Candy test = new Problem27_Candy();

    @Test
    void candy() {
        int[] ratings = new int[]{1, 0, 2};
        assertEquals(5, test.candy(ratings));

        ratings = new int[]{1, 2, 2};
        assertEquals(4, test.candy(ratings));
    }
}