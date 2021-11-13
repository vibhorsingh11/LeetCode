package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Problem14_DailyTemperaturesTest {

    private final Problem14_DailyTemperatures test = new Problem14_DailyTemperatures();

    @Test
    void dailyTemperatures() {
        int[] temperatures = new int[]{73, 74, 75, 71, 69, 72, 76, 73};
        int[] expected = new int[]{1, 1, 4, 2, 1, 1, 0, 0};
        assertArrayEquals(expected, test.dailyTemperatures(temperatures));
    }
}