package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Problem02_SetMismatchTest {

    private final Problem02_SetMismatch test = new Problem02_SetMismatch();

    @Test
    void findErrorNums() {
        int[] result = new int[]{2, 3};
        int[] arr = new int[]{1, 2, 2, 4};

        assertArrayEquals(result, test.findErrorNums(arr));
    }
}