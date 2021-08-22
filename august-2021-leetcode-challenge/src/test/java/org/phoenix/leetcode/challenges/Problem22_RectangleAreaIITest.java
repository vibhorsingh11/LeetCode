package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem22_RectangleAreaIITest {

    private final Problem22_RectangleAreaII test = new Problem22_RectangleAreaII();

    @Test
    void rectangleArea() {
        int[][] rectangles = new int[][]{
                {0, 0, 2, 2},
                {1, 0, 2, 3},
                {1, 0, 3, 1}
        };
        assertEquals(6, test.rectangleArea(rectangles));
    }
}