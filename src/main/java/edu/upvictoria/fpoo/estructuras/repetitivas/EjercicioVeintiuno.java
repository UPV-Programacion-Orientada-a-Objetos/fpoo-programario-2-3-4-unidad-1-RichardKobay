package edu.upvictoria.fpoo.estructuras.repetitivas;

import edu.upvictoria.fpoo.helpers.Scanner;

public class EjercicioVeintiuno {
    public int getTotalAfterMonths (int months) {
        int total = 3;
        for (int i = 0; i < months; i++) {
            total = total * 3;
        }
        return total;
    }

    public EjercicioVeintiuno () {
        Scanner s = new Scanner();
        int months = s.readInt("Give me the amount of months");
        System.out.println("The total will be: " + getTotalAfterMonths(months));
    }
}
