package org.phoenix.leetcode.learn.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem10_GreatestElementOnRightSideTest {

    private final Problem10_GreatestElementOnRightSide test = new Problem10_GreatestElementOnRightSide();

    @Test
    void replaceElements() {
        int[] arr = new int[]{17, 18, 5, 4, 6, 1};
        int[] expected = new int[]{18, 6, 6, 6, 1, -1};

        assertArrayEquals(expected, test.replaceElements(arr));
    }
}