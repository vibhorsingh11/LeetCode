/**
 * Given an integer array nums, return the length of the longest wiggle sequence.
 * <p>
 * A wiggle sequence is a sequence where the differences between successive numbers strictly alternate between positive
 * and negative. The first difference (if one exists) may be either positive or negative. A sequence with fewer than two
 * elements is trivially a wiggle sequence.
 * <p>
 * For example, [1, 7, 4, 9, 2, 5] is a wiggle sequence because the differences (6, -3, 5, -7, 3) are alternately positive
 * and negative.
 * In contrast, [1, 4, 7, 2, 5] and [1, 7, 4, 5, 5] are not wiggle sequences, the first because its first two differences
 * are positive and the second because its last difference is zero.
 * A subsequence is obtained by deleting some elements (eventually, also zero) from the original sequence, leaving the
 * remaining elements in their original order.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [1,7,4,9,2,5]
 * Output: 6
 * Explanation: The entire sequence is a wiggle sequence.
 * Constraints:
 * <p>
 * 1 <= nums.length <= 1000
 * 0 <= nums[i] <= 1000
 * <p>
 * Follow up: Could you solve this in O(n) time?
 */
package org.phoenix.leetcode.challenges;

public class Problem18_WiggleSubsequence {
    public int wiggleMaxLength(int[] nums) {
        int longestWiggleSubsequence = 1;
        int lastSign = 0;
        for (int i = 1; i < nums.length; i++) {
            int currentSign = getSign(nums[i] - nums[i - 1]);
            if (currentSign != 0 && currentSign != lastSign) {
                lastSign = currentSign;
                longestWiggleSubsequence++;
            }
        }
        return longestWiggleSubsequence;
    }

    private int getSign(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n > 0 ? 1 : -1;
        }
    }
}
