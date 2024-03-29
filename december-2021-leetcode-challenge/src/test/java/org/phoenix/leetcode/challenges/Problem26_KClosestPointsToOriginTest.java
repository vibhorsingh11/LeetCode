package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Problem26_KClosestPointsToOriginTest {

    private final Problem26_KClosestPointsToOrigin test = new Problem26_KClosestPointsToOrigin();

    @Test
    void kClosest() {
        int[][] points = new int[][]{
                {1, 3},
                {-2, 2}
        };
        int k = 1;
        int[][] expected = new int[][]{
                {-2, 2}
        };
        assertArrayEquals(expected, test.kClosest(points, k));
    }
}