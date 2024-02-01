package edu.upvictoria.fpoo.estructuras.selectivas;

import edu.upvictoria.fpoo.helpers.Scanner;

public class EjercicioVeintinueve {

    public String dayOfTheWeek(int day) {
        if (day == 1)
            return "Monday";
        if (day == 2)
            return "Tuesday";
        if (day == 3)
            return "Wednesday";
        if (day == 4)
            return "Thursday";
        if (day == 5)
            return "Friday";
        if (day == 6)
            return "Saturday";
        return "Sunday";
    }

    public EjercicioVeintinueve() {
        Scanner scanner = new Scanner();
        int dayInNum = scanner.readInt("Give me the day in a positive integer");
        System.out.println("Today is: " + dayOfTheWeek(dayInNum));
    }
}
