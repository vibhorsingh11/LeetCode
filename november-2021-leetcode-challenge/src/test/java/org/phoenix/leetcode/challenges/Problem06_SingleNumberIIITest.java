package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Problem06_SingleNumberIIITest {

    private final Problem06_SingleNumberIII test = new Problem06_SingleNumberIII();

    @Test
    void singleNumber() {
        int[] nums = new int[]{1, 2, 1, 3, 2, 5};
        int[] expected = new int[]{3, 5};
        assertArrayEquals(expected, test.singleNumber(nums));
    }
}