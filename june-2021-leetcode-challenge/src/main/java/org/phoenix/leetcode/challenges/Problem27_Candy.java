package org.phoenix.leetcode.challenges;

import java.util.Arrays;

/**
 * There are n children standing in a line. Each child is assigned a rating value given in the integer array ratings.
 * <p>
 * You are giving candies to these children subjected to the following requirements:
 * <p>
 * Each child must have at least one candy.
 * Children with a higher rating get more candies than their neighbors.
 * Return the minimum number of candies you need to have to distribute the candies to the children.
 * Constraints:
 * <p>
 * n == ratings.length
 * 1 <= n <= 2 * 104
 * 0 <= ratings[i] <= 2 * 104
 */

public class Problem27_Candy {
    public int candy(int[] ratings) {
        // Base case
        if (ratings == null || ratings.length == 0) {
            return 0;
        }
        // Total children
        int n = ratings.length;
        // Array for left and right neighbours
        int[] leftNeighbour = new int[n];
        int[] rightNeighbour = new int[n];
        Arrays.fill(leftNeighbour, 1);
        Arrays.fill(rightNeighbour, 1);
        // Traverse left child and increment previous
        for (int i = 1; i < n; i++) {
            if (ratings[i] > ratings[i - 1]) {
                leftNeighbour[i] = leftNeighbour[i - 1] + 1;
            }
        }
        // Traverse right child and increment
        for (int i = n - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                rightNeighbour[i] = rightNeighbour[i + 1] + 1;
            }
        }
        // Maximum Candies required
        int candies = 0;
        for (int i = 0; i < n; i++) {
            candies += Math.max(leftNeighbour[i], rightNeighbour[i]);
        }
        return candies;
    }
}
