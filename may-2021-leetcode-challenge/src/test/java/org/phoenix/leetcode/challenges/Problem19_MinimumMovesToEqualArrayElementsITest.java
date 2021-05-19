package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem19_MinimumMovesToEqualArrayElementsITest {

    private final Problem19_MinimumMovesToEqualArrayElementsI test = new Problem19_MinimumMovesToEqualArrayElementsI();

    @Test
    void minMoves2() {
        int[] arr = new int[]{1, 10, 2, 9};
        assertEquals(16, test.minMoves2(arr));

        int[] nums = new int[]{1, 2, 3};
        assertEquals(2, test.minMoves2(nums));
    }
}