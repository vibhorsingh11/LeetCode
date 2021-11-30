package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem30_MaximalRectangleTest {

    private final Problem30_MaximalRectangle test = new Problem30_MaximalRectangle();

    @Test
    void maximalRectangle() {
        char[][] matrix = new char[][]{
                {'1', '0', '1', '0', '0'},
                {'1', '0', '1', '1', '1'},
                {'1', '1', '1', '1', '1'},
                {'1', '0', '0', '1', '0'}
        };
        assertEquals(6, test.maximalRectangle(matrix));
    }
}