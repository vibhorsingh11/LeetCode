package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem14_MaximumUnitsOnATruckTest {

    private final Problem14_MaximumUnitsOnATruck test = new Problem14_MaximumUnitsOnATruck();

    @Test
    void maximumUnits() {
        int[][] boxTypes = new int[][]{{1, 3}, {2, 2}, {3, 1}};
        assertEquals(8, test.maximumUnits(boxTypes, 4));
    }
}