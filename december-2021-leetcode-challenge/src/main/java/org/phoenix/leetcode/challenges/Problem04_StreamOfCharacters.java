package org.phoenix.leetcode.challenges;

/**
 * Design an algorithm that accepts a stream of characters and checks if a suffix of these characters is a string of a given array of strings words.
 * <p>
 * For example, if words = ["abc", "xyz"] and the stream added the four characters (one by one) 'a', 'x', 'y', and 'z', your algorithm should detect that the suffix "xyz" of the characters "axyz" matches "xyz" from words.
 * <p>
 * Implement the StreamChecker class:
 * <p>
 * StreamChecker(String[] words) Initializes the object with the strings array words.
 * boolean query(char letter) Accepts a new character from the stream and returns true if any non-empty suffix from the stream forms a word that is in words.
 */

public class Problem04_StreamOfCharacters {
    static class TrieNode {
        boolean isWord;
        TrieNode[] children = new TrieNode[26];
    }

    TrieNode root = new TrieNode();
    int maxSize;
    StringBuilder sb = new StringBuilder();

    public Problem04_StreamOfCharacters(String[] words) {
        insert(words);
    }

    public boolean query(char letter) {
        if (sb.length() >= maxSize) {
            sb.deleteCharAt(0);
        }
        sb.append(letter);
        TrieNode curr = root;

        for (int i = sb.length() - 1; i >= 0; i--) {
            char ch = sb.charAt(i);

            if (curr != null) curr = curr.children[ch - 'a'];

            if (curr != null && curr.isWord) return true;
        }
        return false;
    }

    public void insert(String[] words) {

        for (String s : words) {
            maxSize = Math.max(maxSize, s.length());
            TrieNode curr = root;
            for (int i = s.length() - 1; i >= 0; i--) {
                char ch = s.charAt(i);
                if (curr.children[ch - 'a'] == null) {
                    curr.children[ch - 'a'] = new TrieNode();
                }
                curr = curr.children[ch - 'a'];
            }
            curr.isWord = true;
        }
    }
}
