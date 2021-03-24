/**
 * Given two arrays A and B of equal size, the advantage of A with respect to B is the number of indices i for which A[i] > B[i].
 * <p>
 * Return any permutation of A that maximizes its advantage with respect to B.
 * <p>
 * Example 1:
 * Input: A = [2,7,11,15], B = [1,10,4,11]
 * Output: [2,11,7,15]
 * Example 2:
 * Input: A = [12,24,8,32], B = [13,25,32,11]
 * Output: [24,32,8,12]
 * <p>
 * Note:
 * 1 <= A.length = B.length <= 10000
 * 0 <= A[i] <= 10^9
 * 0 <= B[i] <= 10^9
 */
package org.phoenix.leetcode.challenges;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Problem24_AdvantageShuffle {
    public int[] advantageCount(int[] A, int[] B) {
        // Result array
        int[] result = new int[A.length];
        // Priority Queue to store array B elements and
        // arranging in descending order
        PriorityQueue<int[]> pQueue = new PriorityQueue<>((a, b) -> (b[1] - a[1]));
        // Storing all elements to queue
        for (int i = 0; i < B.length; i++) {
            pQueue.offer(new int[]{i, B[i]});
        }
        // Variables for start and end index
        int low = 0, high = A.length - 1;
        // Sorting array A
        Arrays.sort(A);
        // Looping until queue is empty
        while (!pQueue.isEmpty()) {
            // removing element from queue
            int[] curr = pQueue.poll();
            // Splitting index and value
            int index = curr[0];
            int maxValue = curr[1];
            // If maxvalue if less then add value with high index
            // else add value with low index
            if (A[high] > maxValue) {
                result[index] = A[high--];
            } else {
                result[index] = A[low++];
            }
        }
        return result;
    }
}
