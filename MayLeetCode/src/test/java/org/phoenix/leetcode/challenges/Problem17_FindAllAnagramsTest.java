package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem17_FindAllAnagramsTest {

    private final Problem17_FindAllAnagrams test = new Problem17_FindAllAnagrams();

    @Test
    void findAnagrams() {
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(6);
        assertEquals(list, test.findAnagrams("cbaebabacd", "abc"));
    }
}