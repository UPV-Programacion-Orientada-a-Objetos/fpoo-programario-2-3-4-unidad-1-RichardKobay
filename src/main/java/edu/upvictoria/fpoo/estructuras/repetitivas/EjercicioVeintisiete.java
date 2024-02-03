package edu.upvictoria.fpoo.estructuras.repetitivas;

import edu.upvictoria.fpoo.helpers.Scanner;
import edu.upvictoria.fpoo.helpers.math.NewMath;

public class EjercicioVeintisiete {

    public double getEToX (int n, int x) {
        NewMath newMath = new NewMath();
        double eToX = 1;
        for (int i = 1; i <= n; i++) {
            eToX = eToX + (Math.pow(x, i) / newMath.factorial(i));
        }

        return eToX;
    }

    public EjercicioVeintisiete () {
        Scanner scanner = new Scanner();
        int n = scanner.readInt("Give me n");
        int x = scanner.readInt("Give me x");

        System.out.println("The value is: " + getEToX(n, x));
    }
}
