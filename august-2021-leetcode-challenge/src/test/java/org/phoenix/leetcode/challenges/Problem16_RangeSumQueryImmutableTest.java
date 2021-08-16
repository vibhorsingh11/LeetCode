package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem16_RangeSumQueryImmutableTest {

    @Test
    void sumRange() {
        int[] arr = new int[]{-2, 0, 3, -5, 2, -1};
        Problem16_RangeSumQueryImmutable test = new Problem16_RangeSumQueryImmutable(arr);
        assertEquals(1, test.sumRange(0, 2));
        assertEquals(-1, test.sumRange(2, 5));
        assertEquals(-3, test.sumRange(0, 5));
    }
}