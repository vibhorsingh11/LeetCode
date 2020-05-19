package org.phoenix.leetcode.learn.binarytree;

public class Problem13_SerializeAndDeserialize {

    String s;
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root == null){
            s += "," + "null";
            return null;
        }
        s += "," + root.val;
        serialize(root.left);
        serialize(root.right);
        return s.substring(5);
    }
    int index = 0;
    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] arr = data.split(",");
        return helper(arr);
    }

    public TreeNode helper(String[] arr) {
        if(index == arr.length || arr[index].equals("null")){
            index++;
            return null;
        }
        TreeNode node = new TreeNode(Integer.parseInt(arr[index]));
        index++;
        node.left = helper(arr);
        node.right = helper(arr);
        return node;
    }

    // Definition for a binary tree node.
    public static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
    }
}
