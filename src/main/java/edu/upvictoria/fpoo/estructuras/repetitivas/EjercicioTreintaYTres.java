package edu.upvictoria.fpoo.estructuras.repetitivas;

import edu.upvictoria.fpoo.helpers.Scanner;

public class EjercicioTreintaYTres {
    public EjercicioTreintaYTres () {
        Scanner scanner = new Scanner();
        int k = scanner.readInt("Give me k");

        for (int i = 0; i < k; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println(k + " x " + j + " = " + (k * j));
            }
        }
    }
}
