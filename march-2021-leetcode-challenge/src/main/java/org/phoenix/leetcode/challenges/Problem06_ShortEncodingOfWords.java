/**
 * A valid encoding of an array of words is any reference string s and array of indices indices such that:
 * <p>
 * words.length == indices.length
 * The reference string s ends with the '#' character.
 * For each index indices[i], the substring of s starting from indices[i] and up to (but not including) the next '#'
 * character is equal to words[i].
 * Given an array of words, return the length of the shortest reference string s possible of any valid encoding of words.
 * <p>
 * Example 1:
 * Input: words = ["time", "me", "bell"]
 * Output: 10
 * Explanation: A valid encoding would be s = "time#bell#" and indices = [0, 2, 5].
 * words[0] = "time", the substring of s starting from indices[0] = 0 to the next '#' is underlined in "time#bell#"
 * words[1] = "me", the substring of s starting from indices[1] = 2 to the next '#' is underlined in "time#bell#"
 * words[2] = "bell", the substring of s starting from indices[2] = 5 to the next '#' is underlined in "time#bell#"
 * <p>
 * Constraints:
 * 1 <= words.length <= 2000
 * 1 <= words[i].length <= 7
 * words[i] consists of only lowercase letters.
 */
package org.phoenix.leetcode.challenges;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Problem06_ShortEncodingOfWords {
    public int minimumLengthEncoding(String[] words) {
        // Adding all array values in set
        Set<String> set = new HashSet<>(Arrays.asList(words));
        // Looping over the words array and removing substrings
        // from the set
        for (String word : words) {
            for (int i = 1; i < word.length(); i++)
                set.remove(word.substring(i));
        }
        // Result variable
        int res = 0;
        // Looping over set and calculating the length
        for (String word : set)
            res += word.length() + 1;
        return res;
    }
}
