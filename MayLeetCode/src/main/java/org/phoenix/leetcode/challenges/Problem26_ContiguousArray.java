package org.phoenix.leetcode.challenges;

/*
 * Given a binary array, find the maximum length of a contiguous subarray with equal number of 0 and 1.
 *
 * Example 1:
 * Input: [0,1]
 * Output: 2
 * Explanation: [0, 1] is the longest contiguous subarray with equal number of 0 and 1.
 *
 * Example 2:
 * Input: [0,1,0]
 * Output: 2
 * Explanation: [0, 1] (or [1, 0]) is a longest contiguous subarray with equal number of 0 and 1.
 */

import java.util.HashMap;
import java.util.Map;

public class Problem26_ContiguousArray {
    public int findMaxLength(int[] nums) {
        // map for storing the count
        Map<Integer, Integer> map = new HashMap<>();
        // initializing the map
        map.put(0, -1);
        int max = 0;
        int sum = 0;
        // looping over the array
        for (int i = 0; i < nums.length; i++) {
            // calculating sum on 0 or 1 occurrence
            sum += (nums[i] == 0) ? -1 : 1;
            // it sum is in map calculate max contiguous length
            // else put it in map
            if (map.containsKey(sum)) {
                max = Math.max(max, i - map.get(sum));
            } else {
                map.put(sum, i);
            }
        }
        return max;
    }
}
