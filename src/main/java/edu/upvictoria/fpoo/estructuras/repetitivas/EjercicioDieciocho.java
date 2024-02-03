package edu.upvictoria.fpoo.estructuras.repetitivas;

import edu.upvictoria.fpoo.helpers.Prices;
import edu.upvictoria.fpoo.helpers.Scanner;
import edu.upvictoria.fpoo.helpers.math.Aritmethic;

public class EjercicioDieciocho {
    public double getTotal (int simple, int d, int triple, boolean card) {
        Prices prices = new Prices();
        double total = (simple * 20) + (d * 25) + (triple * 28);
        if (card)
            total = prices.addPercentage(total, 5);
        return total;
    }

    public EjercicioDieciocho () {
        Scanner scanner = new Scanner();
        int simple = scanner.readInt("Give me the amount of simple burgers");
        int d = scanner.readInt("Give me the amount of double burgers");
        int triple = scanner.readInt("Give me the amount of triple burgers");
        boolean card = Boolean.parseBoolean(scanner.readLine("They pay is with card? \n\t\"false\".No\n\t\"true\"Yes"));

        System.out.println("Your total will be: " + getTotal(simple, d, triple, card));
    }
}
