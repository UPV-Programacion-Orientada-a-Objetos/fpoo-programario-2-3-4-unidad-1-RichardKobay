package edu.upvictoria.fpoo.estructuras.selectivas;

import edu.upvictoria.fpoo.helpers.Prices;
import edu.upvictoria.fpoo.helpers.Scanner;

public class EjercicioVeinte {

    public double totalWithDiscount(double total) {
        Prices prices = new Prices();

        if (total < 100)
            return prices.removePercentage(total, 10);
        if (total < 200)
            return prices.removePercentage(total, 12);

        return prices.removePercentage(total, 15);
    }

    public EjercicioVeinte () {
        Scanner scanner = new Scanner();
        double price = scanner.readDouble("Give me the total of your ticket");
        System.out.println("Your new total will be: " + totalWithDiscount(price));
    }
    public EjercicioVeinte (boolean test) {}
}
