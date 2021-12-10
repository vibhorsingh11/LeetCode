package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem10_DominoAndTrominoTilingTest {

    private final Problem10_DominoAndTrominoTiling test = new Problem10_DominoAndTrominoTiling();

    @Test
    void numTilings() {
        assertEquals(5, test.numTilings(3));
    }
}