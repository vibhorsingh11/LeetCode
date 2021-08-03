package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem03_SubsetsIITest {

    private final Problem03_SubsetsII test = new Problem03_SubsetsII();

    @Test
    void subsetsWithDup() {
        int[] nums = new int[]{1, 2, 2};
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Collections.emptyList());
        expected.add(Collections.singletonList(1));
        expected.add(Arrays.asList(1, 2));
        expected.add(Arrays.asList(1, 2, 2));
        expected.add(Collections.singletonList(2));
        expected.add(Arrays.asList(2, 2));
        assertEquals(expected, test.subsetsWithDup(nums));
    }
}