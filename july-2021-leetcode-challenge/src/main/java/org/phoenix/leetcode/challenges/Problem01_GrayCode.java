package org.phoenix.leetcode.challenges;

import java.util.ArrayList;
import java.util.List;

/**
 * An n-bit gray code sequence is a sequence of 2n integers where:
 * <p>
 * Every integer is in the inclusive range [0, 2n - 1],
 * The first integer is 0,
 * An integer appears no more than once in the sequence,
 * The binary representation of every pair of adjacent integers differs by exactly one bit, and
 * The binary representation of the first and last integers differs by exactly one bit.
 * Given an integer n, return any valid n-bit gray code sequence.
 * Constraints:
 * <p>
 * 1 <= n <= 16
 */

public class Problem01_GrayCode {
    public List<Integer> grayCode(int n) {
        if (n == 0) {
            List<Integer> codes = new ArrayList<>();
            codes.add(0);
            return codes;
        }
        List<Integer> codes = grayCode(n - 1);
        int x = 1 << (n - 1);
        for (int i = codes.size() - 1; i >= 0; i--) {
            codes.add(x + codes.get(i));
        }
        return codes;
    }
}
