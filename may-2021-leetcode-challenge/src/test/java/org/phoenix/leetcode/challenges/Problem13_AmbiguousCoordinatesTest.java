package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem13_AmbiguousCoordinatesTest {

    private final Problem13_AmbiguousCoordinates test = new Problem13_AmbiguousCoordinates();

    @Test
    void ambiguousCoordinates() {
        String s = "(123)";
        List<String> expected = Arrays.asList("(1, 23)", "(12, 3)", "(1.2, 3)", "(1, 2.3)");
        assertEquals(expected.size(), test.ambiguousCoordinates(s).size());
    }
}