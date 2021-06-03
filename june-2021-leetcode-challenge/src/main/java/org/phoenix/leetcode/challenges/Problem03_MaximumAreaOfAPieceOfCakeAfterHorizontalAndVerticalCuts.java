package org.phoenix.leetcode.challenges;

import java.util.Arrays;

/**
 * Given a rectangular cake with height h and width w, and two arrays of integers horizontalCuts and verticalCuts where horizontalCuts[i] is the distance from the top of the rectangular cake to the ith horizontal cut and similarly, verticalCuts[j] is the distance from the left of the rectangular cake to the jth vertical cut.
 * <p>
 * Return the maximum area of a piece of cake after you cut at each horizontal and vertical position provided in the arrays horizontalCuts and verticalCuts. Since the answer can be a huge number, return this modulo 10^9 + 7.
 * Constraints:
 * <p>
 * 2 <= h, w <= 10^9
 * 1 <= horizontalCuts.length < min(h, 10^5)
 * 1 <= verticalCuts.length < min(w, 10^5)
 * 1 <= horizontalCuts[i] < h
 * 1 <= verticalCuts[i] < w
 * It is guaranteed that all elements in horizontalCuts are distinct.
 * It is guaranteed that all elements in verticalCuts are distinct.
 */

public class Problem03_MaximumAreaOfAPieceOfCakeAfterHorizontalAndVerticalCuts {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        // Sorting both arrays
        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);
        // Calculating max height
        int hMax = Math.max(horizontalCuts[0], h - horizontalCuts[horizontalCuts.length - 1]);
        for (int i = 1; i < horizontalCuts.length; i++) {
            hMax = Math.max(hMax, (horizontalCuts[i] - horizontalCuts[i - 1]));
        }
        // Calculating max width
        int vMax = Math.max(verticalCuts[0], w - verticalCuts[verticalCuts.length - 1]);
        for (int i = 1; i < verticalCuts.length; i++) {
            vMax = Math.max(vMax, (verticalCuts[i] - verticalCuts[i - 1]));
        }
        // Convert it to long as, it
        // generate some large values
        long ans = (long) hMax * vMax;
        // returning the answer
        return (int) (ans % 1000000007);
    }
}
