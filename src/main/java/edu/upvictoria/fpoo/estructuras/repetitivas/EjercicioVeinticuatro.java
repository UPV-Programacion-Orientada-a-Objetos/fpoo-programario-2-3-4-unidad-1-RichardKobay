package edu.upvictoria.fpoo.estructuras.repetitivas;

import edu.upvictoria.fpoo.helpers.NewArrays;
import edu.upvictoria.fpoo.helpers.Prices;
import edu.upvictoria.fpoo.helpers.Scanner;

import javax.sound.midi.Soundbank;

public class EjercicioVeinticuatro {
    public double[] getNewPrices (double[] prices, int n) {
        Prices prices1 = new Prices();
        double[] newPrices = new double[n];
        for (int i = 0; i < n; i++) {
            if (prices[n] >= 200)
                newPrices[i] = prices1.removePercentage(prices[i], 15);
            else
                newPrices[i] = prices1.removePercentage(prices[i], 10);
        }

        return newPrices;
    }

    public EjercicioVeinticuatro () {
        Scanner scanner = new Scanner();
        NewArrays newArrays = new NewArrays();
        int n = scanner.readInt("Give me the number of prices");
        double[] prices = new double[n];

        for (int i = 0; i < n; i++) {
            prices[i] = scanner.readDouble("Give me the price of the product " + i+1);
        }

        double[] newPrices = getNewPrices(prices, n);

        for (int i = 0; i < n; i++) {
            System.out.println("The new price of the item " + i+1 + " is: " + newPrices[i]);
        }

        System.out.println("The total is: " + newArrays.getSum(newPrices));
    }
}
