package org.phoenix.leetcode.challenges;

/**
 * Nearly everyone has used the Multiplication Table. The multiplication table of size m x n is an integer matrix mat where mat[i][j] == i * j (1-indexed).
 * <p>
 * Given three integers m, n, and k, return the kth smallest element in the m x n multiplication table.
 * Constraints:
 * <p>
 * 1 <= m, n <= 3 * 104
 * 1 <= k <= m * n
 */

public class Problem16_KthSmallestNumberInMultiplicationTable {
    public int findKthNumber(int m, int n, int k) {
        int left = 0, right = m * n;
        while (left < right) {
            int mid = (left + right) / 2, count = 0;
            for (int i = 1; i <= m; i++) {
                count += Math.min(n, mid / i);
            }
            if (count >= k) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}
