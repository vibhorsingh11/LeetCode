package org.phoenix.leetcode.learn.binarytree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import org.phoenix.leetcode.learn.binarytree.Problem13_SerializeAndDeserialize.TreeNode;

class Problem13_SerializeAndDeserializeTest {

    private final Problem13_SerializeAndDeserialize test = new Problem13_SerializeAndDeserialize();

    @Test
    void serialize() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(5);

//        assertEquals("1,2,null,null,3,4,null,null,5,null,null",test.serialize(root));
        String s = "1,2,null,null,3,4,null,null,5,null,null";
        assertEquals(5,test.deserialize(s).right.right.val);
    }

    @Test
    void deserialize() {
    }
}