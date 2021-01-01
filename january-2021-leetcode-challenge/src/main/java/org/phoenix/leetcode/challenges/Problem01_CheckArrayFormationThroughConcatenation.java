package org.phoenix.leetcode.challenges;

public class Problem01_CheckArrayFormationThroughConcatenation {
    public boolean canFormArray(int[] arr, int[][] pieces) {
        int[] indices = new int[101];
        for (int i = 0; i < arr.length; i++) {
            indices[arr[i]] = i + 1;
        }

        for (int[] piece : pieces) {
            if (indices[piece[0]] == 0) {
                return false;
            }
            for (int i = 1; i < piece.length; i++) {
                if (indices[piece[i]] - indices[piece[i - 1]] != 1) {
                    return false;
                }
            }
        }
        return true;
    }
}
