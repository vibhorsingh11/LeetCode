package org.phoenix.leetcode.challenges;

/*
* Design a data structure that supports all following operations in average O(1) time.
*
* insert(val): Inserts an item val to the set if not already present.
* remove(val): Removes an item val from the set if present.
* getRandom: Returns a random element from current set of elements.
*
* Each element must have the same probability of being returned.
*
* Example:

// Init an empty set.
RandomizedSet randomSet = new RandomizedSet();

// Inserts 1 to the set. Returns true as 1 was inserted successfully.
randomSet.insert(1);

// Returns false as 2 does not exist in the set.
randomSet.remove(2);

// Inserts 2 to the set, returns true. Set now contains [1,2].
randomSet.insert(2);

// getRandom should return either 1 or 2 randomly.
randomSet.getRandom();

// Removes 1 from the set, returns true. Set now contains [2].
randomSet.remove(1);

// 2 was already in the set, so return false.
randomSet.insert(2);

// Since 2 is the only number in the set, getRandom always return 2.
randomSet.getRandom();
*/

import java.util.*;

public class Problem12_InsertDeleteGetRandom {

    ArrayList<Integer> arr = new ArrayList<>();
    Map<Integer, Integer> map = new HashMap<>();

    public boolean insert(int val) {
        if (map.containsKey(val)) return false;
        int s = arr.size();
        arr.add(val);
        map.put(val, s);
        return true;
    }

    /**
     * Removes a value from the set. Returns true if the set contained the specified element.
     */
    public boolean remove(int val) {
        Integer index = map.get(val);
        if (index == null) return false;
        map.remove(val);
        int size = arr.size();
        Integer last = arr.get(size - 1);
        Collections.swap(arr, index, size - 1);
        arr.remove(size - 1);
        map.put(last, index);
        return true;
    }

    /**
     * Get a random element from the set.
     */
    public int getRandom() {
        Random random = new Random();
        int index = random.nextInt(arr.size());
        return arr.get(index);
    }
}
