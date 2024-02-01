package edu.upvictoria.fpoo.estructuras.selectivas;

import edu.upvictoria.fpoo.helpers.Scanner;

public class EjercicioVeintisiete {

    public int pricePerChild (int nKids) {
        if (nKids < 20)
            return 70;
        if (nKids < 50)
            return 40;
        if (nKids < 100)
            return 35;

        return 20;
    }

    public EjercicioVeintisiete () {
        Scanner scanner = new Scanner();

        int nKids = scanner.readInt("Give me the number of kids");
        System.out.println("The pay per kid will be: " + pricePerChild(nKids));
    }
}
