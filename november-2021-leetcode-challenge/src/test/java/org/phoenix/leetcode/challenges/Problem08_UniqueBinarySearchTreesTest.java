package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem08_UniqueBinarySearchTreesTest {

    private final Problem08_UniqueBinarySearchTrees test = new Problem08_UniqueBinarySearchTrees();

    @Test
    void numTrees() {
        assertEquals(5, test.numTrees(3));
    }
}