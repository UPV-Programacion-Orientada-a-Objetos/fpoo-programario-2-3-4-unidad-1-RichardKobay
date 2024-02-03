package edu.upvictoria.fpoo.estructuras.repetitivas;

import edu.upvictoria.fpoo.helpers.NewArrays;
import edu.upvictoria.fpoo.helpers.Scanner;

public class EjercicioCatorce {

    public double[] getSalaries (int[] workers, int nWorkers, double payPerHour) {
        double[] salaries = new double[nWorkers];

        for (int i = 0; i < nWorkers; i++) {
            salaries[i] = workers[i] * payPerHour;
        }

        return salaries;
    }

    public EjercicioCatorce () {
        Scanner scanner = new Scanner();
        NewArrays newArrays = new NewArrays();

        int nWorkers = scanner.readInt("Give me the amount of workers");
        double payPerHour = scanner.readDouble("Give me the pay per hour");

        int[] workers = new int[nWorkers];

        for (int i = 0; i < nWorkers; i++) {
            workers[i] = scanner.readInt("Give me the hours of the " + i+1 + " employee");
        }

        double[] salaries = getSalaries(workers, nWorkers, payPerHour);

        for (int i = 0; i < nWorkers; i++){
            System.out.println("The pay per week of the worker " + i+1 + " is: " + salaries[i]);
        }

        System.out.println("The total of all workers is: " + newArrays.getSum(salaries));

    }

}
