package edu.upvictoria.fpoo.estructuras.repetitivas;

import edu.upvictoria.fpoo.helpers.Prices;
import edu.upvictoria.fpoo.helpers.Scanner;

public class EjercicioTreintaYCinco {
    public EjercicioTreintaYCinco () {
        Scanner scanner = new Scanner();
        Prices prices = new Prices();
        int nCars = scanner.readInt("Give me the number of cars");

        for (int i = 0; i < nCars; i++) {
            double price = scanner.readDouble("Give me the total of the car");
            int key = scanner.readInt("Give me the key of the car");
            if (key == 1)
                price = prices.addPercentage(price, 10);
            if (key == 2)
                price = prices.addPercentage(price, 7);
            if (key == 3)
                price = prices.addPercentage(price, 3);
            System.out.println("The new price is: " + price);
        }
    }
}
