package org.phoenix.leetcode.challenges;

import java.util.Arrays;

/**
 * You are assigned to put some amount of boxes onto one truck. You are given a 2D array boxTypes, where boxTypes[i] = [numberOfBoxesi, numberOfUnitsPerBoxi]:
 * <p>
 * numberOfBoxesi is the number of boxes of type i.
 * numberOfUnitsPerBoxi is the number of units in each box of the type i.
 * You are also given an integer truckSize, which is the maximum number of boxes that can be put on the truck. You can choose any boxes to put on the truck as long as the number of boxes does not exceed truckSize.
 * <p>
 * Return the maximum total number of units that can be put on the truck.
 * Constraints:
 * <p>
 * 1 <= boxTypes.length <= 1000
 * 1 <= numberOfBoxesi, numberOfUnitsPerBoxi <= 1000
 * 1 <= truckSize <= 106
 */

public class Problem14_MaximumUnitsOnATruck {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        // Base case
        if (boxTypes == null || boxTypes.length == 0) {
            return 0;
        }
        Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);
        int totalUnits = 0;
        for (int[] boxType : boxTypes) {
            int temp = Math.min(boxType[0], truckSize);
            totalUnits += temp * boxType[1];
            truckSize -= temp;
        }
        return totalUnits;
    }
}
