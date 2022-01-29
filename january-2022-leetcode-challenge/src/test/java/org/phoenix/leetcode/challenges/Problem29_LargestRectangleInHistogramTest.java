package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem29_LargestRectangleInHistogramTest {

    private final Problem29_LargestRectangleInHistogram test = new Problem29_LargestRectangleInHistogram();

    @Test
    void largestRectangleArea() {
        int[] heights = new int[]{2, 1, 5, 6, 2, 3};
        assertEquals(10, test.largestRectangleArea(heights));
    }
}