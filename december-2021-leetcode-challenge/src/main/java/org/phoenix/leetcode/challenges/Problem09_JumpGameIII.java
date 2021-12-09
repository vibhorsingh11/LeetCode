package org.phoenix.leetcode.challenges;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Given an array of non-negative integers arr, you are initially positioned at start index of the array. When you are at index i, you can jump to i + arr[i] or i - arr[i], check if you can reach to any index with value 0.
 * <p>
 * Notice that you can not jump outside of the array at any time.
 * Constraints:
 * <p>
 * 1 <= arr.length <= 5 * 104
 * 0 <= arr[i] < arr.length
 * 0 <= start < arr.length
 */

public class Problem09_JumpGameIII {
    public boolean canReach(int[] arr, int start) {
        int n = arr.length;
        Queue<Integer> q = new LinkedList<>();
        q.add(start);

        while (!q.isEmpty()) {
            int curr = q.poll();
            if (arr[curr] == 0) return true;
            if (arr[curr] < 0) continue;

            if (curr + arr[curr] < n) {
                q.add(curr + arr[curr]);
            }
            if (curr - arr[curr] >= 0) {
                q.add(curr - arr[curr]);
            }
            arr[curr] = -arr[curr];
        }
        return false;
    }
}
