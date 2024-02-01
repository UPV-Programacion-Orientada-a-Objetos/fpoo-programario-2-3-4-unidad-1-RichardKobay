package edu.upvictoria.fpoo.estructuras.selectivas;

import edu.upvictoria.fpoo.helpers.Scanner;

public class EjercicioSeis {
    public double newPrice (int nPeople) {
        if (nPeople > 300)
            return nPeople * 75;
        if (nPeople > 200)
            return nPeople * 85;
        return nPeople * 95;
    }

    public EjercicioSeis () {
        Scanner scanner = new Scanner();
        int nPeople = scanner.readInt("Give me the amount of people");
        System.out.println("The price per person will be: " + newPrice(nPeople));
    }

    public EjercicioSeis (boolean test) {}
}
