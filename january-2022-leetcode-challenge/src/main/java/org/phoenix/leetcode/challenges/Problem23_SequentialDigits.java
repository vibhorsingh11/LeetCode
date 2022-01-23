package org.phoenix.leetcode.challenges;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**An integer has sequential digits if and only if each digit in the number is one more than the previous digit.

 Return a sorted list of all the integers in the range [low, high] inclusive that have sequential digits.*/

public class Problem23_SequentialDigits {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> ans = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        if(low <= 0 && high >= 0) ans.add(0);
        for(int i = 1; i < 10; i++) q.add(i);
        while(q.size() > 0){
            int curr = q.remove();
            if(curr >= low && curr <= high) ans.add(curr);
            int onesDigit = curr % 10;
            if(onesDigit < 9 && curr * 10 + onesDigit + 1 <= high) q.add(curr * 10 + onesDigit + 1);
        }
        return ans;
    }
}
