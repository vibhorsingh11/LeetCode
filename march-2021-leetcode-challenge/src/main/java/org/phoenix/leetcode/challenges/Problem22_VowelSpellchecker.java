/**
 * Given a wordlist, we want to implement a spellchecker that converts a query word into a correct word.
 * <p>
 * For a given query word, the spell checker handles two categories of spelling mistakes:
 * <p>
 * Capitalization: If the query matches a word in the wordlist (case-insensitive), then the query word is returned with the same case as the case in the wordlist.
 * Example: wordlist = ["yellow"], query = "YellOw": correct = "yellow"
 * Example: wordlist = ["Yellow"], query = "yellow": correct = "Yellow"
 * Example: wordlist = ["yellow"], query = "yellow": correct = "yellow"
 * Vowel Errors: If after replacing the vowels ('a', 'e', 'i', 'o', 'u') of the query word with any vowel individually,
 * it matches a word in the wordlist (case-insensitive), then the query word is returned with the same case as the match
 * in the wordlist.
 * Example: wordlist = ["YellOw"], query = "yollow": correct = "YellOw"
 * Example: wordlist = ["YellOw"], query = "yeellow": correct = "" (no match)
 * Example: wordlist = ["YellOw"], query = "yllw": correct = "" (no match)
 * In addition, the spell checker operates under the following precedence rules:
 * <p>
 * When the query exactly matches a word in the wordlist (case-sensitive), you should return the same word back.
 * When the query matches a word up to capitlization, you should return the first such match in the wordlist.
 * When the query matches a word up to vowel errors, you should return the first such match in the wordlist.
 * If the query has no matches in the wordlist, you should return the empty string.
 * Given some queries, return a list of words answer, where answer[i] is the correct word for query = queries[i].
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: wordlist = ["KiTe","kite","hare","Hare"], queries = ["kite","Kite","KiTe","Hare","HARE","Hear","hear","keti","keet","keto"]
 * Output: ["kite","KiTe","KiTe","Hare","hare","","","KiTe","","KiTe"]
 * <p>
 * Note:
 * 1 <= wordlist.length <= 5000
 * 1 <= queries.length <= 5000
 * 1 <= wordlist[i].length <= 7
 * 1 <= queries[i].length <= 7
 * All strings in wordlist and queries consist only of english letters.
 */
package org.phoenix.leetcode.challenges;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Arrays;

public class Problem22_VowelSpellchecker {
    public String[] spellchecker(String[] wordlist, String[] queries) {
        Set<String> wordSet = new HashSet<>(Arrays.asList(wordlist));
        Map<String, String> lowercaseMap = new HashMap<>();
        Map<String, String> maskedMap = new HashMap<>();
        for (int i = wordlist.length - 1; i >= 0; i--) {
            String word = wordlist[i];
            String lowercaseWord = word.toLowerCase();
            lowercaseMap.put(lowercaseWord, word);
            maskedMap.put(getMaskedValue(lowercaseWord), word);
        }
        for (int i = 0; i < queries.length; i++) {
            String query = queries[i];
            String lowercaseQuery = query.toLowerCase();
            String maskedQuery = getMaskedValue(lowercaseQuery);
            if (wordSet.contains(query)) {
                continue;
            } else if (lowercaseMap.containsKey(lowercaseQuery)) {
                queries[i] = lowercaseMap.get(lowercaseQuery);
            } else queries[i] = maskedMap.getOrDefault(maskedQuery, "");
        }
        return queries;
    }

    private String getMaskedValue(String lowercaseWord) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < lowercaseWord.length(); i++) {
            char c = lowercaseWord.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                c = '#';
            }
            sb.append(c);
        }
        return sb.toString();
    }
}
