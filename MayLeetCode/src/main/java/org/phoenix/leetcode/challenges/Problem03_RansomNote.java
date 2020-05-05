package org.phoenix.leetcode.challenges;

/*
 * Given an arbitrary ransom note string and another string containing letters from all the magazines,
 * write a function that will return true if the ransom note can be constructed from the magazines ;
 * otherwise, it will return false.
 *
 * Each letter in the magazine string can only be used once in your ransom note.
 *
 * Note:
 * You may assume that both strings contain only lowercase letters.
 * canConstruct("a", "b") -> false
 * canConstruct("aa", "ab") -> false
 * canConstruct("aa", "aab") -> true*/

import java.util.HashMap;

public class Problem03_RansomNote {

    public boolean canConstruct(String ransomNote, String magazine) {
        // Created a HashMap
        HashMap<Character, Integer> map = new HashMap<>();
        // Looping over magazine and adding each in map
        for (int i = 0; i < magazine.length(); i++) {
            map.put(magazine.charAt(i), map.getOrDefault(magazine.charAt(i), 0) + 1);
        }
        // Looping over ransomNote and checking if it exist in map
        for (int i = 0; i < ransomNote.length(); i++) {
            char c = ransomNote.charAt(i);
            if (map.containsKey(c)) {
                if (map.get(c) != 0) {
                    map.put(c, map.get(c) - 1);
                } else
                    return false;
            } else {
                return false;
            }
        }
        return true;
    }
}
