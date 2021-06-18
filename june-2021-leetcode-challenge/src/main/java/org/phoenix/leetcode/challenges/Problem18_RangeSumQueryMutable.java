package org.phoenix.leetcode.challenges;

/**
 * Given an integer array nums, handle multiple queries of the following types:
 * <p>
 * Update the value of an element in nums.
 * Calculate the sum of the elements of nums between indices left and right inclusive where left <= right.
 * Implement the NumArray class:
 * <p>
 * NumArray(int[] nums) Initializes the object with the integer array nums.
 * void update(int index, int val) Updates the value of nums[index] to be val.
 * int sumRange(int left, int right) Returns the sum of the elements of nums between indices left and right inclusive (i.e. nums[left] + nums[left + 1] + ... + nums[right]).
 * Constraints:
 * <p>
 * 1 <= nums.length <= 3 * 104
 * -100 <= nums[i] <= 100
 * 0 <= index < nums.length
 * -100 <= val <= 100
 * 0 <= left <= right < nums.length
 * At most 3 * 104 calls will be made to update and sumRange.
 */

public class Problem18_RangeSumQueryMutable {
    int[] tree;
    int n;

    public Problem18_RangeSumQueryMutable(int[] nums) {
        n = nums.length;
        tree = new int[n << 1];
        buildTree(nums);
    }

    private void buildTree(int[] nums) {
        for (int i = n; i < n << 1; i++) {
            tree[i] = nums[i - n];
        }

        for (int i = n - 1; i > 0; i--) {
            tree[i] = tree[i << 1] + tree[i << 1 | 1];
        }
    }

    void update(int i, int val) {
        for (tree[i += n] = val; i > 0; i >>= 1) {
            tree[i >> 1] = tree[i] + tree[i ^ 1];
        }
    }

    public int sumRange(int i, int j) {
        int ret = 0;
        for (i += n, j += n; i <= j; i >>= 1, j >>= 1) {
            if ((i & 1) == 1) ret += tree[i++];
            if ((j & 1) == 0) ret += tree[j--];
        }
        return ret;
    }
}
