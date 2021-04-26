package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem26_FurthestBuildingYouCanReachTest {

    private final Problem26_FurthestBuildingYouCanReach test = new Problem26_FurthestBuildingYouCanReach();

    @Test
    void furthestBuilding() {
        int[] heights = new int[]{4, 2, 7, 6, 9, 14, 12};
        assertEquals(4, test.furthestBuilding(heights, 5, 1));
    }
}