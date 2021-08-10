package org.phoenix.leetcode.challenges;

/**
 * <p>
 * A binary string is monotone increasing if it consists of some number of 0's (possibly none),
 * followed by some number of 1's (also possibly none).
 * <p>
 * You are given a binary string s. You can flip s[i] changing it from 0 to 1 or from 1 to 0.
 * <p>
 * Return the minimum number of flips to make s monotone increasing.
 * <p>
 * Constraints:
 * <p>
 * 1 <= s.length <= 10^5
 * s[i] is either '0' or '1'.
 */

public class Problem10_FlipStringToMonotoneIncreasing {
    public int minFlipsMonoIncr(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }
        int ones = 0;
        int flips = 0;
        for (char c : s.toCharArray()) {
            if (c == '0') {
                if (ones == 0) {
                    continue;
                } else {
                    flips++;
                }
            } else {
                ones++;
            }
            flips = Math.min(flips, ones);
        }
        return flips;
    }
}
