package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem01_GrayCodeTest {

    private final Problem01_GrayCode test = new Problem01_GrayCode();

    @Test
    void grayCode() {
        List<Integer> list = Arrays.asList(0,1,3,2);
        assertEquals(list, test.grayCode(2));
    }
}