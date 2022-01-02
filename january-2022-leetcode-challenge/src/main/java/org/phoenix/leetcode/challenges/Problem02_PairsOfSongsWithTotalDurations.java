package org.phoenix.leetcode.challenges;

import java.util.HashMap;
import java.util.Map;

/**
 * You are given a list of songs where the ith song has a duration of time[i] seconds.
 * <p>
 * Return the number of pairs of songs for which their total duration in seconds is divisible by 60. Formally, we want the
 * number of indices i, j such that i < j with (time[i] + time[j]) % 60 == 0.
 * Constraints:
 * <p>
 * 1 <= time.length <= 6 * 104
 * 1 <= time[i] <= 500
 */

public class Problem02_PairsOfSongsWithTotalDurations {
    public int numPairsDivisibleBy60(int[] time) {
        int result = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int t : time) {
            int remainder = 60 - t % 60;
            if (remainder == 60) {
                result += map.getOrDefault(0, 0);
            } else {
                result += map.getOrDefault(remainder, 0);
            }
            map.put(t % 60, map.getOrDefault(t % 60, 0) + 1);
        }
        return result;
    }
}
