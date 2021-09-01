package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem01_ArrayNestingTest {

    private final Problem01_ArrayNesting test = new Problem01_ArrayNesting();

    @Test
    void arrayNesting() {
        int[] arr = new int[]{5, 4, 0, 3, 1, 6, 2};
        assertEquals(4, test.arrayNesting(arr));
    }
}