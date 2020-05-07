package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem05_FirstUniqueCharacterTest {

    private final Problem05_FirstUniqueCharacter test = new Problem05_FirstUniqueCharacter();

    @Test
    void firstUniqueChar() {
        String s = "leetcode";
        String s1 = "loveleetcode";

        assertEquals(0,test.firstUniqueChar(s));
        assertEquals(2,test.firstUniqueChar(s1));
    }
}