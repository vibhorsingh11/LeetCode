package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem12_MinimumNumberOfRefuelingStopsTest {

    private final Problem12_MinimumNumberOfRefuelingStops test = new Problem12_MinimumNumberOfRefuelingStops();

    @Test
    void minRefuelStops() {
        int[][] stations = new int[][]{{10,100}};
        assertEquals(-1, test.minRefuelStops(100,1,stations));
    }
}