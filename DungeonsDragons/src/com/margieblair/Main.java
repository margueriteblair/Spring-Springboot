package com.margieblair;

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println("Dungeons and Dragons Baby!");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        while(true) {
            int ac = CliLogic.getNumber("Player, input your Armor Class between 10 and 18", 10, 18);
            int defenseMod = CliLogic.getNumber("Player, input your defense mod -50 to 50", -50, 50);
            int attackMod = CliLogic.getNumber("Great! Now input your attack mod between -50 and 50", -50, 50);
            String damageDice = CliLogic.getString("Lastly, input the damage die that will be used: ");
            int damage = Calculator.attack(ac, defenseMod, attackMod, damageDice);
            System.out.println(damage + " is the final total damage for this roll!");
        }
    }
}
