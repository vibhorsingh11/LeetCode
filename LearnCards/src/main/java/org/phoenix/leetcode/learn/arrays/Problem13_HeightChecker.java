package org.phoenix.leetcode.learn.arrays;

/*
 * Students are asked to stand in non-decreasing order of heights for an annual photo.
 * Return the minimum number of students that must move in order for all students to be standing in
 * non-decreasing order of height.
 *
 * Notice that when a group of students is selected they can reorder in any possible way between themselves
 * and the non selected students remain on their seats.
 *
 * Example 1:
 * Input: heights = [1,1,4,2,1,3]
 * Output: 3
 *
 * Explanation:
 * Current array : [1,1,4,2,1,3]
 * Target array  : [1,1,1,2,3,4]
 * On index 2 (0-based) we have 4 vs 1 so we have to move this student.
 * On index 4 (0-based) we have 1 vs 3 so we have to move this student.
 * On index 5 (0-based) we have 3 vs 4 so we have to move this student.*/

import java.util.Arrays;

public class Problem13_HeightChecker {

    public int heightChecker(int[] heights) {
        // Cloning array to new array, then sorting the new array
        int[] sortHeights = heights.clone();
        Arrays.sort(sortHeights);
        int count = 0;
        // Looping over the array and comparing it with the new array
        for (int i = 0; i < heights.length; i++) {
            if (sortHeights[i] != heights[i]) {
                count++;
            }
        }
        return count;
    }
}
