package edu.upvictoria.fpoo.estructuras.selectivas;

import edu.upvictoria.fpoo.helpers.Scanner;

public class EjercicioVeintiocho {
    public char returnLetter(double grade) {
        if (grade <= 5)
            return 'F';
        if (grade <= 7)
            return 'D';
        if (grade <= 8)
            return 'C';
        if (grade <= 9)
            return 'D';
        return 'A';
    }

    public EjercicioVeintiocho() {
        Scanner scanner = new Scanner();

        int grade = scanner.readInt("Give me your grade");
        System.out.println("Your letter is: " + returnLetter(grade));
    }
}
