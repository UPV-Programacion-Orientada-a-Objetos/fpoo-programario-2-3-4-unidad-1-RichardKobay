package edu.upvictoria.fpoo.estructuras.repetitivas;

import edu.upvictoria.fpoo.helpers.Scanner;

public class EjercicioOnce {

    public int getKilometer (int km1, int km2) {
        while (km1 < km2) {
            km1++;
            km2--;
        }

        return km1;
    }

    public EjercicioOnce () {
        Scanner scanner = new Scanner();

        int km1 = scanner.readInt("Give me the km of the first person");
        int km2 = scanner.readInt("Give me the km of the second person");

        System.out.println("They'll find each other in the kilometer " + getKilometer(km1, km2));
    }

}
