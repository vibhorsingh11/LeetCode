package org.phoenix.leetcode.learn.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class Problem08_CheckIfNandItsDoubleExistTest {

    private final Problem08_CheckIfNandItsDoubleExist test = new Problem08_CheckIfNandItsDoubleExist();

    @Test
    void checkIfExist() {
        int[] arr = new int[]{10, 2, 5, 3};

        assertTrue(test.checkIfExist(arr));
    }
}