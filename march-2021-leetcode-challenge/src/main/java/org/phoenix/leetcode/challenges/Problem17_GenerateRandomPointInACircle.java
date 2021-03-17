package org.phoenix.leetcode.challenges;

import java.util.Random;

public class Problem17_GenerateRandomPointInACircle {
    double a;
    double b;
    double r;

    Random rand = null;

    public Problem17_GenerateRandomPointInACircle(double radius, double x_center, double y_center) {
        this.a = x_center;
        this.b = y_center;
        this.r = radius;
        rand = new Random();
    }

    public double[] randPoint() {

        double x = getRandomCoordinate(r, a);

        double y = getRandomCoordinate(r, b);

        while (getDistance(x, y) >= r * r) {
            x = getRandomCoordinate(r, a);
            y = getRandomCoordinate(r, b);
        }

        return new double[]{x, y};

    }

    private double getDistance(double x, double y) {
        return (x - a) * (x - a) + (y - b) * (y - b);
    }

    private double getRandomCoordinate(double r, double c) {
        return c - r + Math.random() * (2 * r);
    }
}
