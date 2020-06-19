package org.phoenix.leetcode.challenges;

/*
 * Given a string S, consider all duplicated substrings: (contiguous) substrings of S that occur 2 or
 * more times.  (The occurrences may overlap.)
 * Return any duplicated substring that has the longest possible length.
 * (If S does not have a duplicated substring, the answer is "".)
 *
 * Example 1:
 * Input: "banana"
 * Output: "ana"
 *
 * Example 2:
 * Input: "abcd"
 * Output: ""
 *
 * Note:
 * 2 <= S.length <= 10^5
 * S consists of lowercase English letters.
 */

public class Problem19_LongestDuplicateSubstring {
    /*A trie is a discrete data structure that's not quite well-known or widely-mentioned in typical algorithm courses,
        but nevertheless an important one.

    A trie (also known as a digital tree) and sometimes even radix tree or prefix tree (as they can be searched by prefixes)
    , is an ordered tree structure, which takes advantage of the keys that it stores – usually strings.

    A node's position in the tree defines the key with which that node is associated,
    which makes tries different in comparison to binary search trees, in which a node stores a key that corresponds only to that node.

    In a trie, every node (except the root node) stores one character or a digit.
    By traversing the trie down from the root node to a particular node n, a common prefix of characters or
    digits can be formed which is shared by other branches of the trie as well.
    */
    private String S;

    private static class TrieNode {
        // By storing indexes and offsets in the trie nodes, almost all string handling is avoided.
        private TrieNode[] next;
        private final int i;// i indicates the start position
        private int depth;

        public TrieNode(int i, int depth) {
            this.i = i;
            this.depth = depth;
        }
    }

    public String longestDupSubstring(String S) {
        this.S = S;
        int maxStart = 0, maxLength = 0;
        TrieNode root = new TrieNode(0, 0);
        for (int i = 1; i + maxLength < S.length(); i++) {
            int len = addNew(root, i);
            if (len > maxLength) {
                maxLength = len;
                maxStart = i;
            }
        }
        return S.substring(maxStart, maxStart + maxLength);
    }

    private boolean isLeaf(TrieNode node) {
        return node.next == null;
    }

    private int getIndex(int i, int depth) {
        return S.charAt(i + depth) - 'a';
    }

    private int addNew(TrieNode node, int i) {
        int depth = node.depth;
        if (i + depth == S.length()) return depth;
        if (isLeaf(node)) {
            node.next = new TrieNode[26];
            node.next[getIndex(node.i, node.depth)] = new TrieNode(node.i, depth + 1);
        }
        int c = getIndex(i, node.depth);
        TrieNode x = node.next[c];
        if (x == null) {
            node.next[c] = new TrieNode(i, depth + 1);
            return depth;
        }
        return addNew(x, i);
    }
}
