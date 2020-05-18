package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem18_PermutationInStringTest {

    private final Problem18_PermutationInString test = new Problem18_PermutationInString();

    @Test
    void checkInclusion() {
        String s1 = "ab";
        String s2 = "eidbaooo";

        assertTrue(test.checkInclusion(s1,s2));
    }
}