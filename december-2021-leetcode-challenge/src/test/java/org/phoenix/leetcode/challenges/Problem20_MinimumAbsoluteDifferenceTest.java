package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem20_MinimumAbsoluteDifferenceTest {

    private final Problem20_MinimumAbsoluteDifference test = new Problem20_MinimumAbsoluteDifference();

    @Test
    void minimumAbsDifference() {
        int[] arr = new int[]{4, 2, 1, 3};
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(1, 2));
        expected.add(Arrays.asList(2, 3));
        expected.add(Arrays.asList(3, 4));
        assertEquals(expected, test.minimumAbsDifference(arr));
    }
}