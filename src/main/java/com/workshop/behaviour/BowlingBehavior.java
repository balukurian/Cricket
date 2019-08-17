package com.workshop.behaviour;

import com.workshop.BowlerType;

import java.util.Random;

public class BowlingBehavior {

    private int[] possibleRuns = {0, 1, 2, 3, 4, 5, 6, 7};
    private Random random = new Random();
    private BowlerType bowlerType = BowlerType.NORMAL;

    public BowlingBehavior() {
    }

    public BowlingBehavior(BowlerType bowlerType) {
        this.bowlerType = bowlerType;
    }

    public BowlingBehavior(int[] possibleRuns) {
        this.possibleRuns = possibleRuns;
    }

    public int bowl() {
        return possibleRuns[random.nextInt(possibleRuns.length)];
    }

    public boolean canTakeWickets() {
        return this.bowlerType == BowlerType.NORMAL;
    }

}
