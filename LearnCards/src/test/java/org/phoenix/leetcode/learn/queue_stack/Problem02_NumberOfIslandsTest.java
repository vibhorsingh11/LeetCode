package org.phoenix.leetcode.learn.queue_stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem02_NumberOfIslandsTest {

    private final Problem02_NumberOfIslands test = new Problem02_NumberOfIslands();

    @Test
    void numIslands() {
        char[][] arr = {{'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}};

        assertEquals(1, test.numIslands(arr));
    }
}