package edu.upvictoria.fpoo.estructuras.selectivas;

import edu.upvictoria.fpoo.helpers.Scanner;

public class EjercicioQuince {
    public boolean canVote(int age) {
        return age >= 18;
    }

    public EjercicioQuince (boolean test) {}

    public EjercicioQuince () {
        Scanner scanner = new Scanner();
        int age = scanner.readInt("Give me your age: ");
        if (canVote(age))
            System.out.println("You can vote");
        else
            System.out.println("Your cannot vote");
    }
}
