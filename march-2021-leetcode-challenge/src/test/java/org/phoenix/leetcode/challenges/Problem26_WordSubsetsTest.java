package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem26_WordSubsetsTest {

    private final Problem26_WordSubsets test = new Problem26_WordSubsets();

    @Test
    void wordSubsets() {
        String[] A = new String[]{"amazon", "apple", "facebook", "google", "leetcode"};
        String[] B = new String[]{"e", "o"};
        List<String> expected = Arrays.asList("facebook", "google", "leetcode");
        assertEquals(expected, test.wordSubsets(A, B));
    }
}