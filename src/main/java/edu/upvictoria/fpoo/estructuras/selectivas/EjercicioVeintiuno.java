package edu.upvictoria.fpoo.estructuras.selectivas;

import edu.upvictoria.fpoo.helpers.Scanner;

public class EjercicioVeintiuno {

    public int amount (int age, double avCal) {
        if (age > 18) {
            if (avCal >= 9)
                return 2000;
            if (avCal >= 7.5)
                return 1000;
            if (avCal >= 6)
                return 500;
            return 0;
        }

        if (avCal >= 9)
            return 3000;
        if (avCal >= 7.5)
            return 2000;
        if (avCal >= 6)
            return 100;
        return 0;
    }

    public EjercicioVeintiuno (){
        Scanner scanner = new Scanner();
        int age = scanner.readInt("Give me your age");
        double cal = scanner.readDouble("Give me your grade point average");

            System.out.println("You'll receive $" + amount(age, cal));
    }
}
