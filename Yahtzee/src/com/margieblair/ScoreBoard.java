package com.margieblair;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
//OR YOU CAN USE THE SET INTERFACE
//WHEN THE PLAYERS TURN ENDS, THEIR DIE GET TURNED INTO A SET FOR LOWER SCORES
//WE CAN SEE ONLY THE UNIQUE VALUES

public class ScoreBoard {
    //try to make hashmap with key being the score, value being the arraylist/[]
    //THIS IS A DRAFT NOT INTEGRATED INTO THE REST OF THE PROGRAM RIGHT NOW!!
    public Map<Integer, int[]> onlyOnes = new HashMap<>();
    private int upperScore = 0;

    public void setHashMap() {
        onlyOnes.put(11, new int[] {1, 1, 1, 5, 5});
        System.out.println(onlyOnes);
    }

    public int upperSectionScore(int[] finalDie) {
        for (var die : finalDie) {
            upperScore += die;
        }
        return upperScore;
    }

    public int threeOfAKind(int[] finalDie) {
        return upperScore;
    }

    public int fourOfAKind(int[] finalDie) {
        return upperScore;
    }

    public int fullHouse(int[] finalDie) {
        return 5;
    }



}
