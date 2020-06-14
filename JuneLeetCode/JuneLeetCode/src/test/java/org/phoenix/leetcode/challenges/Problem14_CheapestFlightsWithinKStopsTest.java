package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem14_CheapestFlightsWithinKStopsTest {

    private final Problem14_CheapestFlightsWithinKStops test = new Problem14_CheapestFlightsWithinKStops();

    @Test
    void findCheapestPrice() {
        int[][] arr = new int[][]{{0,1,100},{1,2,100},{0,2,500}};
        assertEquals(500,test.findCheapestPrice(3,arr,0,2,0));
    }
}