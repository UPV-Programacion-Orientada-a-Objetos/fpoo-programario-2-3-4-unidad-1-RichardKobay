package edu.upvictoria.fpoo.estructuras.selectivas;

import edu.upvictoria.fpoo.helpers.Scanner;
import edu.upvictoria.fpoo.helpers.math.NewMath;

public class EjercicioCinco {
    public EjercicioCinco () {
        Scanner scanner = new Scanner();
        NewMath newMath = new NewMath();

        double n1 = scanner.readDouble("Give me one number");
        double n2 = scanner.readDouble("Give the second number");
        double n3 = scanner.readDouble("Give the third number");

        System.out.println("The major number is: " + newMath.max(n1, n2, n3));
    }
}
