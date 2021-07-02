package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem02_FindKClosestElementsTest {

    private final Problem02_FindKClosestElements test = new Problem02_FindKClosestElements();

    @Test
    void findClosestElements() {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        List<Integer> expectedList = Arrays.asList(1, 2, 3, 4);
        assertEquals(expectedList, test.findClosestElements(arr, 4, 3));
    }
}