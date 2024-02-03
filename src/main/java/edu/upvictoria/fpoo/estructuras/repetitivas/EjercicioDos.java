package edu.upvictoria.fpoo.estructuras.repetitivas;

public class EjercicioDos {
    public float getSum () {
        float sum = 0;
        int i = 0;

        do {
            sum = sum + i;
            i++;
        } while (i < 10);

        return sum;
    }

    public EjercicioDos () {
        System.out.println("The sum result is: " + getSum());
    }

    public EjercicioDos (boolean test) {}
}
