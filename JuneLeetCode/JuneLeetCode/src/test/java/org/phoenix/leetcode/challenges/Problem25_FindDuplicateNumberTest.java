package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem25_FindDuplicateNumberTest {

    private final Problem25_FindDuplicateNumber test = new Problem25_FindDuplicateNumber();

    @Test
    void findDuplicate() {
        int[] arr = new int[]{1, 3, 4, 2, 2};

        assertEquals(2, test.findDuplicate(arr));
    }
}