package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem13_BinaryTreesWithFactorsTest {

    private final Problem13_BinaryTreesWithFactors test = new Problem13_BinaryTreesWithFactors();

    @Test
    void numFactoredBinaryTrees() {
        int[] arr = new int[]{2, 4};
        assertEquals(3, test.numFactoredBinaryTrees(arr));
    }
}