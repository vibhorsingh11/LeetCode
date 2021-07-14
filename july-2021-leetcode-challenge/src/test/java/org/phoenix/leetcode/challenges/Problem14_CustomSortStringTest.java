package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem14_CustomSortStringTest {

    private final Problem14_CustomSortString test = new Problem14_CustomSortString();

    @Test
    void customSortString() {
        String order = "cba";
        String str = "abcd";
        String result = "cbad";
        assertEquals(result, test.customSortString(order, str));
    }
}