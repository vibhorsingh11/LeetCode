package org.phoenix.leetcode.challenges;

import java.util.HashMap;

/**
 * Given a pattern and a string s, find if s follows the same pattern.
 * <p>
 * Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s.
 */

public class Problem17_WordPattern {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> map = new HashMap<>();
        HashMap<String, Character> smap = new HashMap<>();
        String[] arr = s.split(" ");
        if (arr.length != pattern.length())
            return false;
        for (int i = 0; i < pattern.length(); i++) {
            if (map.containsKey(pattern.charAt(i)) || smap.containsKey(arr[i])) {
                if (!map.containsKey(pattern.charAt(i))) {
                    return false;
                }
                if (!map.get(pattern.charAt(i)).equals(arr[i])) {
                    return false;
                }
                if (!smap.containsKey(arr[i])) {
                    return false;
                }
                if (smap.get(arr[i]) != pattern.charAt(i)) {
                    return false;
                }
                continue;
            }
            map.put(pattern.charAt(i), arr[i]);
            smap.put(arr[i], pattern.charAt(i));
        }
        return true;
    }
}
