/*
 * Find the kth largest element in an unsorted array. Note that it is the kth largest element in the sorted order, not the kth distinct element.
 * Example 1:
 * Input: [3,2,1,5,6,4] and k = 2
 * Output: 5
 *
 * Example 2:
 * Input: [3,2,3,1,2,4,5,5,6] and k = 4
 * Output: 4
 * Note:
 * You may assume k is always valid, 1 ≤ k ≤ array's length.
 */
package org.phoenix.leetcode.challenges;

public class Problem16_KthLargestElementInAnArray {
    public int findKthLargest(int[] nums, int k) {
        int start = 0;
        int end = nums.length - 1;
        int index = nums.length - k;
        while (start <= end) {
            int partionIndex = parition(nums, start, end);
            if (partionIndex == index) {
                return nums[index];
            } else if (partionIndex > index) {
                end = partionIndex - 1;
            } else {
                start = partionIndex + 1;
            }
        }
        return nums[start];
    }

    private int parition(int[] nums, int low, int high) {
        int i = low;
        int j = high;
        while (i < j) {
            while (i < j && nums[i] <= nums[high]) {
                i++;
            }
            while (i < j && nums[j] >= nums[high]) {
                j--;
            }
            swap(nums, i, j);
        }
        swap(nums, i, high);
        return i;


    }

    private void swap(int[] nums, int i, int j) {
        if (i != j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }
}
