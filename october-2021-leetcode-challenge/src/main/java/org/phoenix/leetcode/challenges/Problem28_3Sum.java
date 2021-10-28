package org.phoenix.leetcode.challenges;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Problem28_3Sum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> answer = new LinkedList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            if (i == 0 || nums[i] != nums[i - 1]) {
                int low = i + 1;
                int high = nums.length - 1;
                while (low < high) {
                    if ((nums[low] + nums[high] + nums[i]) == 0) {
                        answer.add(Arrays.asList(nums[i], nums[low], nums[high]));
                        while (low < high && nums[low] == nums[low + 1]) low++;
                        while (low < high && nums[high] == nums[high - 1]) high--;

                        low++;
                        high--;
                    } else if (nums[low] + nums[high] + nums[i] > 0) {
                        high--;
                    } else {
                        low++;
                    }
                }
            }
        }
        return answer;
    }
}
