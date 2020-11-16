package com.margieblair;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;


public class YahtzeeConsole extends Console{

    static public void welcome() {
        welcome("Yahtzee!");
    }

    static public void displayDice(List<Die> currentDice) {
        System.out.println("--------------\n");
        for (var die : currentDice) {
            System.out.print(die.getValue() + " ");
        }
    }

    static public ArrayList<Integer> getChoices() {
        System.out.println("Which die do you want to reroll? 1-5 Input them all on one line ex: 1 5 2." );
        String input = scanner.nextLine();
        List<Integer> choices = new ArrayList<>();
        String[] inputArray = input.split(" ");
        Arrays.stream(inputArray)
                .map(choice -> Integer.parseInt(choice))
                .forEach(choice -> choices.add(choice-1));
//        String[] inputArray = input.split(" ");
//        List<Integer> choices = new ArrayList<>();
//        for (String choice : inputArray) {
//            choices.add(Integer.parseInt(choice) - 1);
//        }
        return (ArrayList<Integer>) choices;

    }
}
