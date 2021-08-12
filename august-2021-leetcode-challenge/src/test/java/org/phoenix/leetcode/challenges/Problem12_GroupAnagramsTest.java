package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem12_GroupAnagramsTest {

    private final Problem12_GroupAnagrams test = new Problem12_GroupAnagrams();

    @Test
    void groupAnagrams() {
        String[] arr = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> expected = new ArrayList<>();
        expected.add(Arrays.asList("tan", "nat"));
        expected.add(Arrays.asList("eat", "tea", "ate"));
        expected.add(Collections.singletonList("bat"));
        assertEquals(expected, test.groupAnagrams(arr));
    }
}