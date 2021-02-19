package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem19_MinimumRemoveToMakeValidParenthesesTest {

    private final Problem19_MinimumRemoveToMakeValidParentheses test = new Problem19_MinimumRemoveToMakeValidParentheses();

    @Test
    void minRemoveToMakeValid() {
        String s = "lee(t(c)o)de)";
        String result = "lee(t(c)o)de";
        assertEquals(result, test.minRemoveToMakeValid(s));
    }
}