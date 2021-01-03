/*
* Suppose you have n integers labeled 1 through n. A permutation of those n integers perm (1-indexed) is considered a
* beautiful arrangement if for every i (1 <= i <= n), either of the following is true:
*
* perm[i] is divisible by i.
* i is divisible by perm[i].
* Given an integer n, return the number of the beautiful arrangements that you can construct.
*
* Example 1:
* Input: n = 2
* Output: 2
* Explanation:
The first beautiful arrangement is [1,2]:
    - perm[1] = 1 is divisible by i = 1
    - perm[2] = 2 is divisible by i = 2
The second beautiful arrangement is [2,1]:
    - perm[1] = 2 is divisible by i = 1
    - i = 2 is divisible by perm[2] = 1
*/

package org.phoenix.leetcode.challenges;

public class Problem03_BeautifulArrangement {
    int count = 0;

    public int countArrangement(int n) {
        int[] nums = new int[n];
        for (int i = 0; i < n; i++)
            nums[i] = i + 1;
        permute(nums, 0);
        return count;
    }

    private void permute(int[] nums, int k) {
        if (k == nums.length)
            count++;
        for (int i = k; i < nums.length; i++) {
            swap(nums, i, k);
            if (nums[k] % (k + 1) == 0 || (k + 1) % nums[k] == 0)
                permute(nums, k + 1);
            swap(nums, i, k);
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
