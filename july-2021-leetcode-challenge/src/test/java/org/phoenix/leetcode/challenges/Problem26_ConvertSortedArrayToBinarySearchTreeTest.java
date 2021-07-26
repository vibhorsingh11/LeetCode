package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.phoenix.leetcode.challenges.Problem26_ConvertSortedArrayToBinarySearchTree.TreeNode;

class Problem26_ConvertSortedArrayToBinarySearchTreeTest {

    private final Problem26_ConvertSortedArrayToBinarySearchTree test = new Problem26_ConvertSortedArrayToBinarySearchTree();

    @Test
    void sortedArrayToBST() {
        int[] nums = new int[]{-10, -3, 0, 5, 9};
        TreeNode expected = test.sortedArrayToBST(nums);
        assertEquals(0, expected.val);
        assertEquals(-10, expected.left.val);
        assertEquals(-3, expected.left.right.val);
        assertEquals(5, expected.right.val);
        assertEquals(9, expected.right.right.val);
    }
}