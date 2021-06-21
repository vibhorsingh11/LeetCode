package org.phoenix.leetcode.challenges;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an integer numRows, return the first numRows of Pascal's triangle.
 * <p>
 * In Pascal's triangle, each number is the sum of the two numbers directly above it.
 * Constraints:
 * <p>
 * 1 <= numRows <= 30
 */

public class Problem21_PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        // Resultant list
        List<List<Integer>> result = new ArrayList<>();
        // Base case
        if (numRows == 0) {
            return result;
        }
        result.add(new ArrayList<>());
        result.get(0).add(1);
        for (int rowNum = 1; rowNum < numRows; rowNum++) {
            List<Integer> row = new ArrayList<>();
            List<Integer> prevRow = result.get(rowNum - 1);

            // The first row element is always 1.
            row.add(1);

            // Each triangle element (other than the first and last of each row)
            // is equal to the sum of the elements above-and-to-the-left and
            // above-and-to-the-right.
            for (int j = 1; j < rowNum; j++) {
                row.add(prevRow.get(j - 1) + prevRow.get(j));
            }

            // The last row element is always 1.
            row.add(1);

            result.add(row);
        }
        return result;
    }
}
