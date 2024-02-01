package edu.upvictoria.fpoo.estructuras.selectivas;

import edu.upvictoria.fpoo.helpers.Prices;
import edu.upvictoria.fpoo.helpers.Scanner;

public class EjercicioCuatro {
    public double newPrice (double price) {
        Prices prices = new Prices();
        if (price > 2500)
            return prices.removePercentage(price, 15);
        return prices.removePercentage(price, 8);
    }

    public EjercicioCuatro () {
        Scanner scanner = new Scanner();
        System.out.println("Give me the price of the clothe: ");
        double price = scanner.readDouble();
        System.out.println("Your new price is: " + newPrice(price));
    }

    public EjercicioCuatro (boolean test) {}
}
