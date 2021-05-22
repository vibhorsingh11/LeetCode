package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem22_NQueensTest {

    private final Problem22_NQueens test = new Problem22_NQueens();

    @Test
    void solveNQueens() {
        List<List<String>> expected = new ArrayList<>();
        expected.add(Arrays.asList("..Q.", "Q...", "...Q", ".Q.."));
        expected.add(Arrays.asList(".Q..", "...Q", "Q...", "..Q."));
        assertEquals(expected, test.solveNQueens(4));
    }
}