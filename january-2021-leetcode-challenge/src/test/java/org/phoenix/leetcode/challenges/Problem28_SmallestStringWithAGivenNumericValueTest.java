package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem28_SmallestStringWithAGivenNumericValueTest {

    private final Problem28_SmallestStringWithAGivenNumericValue test = new Problem28_SmallestStringWithAGivenNumericValue();

    @Test
    void getSmallestString() {
        assertEquals("aay", test.getSmallestString(3, 27));

        assertEquals("aaszz", test.getSmallestString(5, 73));
    }
}