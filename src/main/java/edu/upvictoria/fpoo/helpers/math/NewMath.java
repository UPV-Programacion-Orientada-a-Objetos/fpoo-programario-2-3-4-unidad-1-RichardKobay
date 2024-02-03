package edu.upvictoria.fpoo.helpers.math;

public class NewMath {
    public double max (double a, double b) {
        return a > b ? a : b;
    }

    public double max (double a, double b, double c) {
        if (a > b && a > c)
            return a;
        if (b > a && b > c)
            return b;
        return c;
    }

    public int factorial (int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public boolean isPrime(int n){
        int counter = 2;
        boolean prime=true;
        while ((prime) && (counter!=n)){
            if (n % counter == 0)
                prime = false;
            counter++;
        }
        return prime;
    }
}
