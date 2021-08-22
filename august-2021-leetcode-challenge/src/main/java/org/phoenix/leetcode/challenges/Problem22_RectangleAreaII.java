package org.phoenix.leetcode.challenges;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * We are given a list of (axis-aligned) rectangles. Each rectangle[i] = [xi1, yi1, xi2, yi2] , where (xi1, yi1) are the coordinates of the bottom-left corner, and (xi2, yi2) are the coordinates of the top-right corner of the ith rectangle.
 * <p>
 * Find the total area covered by all rectangles in the plane. Since the answer may be too large, return it modulo 109 + 7.
 * Constraints:
 * <p>
 * 1 <= rectangles.length <= 200
 * rectanges[i].length = 4
 * 0 <= rectangles[i][j] <= 109
 * The total area covered by all rectangles will never exceed 263 - 1 and thus will fit in a 64-bit signed integer.
 */

public class Problem22_RectangleAreaII {
    public int rectangleArea(int[][] rectangles) {
        final int MODULUS = 1000000007;
        List<Point> rectangleList = new ArrayList<>();
        for (int[] rectangle : rectangles) {
            rectangleList.add(new Point(rectangle[0], rectangle[1], 1));
            rectangleList.add(new Point(rectangle[0], rectangle[3], -1));
            rectangleList.add(new Point(rectangle[2], rectangle[1], -1));
            rectangleList.add(new Point(rectangle[2], rectangle[3], 1));
        }
        rectangleList.sort(Comparator.comparingInt(a -> a.x));
        Map<Integer, Integer> map = new TreeMap<>();
        int previousX = -1;
        int previousY = -1;
        int totalArea = 0;
        for (int i = 0; i < rectangleList.size(); i++) {
            Point point = rectangleList.get(i);
            map.put(point.y, map.getOrDefault(point.y, 0) + point.value);
            if (i == rectangleList.size() - 1 || rectangleList.get(i + 1).x > point.x) {
                if (previousX > -1) {
                    totalArea += ((long) previousY * (point.x - previousX)) % MODULUS;
                    totalArea %= MODULUS;
                }
                previousY = calculateY(map);
                previousX = point.x;
            }
        }
        return totalArea;
    }

    private int calculateY(Map<Integer, Integer> map) {
        int result = 0;
        int previous = -1;
        int count = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (previous >= 0 && count > 0) {
                result += entry.getKey() - previous;
            }
            count += entry.getValue();
            previous = entry.getKey();
        }
        return result;
    }

    static class Point {
        int x;
        int y;
        int value;

        Point(int x, int y, int value) {
            this.x = x;
            this.y = y;
            this.value = value;
        }
    }
}
