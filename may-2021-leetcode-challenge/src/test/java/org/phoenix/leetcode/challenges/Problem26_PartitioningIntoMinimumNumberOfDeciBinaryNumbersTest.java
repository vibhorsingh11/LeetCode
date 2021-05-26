package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem26_PartitioningIntoMinimumNumberOfDeciBinaryNumbersTest {

    private final Problem26_PartitioningIntoMinimumNumberOfDeciBinaryNumbers test = new Problem26_PartitioningIntoMinimumNumberOfDeciBinaryNumbers();

    @Test
    void minPartitions() {
        assertEquals(3, test.minPartitions("32"));
        assertEquals(9, test.minPartitions("27346209830709182346"));
    }
}