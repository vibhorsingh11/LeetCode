package org.phoenix.leetcode.learn.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Problem02_EvenNumberTest {

    private final Problem02_EvenNumber test = new Problem02_EvenNumber();

    @Test
    void findNumbers() {
        int[] nums = {12, 345, 2, 6, 7896};

        Assertions.assertEquals(2, test.findNumbers(nums));
    }
}