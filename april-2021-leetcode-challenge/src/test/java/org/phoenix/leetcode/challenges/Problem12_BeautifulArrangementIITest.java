package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Problem12_BeautifulArrangementIITest {

    private final Problem12_BeautifulArrangementII test = new Problem12_BeautifulArrangementII();

    @Test
    void constructArray() {
        int[] res = new int[]{1, 2, 3};
        assertArrayEquals(res, test.constructArray(3, 1));
    }
}