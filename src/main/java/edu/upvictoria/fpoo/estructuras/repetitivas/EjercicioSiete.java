package edu.upvictoria.fpoo.estructuras.repetitivas;

import edu.upvictoria.fpoo.helpers.Scanner;

public class EjercicioSiete {
    public EjercicioSiete () {
        Scanner scanner = new Scanner();
        int nMajorZero = 0;
        int nMinorZero = 0;
        int nEqualsZero = 0;

        int nNumbers = scanner.readInt("Enter the number of items");

        for (int i = 0; i < nNumbers; i++) {
            double number = scanner.readDouble("Enter the number " + (i + 1));
            if (number > 0)
                nMajorZero++;
            if (number < 0)
                nMinorZero++;
            if (number == 0)
                nEqualsZero++;
        }

        System.out.println("Number of numbers major to 0: " + nMajorZero);
        System.out.println("Number of numbers minor to 0: " + nMinorZero);
        System.out.println("Number of numbers equals to 0: " + nEqualsZero);
    }
}
