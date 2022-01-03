package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem03_FindTheTownJudgeTest {

    private final Problem03_FindTheTownJudge test = new Problem03_FindTheTownJudge();

    @Test
    void findJudge() {
        int[][] trust = new int[][]{{1, 2}};
        assertEquals(2, test.findJudge(2, trust));
    }
}