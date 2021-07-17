package org.phoenix.leetcode.challenges;

import java.util.Arrays;

/**
 * <p>
 * You are given an array arr which consists of only zeros and ones, divide the array into three
 * non-empty parts such that all of these parts represent the same binary value.
 * <p>
 * If it is possible, return any [i, j] with i + 1 < j, such that:
 * <p>
 * arr[0], arr[1], ..., arr[i] is the first part,
 * arr[i + 1], arr[i + 2], ..., arr[j - 1] is the second part, and
 * arr[j], arr[j + 1], ..., arr[arr.length - 1] is the third part.
 * All three parts have equal binary values.
 * If it is not possible, return [-1, -1].
 * <p>
 * Note that the entire part is used when considering what binary value it represents. For example,
 * [1,1,0] represents 6 in decimal, not 3. Also, leading zeros are allowed, so [0,1,1] and [1,1]
 * represent the same value.
 * <p>
 * Constraints:
 * <p>
 * 3 <= arr.length <= 3 * 10^4
 * arr[i] is 0 or 1
 */

public class Problem17_ThreeEqualParts {
    public int[] threeEqualParts(int[] nums) {
        int[] result = new int[]{-1, -1};
        if (nums == null || nums.length == 0) {
            return result;
        }
        int sum = Arrays.stream(nums).sum();
        if (sum % 3 != 0) {
            return result;
        }
        if (sum == 0) {
            result[0] = 0;
            result[1] = nums.length - 1;
            return result;
        }
        int numberOfOnesInEachPart = sum / 3;
        int i = -1;
        int j = -1;
        int k = -1;
        sum = 0;
        for (int l = 0; l < nums.length; l++) {
            if (nums[l] == 1) {
                sum++;
                if (sum == numberOfOnesInEachPart + 1) {
                    j = l;
                } else if (sum == numberOfOnesInEachPart * 2 + 1) {
                    k = l;
                } else if (sum == 1) {
                    i = l;
                }
            }
        }
        while (k < nums.length) {
            if (nums[k] == nums[i] && nums[k] == nums[j]) {
                i++;
                j++;
                k++;
            } else {
                return result;
            }
        }
        result[0] = i - 1;
        result[1] = j;
        return result;
    }
}
