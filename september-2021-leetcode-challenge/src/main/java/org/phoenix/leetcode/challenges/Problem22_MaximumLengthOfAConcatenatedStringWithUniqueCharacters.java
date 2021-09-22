package org.phoenix.leetcode.challenges;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an array of strings arr. String s is a concatenation of a sub-sequence of arr which have unique characters.
 * <p>
 * Return the maximum possible length of s.
 * Constraints:
 * <p>
 * 1 <= arr.length <= 16
 * 1 <= arr[i].length <= 26
 * arr[i] contains only lower case English letters.
 */

public class Problem22_MaximumLengthOfAConcatenatedStringWithUniqueCharacters {
    public int maxLength(List<String> arr) {
        if (arr == null || arr.isEmpty()) {
            return 0;
        }
        int maxLength = 0;
        List<String> combinations = new ArrayList<>();
        combinations.add("");
        for (String word : arr) {
            if (checkForUniqueCharacters(word)) {
                List<String> currentCombinations = new ArrayList<>();
                for (String candidate : combinations) {
                    String temp = candidate + word;
                    if (checkForUniqueCharacters(temp)) {
                        currentCombinations.add(temp);
                        maxLength = Math.max(maxLength, temp.length());
                    }
                }
                combinations.addAll(currentCombinations);
            }
        }
        return maxLength;
    }

    private boolean checkForUniqueCharacters(String word) {
        if (word.length() > 26) {
            return false;
        }
        int[] frequencyMap = new int[26];
        for (char c : word.toCharArray()) {
            frequencyMap[c - 'a']++;
            if (frequencyMap[c - 'a'] > 1) {
                return false;
            }
        }
        return true;
    }
}
