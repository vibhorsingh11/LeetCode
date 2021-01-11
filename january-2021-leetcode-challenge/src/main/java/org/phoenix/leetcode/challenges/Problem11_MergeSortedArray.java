/*
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
 * The number of elements initialized in nums1 and nums2 are m and n respectively. You may assume that nums1 has enough
 * space (size that is equal to m + n) to hold additional elements from nums2.
 *
 * Example 1:
 * Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
 * Output: [1,2,2,3,5,6]
 *
 * Example 2:
 * Input: nums1 = [1], m = 1, nums2 = [], n = 0
 * Output: [1]
 *
 * Constraints:
 * 0 <= n, m <= 200
 * 1 <= n + m <= 200
 * nums1.length == m + n
 * nums2.length == n
 * -109 <= nums1[i], nums2[i] <= 109
 */
package org.phoenix.leetcode.challenges;

public class Problem11_MergeSortedArray {
    public int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int l = nums1.length - 1;
        m--;
        n--;
        while (m >= 0 && n >= 0) {
            if (nums1[m] > nums2[n])
                nums1[l--] = nums1[m--];
            else
                nums1[l--] = nums2[n--];
        }

        while (n >= 0)
            nums1[l--] = nums2[n--];

        return nums1;
    }
}
