package org.phoenix.leetcode.challenges;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an integer array nums, return the maximum difference between two successive elements in its sorted form. If the array contains less than two elements, return 0.
 * <p>
 * You must write an algorithm that runs in linear time and uses linear extra space.
 * Constraints:
 * <p>
 * 1 <= nums.length <= 104
 * 0 <= nums[i] <= 109
 */

public class Problem30_MaximumGap {
    public int maximumGap(int[] nums) {
        // Base case
        if (nums == null || nums.length < 2) {
            return 0;
        }
        // Highest and the lowest element of array
        int highest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;
        // Loop through the array and
        // find the highest and lowest
        for (int n : nums) {
            highest = Math.max(highest, n);
            lowest = Math.min(lowest, n);
        }
        // Setting size of bucket
        int bucketSize = Math.max((highest - lowest) / (nums.length - 1), 1);
        // Create buckets
        List<List<Integer>> buckets = new ArrayList<>();
        for (int i = (highest - lowest) / bucketSize; i >= 0; i--) {
            buckets.add(new ArrayList<>());
        }
        // Add numbers to their respective buckets
        for (int n : nums) {
            buckets.get((n - lowest) / bucketSize).add(n);
        }
        // Variable to store the maximum gap
        int maximumGap = Integer.MIN_VALUE;
        // Highest value in the current bucket
        int currentHighest = 0;
        // Lowest value in current bucket
        int currentLowest;
        // Loop through every bucket to find current highest and lowest
        for (List<Integer> bucket : buckets) {
            // If the bucket is empty, move on to the next bucket
            if (bucket.isEmpty()) {
                continue;
            }
            // Highest of the previous bucket
            int previousHighest = currentHighest > 0 ? currentHighest : bucket.get(0);
            currentLowest = bucket.get(0);
            // For every element in the bucket
            for (int element : bucket) {
                currentHighest = Math.max(currentHighest, element);
                currentLowest = Math.min(currentLowest, element);
            }
            maximumGap = Math.max(maximumGap, currentHighest - previousHighest);
        }
        return maximumGap;
    }
}
