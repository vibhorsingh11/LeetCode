package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem07_CoinChange2Test {

    private final Problem07_CoinChange2 test = new Problem07_CoinChange2();

    @Test
    void change() {
        int[] arr = new int[]{1, 2, 5};

        assertEquals(4, test.change(5, arr));
    }
}