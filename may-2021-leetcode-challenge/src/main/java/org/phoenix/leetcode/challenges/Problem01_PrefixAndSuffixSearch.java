package org.phoenix.leetcode.challenges;

/**
 * Design a special dictionary which has some words and allows you to search the words in it by a prefix and a suffix.
 * <p>
 * Implement the WordFilter class:
 * <p>
 * WordFilter(string[] words) Initializes the object with the words in the dictionary.
 * f(string prefix, string suffix) Returns the index of the word in the dictionary which has the prefix prefix and the suffix suffix. If there is more than one valid index, return the largest of them. If there is no such word in the dictionary, return -1.
 * <p>
 * Example 1:
 * <p>
 * Input
 * ["WordFilter", "f"]
 * [[["apple"]], ["a", "e"]]
 * Output
 * [null, 0]
 * <p>
 * Explanation
 * WordFilter wordFilter = new WordFilter(["apple"]);
 * wordFilter.f("a", "e"); // return 0, because the word at index 0 has prefix = "a" and suffix = 'e".
 * <p>
 * Constraints:
 * <p>
 * 1 <= words.length <= 15000
 * 1 <= words[i].length <= 10
 * 1 <= prefix.length, suffix.length <= 10
 * words[i], prefix and suffix consist of lower-case English letters only.
 * At most 15000 calls will be made to the function f.
 */

public class Problem01_PrefixAndSuffixSearch {
    static class WordFilter {
        private final TrieNode root;

        public WordFilter(String[] words) {
            root = new TrieNode();
            for (int i = 0; i < words.length; i++) {
                String word = "{" + words[i];
                insert(root, word, i);
                for (int j = 0; j < word.length(); j++) {
                    insert(root, word.substring(j + 1) + word, i);
                }
            }
        }

        private void insert(TrieNode root, String word, int weight) {
            TrieNode current = root;
            for (char c : word.toCharArray()) {
                int index = c - 'a';
                if (current.children[index] == null) {
                    current.children[index] = new TrieNode();
                }
                current = current.children[index];
                current.weight = weight;
            }
        }

        public int f(String prefix, String suffix) {
            TrieNode current = root;
            for (char c : (suffix + "{" + prefix).toCharArray()) {
                if (current.children[c - 'a'] == null) {
                    return -1;
                }
                current = current.children[c - 'a'];
            }
            return current.weight;
        }

        static class TrieNode {
            private final TrieNode[] children;
            private int weight;

            TrieNode() {
                this.weight = 0;
                this.children = new TrieNode[27];
            }
        }
    }
}
