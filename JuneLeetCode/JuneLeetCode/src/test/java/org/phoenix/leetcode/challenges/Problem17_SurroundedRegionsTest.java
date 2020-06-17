package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem17_SurroundedRegionsTest {

    private final Problem17_SurroundedRegions test = new Problem17_SurroundedRegions();

    @Test
    void solve() {
        char[][] arr = new char[][]{{'X', 'X', 'X', 'X'},{'X', 'O', 'O', 'X'},{'X', 'X', 'O', 'X'},{'X', 'O', 'X', 'X'}};
        char[][] expected = new char[][]{{'X', 'X', 'X', 'X'},{'X', 'X', 'X', 'X'},{'X', 'X', 'X', 'X'},{'X', 'O', 'X', 'X'}};
        assertArrayEquals(expected,test.solve(arr));
    }
}