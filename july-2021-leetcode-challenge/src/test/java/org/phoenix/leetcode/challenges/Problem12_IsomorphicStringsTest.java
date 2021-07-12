package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class Problem12_IsomorphicStringsTest {

    private final Problem12_IsomorphicStrings test = new Problem12_IsomorphicStrings();

    @Test
    void isIsomorphic() {
        String s = "egg";
        String t = "add";
        assertTrue(test.isIsomorphic(s, t));
    }
}