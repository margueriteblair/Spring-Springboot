package com.margieblair;

import java.util.Scanner;

public class CliLogic {
    static Scanner scanner = new Scanner(System.in);

    public static String getString(String question) {
        System.out.println(question);
        String die = scanner.next();
        return die;
    }

    public static int getNumber(String question, int min, int max) {
        System.out.println(question);
        while (true) {
            try {
                int mod = scanner.nextInt();
                if (mod > max || mod < min) {
                    System.out.println("Your input has to be between " + min + " and " + max);
                } else {
                    return mod;
                }
                System.out.println();
            } catch (IllegalArgumentException ex) {
                System.out.println("Please only input a number within the bounds of the field.");
            }
        }
    }


}
