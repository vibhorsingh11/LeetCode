package org.phoenix.leetcode.learn.binarytree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.phoenix.leetcode.learn.binarytree.Problem12_LowestCommonAncestor.TreeNode;

class Problem12_LowestCommonAncestorTest {

    private final Problem12_LowestCommonAncestor test = new Problem12_LowestCommonAncestor();

    @Test
    void lowestCommonAncestor() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);
        
        root.right = new TreeNode(1);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);

        TreeNode p = new TreeNode(7);
        TreeNode q = new TreeNode(4);

        assertEquals(2, test.lowestCommonAncestor(root, p, q).val);
    }
}