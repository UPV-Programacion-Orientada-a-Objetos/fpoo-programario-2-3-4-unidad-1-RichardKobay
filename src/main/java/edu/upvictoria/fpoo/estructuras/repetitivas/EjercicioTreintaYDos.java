package edu.upvictoria.fpoo.estructuras.repetitivas;

import edu.upvictoria.fpoo.helpers.Scanner;

public class EjercicioTreintaYDos {
    public EjercicioTreintaYDos () {
        Scanner scanner = new Scanner();
        int n = scanner.readInt("Give me amount of numbers");

        for (int i = 0; i < n; i++) {
            double n2 = scanner.readDouble("Give me a number");
            System.out.println("It's cube is: " + Math.pow(n2, 3));
        }
    }
}
