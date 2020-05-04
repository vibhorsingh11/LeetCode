package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem02_JewelsAndStonesTest {

    private final Problem02_JewelsAndStones test = new Problem02_JewelsAndStones();

    @Test
    void numJewelsInStones() {
        String J = "aA", S = "aAAbbbb";
        String J1 = "z", S1 = "ZZ";

        assertEquals(3, test.numJewelsInStones(J, S));
        assertEquals(0, test.numJewelsInStones(J1, S1));
    }
}