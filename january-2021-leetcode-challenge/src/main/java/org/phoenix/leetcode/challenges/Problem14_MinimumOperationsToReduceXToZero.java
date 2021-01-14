/*
 * You are given an integer array nums and an integer x. In one operation, you can either remove the leftmost or
 * the rightmost element from the array nums and subtract its value from x. Note that this modifies the array for future operations.
 * Return the minimum number of operations to reduce x to exactly 0 if it's possible, otherwise, return -1.
 *
 * Example 1:
 * Input: nums = [1,1,4,2,3], x = 5
 * Output: 2
 * Explanation: The optimal solution is to remove the last two elements to reduce x to zero.
 */
package org.phoenix.leetcode.challenges;

import java.util.HashMap;
import java.util.Map;

public class Problem14_MinimumOperationsToReduceXToZero {
    public int minOperations(int[] nums, int x) {
        int totalSum = 0;
        for (int el : nums) {
            totalSum += el;
        }
        int target = totalSum - x;

        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int maxLenSubArray = -1;
        int prefixSum = 0;
        for (int i = 0; i < nums.length; i++) {
            prefixSum += nums[i];
            map.put(prefixSum, i);
            if (map.containsKey(prefixSum - target)) {
                int currLenSubArray = i - map.get(prefixSum - target);
                maxLenSubArray = Math.max(maxLenSubArray, currLenSubArray);
            }
        }

        if (maxLenSubArray == -1) {
            return maxLenSubArray;
        } else {
            return nums.length - maxLenSubArray;
        }
    }
}
