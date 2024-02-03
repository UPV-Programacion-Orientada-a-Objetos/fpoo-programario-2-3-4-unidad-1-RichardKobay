package edu.upvictoria.fpoo.estructuras.repetitivas;

import edu.upvictoria.fpoo.helpers.Scanner;

public class EjercicioSeis {
    public double getSum (double[] saves) {
        double sum = 0;
        for (double save : saves)
            sum = sum + save;
        return sum;
    }

    public EjercicioSeis () {
        Scanner scanner = new Scanner();
        double[] saves = new double[12];
        String[] months = {
                "January",
                "February",
                "March",
                "April",
                "May",
                "June",
                "July",
                "August",
                "September",
                "October",
                "November",
                "December"
        };

        for (int i = 0; i < 12; i++) {
            saves[i] = scanner.readDouble("Enter the saves of " + months[i]);
        }

        for (int i = 0; i < 12; i++) {
            System.out.println("Saves of " + months[i] + ": " + saves[i]);
        }

        System.out.println("Total saves: " + getSum(saves));
    }

    public EjercicioSeis (boolean test) {}
}
