package edu.upvictoria.fpoo.estructuras.repetitivas;

import edu.upvictoria.fpoo.helpers.Scanner;

public class EjercicioCinco {
    public double avHeight (double[] heights) {
        double average = 0;
        for(double height : heights)
            average = average + height;

        return average / heights.length;
    }

    public EjercicioCinco () {
        Scanner scanner = new Scanner();
        int nHeights = scanner.readInt("Give me the number of heights");

        double[] heights = new double[nHeights];

        System.out.println("The average is: " + avHeight(heights));
    }
}
