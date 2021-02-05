package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem05_SimplifyPathTest {

    private final Problem05_SimplifyPath test = new Problem05_SimplifyPath();

    @Test
    void simplifyPath() {
        assertEquals("/home", test.simplifyPath("/home/"));
        assertEquals("/", test.simplifyPath("/../"));
    }
}