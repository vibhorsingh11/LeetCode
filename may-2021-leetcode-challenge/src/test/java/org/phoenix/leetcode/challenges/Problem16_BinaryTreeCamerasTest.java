package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem16_BinaryTreeCamerasTest {

    private final Problem16_BinaryTreeCameras test = new Problem16_BinaryTreeCameras();

    @Test
    void minCameraCover() {
        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(0);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(0);
        assertEquals(1, test.minCameraCover(root));
    }
}