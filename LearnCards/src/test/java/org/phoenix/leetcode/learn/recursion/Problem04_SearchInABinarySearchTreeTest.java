package org.phoenix.leetcode.learn.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem04_SearchInABinarySearchTreeTest {

    private final Problem04_SearchInABinarySearchTree test = new Problem04_SearchInABinarySearchTree();

    @Test
    void searchBST() {
        TreeNode head = new TreeNode(4);
        head.left = new TreeNode(2);
        head.left.left = new TreeNode(1);
        head.right = new TreeNode(7);
        head.left.right = new TreeNode(3);
        assertEquals(2, test.searchBST(head, 2).val);
    }
}