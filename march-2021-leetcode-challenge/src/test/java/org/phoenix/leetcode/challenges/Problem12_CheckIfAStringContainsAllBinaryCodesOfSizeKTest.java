package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

class Problem12_CheckIfAStringContainsAllBinaryCodesOfSizeKTest {

    private final Problem12_CheckIfAStringContainsAllBinaryCodesOfSizeK test = new
            Problem12_CheckIfAStringContainsAllBinaryCodesOfSizeK();

    @Test
    void hasAllCodes() {
        assertTrue(test.hasAllCodes("00110110", 2));

        assertFalse(test.hasAllCodes("0110", 2));
    }
}