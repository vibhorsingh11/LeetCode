package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.phoenix.leetcode.challenges.Problem04_PathSumII.TreeNode;

class Problem04_PathSumIITest {

    private final Problem04_PathSumII test = new Problem04_PathSumII();

    @Test
    void pathSum() {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);
        root.right = new TreeNode(8);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.left = new TreeNode(5);
        root.right.right.right = new TreeNode(1);

        System.out.println(test.pathSum(root, 22));
    }
}