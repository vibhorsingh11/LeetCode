/**
 * Given a string and a string dictionary, find the longest string in the dictionary that can be formed by deleting
 * some characters of the given string. If there are more than one possible results, return the longest word with the
 * smallest lexicographical order. If there is no possible result, return the empty string.
 * <p>
 * Example 1:
 * Input:
 * s = "abpcplea", d = ["ale","apple","monkey","plea"]
 * <p>
 * Output:
 * "apple"
 * Note:
 * All the strings in the input will only contain lower-case letters.
 * The size of the dictionary won't exceed 1,000.
 * The length of all the strings in the input won't exceed 1,000.
 */
package org.phoenix.leetcode.challenges;

import java.util.List;

public class Problem22_LongestWordInDictionarythroughDeleting {
    public String findLongestWord(String s, List<String> d) {
        String output = "";
        // Loop for each word in the dictionary
        for (String word : d) {
            // Check if the current word is a subsequence
            // of the string s.
            if (isSubsequence(word, s)) {
                // Check for the bigger length
                if (word.length() > output.length()) {
                    output = word;
                }
                // Check for lexicographically shorter word
                else if (word.length() == output.length() && word.compareTo(output) < 0) {
                    output = word;
                }
            }
        }
        return output;
    }

    private boolean isSubsequence(String word, String s) {
        // Base case
        if (word.length() > s.length()) {
            return false;
        }
        // Position of character
        int position = 0;
        // Check if word is a subsequence of s.
        for (char c : word.toCharArray()) {
            position = s.indexOf(c, position);
            // If the character does not exist in s
            if (position == -1) {
                return false;
            }
            position++;
        }
        return true;
    }
}
