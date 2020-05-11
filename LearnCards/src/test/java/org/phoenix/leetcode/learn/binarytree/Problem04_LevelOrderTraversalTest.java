package org.phoenix.leetcode.learn.binarytree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.phoenix.leetcode.learn.binarytree.Problem04_LevelOrderTraversal.TreeNode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Problem04_LevelOrderTraversalTest {

    private final Problem04_LevelOrderTraversal test = new Problem04_LevelOrderTraversal();

    @Test
    void levelOrder() {
        TreeNode node = new TreeNode(3);
        node.left = new TreeNode(9);
        node.right = new TreeNode(20);
        node.right.left = new TreeNode(15);
        node.right.right = new TreeNode(7);

        Integer[][] expectedArray = new Integer[][]{{3}, {9, 20}, {15, 7}};
        List<List<Integer>> expected = Arrays.stream(expectedArray)
                .map(Arrays::asList)
                .collect(Collectors.toList());

        assertEquals(expected, test.levelOrder(node));
    }
}