package edu.upvictoria.fpoo.estructuras.repetitivas;

import edu.upvictoria.fpoo.helpers.Scanner;
import edu.upvictoria.fpoo.helpers.math.Aritmethic;
import edu.upvictoria.fpoo.helpers.math.NewMath;

public class EjercicioDiecisiete {

    public double getNewSalary (double salary) {
        Aritmethic aritmethic = new Aritmethic();
        return aritmethic.getPercentage(salary, 6);
    }

    public EjercicioDiecisiete () {
        Scanner scanner = new Scanner();
        double baseSalary = scanner.readDouble("Give me the base salary");
        int years = scanner.readInt("Give me the number of years");

        for (int i = 0; i < years; i++) {
            System.out.println("The salary of the " + i+1 + " year is: " + baseSalary);
            baseSalary = getNewSalary(baseSalary);
        }
    }

}
