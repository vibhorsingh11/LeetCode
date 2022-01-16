package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem16_MaximizeDistanceToClosestPersonTest {

    private final Problem16_MaximizeDistanceToClosestPerson test = new Problem16_MaximizeDistanceToClosestPerson();

    @Test
    void maxDistToClosest() {
        int[] seats = new int[]{1, 0, 0, 0, 1, 0, 1};
        assertEquals(2, test.maxDistToClosest(seats));
    }
}