package org.phoenix.leetcode.challenges;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Given a list of unique words, return all the pairs of the distinct indices (i, j) in the given list, so that the concatenation of the two words words[i] + words[j] is a palindrome.
 * Constraints:
 * <p>
 * 1 <= words.length <= 5000
 * 0 <= words[i].length <= 300
 * words[i] consists of lower-case English letters.
 */

public class Problem13_PalindromePairs {
    public List<List<Integer>> palindromePairs(String[] words) {
        List<List<Integer>> palindromes = new ArrayList<>();
        if (words == null || words.length < 2) {
            return palindromes;
        }
        Map<String, Integer> wordIndexMap = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            wordIndexMap.put(words[i], i);
        }
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j <= words[i].length(); j++) {
                String s = words[i].substring(0, j);
                String t = words[i].substring(j);
                if (isPalindrome(s)) {
                    String reversedT = new StringBuilder(t).reverse().toString();
                    if (wordIndexMap.containsKey(reversedT) && wordIndexMap.get(reversedT) != i) {
                        List<Integer> temp = new ArrayList<>();
                        temp.add(wordIndexMap.get(reversedT));
                        temp.add(i);
                        palindromes.add(temp);
                    }
                }
                if (isPalindrome(t)) {
                    String reversedS = new StringBuilder(s).reverse().toString();
                    if (wordIndexMap.containsKey(reversedS) && wordIndexMap.get(reversedS) != i && t.length() != 0) {
                        List<Integer> temp = new ArrayList<>();
                        temp.add(i);
                        temp.add(wordIndexMap.get(reversedS));
                        palindromes.add(temp);
                    }
                }
            }
        }
        return palindromes;
    }

    private boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left <= right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
