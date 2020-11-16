package com.margieblair;

import java.util.Random;
public class Calculator {


    public static int attack(int ac, int defenseMod, int attackMod, String damageDice) {
        int temp;
        try {
            temp = Integer.parseInt(damageDice.split("d")[0]);
        } catch (NumberFormatException ex) {
            temp = 1;
        }
        int numRolls = temp;
        int damageDieNumSides = Integer.parseInt(damageDice.split("d")[1]);

        Die twentySided = new Die(20);
        Die damageDieHit = new Die(damageDieNumSides);

        Random rand = new Random();

        int hit = twentySided.roll(rand);
        System.out.println("Enemy rolled a " + hit);
        if (hit == 20) {
            //you can also replicate the yahtzee scenario where you have a hand that rolls multiple die at once
            int firstRoll = 0;
            for (int i = 0; i < numRolls; i++) {
                firstRoll += damageDieHit.roll(rand);
                System.out.println(firstRoll);
            }
            int secondRoll = 0;
            for (int i = 0; i < numRolls; i++) {
                secondRoll += damageDieHit.roll(rand);
            }

            int totalDamage = firstRoll + secondRoll;
            System.out.println("Critical Hit! " + firstRoll + " + " + secondRoll + " = " + totalDamage + " damage");
            return totalDamage;
        }

        if (hit + attackMod > ac + defenseMod) {
            int totalDamage = 0;
            for (int i = 0; i < numRolls; i++) {
                totalDamage += damageDieHit.roll(rand);
            }
            System.out.println("Hit " + totalDamage + " damage delt");
            return totalDamage;
        }

        if (hit == 1) {
            System.out.println("Critical Miss!");
            return 0;
        }

        System.out.println("Miss 0 damage");
        return 0;
    }

}
