package org.phoenix.leetcode.challenges;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Given a list of strings words and a string pattern, return a list of words[i] that match pattern. You may return the answer in any order.
 * <p>
 * A word matches the pattern if there exists a permutation of letters p so that after replacing every letter x in the pattern with p(x), we get the desired word.
 * <p>
 * Recall that a permutation of letters is a bijection from letters to letters: every letter maps to another letter, and no two letters map to the same letter.
 * Constraints:
 * <p>
 * 1 <= pattern.length <= 20
 * 1 <= words.length <= 50
 * words[i].length == pattern.length
 * pattern and words[i] are lowercase English letters.
 */

public class Problem21_FindAndReplacePattern {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        // Result list
        List<String> matching = new ArrayList<>();
        // Base condition
        if (words.length == 0 || pattern == null) {
            return matching;
        }
        // Map to store the characters mapping
        Map<Character, Character> map = new HashMap<>();
        // Loop through the words array
        for (String word : words) {
            boolean isSame = true;
            if (word.length() == pattern.length()) {
                // Traverse each word char
                for (int i = 0; i < word.length(); i++) {
                    // Current char from pattern and word
                    char p = pattern.charAt(i);
                    char w = word.charAt(i);
                    if (!map.containsKey(p) && !map.containsValue(w)) {
                        map.put(p, w);
                    } else if (map.get(p) == null || w != map.get(p)) {
                        isSame = false;
                        break;
                    }
                }
                if (isSame) {
                    matching.add(word);
                }
            }
            map.clear();
        }
        return matching;
    }
}
