package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem03_MissingNumberTest {

    private final Problem03_MissingNumber test = new Problem03_MissingNumber();

    @Test
    void missingNumber() {
        int[] arr = new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1};
        assertEquals(8, test.missingNumber(arr));
    }
}