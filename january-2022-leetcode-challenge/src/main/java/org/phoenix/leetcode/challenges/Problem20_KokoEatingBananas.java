package org.phoenix.leetcode.challenges;

/**
 * Koko loves to eat bananas. There are n piles of bananas, the ith pile has piles[i] bananas. The guards have gone and will come back in h hours.
 * <p>
 * Koko can decide her bananas-per-hour eating speed of k. Each hour, she chooses some pile of bananas and eats k bananas from that pile. If the pile has less than k bananas, she eats all of them instead and will not eat any more bananas during this hour.
 * <p>
 * Koko likes to eat slowly but still wants to finish eating all the bananas before the guards return.
 * <p>
 * Return the minimum integer k such that she can eat all the bananas within h hours.
 */

public class Problem20_KokoEatingBananas {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 1000000000;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (canEatInTime(piles, mid, h)) right = mid - 1;
            else left = mid + 1;
        }
        return left;
    }

    public boolean canEatInTime(int[] piles, int k, int h) {
        int hours = 0;
        for (int pile : piles) {
            int div = pile / k;
            hours += div;
            if (pile % k != 0) hours++;
        }
        return hours <= h;
    }
}
