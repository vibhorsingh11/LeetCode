package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Problem13_DailyTemperaturesTest {

    private final Problem13_DailyTemperatures test = new Problem13_DailyTemperatures();

    @Test
    void dailyTemperatures() {
        int[] temperatures = new int[]{73, 74, 75, 71, 69, 72, 76, 73};
        int[] expected = new int[]{1, 1, 4, 2, 1, 1, 0, 0};
        assertArrayEquals(expected, test.dailyTemperatures(temperatures));
    }
}