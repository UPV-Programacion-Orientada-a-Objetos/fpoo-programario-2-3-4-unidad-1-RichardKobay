package edu.upvictoria.fpoo.helpers;

import edu.upvictoria.fpoo.helpers.math.Aritmethic;

public class Prices {
    public double addPercentage(double initial, double percentage) {
        Aritmethic aritmethic = new Aritmethic();
        return initial + aritmethic.getPercentage(initial, percentage);
    }

    public double removePercentage (double initial, double percentage) {
        Aritmethic aritmethic = new Aritmethic();
        return initial - aritmethic.getPercentage(initial, percentage);
    }
}
