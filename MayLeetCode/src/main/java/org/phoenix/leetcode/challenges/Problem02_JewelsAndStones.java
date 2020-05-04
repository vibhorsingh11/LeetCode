package org.phoenix.leetcode.challenges;

/*
* You're given strings J representing the types of stones that are jewels, and S representing the stones you have.
* Each character in S is a type of stone you have.  You want to know how many of the stones you have are
* also jewels.
*
* The letters in J are guaranteed distinct, and all characters in J and S are letters.
* Letters are case sensitive, so "a" is considered a different type of stone from "A".
*
* Example 1:
* Input: J = "aA", S = "aAAbbbb"
* Output: 3
*/

import java.util.HashSet;

public class Problem02_JewelsAndStones {

    public int numJewelsInStones(String J, String S) {
        // Created a hashset
        HashSet<Character> set = new HashSet<>();
        // Looping over the J array and adding all to set
        for(char str : J.toCharArray()) {
            set.add(str);
        }
        // Initialized a counter
        int count = 0;
        // Looping over the S array and checking if that exist in set, if it is present then increment the count
        for(char str1 : S.toCharArray()) {
            if(set.contains(str1)) {
                count++;
            }
        }
        // Return the count
        return count;
    }
}
