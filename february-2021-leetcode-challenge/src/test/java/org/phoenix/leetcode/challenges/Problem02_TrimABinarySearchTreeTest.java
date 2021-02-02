package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class Problem02_TrimABinarySearchTreeTest {

    private final Problem02_TrimABinarySearchTree test = new Problem02_TrimABinarySearchTree();

    @Test
    void trimBST() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(0);
        root.right = new TreeNode(2);
        int low = 1;
        int high = 2;
        assertEquals(1, test.trimBST(root, low, high).val);
        assertNull(test.trimBST(root, low, high).left);
        assertEquals(2, test.trimBST(root, low, high).right.val);
    }
}