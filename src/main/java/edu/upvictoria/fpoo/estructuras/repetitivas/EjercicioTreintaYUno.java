package edu.upvictoria.fpoo.estructuras.repetitivas;

import edu.upvictoria.fpoo.helpers.Prices;
import edu.upvictoria.fpoo.helpers.Scanner;

public class EjercicioTreintaYUno {
     public double[] newSalaries (double[] salaries, double[] hoursWorked, int n) {
         Prices prices = new Prices();
         double[] newSalaries = new double[n];

         for (int i = 0; i < n; i++) {
             if (salaries[i] <= 150) {
                 newSalaries[i] = prices.removePercentage((salaries[i] * hoursWorked[i]), 5);
                 continue;
             }
             if (salaries[i] <= 300) {
                 newSalaries[i] = prices.removePercentage((salaries[i] * hoursWorked[i]), 7);
                 continue;
             }
             if (salaries[i] <= 450) {
                 newSalaries[i] = prices.removePercentage((salaries[i] * hoursWorked[i]), 9);
             }
         }

         return newSalaries;
     }

     public EjercicioTreintaYUno () {
         Scanner scanner = new Scanner();
         int n = scanner.readInt("Give me the number of workers");

         String[] names = new String[n];
         double[] hoursWorked = new double[n];
         double[] salaries = new double[n];

         for (int i = 0; i < n; i++) {
             names[i] = scanner.readLine("Give me the name of the worker " + i+1);
             salaries[i] = scanner.readDouble("Give me the salary");
             hoursWorked[i] = scanner.readDouble("Give me how many hours worked");
         }

         double[] newSalaries = newSalaries(salaries, hoursWorked, n);

         for (int i = 0; i < n; i++) {
             System.out.println("Salary of " + names[i] + ": " + newSalaries[i]);
         }
     }
}
