/**
 * In an alien language, surprisingly they also use english lowercase letters, but possibly in a different order. The order of the alphabet is some permutation of lowercase letters.
 * <p>
 * Given a sequence of words written in the alien language, and the order of the alphabet, return true if and only if the given words are sorted lexicographicaly in this alien language.
 * <p>
 * Example 1:
 * Input: words = ["hello","leetcode"], order = "hlabcdefgijkmnopqrstuvwxyz"
 * Output: true
 * Explanation: As 'h' comes before 'l' in this language, then the sequence is sorted.
 * Constraints:
 * 1 <= words.length <= 100
 * 1 <= words[i].length <= 20
 * order.length == 26
 * All characters in words[i] and order are English lowercase letters.
 */
package org.phoenix.leetcode.challenges;

import java.util.HashMap;
import java.util.Map;

public class Problem09_VerifyingAnAlienDictionary {
    public boolean isAlienSorted(String[] words, String order) {
        Map<Character, Integer> map = new HashMap<>();
        int weight = 1;
        for (char c : order.toCharArray()) {
            map.put(c, weight);
            weight++;
        }
        for (int i = 0; i < words.length - 1; i++) {
            String first = words[i];
            String second = words[i + 1];
            if (!helper(first, second, map)) {
                return false;
            }
        }
        return true;
    }

    private boolean helper(String s1, String s2, Map<Character, Integer> map) {
        int i1 = 0;
        int i2 = 0;
        while (i1 < s1.length() && i2 < s2.length()) {
            if (s1.charAt(i1) != s2.charAt(i2)) {
                return map.get(s1.charAt(i1)) < map.get(s2.charAt(i2));
            }
            i1++;
            i2++;
        }
        return s1.length() <= s2.length();
    }
}
