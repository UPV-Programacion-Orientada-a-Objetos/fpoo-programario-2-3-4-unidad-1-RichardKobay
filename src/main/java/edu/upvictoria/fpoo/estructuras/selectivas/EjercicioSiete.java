package edu.upvictoria.fpoo.estructuras.selectivas;

import edu.upvictoria.fpoo.helpers.Prices;
import edu.upvictoria.fpoo.helpers.Scanner;

public class EjercicioSiete {
    public double initialPrice (String type, int size, double price) {
        if (type.equalsIgnoreCase("a"))
            if (size == 1)
                return price + 20;
            else
                return price + 30;

        if (type.equalsIgnoreCase("b"))
            if (size == 1)
                return price + 30;
            else
                return price + 50;

        System.out.println("The type or the size is not one of the options");
        return 0;
    }

    public EjercicioSiete () {
        Scanner scanner = new Scanner();

        String type = scanner.readLine("Give me the type");
        int size = scanner.readInt("Give me the size");
        double price = scanner.readDouble("Give me the initial price");

        System.out.println("The inital price of the grapes is: " + initialPrice(type, size, price));
    }

    public EjercicioSiete (boolean test) {}
}
