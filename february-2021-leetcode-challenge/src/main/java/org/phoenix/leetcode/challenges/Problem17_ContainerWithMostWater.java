/*
 * Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai). n vertical lines
 * are drawn such that the two endpoints of the line i is at (i, ai) and (i, 0). Find two lines, which, together with
 * the x-axis forms a container, such that the container contains the most water.
 *
 * Notice that you may not slant the container.
 * Example 1:
 * Input: height = [1,8,6,2,5,4,8,3,7]
 * Output: 49
 * Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water
 *  (blue section) the container can contain is 49
 *
 * Constraints:
 * n == height.length
 * 2 <= n <= 3 * 104
 * 0 <= height[i] <= 3 * 104
 */
package org.phoenix.leetcode.challenges;

public class Problem17_ContainerWithMostWater {
    public int maxArea(int[] height) {
        // Initialize area
        int maxArea = Integer.MIN_VALUE;
        // Initialize two pointers
        int start = 0;
        int end = height.length - 1;
        // looping until start is smaller than end
        while (start < end) {
            // shorter bar value
            int shortBar = Math.min(height[start], height[end]);
            // check for max area
            maxArea = Math.max(maxArea, shortBar * (end - start));
            if (height[start] < height[end]) {
                start++;
            } else {
                end--;
            }
        }
        return maxArea;
    }
}
