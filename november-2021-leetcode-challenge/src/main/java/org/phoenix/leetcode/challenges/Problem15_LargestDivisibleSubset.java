package org.phoenix.leetcode.challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given a set of distinct positive integers nums, return the largest subset answer such that every pair (answer[i], answer[j]) of elements in this subset satisfies:
 * <p>
 * answer[i] % answer[j] == 0, or
 * answer[j] % answer[i] == 0
 * If there are multiple solutions, return any of them.
 * Constraints:
 * <p>
 * 1 <= nums.length <= 1000
 * 1 <= nums[i] <= 2 * 109
 * All the integers in nums are unique.
 */

public class Problem15_LargestDivisibleSubset {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        List<Integer> result = new ArrayList<>();
        if (nums == null || nums.length == 0) return result;
        Arrays.sort(nums);
        int[] length = new int[nums.length];
        int[] index = new int[nums.length];
        Arrays.fill(length, 1);
        Arrays.fill(index, -1);
        int max = 0;
        int maxIndex = -1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (nums[i] % nums[j] == 0 && length[j] + 1 > length[i]) {
                    length[i] = length[j] + 1;
                    index[i] = j;
                }
            }
            if (max < length[i]) {
                max = length[i];
                maxIndex = i;
            }
        }
        int i = maxIndex;
        while (i >= 0) {
            result.add(nums[i]);
            i = index[i];
        }
        return result;
    }
}
