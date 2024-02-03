package edu.upvictoria.fpoo.estructuras.repetitivas;

import edu.upvictoria.fpoo.helpers.NewArrays;
import edu.upvictoria.fpoo.helpers.Scanner;

public class EjercicioDieciseis {
    public EjercicioDieciseis () {
        Scanner scanner = new Scanner();
        NewArrays arrays = new NewArrays();

        int c = scanner.readInt("Give me the number of cities");
        int s = scanner.readInt("Give me the number of stores");
        int n = scanner.readInt("Give me the number of employees");

        double[] employees = new double[n];
        double[] stores = new double[s];
        double[] cities = new double[c];

        for (int i = 0; i < n; i++) {
            employees[i] = scanner.readDouble("Give me the amount of sells the employee " + i+1 + " had");
        }

        for (int i = 0; i < n; i++) {
            stores[i] = scanner.readDouble("Give me the amount of sells the store " + i+1 + " had");
        }

        for (int i = 0; i < n; i++) {
            cities[i] = scanner.readDouble("Give me the amount of sells the city " + i+1 + " had");
        }

        System.out.println("The total of workers is: " + arrays.getSum(employees));
        System.out.println("The total of stores is: " + arrays.getSum(stores));
        System.out.println("The total of cities is: " + arrays.getSum(cities));
    }
}
