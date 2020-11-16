package com.margieblair;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //margie, change these from method scope fields
        int score=0;
        Random rand = new Random();
        Player myHand = new Player();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            myHand.roll(rand);
            System.out.println();
            PlayerRolls.turn(myHand);
            System.out.println("Tally your score and input your final score:");
            score = scanner.nextInt();
            System.out.println("Your final score is " + score + ", would you like to play again (1), or exit the game? (2)");
            int option = scanner.nextInt();
            if (option == 2) break;
            if (option == 1) PlayerRolls.setCount(0);
        }



    }

}
