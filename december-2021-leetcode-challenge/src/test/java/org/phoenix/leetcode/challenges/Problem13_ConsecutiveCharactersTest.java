package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem13_ConsecutiveCharactersTest {

    private final Problem13_ConsecutiveCharacters test = new Problem13_ConsecutiveCharacters();

    @Test
    void maxPower() {
        assertEquals(2, test.maxPower("leetcode"));
    }
}