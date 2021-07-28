package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Problem28_BeautifulArrayTest {

    private final Problem28_BeautifulArray test = new Problem28_BeautifulArray();

    @Test
    void beautifulArray() {
        int[] expected = new int[]{1, 3, 2, 4};
        assertArrayEquals(expected, test.beautifulArray(4));
    }
}