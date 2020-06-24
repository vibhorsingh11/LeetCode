package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem24_UniqueBinarySearchTreesTest {

    private final Problem24_UniqueBinarySearchTrees test = new Problem24_UniqueBinarySearchTrees();

    @Test
    void numTrees() {
        assertEquals(5, test.numTrees(3));
    }
}