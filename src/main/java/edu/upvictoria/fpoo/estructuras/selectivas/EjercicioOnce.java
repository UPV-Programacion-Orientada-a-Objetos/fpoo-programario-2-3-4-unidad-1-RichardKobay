package edu.upvictoria.fpoo.estructuras.selectivas;

import edu.upvictoria.fpoo.helpers.Prices;
import edu.upvictoria.fpoo.helpers.Scanner;

public class EjercicioOnce {

    public double calculateTotal (int burgerType, int amount, boolean cardPayment){
        Prices prices = new Prices();
        double total = 0;

        if (burgerType == 1)
            total = amount * 20;
        if (burgerType == 2)
            total = amount * 25;
        if (burgerType == 3)
            total = amount * 28;
        if (cardPayment)
            total = prices.addPercentage(total, 5);

        return total;
    }

    public EjercicioOnce (boolean test) {}

    public EjercicioOnce () {
        Scanner scanner = new Scanner();
        System.out.println("Select a burger: ");
        System.out.println("1. Simple");
        System.out.println("2. Double");
        System.out.println("3. Triple");
        int burgerType = scanner.readInt();
        if (burgerType >= 1 && burgerType <= 3) {
            int amount = scanner.readInt("Select an amount");
            boolean cardPayment = Boolean.parseBoolean(scanner.readLine("Your pay will be in card?\n" +
                    "\t1. Yes" +
                    "\t0. No"));
            System.out.println("Your total will be: " + calculateTotal(burgerType, amount, cardPayment));
        } else {
            System.out.println("Your input is not valid");
        }
    }
}
