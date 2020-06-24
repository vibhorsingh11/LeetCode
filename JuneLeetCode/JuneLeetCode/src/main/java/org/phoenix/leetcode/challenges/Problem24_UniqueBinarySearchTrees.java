package org.phoenix.leetcode.challenges;

/*
* Given n, how many structurally unique BST's (binary search trees) that store values 1 ... n?
*
* Example:
* Input: 3
* Output: 5
* Explanation:
* Given n = 3, there are a total of 5 unique BST's:

   1         3     3      2      1
    \       /     /      / \      \
     3     2     1      1   3      2
    /     /       \                 \
   2     1         2                 3

*/

public class Problem24_UniqueBinarySearchTrees {
    public int numTrees(int n) {
        int[] dp = new int[n + 1];
        // base case
        dp[0] = 1;
        dp[1] = 1;
        // G(n) = (i - 1) * (n - 1)
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                dp[i] = dp[i] + (dp[i - j] * dp[j - 1]);
            }
        }
        return dp[n];
    }
}
