package org.phoenix.leetcode.challenges;

import java.util.Map;
import java.util.TreeMap;

/**
 * Given an array of integers arr of even length, return true if and only if it is possible to reorder it such that arr[2 * i + 1] = 2 * arr[2 * i] for every 0 <= i < len(arr) / 2.
 * Constraints:
 * <p>
 * 0 <= arr.length <= 3 * 104
 * arr.length is even.
 * -105 <= arr[i] <= 105
 */

public class Problem11_ArrayOfDoubledPairs {
    public boolean canReorderDoubled(int[] arr) {
        if (arr == null || arr.length == 0) {
            return true;
        }
        Map<Integer, Integer> count = new TreeMap<>();
        for (int a : arr)
            count.put(a, count.getOrDefault(a, 0) + 1);
        for (int x : count.keySet()) {
            if (count.get(x) == 0) continue;
            int want = x < 0 ? x / 2 : x * 2;
            if (x < 0 && x % 2 != 0 || count.get(x) > count.getOrDefault(want, 0))
                return false;
            count.put(want, count.get(want) - count.get(x));
        }
        return true;
    }
}
