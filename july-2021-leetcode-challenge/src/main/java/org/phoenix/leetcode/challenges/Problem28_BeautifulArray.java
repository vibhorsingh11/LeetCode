package org.phoenix.leetcode.challenges;

import java.util.ArrayList;
import java.util.List;

/**
 * For some fixed n, an array nums is beautiful if it is a permutation of the integers 1, 2, ..., n, such that:
 * <p>
 * For every i < j, there is no k with i < k < j such that nums[k] * 2 = nums[i] + nums[j].
 * <p>
 * Given n, return any beautiful array nums.  (It is guaranteed that one exists.)
 * Note:
 * <p>
 * 1 <= n <= 1000
 */

public class Problem28_BeautifulArray {
    public int[] beautifulArray(int n) {
        List<Integer> result = new ArrayList<>();
        result.add(1);
        while (result.size() < n) {
            List<Integer> temp = new ArrayList<>();
            for (int i : result) {
                if (i * 2 - 1 <= n) {
                    temp.add(i * 2 - 1);
                }
            }
            for (int i : result) {
                if (i * 2 <= n) {
                    temp.add(i * 2);
                }
            }
            result = temp;
        }
        return result.stream().mapToInt(i -> i).toArray();
    }
}
