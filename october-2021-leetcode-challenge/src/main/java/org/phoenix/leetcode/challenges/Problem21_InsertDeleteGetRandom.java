package org.phoenix.leetcode.challenges;

import java.util.HashSet;
import java.util.Random;

public class Problem21_InsertDeleteGetRandom {
    HashSet<Integer> set;
    /** Initialize your data structure here. */
    public Problem21_InsertDeleteGetRandom() {
        set = new HashSet<>();
    }

    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if(set.contains(val)) return false;
        set.add(val);
        return true;
    }

    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if(set.contains(val)) {
            set.remove(val);
            return true;
        }
        return false;
    }

    /** Get a random element from the set. */
    public int getRandom() {
        int item = new Random().nextInt(set.size());
        int i =0;
        for(int obj : set)
        {
            if (i == item)
                return obj;
            i++;
        }
        return 0;
    }
}
