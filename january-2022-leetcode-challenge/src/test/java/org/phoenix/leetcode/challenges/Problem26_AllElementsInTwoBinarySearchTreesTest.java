package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.phoenix.leetcode.challenges.Problem26_AllElementsInTwoBinarySearchTrees.TreeNode;

class Problem26_AllElementsInTwoBinarySearchTreesTest {

    private final Problem26_AllElementsInTwoBinarySearchTrees test = new Problem26_AllElementsInTwoBinarySearchTrees();

    @Test
    void getAllElements() {
        TreeNode root1 = new TreeNode(2);
        root1.left = new TreeNode(1);
        root1.right = new TreeNode(4);
        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(0);
        root2.right = new TreeNode(3);
        List<Integer> expected = Arrays.asList(0, 1, 1, 2, 3, 4);
        assertEquals(expected, test.getAllElements(root1, root2));
    }
}