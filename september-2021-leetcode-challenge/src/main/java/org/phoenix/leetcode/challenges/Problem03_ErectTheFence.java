package org.phoenix.leetcode.challenges;

import java.util.HashSet;
import java.util.Set;

/**
 * You are given an array trees where trees[i] = [xi, yi] represents the location of a tree in the garden.
 * <p>
 * You are asked to fence the entire garden using the minimum length of rope as it is expensive. The garden is well fenced only if all the trees are enclosed.
 * <p>
 * Return the coordinates of trees that are exactly located on the fence perimeter.
 * Constraints:
 * <p>
 * 1 <= points.length <= 3000
 * points[i].length == 2
 * 0 <= xi, yi <= 100
 * All the given points are unique.
 */

public class Problem03_ErectTheFence {
    public int[][] outerTrees(int[][] trees) {
        if (trees == null || trees.length < 4) {
            return trees;
        }
        int n = trees.length;
        Set<int[]> points = new HashSet<>();
        int[] tree = trees[0];
        int firstIndex = 0;
        for (int i = 1; i < n; i++) {
            if (trees[i][0] < tree[0]) {
                tree = trees[i];
                firstIndex = i;
            }
        }
        points.add(tree);
        int[] current = tree;
        int currentIndex = firstIndex;
        do {
            int[] next = trees[0];
            int nextIndex = 0;
            for (int i = 1; i < n; i++) {
                if (i == currentIndex) {
                    continue;
                }
                int cross = crossProductLength(current, trees[i], next);
                if (nextIndex == currentIndex
                        || cross > 0
                        || (cross == 0 && distance(trees[i], current) > distance(next, current))) {
                    next = trees[i];
                    nextIndex = i;
                }
            }
            for (int i = 0; i < n; i++) {
                if (i == currentIndex) {
                    continue;
                }
                int cross = crossProductLength(current, trees[i], next);
                if (cross == 0) {
                    points.add(trees[i]);
                }
            }
            current = next;
            currentIndex = nextIndex;
        } while (currentIndex != firstIndex);
        int[][] result = new int[points.size()][2];
        int index = 0;
        for (int[] point : points) {
            result[index] = point;
            index++;
        }
        return result;
    }

    private int distance(int[] A, int[] B) {
        return (A[0] - B[0]) * (A[0] - B[0]) + (A[1] - B[1]) * (A[1] - B[1]);
    }

    private int crossProductLength(int[] A, int[] B, int[] C) {
        int BAx = A[0] - B[0];
        int BAy = A[1] - B[1];
        int BCx = C[0] - B[0];
        int BCy = C[1] - B[1];
        return BAx * BCy - BAy * BCx;
    }
}
