package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem22_SingleNumberIITest {

    private final Problem22_SingleNumberII test = new Problem22_SingleNumberII();

    @Test
    void singleNumber() {
        int[] arr = new int[]{0, 1, 0, 1, 0, 1, 99};
        assertEquals(99, test.singleNumber(arr));
    }
}