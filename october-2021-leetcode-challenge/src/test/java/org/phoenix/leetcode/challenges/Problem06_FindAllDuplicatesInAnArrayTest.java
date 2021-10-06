package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem06_FindAllDuplicatesInAnArrayTest {

    private final Problem06_FindAllDuplicatesInAnArray test = new Problem06_FindAllDuplicatesInAnArray();

    @Test
    void findDuplicates() {
        int[] arr = new int[]{4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> expected = Arrays.asList(2, 3);
        assertEquals(expected, test.findDuplicates(arr));
    }
}