package org.phoenix.leetcode.challenges;

/**
 * Suppose an array of length n sorted in ascending order is rotated between 1 and n times. For example, the array nums = [0,1,4,4,5,6,7] might become:
 * <p>
 * [4,5,6,7,0,1,4] if it was rotated 4 times.
 * [0,1,4,4,5,6,7] if it was rotated 7 times.
 * Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time results in the array [a[n-1], a[0], a[1], a[2], ..., a[n-2]].
 * <p>
 * Given the sorted rotated array nums that may contain duplicates, return the minimum element of this array.
 * <p>
 * You must decrease the overall operation steps as much as possible.
 * Constraints:
 * <p>
 * n == nums.length
 * 1 <= n <= 5000
 * -5000 <= nums[i] <= 5000
 * nums is sorted and rotated between 1 and n times.
 */

public class Problem23_FindMinimumInRotatedSortedArrayII {
    public int findMin(int[] nums) {
        int l = 0, h = nums.length - 1;
        int min = Integer.MAX_VALUE;
        if (h == 0) {
            return nums[0];
        }
        while (l < h) {
            if (l + 1 == h) {
                return Math.min(min, Math.min(nums[l], nums[h]));
            }
            int m = l + (h - l) / 2;
            if (nums[l] <= nums[m]) {
                min = Math.min(min, nums[l]);
            }
            if (nums[m] <= nums[h]) {
                min = Math.min(min, nums[m]);
            }
            if (nums[l] > nums[m]) {
                h = m;
            } else if (nums[m] > nums[h]) {
                l = m;
            } else {
                h--;
            }
        }
        return min;
    }
}
