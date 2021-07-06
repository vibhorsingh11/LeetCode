package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem06_ReduceArraySizeToTheHalfTest {

    private final Problem06_ReduceArraySizeToTheHalf test = new Problem06_ReduceArraySizeToTheHalf();

    @Test
    void minSetSize() {
        int[] arr = new int[]{3,3,3,3,5,5,5,2,2,7};
        assertEquals(2, test.minSetSize(arr));
    }
}