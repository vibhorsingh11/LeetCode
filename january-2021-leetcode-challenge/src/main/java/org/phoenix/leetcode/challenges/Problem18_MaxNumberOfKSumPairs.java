/*
 * You are given an integer array nums and an integer k.
 * In one operation, you can pick two numbers from the array whose sum equals k and remove them from the array.
 * Return the maximum number of operations you can perform on the array.
 *
 * Example 1:
 * Input: nums = [1,2,3,4], k = 5
 * Output: 2
 * Explanation: Starting with nums = [1,2,3,4]:
 * - Remove numbers 1 and 4, then nums = [2,3]
 * - Remove numbers 2 and 3, then nums = []
 * There are no more pairs that sum up to 5, hence a total of 2 operations.
 */
package org.phoenix.leetcode.challenges;

import java.util.HashMap;
import java.util.Map;

public class Problem18_MaxNumberOfKSumPairs {
    public int maxOperations(int[] nums, int k) {
        int pairs = 0;
        if (nums.length <= 1) {
            return pairs;
        }
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            if (num < k) {
                frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
            }
        }
        for (int key : frequencyMap.keySet()) {
            pairs += Math.min(frequencyMap.getOrDefault(key, 0),
                    frequencyMap.getOrDefault(k - key, 0));
        }
        return pairs / 2;
    }
}
