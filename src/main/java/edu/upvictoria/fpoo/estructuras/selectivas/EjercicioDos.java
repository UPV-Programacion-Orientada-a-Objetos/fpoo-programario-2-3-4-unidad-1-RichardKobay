package edu.upvictoria.fpoo.estructuras.selectivas;

import edu.upvictoria.fpoo.helpers.Scanner;

public class EjercicioDos {
    public boolean isPositive (double n) {
        return n >= 0;
    }

    public EjercicioDos () {
        Scanner scanner = new Scanner();
        double n = scanner.readDouble();

        if (isPositive(n))
            System.out.println("Is positive");
        else
            System.out.println("Is negative");
    }

    public EjercicioDos (boolean test) {}
}
