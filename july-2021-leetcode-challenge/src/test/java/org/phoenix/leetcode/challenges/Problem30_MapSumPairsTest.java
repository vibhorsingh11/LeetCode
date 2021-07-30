package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.phoenix.leetcode.challenges.Problem30_MapSumPairs.MapSum;

class Problem30_MapSumPairsTest {

    @Test
    public void test() {
        MapSum test = new MapSum();
        test.insert("apple", 3);
        assertEquals(3, test.sum("ap"));
        test.insert("app", 2);
        assertEquals(5, test.sum("ap"));
    }

}