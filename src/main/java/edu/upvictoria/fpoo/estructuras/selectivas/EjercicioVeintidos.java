package edu.upvictoria.fpoo.estructuras.selectivas;

import edu.upvictoria.fpoo.helpers.Prices;
import edu.upvictoria.fpoo.helpers.Scanner;

public class EjercicioVeintidos {

    public double getNewSalary (double salary, int antiquity) {
        Prices prices = new Prices();
        double newSalary = 0;
        if (salary <= 1000)
            newSalary = prices.addPercentage(salary, 25);
        if (salary <= 3500)
            newSalary = prices.addPercentage(salary, 15);
        if (salary > 3500)
            newSalary = prices.addPercentage(salary, 10);

        if (antiquity >= 2 && antiquity <= 5)
            return prices.addPercentage(newSalary, 20);

        if (antiquity > 5)
            return prices.addPercentage(newSalary, 30);

        return newSalary;
    }

    public EjercicioVeintidos () {
        Scanner scanner = new Scanner();
        double salary = scanner.readDouble("Give me your salary");
        int years = scanner.readInt("How many years have yo worked for this company");

        System.out.println("Your salary now is: " + getNewSalary(salary, years));
    }
}
