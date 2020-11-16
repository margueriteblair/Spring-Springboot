package com.margieblair;


import java.util.List;

public class Main {

    public static void main(String[] args) {
        Hotel newHotel = new Hotel("Baby Hotel", 101, 102, 103, 104, 201, 202, 203, 204);

        while (true) {
            CliLogic.runProgram(newHotel);
        }

    }
}
