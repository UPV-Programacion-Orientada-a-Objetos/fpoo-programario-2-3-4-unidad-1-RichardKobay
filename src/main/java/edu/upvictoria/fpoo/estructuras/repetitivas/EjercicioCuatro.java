package edu.upvictoria.fpoo.estructuras.repetitivas;

import edu.upvictoria.fpoo.helpers.Scanner;

public class EjercicioCuatro {
    public double getAverage (int[] cals) {
        double average = 0;

        for(double cal : cals)
            average = average + cal;

        return average / cals.length;
    }

    public EjercicioCuatro () {
        Scanner scanner = new Scanner();
        int nCals = scanner.readInt("Insert the number of kids");
        int[] cals = new int[nCals];

        for (int i = 0; i < cals.length; i++) {
            cals[i] = scanner.readInt("Give me the age of the " + i + 1);
        }

        System.out.println("The average is: " + getAverage(cals));
    }

    public EjercicioCuatro (boolean test) {}
}
