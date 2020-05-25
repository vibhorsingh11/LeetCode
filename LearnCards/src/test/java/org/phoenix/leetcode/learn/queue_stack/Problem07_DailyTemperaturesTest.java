package org.phoenix.leetcode.learn.queue_stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Problem07_DailyTemperaturesTest {

    private final Problem07_DailyTemperatures test = new Problem07_DailyTemperatures();

    @Test
    void dailyTemperatures() {
        int[] arr = new int[]{73, 74, 75, 71, 69, 72, 76, 73};
        int[] expected = new int[]{1, 1, 4, 2, 1, 1, 0, 0};

        assertArrayEquals(expected, test.dailyTemperatures(arr));
    }
}