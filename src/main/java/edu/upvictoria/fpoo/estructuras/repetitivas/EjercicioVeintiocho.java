package edu.upvictoria.fpoo.estructuras.repetitivas;

import edu.upvictoria.fpoo.helpers.NewArrays;
import edu.upvictoria.fpoo.helpers.Scanner;

public class EjercicioVeintiocho {
    public double[] getTotal (double[] coinValues, double[] coinAmount, int size) {
        double[] totals = new double[size];

        for (int i = 0; i < size; i++) {
            totals[i] = coinValues[i] * coinAmount[i];
        }

        return totals;
    }

    public EjercicioVeintiocho () {
        Scanner scanner = new Scanner();
        NewArrays newArrays = new NewArrays();
        int size = scanner.readInt("Give me the amount of different values ");
        double[] coinValues = new double[size];
        double[] coinAmount = new double[size];

        for (int i = 0; i < size; i++) {
            coinValues[i] = scanner.readDouble("Insert the value of the coin");
            coinAmount[i] = scanner.readInt("Give me the amount of coins");
        }

        double[] total = getTotal(coinValues, coinAmount, size);
        System.out.println("The total is: " + newArrays.getSum(total));
    }
}
