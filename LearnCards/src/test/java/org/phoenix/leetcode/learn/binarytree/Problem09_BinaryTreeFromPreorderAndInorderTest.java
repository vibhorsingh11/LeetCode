package org.phoenix.leetcode.learn.binarytree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem09_BinaryTreeFromPreorderAndInorderTest {

    private final Problem09_BinaryTreeFromPreorderAndInorder test = new Problem09_BinaryTreeFromPreorderAndInorder();

    @Test
    void buildTree() {
        int[] inOrder = new int[]{9, 3, 15, 20, 7};
        int[] preOrder = new int[]{3, 9, 20, 15, 7};

        assertEquals(3, test.buildTree(preOrder, inOrder).val);
        assertEquals(9, test.buildTree(preOrder, inOrder).left.val);
        assertEquals(15, test.buildTree(preOrder, inOrder).right.left.val);

        int[] inOrder1 = new int[]{1, 2};
        int[] preOrder1 = new int[]{1, 2};

        assertEquals(1, test.buildTree(preOrder1, inOrder1).val);
        assertEquals(2, test.buildTree(preOrder1, inOrder1).right.val);
    }
}