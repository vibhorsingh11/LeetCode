package org.phoenix.leetcode.learn.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem11_MoveZeroesTest {

    private final Problem11_MoveZeroes test = new Problem11_MoveZeroes();

    @Test
    void moveZeroes() {
        int[] arr = new int[]{0, 1, 0, 3, 12};
        int[] except = new int[]{1, 3, 12, 0, 0};

        assertArrayEquals(except, test.moveZeroes(arr));
    }
}