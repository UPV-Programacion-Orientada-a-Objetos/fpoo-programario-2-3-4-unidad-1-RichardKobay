package edu.upvictoria.fpoo.helpers.math;

public class NewMath {
    public double max (double a, double b) {
        return a > b ? a : b;
    }

    public double max (double a, double b, double c) {
        if (a > b && a > c)
            return a;
        if (b > a && b > c)
            return b;
        return c;
    }
}
