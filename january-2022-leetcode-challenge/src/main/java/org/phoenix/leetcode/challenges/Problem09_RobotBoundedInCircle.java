package org.phoenix.leetcode.challenges;

/**
 * On an infinite plane, a robot initially stands at (0, 0) and faces north. The robot can receive one of three instructions:
 * <p>
 * "G": go straight 1 unit;
 * "L": turn 90 degrees to the left;
 * "R": turn 90 degrees to the right.
 * The robot performs the instructions given in order, and repeats them forever.
 * <p>
 * Return true if and only if there exists a circle in the plane such that the robot never leaves the circle.
 */

public class Problem09_RobotBoundedInCircle {
    public boolean isRobotBounded(String instructions) {
        int[][] directions = {{0, 1}, {-1, 0}, {0, -1}, {1, 0}};
        int mx = 0;
        int my = 0;
        int dir = 0;
        for (int i = 0; i < instructions.length(); i++) {
            char ch = instructions.charAt(i);
            if (ch == 'G') {
                mx += directions[dir][0];
                my += directions[dir][1];
            } else if (ch == 'L') {
                if (dir == 0) dir = 1;
                else if (dir == 1) dir = 2;
                else if (dir == 2) dir = 3;
                else dir = 0;
            } else if (ch == 'R') {
                if (dir == 0) dir = 3;
                else if (dir == 3) dir = 2;
                else if (dir == 2) dir = 1;
                else dir = 0;
            }
        }
        return (mx == 0 && my == 0) || (dir != 0);
    }
}
