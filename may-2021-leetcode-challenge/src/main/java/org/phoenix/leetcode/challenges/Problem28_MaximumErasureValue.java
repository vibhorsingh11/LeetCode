package org.phoenix.leetcode.challenges;

import java.util.HashSet;
import java.util.Set;

/**
 * You are given an array of positive integers nums and want to erase a subarray containing unique elements. The score you get by erasing the subarray is equal to the sum of its elements.
 * <p>
 * Return the maximum score you can get by erasing exactly one subarray.
 * <p>
 * An array b is called to be a subarray of a if it forms a contiguous subsequence of a, that is, if it is equal to a[l],a[l+1],...,a[r] for some (l,r).
 * Constraints:
 * <p>
 * 1 <= nums.length <= 105
 * 1 <= nums[i] <= 104
 */

public class Problem28_MaximumErasureValue {
    public int maximumUniqueSubarray(int[] nums) {
        // Edge Case
        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        // Set to elements of array
        Set<Integer> set = new HashSet<>();
        int i = 0, j = 0, sum = 0, max = 0;
        // Loop until two pointers are less than nums
        // array length
        while (i < nums.length && j < nums.length) {
            // If element is not in set than add it to set
            // and set the max value else
            // move the i counter and remove the element
            // from the set
            if (!set.contains(nums[j])) {
                sum += nums[j];
                max = Math.max(max, sum);
                set.add(nums[j]);
                j++;
            } else {
                sum -= nums[i];
                set.remove(nums[i]);
                i++;
            }
        }
        return max;
    }
}
