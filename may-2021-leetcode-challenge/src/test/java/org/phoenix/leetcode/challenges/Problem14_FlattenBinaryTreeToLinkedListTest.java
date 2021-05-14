package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

class Problem14_FlattenBinaryTreeToLinkedListTest {

    private final Problem14_FlattenBinaryTreeToLinkedList test = new Problem14_FlattenBinaryTreeToLinkedList();

    @Test
    void flatten() {
        Problem14_FlattenBinaryTreeToLinkedList.TreeNode1 root = new Problem14_FlattenBinaryTreeToLinkedList.TreeNode1(1);
        root.left = new Problem14_FlattenBinaryTreeToLinkedList.TreeNode1(2);
        root.left.left = new Problem14_FlattenBinaryTreeToLinkedList.TreeNode1(3);
        root.left.right = new Problem14_FlattenBinaryTreeToLinkedList.TreeNode1(4);
        root.right = new Problem14_FlattenBinaryTreeToLinkedList.TreeNode1(5);
        root.right.right = new Problem14_FlattenBinaryTreeToLinkedList.TreeNode1(6);

        test.flatten(root);
    }
}