package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem08_CherryPickupIITest {

    private final Problem08_CherryPickupII test = new Problem08_CherryPickupII();

    @Test
    void cherryPickup() {
        int[][] grid = new int[][]{{3, 1, 1}, {2, 5, 1}, {1, 5, 5}, {2, 1, 1}};
        assertEquals(24, test.cherryPickup(grid));
    }
}