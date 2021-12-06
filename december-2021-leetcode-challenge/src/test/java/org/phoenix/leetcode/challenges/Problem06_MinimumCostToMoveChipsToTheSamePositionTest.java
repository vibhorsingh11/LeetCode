package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem06_MinimumCostToMoveChipsToTheSamePositionTest {

    private final Problem06_MinimumCostToMoveChipsToTheSamePosition test = new Problem06_MinimumCostToMoveChipsToTheSamePosition();

    @Test
    void minCostToMoveChips() {
        int[] position = new int[]{2, 2, 2, 3, 3};
        assertEquals(2, test.minCostToMoveChips(position));
    }
}