package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem03_MaximumAreaOfAPieceOfCakeAfterHorizontalAndVerticalCutsTest {

    private final Problem03_MaximumAreaOfAPieceOfCakeAfterHorizontalAndVerticalCuts test = new Problem03_MaximumAreaOfAPieceOfCakeAfterHorizontalAndVerticalCuts();

    @Test
    void maxArea() {
        int height = 5, width = 4;
        int[] horizontalCuts = new int[]{1, 2, 4};
        int[] verticalCuts = new int[]{1, 3};
        assertEquals(4, test.maxArea(height, width, horizontalCuts, verticalCuts));
    }
}