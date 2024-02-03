package edu.upvictoria.fpoo.estructuras.repetitivas;

import edu.upvictoria.fpoo.helpers.Scanner;
import edu.upvictoria.fpoo.helpers.math.NewMath;

public class EjercicioTreintaYSeis {

    public double approximateSin(double x, int n) {
        NewMath newMath = new NewMath();
        double sin = 0;
        for (int i = 0; i < n; i++) {
            if (newMath.isPrime(i)) {
                sin = sin + ((x - Math.pow(x, i)) / newMath.factorial(i));
            }
        }
        return sin;
    }

    public EjercicioTreintaYSeis () {
        Scanner scanner = new Scanner();
        int n = scanner.readInt("Give me n");
        double x = scanner.readDouble("Give me x");

        System.out.println("The sin is approx: " + approximateSin(x, n));
    }
}
