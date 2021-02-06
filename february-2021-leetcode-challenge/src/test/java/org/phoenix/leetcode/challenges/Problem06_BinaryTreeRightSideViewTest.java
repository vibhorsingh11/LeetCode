package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem06_BinaryTreeRightSideViewTest {

    private final Problem06_BinaryTreeRightSideView test = new Problem06_BinaryTreeRightSideView();

    @Test
    void rightSideView() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.right = new TreeNode(5);
        root.right = new TreeNode(3);
        root.right.right = new TreeNode(4);

        List<Integer> result = Arrays.asList(1, 3, 4);

        assertEquals(result, test.rightSideView(root));
    }
}