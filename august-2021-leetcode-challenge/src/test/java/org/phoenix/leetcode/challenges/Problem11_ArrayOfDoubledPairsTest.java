package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Problem11_ArrayOfDoubledPairsTest {

    private final Problem11_ArrayOfDoubledPairs test = new Problem11_ArrayOfDoubledPairs();

    @Test
    void canReorderDoubled() {
        int[] arr = new int[]{3, 1, 3, 6};
        assertFalse(test.canReorderDoubled(arr));

        arr = new int[]{4, -2, 2, -4};
        assertTrue(test.canReorderDoubled(arr));
    }
}