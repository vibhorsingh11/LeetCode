package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem26_ContiguousArrayTest {

    private final Problem26_ContiguousArray test = new Problem26_ContiguousArray();

    @Test
    void findMaxLength() {
        int[] arr = new int[]{0, 1, 0, 0, 1, 1, 0};

        assertEquals(6, test.findMaxLength(arr));
    }
}