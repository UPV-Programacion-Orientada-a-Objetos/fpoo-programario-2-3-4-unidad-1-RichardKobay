package edu.upvictoria.fpoo.estructuras.repetitivas;

import edu.upvictoria.fpoo.helpers.Scanner;

public class EjercicioDiez {

    public int getTotalOfHoursWorked (int[] hours) {
        int sum = 0;
        for (int hour : hours)
            sum = sum + hour;
        return sum;
    }

    public double getTotalOfPay (int[] hours, double payPerHour) {
        return getTotalOfHoursWorked(hours) * payPerHour;
    }

    public EjercicioDiez () {
        Scanner scanner = new Scanner();
        int[] hours = new int[6];
        double payPerHour = scanner.readDouble("Give me the pay per hour");

        for (int i = 0; i < hours.length; i++) {
            hours[i] = scanner.readInt("Give me the amount of hours worked in the day " + (i + 1));
        }

        System.out.println("The total of hours is " + getTotalOfHoursWorked(hours)
                + " with a total of " + getTotalOfPay(hours, payPerHour));
    }

}
