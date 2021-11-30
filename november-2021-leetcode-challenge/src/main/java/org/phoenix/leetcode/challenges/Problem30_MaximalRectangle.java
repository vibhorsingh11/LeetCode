package org.phoenix.leetcode.challenges;

import java.util.Arrays;
import java.util.Stack;

/**
 * Given a rows x cols binary matrix filled with 0's and 1's, find the largest rectangle containing only 1's and return its area.
 * Constraints:
 * <p>
 * rows == matrix.length
 * cols == matrix[i].length
 * 0 <= row, cols <= 200
 * matrix[i][j] is '0' or '1'.
 */

public class Problem30_MaximalRectangle {
    public int maximalRectangle(char[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return 0;
        }
        int rows = matrix.length;
        int columns = matrix[0].length;
        int[] rowArray = new int[columns];
        for (int i = 0; i < columns; i++) {
            rowArray[i] = matrix[0][i] - '0';
        }
        int maxArea = largestRectangleInHistogram(rowArray);
        for (int i = 1; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (matrix[i][j] == '0') {
                    rowArray[j] = 0;
                } else {
                    rowArray[j] += matrix[i][j] - '0';
                }
            }
            maxArea = Math.max(maxArea, largestRectangleInHistogram(rowArray));
        }
        return maxArea;
    }

    private int largestRectangleInHistogram(int[] heights) {
        if (heights == null || heights.length == 0) {
            return 0;
        }
        if (heights.length == 1) {
            return heights[0];
        }
        Stack<Integer> indices = new Stack<>();
        int[] heightsCopy = Arrays.copyOf(heights, heights.length + 1);
        int maxArea = 0;
        int index = 0;
        while (index < heightsCopy.length) {
            if (indices.isEmpty() || heightsCopy[index] > heights[indices.peek()]) {
                indices.push(index);
                index++;
            } else {
                int top = indices.pop();
                int localArea = heightsCopy[top] * (indices.isEmpty() ? index : index - indices.peek() - 1);
                maxArea = Math.max(maxArea, localArea);
            }
        }
        return maxArea;
    }
}
