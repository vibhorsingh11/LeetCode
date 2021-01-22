/*
 * Two strings are considered close if you can attain one from the other using the following operations:
 *
 * Operation 1: Swap any two existing characters.
 * For example, abcde -> aecdb
 * Operation 2: Transform every occurrence of one existing character into another existing character, and do the same with the other character.
 * For example, aacabb -> bbcbaa (all a's turn into b's, and all b's turn into a's)
 * You can use the operations on either string as many times as necessary.
 * Given two strings, word1 and word2, return true if word1 and word2 are close, and false otherwise.
 *
 * Example 1:
 * Input: word1 = "abc", word2 = "bca"
 * Output: true
 * Explanation: You can attain word2 from word1 in 2 operations.
 * Apply Operation 1: "abc" -> "acb"
 * Apply Operation 1: "acb" -> "bca"
 */
package org.phoenix.leetcode.challenges;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Problem22_DetermineIfTwoStringsAreClose {
    public boolean closeStrings(String word1, String word2) {
        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();

        int[] count1 = new int[26];
        int[] count2 = new int[26];

        for (char c : word1.toCharArray()) {
            count1[c - 'a']++;
            set1.add(c);
        }
        for (char d : word2.toCharArray()) {
            count2[d - 'a']++;
            set2.add(d);
        }
        Arrays.sort(count1);
        Arrays.sort(count2);

        return set1.equals(set2) && Arrays.equals(count1, count2);
    }
}
