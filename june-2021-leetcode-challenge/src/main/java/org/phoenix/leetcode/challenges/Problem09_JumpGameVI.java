package org.phoenix.leetcode.challenges;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * You are given a 0-indexed integer array nums and an integer k.
 * <p>
 * You are initially standing at index 0. In one move, you can jump at most k steps forward without going outside the boundaries of the array. That is, you can jump from index i to any index in the range [i + 1, min(n - 1, i + k)] inclusive.
 * <p>
 * You want to reach the last index of the array (index n - 1). Your score is the sum of all nums[j] for each index j you visited in the array.
 * <p>
 * Return the maximum score you can get.
 * Constraints:
 * <p>
 * 1 <= nums.length, k <= 105
 * -104 <= nums[i] <= 104
 */

public class Problem09_JumpGameVI {
    public int maxResult(int[] nums, int k) {
        // Base case
        if (nums == null || nums.length == 0) {
            return 0;
        }
        // Priority Queue to store score and index
        Queue<int[]> pq = new PriorityQueue<>((a, b) -> b[0] - a[0]);
        // Adding first case
        pq.offer(new int[]{nums[0], 0});
        // Max value
        int max = nums[0];
        // Looping through the rest
        for (int i = 1; i < nums.length; i++) {
            while (pq.peek() != null && pq.peek()[1] < i - k) {
                pq.poll();
            }
            int[] current = pq.peek();
            if (current != null) {
                max = current[0] + nums[i];
            }
            pq.offer(new int[]{max, i});
        }
        return max;
    }
}
