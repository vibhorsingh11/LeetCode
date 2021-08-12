package org.phoenix.leetcode.challenges;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Given an array of strings strs, group the anagrams together. You can return the answer in any order.
 * <p>
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
 * Constraints:
 * <p>
 * 1 <= strs.length <= 104
 * 0 <= strs[i].length <= 100
 * strs[i] consists of lower-case English letters.
 */

public class Problem12_GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }
        Map<String, List<String>> anagrams = new HashMap<>();
        for (String s : strs) {
            char[] charArray = new char[26];
            for (char c : s.toCharArray()) {
                charArray[c - 'a']++;
            }
            String keyStr = String.valueOf(charArray);
            if (!anagrams.containsKey(keyStr)) {
                anagrams.put(keyStr, new ArrayList<>());
            }
            anagrams.get(keyStr).add(s);
        }
        return new ArrayList<>(anagrams.values());
    }
}
