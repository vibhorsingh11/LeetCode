package org.phoenix.leetcode.challenges;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * With respect to a given puzzle string, a word is valid if both the following conditions are satisfied:
 * word contains the first letter of puzzle.
 * For each letter in word, that letter is in puzzle.
 * For example, if the puzzle is "abcdefg", then valid words are "faced", "cabbage", and "baggage", while
 * invalid words are "beefed" (does not include 'a') and "based" (includes 's' which is not in the puzzle).
 * Return an array answer, where answer[i] is the number of words in the given word list words that is valid with respect to the puzzle puzzles[i].
 * Constraints:
 * <p>
 * 1 <= words.length <= 105
 * 4 <= words[i].length <= 50
 * 1 <= puzzles.length <= 104
 * puzzles[i].length == 7
 * words[i] and puzzles[i] consist of lowercase English letters.
 * Each puzzles[i] does not contain repeated characters.
 */

public class Problem09_NumberOfValidWordsForEachPuzzle {
    public List<Integer> findNumOfValidWords(String[] words, String[] puzzles) {
        if (words == null || puzzles == null) {
            throw new IllegalArgumentException("Input is invalid");
        }
        int puzzlesLen = puzzles.length;
        List<Integer> result = new ArrayList<>(puzzlesLen);
        if (puzzlesLen == 0 || words.length == 0) {
            for (int i = 0; i < puzzlesLen; i++) {
                result.add(0);
            }
            return result;
        }
        HashMap<Integer, Integer> wordMaskCountMap = new HashMap<>();
        for (String word : words) {
            int wordMask = getMask(word, 0);
            wordMaskCountMap.put(wordMask, wordMaskCountMap.getOrDefault(wordMask, 0) + 1);
        }
        for (String puzzle : puzzles) {
            int puzzleMask = getMask(puzzle, 1);
            int firstCharMask = 1 << (puzzle.charAt(0) - 'a');
            int subsetMask = puzzleMask;
            int count = wordMaskCountMap.getOrDefault(firstCharMask, 0);
            while (subsetMask != 0) {
                count += wordMaskCountMap.getOrDefault(subsetMask | firstCharMask, 0);

                subsetMask = (subsetMask - 1) & puzzleMask;
            }
            result.add(count);
        }
        return result;
    }

    private static int getMask(String s, int start) {
        int mask = 0;
        for (int i = start; i < s.length(); i++) {
            mask |= 1 << (s.charAt(i) - 'a');
        }
        return mask;
    }
}
