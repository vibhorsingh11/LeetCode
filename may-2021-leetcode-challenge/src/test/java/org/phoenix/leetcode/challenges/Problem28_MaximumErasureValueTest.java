package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem28_MaximumErasureValueTest {

    private final Problem28_MaximumErasureValue test = new Problem28_MaximumErasureValue();

    @Test
    void maximumUniqueSubarray() {
        int[] nums = new int[]{5, 2, 1, 2, 5, 2, 1, 2, 5};
        assertEquals(8, test.maximumUniqueSubarray(nums));
    }
}