package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem29_AccountsMergeTest {

    private final Problem29_AccountsMerge test = new Problem29_AccountsMerge();

    @Test
    void accountsMerge() {
        List<List<String>> accounts = new ArrayList<>();
        accounts.add(Arrays.asList("John", "johnsmith@mail.com", "john_newyork@mail.com"));
        accounts.add(Arrays.asList("John", "johnsmith@mail.com", "john00@mail.com"));
        accounts.add(Arrays.asList("Mary", "mary@mail.com"));
        accounts.add(Arrays.asList("John", "johnnybravo@mail.com"));
        List<List<String>> expected = new ArrayList<>();
        expected.add(Arrays.asList("John", "johnnybravo@mail.com"));
        expected.add(Arrays.asList("John", "john00@mail.com", "john_newyork@mail.com", "johnsmith@mail.com"));
        expected.add(Arrays.asList("Mary", "mary@mail.com"));
        assertEquals(expected, test.accountsMerge(accounts));
    }
}