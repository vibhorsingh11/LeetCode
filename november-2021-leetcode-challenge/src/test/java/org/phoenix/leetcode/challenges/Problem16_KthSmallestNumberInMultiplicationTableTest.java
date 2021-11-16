package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem16_KthSmallestNumberInMultiplicationTableTest {

    private final Problem16_KthSmallestNumberInMultiplicationTable test = new Problem16_KthSmallestNumberInMultiplicationTable();

    @Test
    void findKthNumber() {
        assertEquals(3, test.findKthNumber(3, 3, 5));
    }
}