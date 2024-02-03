package edu.upvictoria.fpoo.estructuras.repetitivas;

import edu.upvictoria.fpoo.helpers.NewArrays;
import edu.upvictoria.fpoo.helpers.Scanner;

public class EjercicioTreintaYSiete {
    public EjercicioTreintaYSiete () {
        Scanner scanner = new Scanner();
        NewArrays newArrays = new NewArrays();
        int[] quantities = new int[6];

        quantities[0] = scanner.readInt("Give me the amount of 10 coins");
        quantities[1] = scanner.readInt("Give me the amount of 5 coins");
        quantities[2] = scanner.readInt("Give me the amount of 1 coins");
        quantities[3] = scanner.readInt("Give me the amount of 10 bills");
        quantities[4] = scanner.readInt("Give me the amount of 20 bills");
        quantities[5] = scanner.readInt("Give me the amount of 50 bills");

        System.out.println("The total is: " + newArrays.getSum(quantities));
    }
}
