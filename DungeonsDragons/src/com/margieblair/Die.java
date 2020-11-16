package com.margieblair;

import java.util.Random;

public class Die {
    private int sides;
    private int face;

    public Die(int sides) {
        this.sides = sides;
    }

    public int roll(Random rand) {
        face = rand.nextInt(sides) + 1;
        return face;
    }


}
