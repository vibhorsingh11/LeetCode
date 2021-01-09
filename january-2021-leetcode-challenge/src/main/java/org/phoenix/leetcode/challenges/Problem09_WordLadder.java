/*
 * Given two words beginWord and endWord, and a dictionary wordList, return the length of the shortest transformation sequence from beginWord to endWord, such that:
 * Only one letter can be changed at a time.
 * Each transformed word must exist in the word list.
 * Return 0 if there is no such transformation sequence.
 *
 * Example 1:
 * Input: beginWord = "hit", endWord = "cog", wordList = ["hot","dot","dog","lot","log","cog"]
 * Output: 5
 * Explanation: As one shortest transformation is "hit" -> "hot" -> "dot" -> "dog" -> "cog", return its length 5.*/
package org.phoenix.leetcode.challenges;

import java.util.*;

public class Problem09_WordLadder {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<String> chain = new ArrayDeque<>();
        chain.add(beginWord);
        Set<String> dict = new HashSet<>(wordList);
        dict.remove(beginWord);

        int length = 0;
        while (!chain.isEmpty()) {
            length++;
            int size = chain.size();
            while (size-- > 0) {
                String word = chain.remove();
                if (word.equals(endWord)) {
                    return length;
                }

                for (int i = 0; i < word.length(); i++) {
                    String prefix = word.substring(0, i);
                    String suffix = word.substring(i + 1);
                    for (char c = 'a'; c <= 'z'; c++) {
                        String candidate = prefix + c + suffix;
                        if (dict.remove(candidate)) {
                            chain.add(candidate);
                        }
                    }
                }
            }
        }
        return 0;
    }
}
