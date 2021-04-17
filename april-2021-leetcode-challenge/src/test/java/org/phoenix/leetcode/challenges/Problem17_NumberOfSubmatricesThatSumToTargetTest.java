package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem17_NumberOfSubmatricesThatSumToTargetTest {

    private final Problem17_NumberOfSubmatricesThatSumToTarget test = new Problem17_NumberOfSubmatricesThatSumToTarget();

    @Test
    void numSubmatrixSumTarget() {
        int[][] matrix = new int[][]{
                {0, 1, 0}, {1, 1, 1}, {0, 1, 0}
        };
        assertEquals(4, test.numSubmatrixSumTarget(matrix, 0));
    }
}