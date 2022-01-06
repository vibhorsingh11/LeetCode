package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

class Problem06_CarPoolingTest {

    private final Problem06_CarPooling test = new Problem06_CarPooling();

    @Test
    void carPooling() {
        int[][] trips = new int[][]{{2, 1, 5}, {3, 3, 7}};
        assertFalse(test.carPooling(trips, 4));
    }
}