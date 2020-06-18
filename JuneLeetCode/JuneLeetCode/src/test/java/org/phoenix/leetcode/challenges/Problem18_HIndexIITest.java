package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem18_HIndexIITest {

    private final Problem18_HIndexII test = new Problem18_HIndexII();

    @Test
    void hIndex() {
        int[] arr = new int[]{0, 1, 3, 5, 6};
        assertEquals(3, test.hIndex(arr));
    }
}