package org.phoenix.leetcode.challenges;

/**
 * Given an array of integers nums, half of the integers in nums are odd, and the other half are even.
 * <p>
 * Sort the array so that whenever nums[i] is odd, i is odd, and whenever nums[i] is even, i is even.
 * <p>
 * Return any answer array that satisfies this condition.
 * Constraints:
 * <p>
 * 2 <= nums.length <= 2 * 104
 * nums.length is even.
 * Half of the integers in nums are even.
 * 0 <= nums[i] <= 1000
 * <p>
 * <p>
 * Follow Up: Could you solve it in-place?
 */

public class Problem28_SortArrayByParityII {
    public int[] sortArrayByParityII(int[] nums) {
        int even = 0, odd = nums.length - 1;
        while (even < nums.length && odd > -1) {
            if (nums[even] % 2 == 0 && nums[odd] % 2 == 1) {
                even += 2;
                odd -= 2;
            } else if (nums[even] % 2 == 1 && nums[odd] % 2 == 1) {
                odd -= 2;
            } else if (nums[even] % 2 == 0 && nums[odd] % 2 == 0) {
                even += 2;
            } else if (nums[even] % 2 == 1 && nums[odd] % 2 == 0) {
                int temp = nums[even];
                nums[even] = nums[odd];
                nums[odd] = temp;
                even += 2;
                odd -= 2;
            }
        }
        return nums;
    }
}
