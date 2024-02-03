package edu.upvictoria.fpoo.estructuras.repetitivas;

import edu.upvictoria.fpoo.helpers.Scanner;

public class EjercicioVeintinueve {
    public int[] getSalesBetweenRanges (double[] sales) {
        int[] nSales = {0, 0};

        for (double sale : sales) {
            if (sale > 10000 && sale <= 20000)
                nSales[1]++;
            if (sale <= 10000)
                nSales[0]++;
        }

        return nSales;
    }

    public EjercicioVeintinueve () {
        Scanner scanner = new Scanner();
        int nSales = scanner.readInt("Give me the amount of sales");

        double[] sales = new double[nSales];

        for (int i = 0; i < nSales; i++) {
            sales[i] = scanner.readDouble("Give me the amount of the sale " + i+1);
        }

        int[] classifiedAmounts = getSalesBetweenRanges(sales);

        System.out.println("Number of sales down to 10,000: " + classifiedAmounts[0]);
        System.out.println("Number of sales between 10,000 and 20,000: " + classifiedAmounts[1]);
    }
}
