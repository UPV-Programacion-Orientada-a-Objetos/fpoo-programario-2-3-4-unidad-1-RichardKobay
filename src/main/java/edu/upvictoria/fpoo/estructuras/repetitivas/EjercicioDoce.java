package edu.upvictoria.fpoo.estructuras.repetitivas;

import edu.upvictoria.fpoo.helpers.Scanner;

public class EjercicioDoce {
    public int getSalesMajorTo1000 (double[] sales) {
        int n = 0;

        for (double sale : sales)
            if (sale > 1000)
                n++;

        return n;
    }

    public int getSalesBetween500And1000 (double[] sales) {
        int n = 0;

        for (double sale : sales)
            if (sale > 500 && sale <= 1000)
                n++;

        return n;
    }

    public int getSalesMinorTo500 (double[] sales) {
        int n = 0;

        for (double sale : sales)
            if (sale <= 500)
                n++;

        return n;
    }

    public EjercicioDoce () {
        Scanner scanner = new Scanner();
        int nSells = scanner.readInt("Give me the number of sales");
        double[] sales = new double[nSells];

        for (int i = 0; i < sales.length; i++) {
            sales[i] = scanner.readDouble("Give me the sale " + i+1);
        }

        System.out.println("Sales > 1000: " + getSalesMajorTo1000(sales));
        System.out.println("500 < Sales <= 1000: " + getSalesBetween500And1000(sales));
        System.out.println("Sales < 500: " + getSalesMinorTo500(sales));
    }
}
