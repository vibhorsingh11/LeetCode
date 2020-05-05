package org.phoenix.leetcode.learn.arrays;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Problem15_FindAllNumbersDisappearedInArrayTest {

    private final Problem15_FindAllNumbersDisappearedInArray testObject = new Problem15_FindAllNumbersDisappearedInArray();

    @Test
    void findDisappearedNumbers() {
        int[] numbers = new int[]{4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> expected = Arrays.asList(5, 6);
        assertEquals(expected, testObject.findDisappearedNumbers(numbers));

        numbers = new int[]{1, 2, 3};
        expected = Collections.emptyList();
        assertEquals(expected, testObject.findDisappearedNumbers(numbers));

        numbers = new int[]{1, 1, 2, 2, 3, 3};
        expected = Arrays.asList(4, 5, 6);
        assertEquals(expected, testObject.findDisappearedNumbers(numbers));
    }
}