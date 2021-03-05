package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem05_AverageOfLevelsInBinaryTreeTest {

    private final Problem05_AverageOfLevelsInBinaryTree test = new Problem05_AverageOfLevelsInBinaryTree();

    @Test
    void averageOfLevels() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        Double[] arr = new Double[]{3.0, 14.5, 11.0};
        assertEquals(Arrays.asList(arr), test.averageOfLevels(root));
    }
}