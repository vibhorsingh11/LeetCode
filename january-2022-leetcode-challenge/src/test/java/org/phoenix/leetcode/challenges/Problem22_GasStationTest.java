package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem22_GasStationTest {

    private final Problem22_GasStation test = new Problem22_GasStation();

    @Test
    void canCompleteCircuit() {
        int[] gas = new int[]{1, 2, 3, 4, 5};
        int[] cost = new int[]{3, 4, 5, 1, 2};
        assertEquals(3, test.canCompleteCircuit(gas, cost));
    }
}