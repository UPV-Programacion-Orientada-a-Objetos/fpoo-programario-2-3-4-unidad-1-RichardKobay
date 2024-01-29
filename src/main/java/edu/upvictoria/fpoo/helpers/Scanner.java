package edu.upvictoria.fpoo.helpers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Scanner {
    BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));

    public String readLine () {
        try {
            return scanner.readLine();
        } catch (IOException e) {
            System.out.println("The input was not what we excepted");
            return "";
        }
    }

    public double readDouble () {
        try {
            return Double.parseDouble(scanner.readLine());
        } catch (IOException | NumberFormatException e) {
            System.out.println("The input was not what we excepted");
            return 0;
        }
    }
    
    public int readInt () {
        try {
            return Integer.parseInt(scanner.readLine());
        } catch (IOException | NumberFormatException e) {
            System.out.println("The input was not what we excepted");
            return 0;
        }
    }
}
