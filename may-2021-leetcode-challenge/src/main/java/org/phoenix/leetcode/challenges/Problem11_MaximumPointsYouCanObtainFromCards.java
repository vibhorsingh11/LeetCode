package org.phoenix.leetcode.challenges;

/**
 * There are several cards arranged in a row, and each card has an associated number of points The points are given in the integer array cardPoints.
 * <p>
 * In one step, you can take one card from the beginning or from the end of the row. You have to take exactly k cards.
 * <p>
 * Your score is the sum of the points of the cards you have taken.
 * <p>
 * Given the integer array cardPoints and the integer k, return the maximum score you can obtain.
 * Constraints:
 * <p>
 * 1 <= cardPoints.length <= 10^5
 * 1 <= cardPoints[i] <= 10^4
 * 1 <= k <= cardPoints.length
 */

public class Problem11_MaximumPointsYouCanObtainFromCards {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int totalSum = 0;
        int currentWindowSum = 0;
        int start = 0;
        int end = 0;
        int minPoints = Integer.MAX_VALUE;
        while (end < n) {
            totalSum += cardPoints[end];
            currentWindowSum += cardPoints[end];
            if (end - start + 1 > n - k) {
                currentWindowSum -= cardPoints[start];
                start++;
            }
            if (end - start + 1 == n - k) {
                minPoints = Math.min(minPoints, currentWindowSum);
            }
            end++;
        }
        return totalSum - minPoints;
    }
}
