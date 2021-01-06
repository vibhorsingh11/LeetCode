package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem06_KthMissingPositiveNumberTest {

    private final Problem06_KthMissingPositiveNumber test = new Problem06_KthMissingPositiveNumber();

    @Test
    void findKthPositive() {
        int[] arr = new int[]{2, 3, 4, 7, 11};
        assertEquals(9, test.findKthPositive(arr, 5));
    }
}