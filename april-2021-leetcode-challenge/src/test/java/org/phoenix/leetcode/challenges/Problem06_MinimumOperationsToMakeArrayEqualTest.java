package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem06_MinimumOperationsToMakeArrayEqualTest {

    private final Problem06_MinimumOperationsToMakeArrayEqual test = new Problem06_MinimumOperationsToMakeArrayEqual();

    @Test
    void minOperations() {
        assertEquals(2, test.minOperations(3));
    }
}