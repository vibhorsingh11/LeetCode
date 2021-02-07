package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Problem07_ShortestDistanceToACharacterTest {

    private final Problem07_ShortestDistanceToACharacter test = new Problem07_ShortestDistanceToACharacter();

    @Test
    void shortestToChar() {
        String s = "loveleetcode";
        char c = 'e';
        int[] resultArray = new int[]{3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0};
        assertArrayEquals(resultArray, test.shortestToChar(s, c));
    }
}