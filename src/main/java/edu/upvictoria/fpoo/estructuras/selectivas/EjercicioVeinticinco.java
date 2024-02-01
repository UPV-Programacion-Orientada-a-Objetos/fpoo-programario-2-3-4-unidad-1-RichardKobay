package edu.upvictoria.fpoo.estructuras.selectivas;

import edu.upvictoria.fpoo.helpers.Scanner;

public class EjercicioVeinticinco {

    public int calculateBonus (int years) {
        if (years == 1)
            return 100;
        if (years == 2)
            return 200;
        if (years == 3)
            return 300;
        if (years == 4)
            return 400;
        if (years == 5)
            return 500;
        if (years > 5)
            return 1000;
        return 0;
    }

    public EjercicioVeinticinco () {
        Scanner scanner = new Scanner();
        int year = scanner.readInt("Give me your worked years");
    }
}
