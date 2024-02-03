package edu.upvictoria.fpoo.estructuras.repetitivas;

import edu.upvictoria.fpoo.helpers.Prices;
import edu.upvictoria.fpoo.helpers.Scanner;
import edu.upvictoria.fpoo.helpers.math.Aritmethic;

public class EjercicioTreintaYOcho {

    public double minimumPay(double money){
        Aritmethic interes = new Aritmethic();
        return interes.getPercentage(money, 50);
    }

    public double notInterest(double money){
        Aritmethic interes = new Aritmethic();
        return interes.getPercentage(money, 85);
    }

    public double getActualMoney(double money, double spent){
        Prices atual = new Prices();
        return atual.addPercentage(money + spent, 12) + 200;
    }

    public EjercicioTreintaYOcho () {
        Scanner scanner = new Scanner();
        int n = scanner.readInt("Give me the number of clients");

        String[] names = new String[n];
        double[] money = new double[n];
        double[] actual = new double[n];
        double[] spent = new double[n];
        double[] minimum = new double[n];
        double[] notInterest = new double[n];

        for (int i = 0; i < n; i++) {

            money[i] = scanner.readDouble("How much money does the client have?");
            spent[i] = scanner.readDouble("How much did the client spent this month?");
            actual[i] = getActualMoney(money[i],spent[i]);
            minimum[i] = minimumPay(actual[i]);
            notInterest[i] = notInterest(actual[i]);

        }

        for (int i = 0; i < n; i++) {
            System.out.println("------ CLIENT NUMBER " + i + " ------");
            System.out.println("Last Money: " + money[i]);
            System.out.println("Spent Money: " + spent[i]);
            System.out.println("Minimum Interest Pay: " + minimum[i]);
            System.out.println("Not Interest Pay :" + notInterest[i]);
        }
    }
}
