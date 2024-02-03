package edu.upvictoria.fpoo.estructuras.repetitivas;

public class EjercicioTres {
    public double getSum () {
        double sum = 0;

        for (int i = 0; i < 10; i++) {
            sum = sum + i;
        }

        return sum;
    }

    public EjercicioTres () {
        System.out.println("The sum is: " + getSum());
    }

    public EjercicioTres (boolean test) {}
}
