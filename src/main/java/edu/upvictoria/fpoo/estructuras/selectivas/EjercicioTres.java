package edu.upvictoria.fpoo.estructuras.selectivas;

import edu.upvictoria.fpoo.helpers.Scanner;

public class EjercicioTres {
    public double pricePerUnit (int numberOfUnits) {
        return numberOfUnits >= 1000 ? 3.65 : 4.83;
    }

    public EjercicioTres () {
        Scanner scanner = new Scanner();
        int nPencils = scanner.readInt();
    }

    public EjercicioTres (boolean test) {}
}
