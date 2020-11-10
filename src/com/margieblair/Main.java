package com.margieblair;

public class Main {

    public static void main(String[] args) {
	    int i = 010;
	    int j = 07;
        System.out.println(i);
        System.out.println(j);

        try {
            Float f1 = new Float("3.0");
            int a = f1.intValue();
            byte b = f1.byteValue();
            double c = f1.byteValue();
            System.out.println(a + b + c);
        } catch (NumberFormatException e) {
            System.out.println("Bad number");
        }
    }
}

