package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.phoenix.leetcode.challenges.Problem05_HouseRobberIII.TreeNode;


class Problem05_HouseRobberIIITest {

    private final Problem05_HouseRobberIII test = new Problem05_HouseRobberIII();

    @Test
    void rob() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(3);
        root.right.right = new TreeNode(1);
        assertEquals(7, test.rob(root));
    }
}