package com.margieblair;

import java.util.Random;
import java.security.SecureRandom;

public class Die {
    private int face;
    private int sides;

    public Die() {
        this.sides = 6;
        face = 1;
    }

    //in the instance we have a different sided die that we want to use
    public Die(int sides) {
        this.sides = sides;
        this.face = face;

    }

    public void roll(Random rand) {
        face = rand.nextInt(sides) + 1;
    }

    public int getValue() {
        return face;

    }


}
