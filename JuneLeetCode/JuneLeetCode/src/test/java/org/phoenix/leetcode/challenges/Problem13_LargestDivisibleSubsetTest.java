package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Problem13_LargestDivisibleSubsetTest {

    private final Problem13_LargestDivisibleSubset test = new Problem13_LargestDivisibleSubset();

    @Test
    void largestDivisibleSubset() {
        int[] arr = new int[]{1, 2, 4, 8};
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(8);
        assertEquals(list, test.largestDivisibleSubset(arr));
    }
}