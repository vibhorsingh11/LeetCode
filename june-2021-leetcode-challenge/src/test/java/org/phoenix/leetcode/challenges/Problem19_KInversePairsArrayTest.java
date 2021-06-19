package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem19_KInversePairsArrayTest {

    private final Problem19_KInversePairsArray test = new Problem19_KInversePairsArray();

    @Test
    void kInversePairs() {
        assertEquals(1, test.kInversePairs(3, 0));
    }
}