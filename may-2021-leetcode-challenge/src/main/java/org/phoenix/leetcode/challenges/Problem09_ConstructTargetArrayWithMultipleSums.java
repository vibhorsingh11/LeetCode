package org.phoenix.leetcode.challenges;

import java.util.PriorityQueue;

/**
 * Given an array of integers target. From a starting array, A consisting of all 1's, you may perform the following procedure:
 * <p>
 * let x be the sum of all elements currently in your array.
 * choose index i, such that 0 <= i < target.size and set the value of A at index i to x.
 * You may repeat this procedure as many times as needed.
 * Return True if it is possible to construct the target array from A otherwise return False.
 * <p>
 * Example 1:
 * Input: target = [9,3,5]
 * Output: true
 * Explanation: Start with [1, 1, 1]
 * [1, 1, 1], sum = 3 choose index 1
 * [1, 3, 1], sum = 5 choose index 2
 * [1, 3, 5], sum = 9 choose index 0
 * [9, 3, 5] Done
 * <p>
 * Constraints:
 * N == target.length
 * 1 <= target.length <= 5 * 10^4
 * 1 <= target[i] <= 10^9
 */

public class Problem09_ConstructTargetArrayWithMultipleSums {
    public boolean isPossible(int[] target) {
        // Queue to store all elements
        PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> (b - a));
        //Total of target array elements
        long total = 0;
        for (int n : target) {
            queue.add(n);
            total += n;
        }
        // loop until queue is empty
        while (!queue.isEmpty()) {
            int temp = queue.poll();
            // Deducting temp from total
            total -= temp;
            // If total is 1 now the its possible
            if (temp == 1 || total == 1) {
                return true;
            }
            if (temp < total || total == 0 || temp % total == 0) {
                return false;
            }
            temp %= total;
            total += temp;
            queue.add(temp);
        }
        return true;
    }
}
