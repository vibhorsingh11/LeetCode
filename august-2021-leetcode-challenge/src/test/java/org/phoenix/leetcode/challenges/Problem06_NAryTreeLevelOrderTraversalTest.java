package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.phoenix.leetcode.challenges.Problem06_NAryTreeLevelOrderTraversal.Node;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Problem06_NAryTreeLevelOrderTraversalTest {

    private final Problem06_NAryTreeLevelOrderTraversal test = new Problem06_NAryTreeLevelOrderTraversal();

    @Test
    void levelOrder() {
        Node threeChildOne = new Node(5);
        Node threeChildTwo = new Node(6);
        Node rootChildOne = new Node(3);
        Node rootChildTwo = new Node(2, Arrays.asList(threeChildOne, threeChildTwo));
        Node rootChildThree = new Node(4);
        Node root = new Node(1, Arrays.asList(rootChildOne, rootChildTwo, rootChildThree));
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Collections.singletonList(1));
        expected.add(Arrays.asList(3, 2, 4));
        expected.add(Arrays.asList(5, 6));
        assertEquals(expected, test.levelOrder(root));
    }
}