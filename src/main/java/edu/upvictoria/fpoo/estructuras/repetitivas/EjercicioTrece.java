package edu.upvictoria.fpoo.estructuras.repetitivas;

import edu.upvictoria.fpoo.helpers.Scanner;

public class EjercicioTrece {
    public int getTotalAfterMonths (int months) {
        int total = 10;
        for (int i = 0; i < months; i++) {
            total = total * 2;
        }
        return total;
    }

    public EjercicioTrece () {
        Scanner s = new Scanner();
        int months = s.readInt("Give me the amount of months");
        System.out.println("The total will be: " + getTotalAfterMonths(months));
    }
}
