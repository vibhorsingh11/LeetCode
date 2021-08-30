package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem30_RangeAdditionIITest {

    private final Problem30_RangeAdditionII test = new Problem30_RangeAdditionII();

    @Test
    void maxCount() {
        int[][] ops = new int[][]{{2, 2}, {3, 3}};
        assertEquals(4, test.maxCount(3, 3, ops));
    }
}