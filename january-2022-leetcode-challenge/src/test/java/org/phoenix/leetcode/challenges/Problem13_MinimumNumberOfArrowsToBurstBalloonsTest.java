package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem13_MinimumNumberOfArrowsToBurstBalloonsTest {

    private final Problem13_MinimumNumberOfArrowsToBurstBalloons test = new Problem13_MinimumNumberOfArrowsToBurstBalloons();

    @Test
    void findMinArrowShots() {
        int[][] points = new int[][]{{10, 16}, {2, 8}, {1, 6}, {7, 12}};
        assertEquals(2, test.findMinArrowShots(points));
    }
}