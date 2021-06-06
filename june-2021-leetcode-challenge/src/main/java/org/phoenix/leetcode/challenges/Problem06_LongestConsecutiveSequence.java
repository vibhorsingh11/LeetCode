package org.phoenix.leetcode.challenges;

import java.util.HashSet;
import java.util.Set;

/**
 * Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
 * <p>
 * You must write an algorithm that runs in O(n) time.
 * Constraints:
 * <p>
 * 0 <= nums.length <= 105
 * -109 <= nums[i] <= 109
 */

public class Problem06_LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int max = 0;

        for (int num : nums) {
            if (!set.contains(num - 1)) {
                int count = 0;
                while (set.contains(num++)) count++;
                max = Math.max(max, count);
            }
        }
        return max;
    }
}
