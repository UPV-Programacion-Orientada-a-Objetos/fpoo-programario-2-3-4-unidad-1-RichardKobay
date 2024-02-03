package edu.upvictoria.fpoo.estructuras.repetitivas;

import edu.upvictoria.fpoo.helpers.Prices;
import edu.upvictoria.fpoo.helpers.Scanner;

public class EjercicioVeinticinco {
    public double getInterest (double amount, int years) {
        Prices prices = new Prices();
        for (int i = 0; i < years; i++) {
            amount = prices.addPercentage(amount, 10);
        }

        return amount;
    }

    public EjercicioVeinticinco () {
        Scanner scanner = new Scanner();
        double amount = scanner.readDouble("Give me your money");
        int years = scanner.readInt("Give me the amount of years");
        System.out.println("Yo have now: " + getInterest(amount, years));
    }
}
