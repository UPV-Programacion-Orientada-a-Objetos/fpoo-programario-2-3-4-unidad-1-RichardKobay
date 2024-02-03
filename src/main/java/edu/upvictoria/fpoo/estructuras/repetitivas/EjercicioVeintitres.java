package edu.upvictoria.fpoo.estructuras.repetitivas;

public class EjercicioVeintitres {

    public float getSum () {
        float sum = 0;
        int i = 0;

        do {
            sum = sum + i;
            i++;
        } while (i < 10);

        return sum;
    }

    public EjercicioVeintitres () {
        System.out.println("The sum result is: " + getSum());
    }

    public EjercicioVeintitres (boolean test) {}
}
