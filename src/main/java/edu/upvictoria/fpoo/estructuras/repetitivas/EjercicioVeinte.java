package edu.upvictoria.fpoo.estructuras.repetitivas;

import edu.upvictoria.fpoo.helpers.Scanner;

public class EjercicioVeinte {
    public EjercicioVeinte () {
        Scanner scanner = new Scanner();

        int green = 0;
        int white = 0;
        int red = 0;

        int n = scanner.readInt("Give me the amount of bulbs");

        for (int i = 0; i < n; i++) {
            int opc = scanner.readInt("The bulb is?" +
                    "\n\t1. green" +
                    "\n\t2. white" +
                    "\n\t3. red");

            if (opc == 1)
                green++;
            if (opc == 2)
                white++;
            if (opc == 3)
                red++;
        }

        System.out.println("Number of green bulbs: " + green);
        System.out.println("Number of white bulbs: " + white);
        System.out.println("Number of red bulbs: " + red);
    }
}
