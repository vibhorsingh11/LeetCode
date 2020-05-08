package org.phoenix.leetcode.challenges;

/*
 * You are given an array coordinates, coordinates[i] = [x, y], where [x, y] represents the coordinate
 * of a point. Check if these points make a straight line in the XY plane.
 *
 * Example:
 * Input: coordinates = [[1,2],[2,3],[3,4],[4,5],[5,6],[6,7]]
 * Output: true
 * */

public class Problem08_CheckStraightLine {

    public boolean checkStraightLine(int[][] coordinates) {
        int[] point1 = coordinates[1];
        int[] point2 = coordinates[0];
        // calculating slope of first coordinate to the second
        float fSlope = slope(point1, point2);

        for (int i = 1; i < coordinates.length; i++) {
            int[] p1 = coordinates[i];
            int[] p2 = coordinates[0];
            // calculating the slope of current coordinates
            float slop = slope(p1, p2);
            // checking if their slope from the first point is same.
            if (fSlope != slop) return false;
        }
        return true;
    }

    // for calculating the slope of two points
    private float slope(int[] p1, int[] p2) {
        // checking if x axis is not 0 while calculating slope
        if ((p1[0] - p2[0]) == 0) return 0;
        return (float) (p2[1] - p1[1]) / (p2[0] - p1[0]);
    }
}
