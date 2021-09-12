package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem12_ReachableNodesInSubdividedGraphTest {

    private final Problem12_ReachableNodesInSubdividedGraph test = new Problem12_ReachableNodesInSubdividedGraph();

    @Test
    void reachableNodes() {
        int[][] edges = new int[][]{{0, 1, 4}, {1, 2, 6}, {0, 2, 8}, {1, 3, 1}};
        assertEquals(23, test.reachableNodes(edges, 10, 4));
    }
}