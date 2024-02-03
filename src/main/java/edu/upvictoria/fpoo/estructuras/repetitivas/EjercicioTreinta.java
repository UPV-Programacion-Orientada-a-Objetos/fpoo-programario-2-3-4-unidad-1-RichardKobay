package edu.upvictoria.fpoo.estructuras.repetitivas;

import edu.upvictoria.fpoo.helpers.Scanner;

public class EjercicioTreinta {

    public int amountOfApproved (double[] cals) {
        int amountOfApproved = 0;

        for (double cal : cals) {
            if (cal >= 6)
                amountOfApproved++;
        }

        return amountOfApproved;
    }

    public EjercicioTreinta () {
        Scanner scanner = new Scanner();
        int n = scanner.readInt("Give me the amount of cals");
        double[] cals = new double[n];

        for (int i = 0; i < n; i++) {
            cals[i] = scanner.readDouble("Give me the cal " + i+1);
        }

        System.out.println("Number of students approved: " + amountOfApproved(cals));
        System.out.println("Number of students approved: " + (n - amountOfApproved(cals)));
    }
}
