package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem23_FindTheShortestSuperstringTest {

    private final Problem23_FindTheShortestSuperstring test = new Problem23_FindTheShortestSuperstring();

    @Test
    void shortestSuperstring() {
        String[] words = new String[]{"alex", "loves", "leetcode"};
        assertEquals("leetcodelovesalex", test.shortestSuperstring(words));
    }
}