package edu.upvictoria.fpoo.estructuras.selectivas;

import edu.upvictoria.fpoo.helpers.Scanner;

public class EjercicioDiecisiete {

    public String gift (double budget) {
        if (budget <= 10)
            return "card";
        if (budget <= 100)
            return "chocolate";
        if (budget <= 250)
            return "flowers";
        return "ring";
    }

    public EjercicioDiecisiete (boolean test) {}

    public EjercicioDiecisiete () {
        Scanner scanner = new Scanner();

        double budget = scanner.readDouble("Give me your budget: ");

        System.out.println("You can buy a " + gift(budget));
    }
}
