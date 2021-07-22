package org.phoenix.leetcode.challenges;

public class Problem22_PartitionArrayIntoDisjointIntervals {
    public int partitionDisjoint(int[] nums) {
        // Base case
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int localMax = nums[0];
        int globalMax = nums[0];
        int partitionIndex = 0;
        // Looping through the array
        for (int i = 1; i < nums.length; i++) {
            if (localMax > nums[i]) {
                localMax = globalMax;
                partitionIndex = i;
            } else {
                globalMax = Math.max(globalMax, nums[i]);
            }
        }
        return partitionIndex + 1;
    }
}
