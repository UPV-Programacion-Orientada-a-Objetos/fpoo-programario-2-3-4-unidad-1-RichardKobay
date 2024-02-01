package edu.upvictoria.fpoo.estructuras.selectivas;

import edu.upvictoria.fpoo.helpers.Prices;
import edu.upvictoria.fpoo.helpers.Scanner;

public class EjercicioCatorce {
    public double calculateNewCreditLimit (double currentCredit, int type) {
        Prices prices = new Prices();
        if (type == 1)
            return prices.addPercentage(currentCredit, 25);
        if (type == 2)
            return prices.addPercentage(currentCredit, 35);
        if (type == 3)
            return prices.addPercentage(currentCredit, 40);
        return prices.addPercentage(currentCredit, 50);
    }

    public EjercicioCatorce (boolean test) {}

    public EjercicioCatorce () {
        Scanner scanner = new Scanner();
        double currentCredit = scanner.readDouble("Enter your current limit");
        int type = scanner.readInt("Enter the type of card");

        System.out.println("Your new limit is: " + calculateNewCreditLimit(currentCredit, type));
    }
}
