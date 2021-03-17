package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

class Problem17_GenerateRandomPointInACircleTest {

    @Test
    void randPoint() {
        Problem17_GenerateRandomPointInACircle test = new
                Problem17_GenerateRandomPointInACircle(1, 0, 0);
        System.out.println(Arrays.toString(test.randPoint()));
    }
}