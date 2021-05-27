package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem27_MaximumProductOfWordLengthsTest {

    private final Problem27_MaximumProductOfWordLengths test = new Problem27_MaximumProductOfWordLengths();

    @Test
    void maxProduct() {
        String[] words = new String[]{"abcw", "baz", "foo", "bar", "xtfn", "abcdef"};
        assertEquals(16, test.maxProduct(words));
    }
}