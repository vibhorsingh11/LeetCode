package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem02_CorrespondingNodeInCloneOfTreeTest {

    private final Problem02_CorrespondingNodeInCloneOfTree test =
            new Problem02_CorrespondingNodeInCloneOfTree();

    @Test
    void getTargetCopy() {
        TreeNode original = new TreeNode(7);
        original.left = new TreeNode(4);
        original.right = new TreeNode(3);
        original.right.left = new TreeNode(6);
        original.right.right = new TreeNode(19);

        TreeNode cloned = new TreeNode(7);
        cloned.left = new TreeNode(4);
        cloned.right = new TreeNode(3);
        cloned.right.left = new TreeNode(6);
        cloned.right.right = new TreeNode(19);

        assertEquals(cloned.right, test.getTargetCopy(original, cloned, original.right));

    }
}