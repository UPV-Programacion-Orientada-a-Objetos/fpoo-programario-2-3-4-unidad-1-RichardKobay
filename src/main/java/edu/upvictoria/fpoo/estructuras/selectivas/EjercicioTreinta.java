package edu.upvictoria.fpoo.estructuras.selectivas;

import edu.upvictoria.fpoo.helpers.Scanner;

public class EjercicioTreinta {
    public double returnBonus (double salary, int points) {
        if (points <= 100)
            return salary;
        if (points <= 150)
            return salary * 2;

        return salary * 3;
    }

    public EjercicioTreinta () {
        Scanner scanner = new Scanner();

        double salary = scanner.readDouble("Give me the minimum salary");
        int points = scanner.readInt("Give me the points of the professor");

        System.out.println("Your new salary will be: " + returnBonus(salary, points));
    }
}
