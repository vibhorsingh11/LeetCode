package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem16_MinimumHeightTreesTest {

    private final Problem16_MinimumHeightTrees test = new Problem16_MinimumHeightTrees();

    @Test
    void findMinHeightTrees() {
        int[][] edges = new int[][]{{1, 0}, {1, 2}, {1, 3}};
        Integer[] res = new Integer[]{1};
        List<Integer> expected = Arrays.asList(res);
        assertEquals(expected, test.findMinHeightTrees(4, edges));
    }
}