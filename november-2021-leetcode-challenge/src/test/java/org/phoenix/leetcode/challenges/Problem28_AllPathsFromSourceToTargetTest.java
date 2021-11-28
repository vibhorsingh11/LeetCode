package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem28_AllPathsFromSourceToTargetTest {

    private final Problem28_AllPathsFromSourceToTarget test = new Problem28_AllPathsFromSourceToTarget();

    @Test
    void allPathsSourceTarget() {
        int[][] graph = new int[][]{
                {4, 3, 1},
                {3, 2, 4},
                {3},
                {4},
                {}
        };
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(0, 4));
        expected.add(Arrays.asList(0, 3, 4));
        expected.add(Arrays.asList(0, 1, 3, 4));
        expected.add(Arrays.asList(0, 1, 2, 3, 4));
        expected.add(Arrays.asList(0, 1, 4));
        assertEquals(expected, test.allPathsSourceTarget(graph));
    }
}