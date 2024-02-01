package edu.upvictoria.fpoo.estructuras.selectivas;

import edu.upvictoria.fpoo.helpers.Prices;
import edu.upvictoria.fpoo.helpers.Scanner;

public class EjercicioNueve {
    public double totalPrice(double time, int day, int turn) {
        Prices prices = new Prices();
        double total = 0;
        if (time <= 5)
            total = time;
        if (time <= 8)
            total = time * 0.8;
        if (time <= 10)
            total = time * 0.7;
        if (time > 10)
            total = time * 0.5;
        if (day == 6)
            total = prices.addPercentage(total, 3);
        if (day >= 1 && day <= 5)
            if (turn == 1)
                total = prices.addPercentage(total, 15);
            else
                total = prices.addPercentage(total, 10);

        return total;
    }

    public EjercicioNueve() {
        Scanner scanner = new Scanner();
        double minutes = scanner.readDouble("Give me the amount of minutes: ");
        System.out.println("Select one of our days: ");
        System.out.println("1. Monday");
        System.out.println("2. Tuesday");
        System.out.println("3. Wednesday");
        System.out.println("4. Thursday");
        System.out.println("5. Friday");
        System.out.println("6. Saturday");
        System.out.println("7. Friday");
        int day = scanner.readInt();
        int turn = 0;
        if (day >= 1 && day <= 5) {
            System.out.println("Select a turn");
            System.out.println("1. Morning");
            System.out.println("2. Afternoon");
            turn = scanner.readInt();
        }

        System.out.println("Your new total is: " + totalPrice(minutes, day, turn));
    }

    public EjercicioNueve (boolean test) {}
}
