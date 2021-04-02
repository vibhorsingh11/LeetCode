package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem02_OnesAndZeroesTest {

    private final Problem02_OnesAndZeroes test = new Problem02_OnesAndZeroes();

    @Test
    void findMaxForm() {
        String[] arr = new String[]{"10", "0001", "111001", "1", "0"};
        assertEquals(4, test.findMaxForm(arr, 5, 3));
    }
}