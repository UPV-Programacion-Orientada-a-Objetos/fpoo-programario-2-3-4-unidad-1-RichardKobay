package edu.upvictoria.fpoo.helpers;

public class NewArrays {
    public double getSum (double[] arr) {
        double sum = 0;
        for(double item : arr)
            sum = sum + item;
        return sum;
    }
    public int getSum (int[] arr) {
        int sum = 0;
        for(int item : arr)
            sum = sum + item;
        return sum;
    }
}
