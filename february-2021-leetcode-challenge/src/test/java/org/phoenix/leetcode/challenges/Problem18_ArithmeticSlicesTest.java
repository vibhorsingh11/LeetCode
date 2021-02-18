package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem18_ArithmeticSlicesTest {

    private final Problem18_ArithmeticSlices test = new Problem18_ArithmeticSlices();

    @Test
    void numberOfArithmeticSlices() {
        int[] arr = new int[]{1, 2, 3, 4};
        assertEquals(3, test.numberOfArithmeticSlices(arr));
    }
}