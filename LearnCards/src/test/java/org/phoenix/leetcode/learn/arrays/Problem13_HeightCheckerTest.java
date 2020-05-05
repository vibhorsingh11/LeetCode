package org.phoenix.leetcode.learn.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem13_HeightCheckerTest {

    private final Problem13_HeightChecker test = new Problem13_HeightChecker();

    @Test
    void heightChecker() {
        int[] heights = new int[]{1, 1, 4, 2, 1, 3};
        int[] heights1 = new int[]{5, 1, 2, 3, 4};
        int[] heights2 = new int[]{1, 2, 3, 4, 5};

        Assertions.assertEquals(3, test.heightChecker(heights));
        Assertions.assertEquals(5, test.heightChecker(heights1));
        Assertions.assertEquals(0, test.heightChecker(heights2));
    }
}