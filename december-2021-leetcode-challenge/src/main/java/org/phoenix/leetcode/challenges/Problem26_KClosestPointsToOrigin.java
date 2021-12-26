package org.phoenix.leetcode.challenges;

import java.util.Arrays;

/**
 * <p>
 * Given an array of points where points[i] = [xi, yi] represents a point on the X-Y plane and an integer k,
 * return the k closest points to the origin (0, 0).
 * <p>
 * The distance between two points on the X-Y plane is the Euclidean distance (i.e., √(x1 - x2)^2 + (y1 - y2)^2).
 * <p>
 * You may return the answer in any order. The answer is guaranteed to be unique (except for the order that it is in).
 * <p>
 * Constraints:
 * <p>
 * 1 <= k <= points.length <= 10^4
 * -104 < xi, yi < 10^4
 */

public class Problem26_KClosestPointsToOrigin {
    public int[][] kClosest(int[][] points, int K) {
        int N = points.length;
        int[] dists = new int[N];
        for (int i = 0; i < N; ++i)
            dists[i] = dist(points[i]);

        Arrays.sort(dists);
        int distK = dists[K - 1];

        int[][] ans = new int[K][2];
        int t = 0;
        for (int[] point : points)
            if (dist(point) <= distK)
                ans[t++] = point;
        return ans;
    }

    public int dist(int[] point) {
        return point[0] * point[0] + point[1] * point[1];
    }
}
