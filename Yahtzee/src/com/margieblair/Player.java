package com.margieblair;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class Player {
    private List<Die> dice;

    public Player() {
        dice = new ArrayList<>();
        for (int count = 0; count < 5; count++) {
            dice.add(new Die());
        }
    }

    public void roll(Random rand) {
        for (var die: dice) {
            die.roll(rand);
        }
    }

    public void roll(Random rand, int choice) {
        try {
            dice.get(choice).roll(rand);
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("You can only input 1 - 5. Restarting...");
            PlayerRolls.setCount(-1);
        }
    }

    public void roll(Random rand, List<Integer> choices) {
        for (int choice : choices) {
            roll(rand, choice);
        }
    }
    public List<Die> getDice() {
        return dice;
    }

    public int getDieValue(int index) {
        return dice.get(index).getValue();
    }



}
