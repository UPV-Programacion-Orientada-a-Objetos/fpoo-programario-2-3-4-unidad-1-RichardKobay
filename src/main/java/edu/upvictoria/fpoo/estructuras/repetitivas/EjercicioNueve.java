package edu.upvictoria.fpoo.estructuras.repetitivas;

import edu.upvictoria.fpoo.helpers.Scanner;

public class EjercicioNueve {
    public EjercicioNueve () {
        Scanner scanner = new Scanner();
        int nElements = scanner.readInt("Enter the number of elements");

        int prev = 0;
        int current = 1;

        if (nElements <= 2) {
            if(nElements == 1)
                System.out.println("0");
            else
                System.out.println("0\n1");
            return;
        }

        for (int i = 0; i < nElements; i++) {
            int newElement = prev + current;
            System.out.println(newElement);
            prev = current;
            current = newElement;
        }
    }
}
