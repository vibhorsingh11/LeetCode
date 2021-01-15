/*
 * You are given an integer n. An array nums of length n + 1 is generated in the following way:
 * nums[0] = 0
 * nums[1] = 1
 * nums[2 * i] = nums[i] when 2 <= 2 * i <= n
 * nums[2 * i + 1] = nums[i] + nums[i + 1] when 2 <= 2 * i + 1 <= n
 * eturn the maximum integer in the array nums​​​.
 *
 * Example 1:
 * Input: n = 7
 * Output: 3
 * Explanation: According to the given rules:
 * nums[0] = 0
 * nums[1] = 1
 * nums[(1 * 2) = 2] = nums[1] = 1
 * nums[(1 * 2) + 1 = 3] = nums[1] + nums[2] = 1 + 1 = 2
 * nums[(2 * 2) = 4] = nums[2] = 1
 * nums[(2 * 2) + 1 = 5] = nums[2] + nums[3] = 1 + 2 = 3
 * nums[(3 * 2) = 6] = nums[3] = 2
 * nums[(3 * 2) + 1 = 7] = nums[3] + nums[4] = 2 + 1 = 3
 * Hence, nums = [0,1,1,2,1,3,2,3], and the maximum is 3.
 */
package org.phoenix.leetcode.challenges;

public class Problem15_GetMaximumInGeneratedArray {
    public int getMaximumGenerated(int n) {
        if (n <= 1) {
            return n;
        }
        int[] arr = new int[n + 1];
        arr[0] = 0;
        arr[1] = 1;
        int index = 2;
        int max = Integer.MIN_VALUE;

        while (index <= n) {
            if (index % 2 == 0) {
                arr[index] = arr[index / 2];
            } else {
                arr[index] = arr[index / 2] + arr[index / 2 + 1];
            }
            max = Math.max(max, arr[index]);
            index++;
        }
        return max;
    }
}
