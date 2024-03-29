package org.phoenix.leetcode.challenges;

import java.util.HashSet;

/**
 * Given an integer array nums, in which exactly two elements appear only once and all the other elements appear exactly twice. Find the two elements that appear only once. You can return the answer in any order.
 * <p>
 * You must write an algorithm that runs in linear runtime complexity and uses only constant extra space.
 * <p>
 * Constraints:
 * <p>
 * 2 <= nums.length <= 3 * 104
 * -231 <= nums[i] <= 231 - 1
 * Each integer in nums will appear twice, only two integers will appear once.
 */

public class Problem06_SingleNumberIII {
    public int[] singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int[] ans = new int[2];
        for (int num : nums) {
            if (set.contains(num))
                set.remove(num);
            else
                set.add(num);
        }
        int j = 0;
        for (int n : set)
            ans[j++] = n;
        return ans;
    }
}
