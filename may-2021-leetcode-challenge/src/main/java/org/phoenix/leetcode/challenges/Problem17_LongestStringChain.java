package org.phoenix.leetcode.challenges;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/**
 * Given a list of words, each word consists of English lowercase letters.
 * <p>
 * Let's say word1 is a predecessor of word2 if and only if we can add exactly one letter anywhere in word1 to make it
 * equal to word2. For example, "abc" is a predecessor of "abac".
 * <p>
 * A word chain is a sequence of words [word_1, word_2, ..., word_k] with k >= 1, where word_1 is a predecessor of word_2,
 * word_2 is a predecessor of word_3, and so on.
 * <p>
 * Return the longest possible length of a word chain with words chosen from the given list of words.
 * Constraints:
 * <p>
 * 1 <= words.length <= 1000
 * 1 <= words[i].length <= 16
 * words[i] only consists of English lowercase letters.
 */

public class Problem17_LongestStringChain {
    public int longestStrChain(String[] words) {
        // Sorting array by length
        Arrays.sort(words, Comparator.comparingInt(String::length));
        // map to store words
        Map<String, Integer> map = new HashMap<>();
        // Max length of string
        int maxLength = 0;
        // looping over words array
        for (String word : words) {
            int current = 0;
            for (int i = 0; i < word.length(); i++) {
                String previous = word.substring(0, i) + word.substring(i + 1);
                current = Math.max(current, map.getOrDefault(previous, 0) + 1);
            }
            map.put(word, current);
            maxLength = Math.max(maxLength, current);
        }
        return maxLength;
    }
}
