package edu.upvictoria.fpoo.estructuras.selectivas;

import edu.upvictoria.fpoo.helpers.Scanner;

public class EjercicioOcho {
    public double totalPricePerKid (int nKids) {
        if (nKids >= 100)
            return 65;
        if (nKids >= 50)
            return 70;
        if (nKids >= 30)
            return 95;

        return 4000 / nKids;
    }

    public EjercicioOcho () {
        Scanner scanner = new Scanner();

        int nKids = scanner.readInt("Give me the number of kids");
        System.out.println("The price per kid will be: " + totalPricePerKid(nKids));
    }
    public EjercicioOcho (boolean test) {}
}
