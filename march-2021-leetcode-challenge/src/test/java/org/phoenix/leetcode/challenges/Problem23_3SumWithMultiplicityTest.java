package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem23_3SumWithMultiplicityTest {

    private final Problem23_3SumWithMultiplicity test = new Problem23_3SumWithMultiplicity();

    @Test
    void threeSumMulti() {
        int[] arr = new int[]{1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
        int target = 8;
        assertEquals(20, test.threeSumMulti(arr, target));
    }
}