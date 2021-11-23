package org.phoenix.leetcode.challenges;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * You are given an integer array of unique positive integers nums. Consider the following graph:
 * <p>
 * There are nums.length nodes, labeled nums[0] to nums[nums.length - 1],
 * There is an undirected edge between nums[i] and nums[j] if nums[i] and nums[j] share a common factor greater than 1.
 * Return the size of the largest connected component in the graph.
 * Constraints:
 * <p>
 * 1 <= nums.length <= 2 * 104
 * 1 <= nums[i] <= 105
 * All the values of nums are unique.
 */

public class Problem23_LargestComponentSizeByCommonFactor {
    public int largestComponentSize(int[] nums) {
        Map<Integer, Integer> parent = new HashMap<>();

        for (int num : nums)
            for (int fact = 2; fact * fact <= num; fact++)
                if (num % fact == 0) {
                    union(num, fact, parent);
                    union(num, num / fact, parent);
                }

        int max = 1;
        Map<Integer, Integer> freq = new HashMap<>();
        for (Integer v : nums) {
            int f = find(v, parent);
            if (freq.containsKey(f)) {
                freq.put(f, freq.get(f) + 1);
                max = Math.max(max, freq.get(f));
            } else freq.put(f, 1);
        }
        return max;
    }

    public void union(int n, int m, Map<Integer, Integer> p) {
        int findN = find(n, p);
        int findM = find(m, p);
        if (findN < findM) p.put(findM, findN);
        else p.put(findN, findM);
    }

    public int find(Integer i, Map<Integer, Integer> parent) {
        parent.putIfAbsent(i, i);
        while (!Objects.equals(i, parent.get(i))) i = parent.get(i);
        return i;
    }
}
