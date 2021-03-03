/**
 * Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is
 * missing from the array.
 * <p>
 * Follow up: Could you implement a solution using only O(1) extra space complexity and O(n) runtime complexity?
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [3,0,1]
 * Output: 2
 * Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the
 * range since it does not appear in nums.
 * Constraints:
 * <p>
 * n == nums.length
 * 1 <= n <= 104
 * 0 <= nums[i] <= n
 * All the numbers of nums are unique.
 */
package org.phoenix.leetcode.challenges;

public class Problem03_MissingNumber {
    public int missingNumber(int[] nums) {
        // Length of array
        int n = nums.length;
        // Calculating the sum
        int res = n * (n + 1) / 2;
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return res - sum;
    }
}
