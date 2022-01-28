package org.phoenix.leetcode.challenges;

/**
 * Design a data structure that supports adding new words and finding if a string matches any previously added string.
 * <p>
 * Implement the WordDictionary class:
 * <p>
 * WordDictionary() Initializes the object.
 * void addWord(word) Adds word to the data structure, it can be matched later.
 * bool search(word) Returns true if there is any string in the data structure that matches word or false otherwise. word may contain dots '.' where dots can be matched with any letter.
 */

public class Problem28_DesignAddAndSearchWordsDataStructure {
    private Problem28_DesignAddAndSearchWordsDataStructure[] children;
    boolean isEndOfWord;

    // Initialize your data structure here.
    public Problem28_DesignAddAndSearchWordsDataStructure() {
        children = new Problem28_DesignAddAndSearchWordsDataStructure[26];
        isEndOfWord = false;
    }

    // Adds a word into the data structure.
    public void addWord(String word) {
        Problem28_DesignAddAndSearchWordsDataStructure curr = this;
        for (char c : word.toCharArray()) {
            if (curr.children[c - 'a'] == null)
                curr.children[c - 'a'] = new Problem28_DesignAddAndSearchWordsDataStructure();
            curr = curr.children[c - 'a'];
        }
        curr.isEndOfWord = true;
    }

    // Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter.
    public boolean search(String word) {
        Problem28_DesignAddAndSearchWordsDataStructure curr = this;
        for (int i = 0; i < word.length(); ++i) {
            char c = word.charAt(i);
            if (c == '.') {
                for (Problem28_DesignAddAndSearchWordsDataStructure ch : curr.children)
                    if (ch != null && ch.search(word.substring(i + 1))) return true;
                return false;
            }
            if (curr.children[c - 'a'] == null) return false;
            curr = curr.children[c - 'a'];
        }
        return curr != null && curr.isEndOfWord;
    }
}
