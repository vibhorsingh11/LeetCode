package org.phoenix.leetcode.challenges;

import java.util.ArrayList;
import java.util.Arrays;

public class Problem27_PossibleBipartition {

    public boolean possibleBipartition(int N, int[][] dislikes) {
        // Groups
        int[] groups = new int[N];
        // Initialize all the elements in the array with -1
        Arrays.fill(groups, -1);
        // Adjacency list
        ArrayList<Integer>[] adjacencyList = new ArrayList[N];
        // Create lists for each node
        for (int i = 0; i < N; i++) {
            adjacencyList[i] = new ArrayList<>();
        }
        // Color the neighboring nodes
        for (int[] p : dislikes) {
            adjacencyList[p[0] - 1].add(p[1] - 1);
            adjacencyList[p[1] - 1].add(p[0] - 1);
        }
        // Check the levels of the neighbors
        for (int i = 0; i < N; i++) {
            if (groups[i] == -1 && !dfs(adjacencyList, groups, i, 0)) {
                return false;
            }
        }
        return true;
    }

    public boolean dfs(ArrayList<Integer>[] adjacencyList, int[] groups, int i, int j) {
        if (groups[i] == -1) {
            groups[i] = j;
        } else {
            return groups[i] == j;
        }
        for (Integer n : adjacencyList[i]) {
            if (!dfs(adjacencyList, groups, n, 1 - j)) {
                return false;
            }
        }
        return true;
    }
}
