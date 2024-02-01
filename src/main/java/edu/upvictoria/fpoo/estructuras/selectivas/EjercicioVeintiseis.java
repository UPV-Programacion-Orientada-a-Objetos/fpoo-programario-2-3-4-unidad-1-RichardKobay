package edu.upvictoria.fpoo.estructuras.selectivas;

import edu.upvictoria.fpoo.helpers.Scanner;

public class EjercicioVeintiseis {


    public double total (double payPerHour, int hoursWorked) {
        if (hoursWorked <= 40)
            return payPerHour * hoursWorked;
        if (hoursWorked <= 45)
            return (40 * hoursWorked) + ((hoursWorked - 40) * (payPerHour * 2));
        if (hoursWorked <= 50)
            return (40 * hoursWorked) + ((hoursWorked - 40) * (payPerHour * 3));
        return 0;
    }

    public EjercicioVeintiseis () {
        Scanner scanner = new Scanner();

        int hoursWorked = scanner.readInt("Enter the amount of hours worked");
        double payPerHour = scanner.readDouble("Enter the pay per hour");

        if (hoursWorked >= 50)
            System.out.println("you're not allowed to do that");
        else
            System.out.println("Your salary will be: " + total(payPerHour, hoursWorked));
    }
}
