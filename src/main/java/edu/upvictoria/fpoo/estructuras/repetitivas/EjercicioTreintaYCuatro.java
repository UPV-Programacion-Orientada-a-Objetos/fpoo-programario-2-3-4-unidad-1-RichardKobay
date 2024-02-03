package edu.upvictoria.fpoo.estructuras.repetitivas;

import edu.upvictoria.fpoo.helpers.Scanner;

public class EjercicioTreintaYCuatro {

    public EjercicioTreintaYCuatro () {
        Scanner scanner = new Scanner();
        double initialCapital = scanner.readDouble("Give me the initial amount");
        int years = scanner.readInt("Give me the number of years");

        double finalCapital = Math.pow((initialCapital * (1 + 15)), years);

        System.out.println("Your new amount of money is: " + finalCapital);
    }
}
