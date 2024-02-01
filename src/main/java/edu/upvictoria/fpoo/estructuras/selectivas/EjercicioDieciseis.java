package edu.upvictoria.fpoo.estructuras.selectivas;

import edu.upvictoria.fpoo.helpers.Scanner;

public class EjercicioDieciseis {

    public double total (double payPerHour, int hoursWorked) {
        if (hoursWorked <= 40)
            return payPerHour * hoursWorked;
        return (40 * payPerHour) + ((hoursWorked - 40) * (payPerHour * 2));
    }

    public EjercicioDieciseis (boolean test) {}

    public EjercicioDieciseis () {
        Scanner scanner = new Scanner();

        int hoursWorked = scanner.readInt("Enter the amount of hours worked");
        double payPerHour = scanner.readDouble("Enter the pay per hour");

        System.out.println("Your salary will be: " + total(payPerHour, hoursWorked));
    }
}
