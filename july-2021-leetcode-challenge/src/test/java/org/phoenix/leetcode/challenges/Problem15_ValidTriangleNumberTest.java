package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem15_ValidTriangleNumberTest {

    private final Problem15_ValidTriangleNumber test = new Problem15_ValidTriangleNumber();

    @Test
    void triangleNumber() {
        int[] arr = new int[]{2, 2, 3, 4};
        assertEquals(3, test.triangleNumber(arr));
    }
}