package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class Problem26_VerifyPreorderSerializationOfABinaryTreeTest {

    private final Problem26_VerifyPreorderSerializationOfABinaryTree test = new Problem26_VerifyPreorderSerializationOfABinaryTree();

    @Test
    void isValidSerialization() {
        String preorder = "9,3,4,#,#,1,#,#,2,#,6,#,#";
        assertTrue(test.isValidSerialization(preorder));
    }
}