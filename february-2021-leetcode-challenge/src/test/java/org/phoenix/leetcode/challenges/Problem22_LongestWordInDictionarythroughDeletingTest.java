package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem22_LongestWordInDictionarythroughDeletingTest {

    private final Problem22_LongestWordInDictionarythroughDeleting test = new Problem22_LongestWordInDictionarythroughDeleting();

    @Test
    void findLongestWord() {
        String s = "abpcplea";
        List<String> d = Arrays.asList("ale", "apple", "monkey", "plea");
        assertEquals("apple", test.findLongestWord(s, d));
    }
}