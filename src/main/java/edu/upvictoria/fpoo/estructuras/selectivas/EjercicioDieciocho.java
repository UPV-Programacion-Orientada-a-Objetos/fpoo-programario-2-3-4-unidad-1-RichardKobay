package edu.upvictoria.fpoo.estructuras.selectivas;

import edu.upvictoria.fpoo.helpers.Scanner;

public class EjercicioDieciocho {

    public double totalCost (int hours) {
        if (hours <= 2)
            return hours * 5;
        if (hours <= 5)
            return hours * 4;
        if (hours <= 10)
            return hours * 3;
        return hours * 2;
    }

    public EjercicioDieciocho(boolean test) {}

    public EjercicioDieciocho () {
        Scanner scanner = new Scanner();

        int hour = scanner.readInt("Enter the amount of hours (positive integer)");

        System.out.println("Your total will be: " + totalCost(hour));
    }
}
