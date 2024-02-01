package edu.upvictoria.fpoo.estructuras.selectivas;

import edu.upvictoria.fpoo.helpers.Scanner;
import edu.upvictoria.fpoo.helpers.math.NewMath;

public class EjercicioUno {
    public EjercicioUno () {
        Scanner scanner = new Scanner();
        NewMath newMath = new NewMath();

        System.out.println("Give me one number");
        double n1 = scanner.readDouble();
        System.out.println("Give me other number");
        double n2 = scanner.readDouble();
        System.out.println("The major is: " + newMath.max(n1, n2));
    }
}
