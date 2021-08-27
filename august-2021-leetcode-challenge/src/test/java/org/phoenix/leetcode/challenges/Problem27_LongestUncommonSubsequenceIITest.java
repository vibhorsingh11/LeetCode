package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem27_LongestUncommonSubsequenceIITest {

    private final Problem27_LongestUncommonSubsequenceII test = new Problem27_LongestUncommonSubsequenceII();

    @Test
    void findLUSlength() {
        String[] arr = new String[]{"aba", "cdc", "eae"};
        assertEquals(3, test.findLUSLength(arr));
    }
}