package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem13_PalindromePairsTest {

    private final Problem13_PalindromePairs test = new Problem13_PalindromePairs();

    @Test
    void palindromePairs() {
        String[] words = new String[]{"abcd", "dcba", "lls", "s", "sssll"};
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(1, 0));
        expected.add(Arrays.asList(0, 1));
        expected.add(Arrays.asList(3, 2));
        expected.add(Arrays.asList(2, 4));
        assertEquals(expected, test.palindromePairs(words));
    }
}