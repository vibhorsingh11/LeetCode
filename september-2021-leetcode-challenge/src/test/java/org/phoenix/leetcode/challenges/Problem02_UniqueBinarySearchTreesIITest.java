package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;
import org.phoenix.leetcode.challenges.Problem02_UniqueBinarySearchTreesII.TreeNode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Problem02_UniqueBinarySearchTreesIITest {

    private final Problem02_UniqueBinarySearchTreesII test = new Problem02_UniqueBinarySearchTreesII();

    @Test
    void generateTrees() {
        List<TreeNode> expected = test.generateTrees(3);
        List<Integer> values = Arrays.asList(1, 1, 2, 3, 3);
        for (int i = 0; i < expected.size(); i++) {
            assertEquals(expected.get(i).val, values.get(i));
        }

        expected = test.generateTrees(1);
        values = Collections.singletonList(1);
        assertEquals(expected.get(0).val, values.get(0));
    }
}