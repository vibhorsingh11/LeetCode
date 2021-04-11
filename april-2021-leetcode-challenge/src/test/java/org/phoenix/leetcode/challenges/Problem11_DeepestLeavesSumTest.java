package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem11_DeepestLeavesSumTest {

    private final Problem11_DeepestLeavesSum test = new Problem11_DeepestLeavesSum();

    @Test
    void deepestLeavesSum() {
        TreeNode head = new TreeNode(1);
        head.left = new TreeNode(2);
        head.left.left = new TreeNode(4);
        head.left.right = new TreeNode(5);
        head.left.left.left = new TreeNode(7);
        head.right = new TreeNode(3);
        head.right.right = new TreeNode(6);
        head.right.right.right = new TreeNode(8);

        assertEquals(15, test.deepestLeavesSum(head));
    }
}