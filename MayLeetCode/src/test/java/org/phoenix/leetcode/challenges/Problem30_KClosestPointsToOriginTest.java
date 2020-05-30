package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Problem30_KClosestPointsToOriginTest {

    private final Problem30_KClosestPointsToOrigin test = new Problem30_KClosestPointsToOrigin();

    @Test
    void kClosest() {
        int[][] arr = new int[][]{{1, 3}, {-2, 2}};
        int[][] expected = new int[][]{{-2, 2}};
        assertArrayEquals(expected, test.kClosest(arr, 1));
    }
}