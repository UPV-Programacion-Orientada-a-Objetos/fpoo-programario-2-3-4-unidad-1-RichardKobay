package edu.upvictoria.fpoo.estructuras.repetitivas;

public class EjercicioUno {

    public double getSum () {
        double sum = 0;
        int i = 0;

        while (i < 10) {
            sum = sum + i;
            i++;
        }

        return sum;
    }

    public EjercicioUno () {
        System.out.println("The sum result is: " + getSum());
    }

    public EjercicioUno (boolean test) {}
}
