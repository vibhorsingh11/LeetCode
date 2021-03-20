/**
 * Implement the UndergroundSystem class:
 * <p>
 * void checkIn(int id, string stationName, int t)
 * A customer with a card id equal to id, gets in the station stationName at time t.
 * A customer can only be checked into one place at a time.
 * void checkOut(int id, string stationName, int t)
 * A customer with a card id equal to id, gets out from the station stationName at time t.
 * double getAverageTime(string startStation, string endStation)
 * Returns the average time to travel between the startStation and the endStation.
 * The average time is computed from all the previous traveling from startStation to endStation that happened directly.
 * Call to getAverageTime is always valid.
 * You can assume all calls to checkIn and checkOut methods are consistent. If a customer gets in at time t1 at some
 * station, they get out at time t2 with t2 > t1. All events happen in chronological order.
 */
package org.phoenix.leetcode.challenges;

import java.util.HashMap;
import java.util.Map;

public class Problem20_DesignUndergroundSystem {
    Map<Integer, String> checkIn;
    Map<String, Integer> timeSpent;
    Map<String, Integer> countMap;

    public Problem20_DesignUndergroundSystem() {
        checkIn = new HashMap<>();
        timeSpent = new HashMap<>();
        countMap = new HashMap<>();
    }

    public void checkIn(int id, String stationName, int t) {
        checkIn.put(id, stationName + "," + t);
    }

    public void checkOut(int id, String stationName, int t) {
        if (checkIn.containsKey(id)) {
            String val = checkIn.get(id);
            String prevStation = val.split(",")[0];
            int checkInTime = Integer.parseInt(val.split(",")[1]);
            String key = prevStation + "|" + stationName;
            timeSpent.put(key, timeSpent.getOrDefault(key, 0) + t - checkInTime);
            countMap.put(key, countMap.getOrDefault(key, 0) + 1);
        }
    }

    public double getAverageTime(String startStation, String endStation) {
        String key = startStation + "|" + endStation;
        return ((double) timeSpent.get(key)) / countMap.get(key);
    }
}
