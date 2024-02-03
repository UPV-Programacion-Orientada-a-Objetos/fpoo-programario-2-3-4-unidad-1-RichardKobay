package edu.upvictoria.fpoo.estructuras.repetitivas;

import edu.upvictoria.fpoo.helpers.NewArrays;
import edu.upvictoria.fpoo.helpers.Scanner;

public class EjercicioVeintiseis {
    public EjercicioVeintiseis () {
        Scanner scanner = new Scanner();
        int groups = scanner.readInt("Give me the number of groups");
        int kids = scanner.readInt("Give me the number of kids per group");

        int[][] ages = new int[groups][kids];

        for (int i = 0; i < groups; i++) {
            for (int j = 0; j < kids; j++) {
                ages[i][j] = scanner.readInt("Give me the age of the group " + i+1 + " kid " + j+1);
            }
        }

        int i = 0;
        int sum = 0;
        for(int[] groupAges : ages) {
            NewArrays arrays = new NewArrays();
            sum = sum + arrays.getSum(groupAges);
            double av = arrays.getSum(groupAges) / groupAges.length;
            System.out.println("The average age of the group " + i+1 + " is: " + av);
        }

        System.out.println("The average of the school is: " + sum / groups);
    }
}
