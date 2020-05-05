package org.phoenix.leetcode.learn.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem14_ThirdMaximumNumberTest {

    private final Problem14_ThirdMaximumNumber test = new Problem14_ThirdMaximumNumber();

    @Test
    void thirdMax() {
        int[] arr = new int[]{3, 2, 1};
        int[] arr1 = new int[]{2, 2, 3, 1};

        assertEquals(1, test.thirdMax(arr));
        assertEquals(1, test.thirdMax(arr1));
    }
}