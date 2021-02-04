/*
 * We define a harmonious array as an array where the difference between its maximum value and its minimum value is exactly 1.
 * Given an integer array nums, return the length of its longest harmonious subsequence among all its possible subsequences.
 * A subsequence of array is a sequence that can be derived from the array by deleting some or no elements without
 * changing the order of the remaining elements.
 * Example 1:
 * Input: nums = [1,3,2,2,5,2,3,7]
 * Output: 5
 * Explanation: The longest harmonious subsequence is [3,2,2,2,3].
 *
 * Constraints:
 * 1 <= nums.length <= 2 * 104
 * -109 <= nums[i] <= 109
 */
package org.phoenix.leetcode.challenges;

import java.util.HashMap;

public class Problem04_LongestHarmoniousSubsequence {
    public int findLHS(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int res = 0;
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int key : map.keySet()) {
            if (map.containsKey(key + 1))
                res = Math.max(res, map.get(key) + map.get(key + 1));
        }
        return res;
    }
}
