package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem10_TownJudgeTest {

    private final Problem10_TownJudge test = new Problem10_TownJudge();

    @Test
    void findJudge() {
        int[][] arr = new int[][]{{1, 3}, {1, 4}, {2, 3}, {2, 4}, {4, 3}};

        assertEquals(3, test.findJudge(4, arr));
    }
}