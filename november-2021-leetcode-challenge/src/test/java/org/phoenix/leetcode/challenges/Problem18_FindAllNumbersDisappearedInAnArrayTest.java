package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem18_FindAllNumbersDisappearedInAnArrayTest {

    private final Problem18_FindAllNumbersDisappearedInAnArray test = new Problem18_FindAllNumbersDisappearedInAnArray();

    @Test
    void findDisappearedNumbers() {
        int[] nums = new int[]{4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> expected = Arrays.asList(5, 6);
        assertEquals(expected, test.findDisappearedNumbers(nums));
    }
}